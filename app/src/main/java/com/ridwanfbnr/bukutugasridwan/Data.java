package com.ridwanfbnr.bukutugasridwan;

public class Data {
    private String nama;
    private String deskripsi;
    private Integer profile;

    public String getNama() {
        return nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public Integer getProfile() {
        return profile;
    }

    public Data(String nama, String deskripsi, Integer profile){
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.profile = profile;
    }
}
