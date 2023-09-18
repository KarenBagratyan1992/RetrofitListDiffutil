package com.example.retrofitlistdiffutil.dataMoves.mapper

interface DataToDomain <T,O> {
    fun delegate(input:T):O

}