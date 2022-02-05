package com.example.kisileruygulamasi.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eJ\u0016\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eJ\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004J\u0006\u0010\u0017\u001a\u00020\fR&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lcom/example/kisileruygulamasi/repo/KisilerDaoRepository;", "", "()V", "kisilerListesi", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/kisileruygulamasi/entity/Kisiler;", "getKisilerListesi", "()Landroidx/lifecycle/MutableLiveData;", "setKisilerListesi", "(Landroidx/lifecycle/MutableLiveData;)V", "kisiAra", "", "aramaKelimesi", "", "kisiGuncelle", "kisi_id", "", "kisi_ad", "kisi_tel", "kisiKayit", "kisiSil", "kisileriGetir", "tumKisileriAl", "app_debug"})
public final class KisilerDaoRepository {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.kisileruygulamasi.entity.Kisiler>> kisilerListesi;
    
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