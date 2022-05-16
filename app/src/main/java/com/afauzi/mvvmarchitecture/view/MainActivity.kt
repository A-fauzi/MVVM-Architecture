package com.afauzi.mvvmarchitecture.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.afauzi.mvvmarchitecture.R
import com.afauzi.mvvmarchitecture.databinding.ActivityMainBinding
import com.afauzi.mvvmarchitecture.model.Mahasiswa
import com.afauzi.mvvmarchitecture.view_model.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.main = viewModel

        val mhs = Mahasiswa("HDHSG678868", "Akhmad Fauzi", "Teknik Informatika")
        viewModel.setData(mhs)
    }
}