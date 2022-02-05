package com.example.kisileruygulamasi.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u001e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014J\u0016\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\u0006\u0010\u001d\u001a\u00020\u0012R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001e"}, d2 = {"Lcom/example/kisileruygulamasi/repo/KisilerDaoRepository;", "", "()V", "kdao", "Lcom/example/kisileruygulamasi/retrofit/KisilerDaoInterface;", "getKdao", "()Lcom/example/kisileruygulamasi/retrofit/KisilerDaoInterface;", "setKdao", "(Lcom/example/kisileruygulamasi/retrofit/KisilerDaoInterface;)V", "kisilerListesi", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/kisileruygulamasi/entity/Kisiler;", "getKisilerListesi", "()Landroidx/lifecycle/MutableLiveData;", "setKisilerListesi", "(Landroidx/lifecycle/MutableLiveData;)V", "kisiAra", "", "aramaKelimesi", "", "kisiGuncelle", "kisi_id", "", "kisi_ad", "kisi_tel", "kisiKayit", "kisiSil", "kisileriGetir", "tumKisileriAl", "app_debug"})
public final class KisilerDaoRepository {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.kisileruygulamasi.entity.Kisiler>> kisilerListesi;
    @org.jetbrains.annotations.NotNull()
    private com.example.kisileruygulamasi.retrofit.KisilerDaoInterface kdao;
    
    public KisilerDaoRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.kisileruygulamasi.entity.Kisiler>> getKisilerListesi() {
        return null;
    }
    
    public final void setKisilerListesi(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.kisileruygulamasi.entity.Kisiler>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kisileruygulamasi.retrofit.KisilerDaoInterface getKdao() {
        return null;
    }
    
    public final void setKdao(@org.jetbrains.annotations.NotNull()
    com.example.kisileruygulamasi.retrofit.KisilerDaoInterface p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.kisileruygulamasi.entity.Kisiler>> kisileriGetir() {
        return null;
    }
    
    public final void kisiKayit(@org.jetbrains.annotations.NotNull()
    java.lang.String kisi_ad, @org.jetbrains.annotations.NotNull()
    java.lang.String kisi_tel) {
    }
    
    public final void kisiGuncelle(int kisi_id, @org.jetbrains.annotations.NotNull()
    java.lang.String kisi_ad, @org.jetbrains.annotations.NotNull()
    java.lang.String kisi_tel) {
    }
    
    public final void kisiAra(@org.jetbrains.annotations.NotNull()
    java.lang.String aramaKelimesi) {
    }
    
    public final void kisiSil(int kisi_id) {
    }
    
    public final void tumKisileriAl() {
    }
}