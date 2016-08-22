package com.example.gezuzm.imagencorporativa;

/**
 * Created by mauricio on 21/08/16.
 */
public class Mascota {

    private int imgMascota;
    private int imgIconoLike;
    private int imgIconoNoLike;
    private String nombreMascota;
    private String noLike;


        public Mascota(int imgMascota, String nombreMascota)
        {
        this.imgMascota = imgMascota;
        this.imgIconoLike = R.drawable.hueso_nosilueta;
        this.imgIconoNoLike = R.drawable.hueso_silueta ;
        this.nombreMascota = nombreMascota;
        this.noLike = "0";
    }

    public int getFotoMascota() {
        return imgMascota;
    }

    public void setFotoMascota(int imgMascota) {
        this.imgMascota = imgMascota;
    }

    public int getImgIconoLike() {
        return imgIconoLike;
    }

    public void setImgIconoLike(int imgIconoLike) {
        this.imgIconoLike = imgIconoLike;
    }

    public int getImgIconoNoLike() {
        return imgIconoNoLike;
    }

    public void setImgIconoNoLike(int imgIconoNoLike) {
        this.imgIconoNoLike = imgIconoNoLike;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getNoLike() {
        return noLike;
    }

    public void setNoLike(String noLike) {
        this.noLike = noLike;
    }
}
