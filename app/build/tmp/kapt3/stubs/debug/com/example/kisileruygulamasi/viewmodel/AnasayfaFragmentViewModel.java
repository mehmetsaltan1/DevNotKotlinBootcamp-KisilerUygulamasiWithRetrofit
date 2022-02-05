package com.example.kisileruygulamasi.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lcom/example/kisileruygulamasi/viewmodel/AnasayfaFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "kisilerListesi", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/kisileruygulamasi/entity/Kisiler;", "getKisilerListesi", "()Landroidx/lifecycle/MutableLiveData;", "setKisilerListesi", "(Landroidx/lifecycle/MutableLiveData;)V", "krepo", "Lcom/example/kisileruygulamasi/repo/KisilerDaoRepository;", "getKrepo", "()Lcom/example/kisileruygulamasi/repo/KisilerDaoRepository;", "ara", "", "aramaKelimesi", "", "kisileriYukle", "sil", "kisi_id", "", "app_debug"})
public final class AnasayfaFragmentViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.kisileruygulamasi.entity.Kisiler>> kisilerListesi;
    @org.jetbrains.annotations.NotNull()
    private final com.example.kisileruygulamasi.repo.KisilerDaoRepository krepo = null;
    
    public AnasayfaFragmentViewModel() {
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
    public final com.example.kisileruygulamasi.repo.KisilerDaoRepository getKrepo() {
        return null;
    }
    
    public final void ara(@org.jetbrains.annotations.NotNull()
    java.lang.String aramaKelimesi) {
    }
    
    public final void sil(int kisi_id) {
    }
    
    public final void kisileriYukle() {
    }
}