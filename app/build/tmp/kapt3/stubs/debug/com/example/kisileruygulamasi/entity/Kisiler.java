package com.example.kisileruygulamasi.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b\u00a8\u0006\u001c"}, d2 = {"Lcom/example/kisileruygulamasi/entity/Kisiler;", "Ljava/io/Serializable;", "kisi_id", "", "kisi_ad", "", "kisi_tel", "(ILjava/lang/String;Ljava/lang/String;)V", "getKisi_ad", "()Ljava/lang/String;", "setKisi_ad", "(Ljava/lang/String;)V", "getKisi_id", "()I", "setKisi_id", "(I)V", "getKisi_tel", "setKisi_tel", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class Kisiler implements java.io.Serializable {
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "kisi_id")
    private int kisi_id;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "kisi_ad")
    private java.lang.String kisi_ad;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "kisi_tel")
    private java.lang.String kisi_tel;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kisileruygulamasi.entity.Kisiler copy(int kisi_id, @org.jetbrains.annotations.NotNull()
    java.lang.String kisi_ad, @org.jetbrains.annotations.NotNull()
    java.lang.String kisi_tel) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Kisiler(int kisi_id, @org.jetbrains.annotations.NotNull()
    java.lang.String kisi_ad, @org.jetbrains.annotations.NotNull()
    java.lang.String kisi_tel) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getKisi_id() {
        return 0;
    }
    
    public final void setKisi_id(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKisi_ad() {
        return null;
    }
    
    public final void setKisi_ad(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKisi_tel() {
        return null;
    }
    
    public final void setKisi_tel(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}