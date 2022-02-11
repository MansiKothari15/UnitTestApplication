package com.example.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

class MainViewModel(): ViewModel() {

    /*private val users = MutableLiveData<List<User>>()
    private val compositeDisposable = CompositeDisposable()*/

    init {
        fetchUser()
    }

    private fun fetchUser() {

    }
}