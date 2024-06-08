package com.example.apipbb.presenter

import com.example.apipbb.model.DataItem

interface CrudView {
    //untuk add
    fun successAdd (msg: String)
    fun onErrorAdd (msg: String)

    //untuk get data
    fun onSuccessGet (data: List<DataItem>?)
    fun onFailedGet (msg: String)

    //untuk update
    fun onSuccessUpdate (msg: String)
    fun onErrorUpdate (msg: String)

    //untuk delete
    fun onSuccessDelete (msg: String)
    fun onErrorDelete (msg: String)
}