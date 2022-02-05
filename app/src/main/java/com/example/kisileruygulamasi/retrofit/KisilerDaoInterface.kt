package com.example.kisileruygulamasi.retrofit

import com.example.kisileruygulamasi.entity.CRUDCevap
import com.example.kisileruygulamasi.entity.Kisiler
import com.example.kisileruygulamasi.entity.KisilerCevap
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface KisilerDaoInterface {
    @GET("kisiler/tum_kisiler.php")
    fun tumKisiler():Call<KisilerCevap>
    @POST("kisiler/insert_kisiler.php")
    @FormUrlEncoded
    fun kisiEkle(@Field("kisi_ad") kisi_ad:String,
                 @Field("kisi_tel") kisi_tel:String) : Call<CRUDCevap>
}