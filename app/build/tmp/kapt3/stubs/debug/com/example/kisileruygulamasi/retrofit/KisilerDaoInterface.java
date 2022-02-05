package com.example.kisileruygulamasi.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H\'J,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H\'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH\'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/example/kisileruygulamasi/retrofit/KisilerDaoInterface;", "", "kisiAra", "Lretrofit2/Call;", "Lcom/example/kisileruygulamasi/entity/KisilerCevap;", "kisi_ad", "", "kisiEkle", "Lcom/example/kisileruygulamasi/entity/CRUDCevap;", "kisi_tel", "kisiGuncelle", "kisi_id", "", "kisiSil", "tumKisiler", "app_debug"})
public abstract interface KisilerDaoInterface {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "kisiler/tum_kisiler.php")
    public abstract retrofit2.Call<com.example.kisileruygulamasi.entity.KisilerCevap> tumKisiler();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "kisiler/insert_kisiler.php")
    public abstract retrofit2.Call<com.example.kisileruygulamasi.entity.CRUDCevap> kisiEkle(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "kisi_ad")
    java.lang.String kisi_ad, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "kisi_tel")
    java.lang.String kisi_tel);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "kisiler/update_kisiler.php")
    public abstract retrofit2.Call<com.example.kisileruygulamasi.entity.CRUDCevap> kisiGuncelle(@retrofit2.http.Field(value = "kisi_id")
    int kisi_id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "kisi_ad")
    java.lang.String kisi_ad, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "kisi_tel")
    java.lang.String kisi_tel);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "kisiler/delete_kisiler.php")
    public abstract retrofit2.Call<com.example.kisileruygulamasi.entity.CRUDCevap> kisiSil(@retrofit2.http.Field(value = "kisi_id")
    int kisi_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "kisiler/tum_kisiler_arama.php")
    public abstract retrofit2.Call<com.example.kisileruygulamasi.entity.KisilerCevap> kisiAra(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "kisi_ad")
    java.lang.String kisi_ad);
}