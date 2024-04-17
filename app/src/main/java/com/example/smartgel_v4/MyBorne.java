package com.example.smartgel_v4;

public class MyBorne {

    private  int idBorne;
    private int batterie;
    private int gel;

    public String getSalle() {
        return salle;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }

    private String salle;
    private String heure;
    private String date;

    //Constructeur
    public MyBorne(int idBorne, int gel,int batterie, String salle, String heure, String date){
        this.idBorne = idBorne;
        this.batterie = batterie;
        this.salle = salle;
        this.gel = gel;
        this.heure = heure;
        this.date = date;

    }

    public int getIdBorne() {
        return idBorne;
    }

    public void setIdBorne(int idBorne) {
        this.idBorne = idBorne;
    }

    public int getBatterie() {
        return batterie;
    }

    public void setBatterie(int batterie) {
        this.batterie = batterie;
    }

    public int getGel() {
        return gel;
    }

    public void setGel(int gel) {
        this.gel = gel;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
