package com.afauzi.mvvmarchitecture.view_model

import android.app.Application
import android.database.Observable
import androidx.databinding.ObservableField
import androidx.lifecycle.AndroidViewModel
import com.afauzi.mvvmarchitecture.model.Mahasiswa

class MainViewModel(application: Application): AndroidViewModel(application) {
    var nim: ObservableField<String> = ObservableField()
    var nama: ObservableField<String> = ObservableField()
    var jurusan: ObservableField<String> = ObservableField()

    fun setData(mahasiswa: Mahasiswa) {
        nim.set(mahasiswa.nim)
        nama.set(mahasiswa.nama)
        jurusan.set(mahasiswa.jurusan)
    }

}