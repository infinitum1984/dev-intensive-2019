package ru.skillbranch.devintensive.extentsions

import androidx.lifecycle.MutableLiveData

fun <T> mutableLiveData(defvalue: T? =null): MutableLiveData<T>{
    val data = MutableLiveData<T>()
    if (defvalue!=null){
        data.value=defvalue
    }
    return data
}