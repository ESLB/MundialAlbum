package com.album.mundial.eslb.mundialalbum.models;

import android.support.annotation.NonNull;

import java.util.UUID;

public class StickersModel implements Comparable {

    int idImagen;
    String shortTxt;
    int numeracion;
    UUID codigoSticker;

    public StickersModel(int idImagen, String shortTxt, int numeracion) {
        this.idImagen = idImagen;
        this.shortTxt = shortTxt;
        this.numeracion = numeracion;
        codigoSticker = UUID.randomUUID();
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    public String getShortTxt() {
        return shortTxt;
    }

    public void setShortTxt(String shortTxt) {
        this.shortTxt = shortTxt;
    }

    public int getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(int numeracion) {
        this.numeracion = numeracion;
    }

    public UUID getCodigoSticker() {
        return codigoSticker;
    }

    @Override
    public int compareTo(Object sticker) {
        int compareage = ((StickersModel) sticker).getNumeracion();
        /* For Ascending order*/
        return this.numeracion - compareage;
    }

    // Collections.sort(arraylist);

}
