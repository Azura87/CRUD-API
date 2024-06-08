package com.example.apipbb.network

import com.example.apipbb.model.ResultStaff
import com.example.apipbb.model.ResultStatus
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface StaffService {
    //fungsi Create Data
    @FormUrlEncoded
    @POST("addStaff")
    fun addStaff(@Field("name") name : String,
                 @Field("hp") hp : String,
                 @Field("alamat") alamat : String) : Call<ResultStatus>

    //fungsi Get Data
    @GET("getDataStaff")

    fun getData() : Call<ResultStaff>

    //fungsi Update Data
    @FormUrlEncoded
    @POST("updateStaff")
    fun updateStaff(@Field("id") id : String,
                    @Field("name") name : String,
                    @Field("hp") hp : String,
                    @Field("alamat") alamat : String) : Call<ResultStatus>

    //fungsi Delete Data
    @FormUrlEncoded
    @POST("deleteStaff")
    fun deleteStaff(@Field("id") id : String?) : Call<ResultStatus>
}