/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjadwalanpribadi.entity;

import penjadwalanpribadi.library.CRUD;

/**
 *
 * @author Sys5
 */
public class Matkul extends CRUD{
    private int id_matkul;
    private String nama_matkul;
    private String waktu_mulai;
    private String waktu_selesai;
    private String ruang_matkul;
    private String dosen_id;
    private String users_id;
    private String kelas_id;
    private String days_id;

    public int getId_matkul() {
        return id_matkul;
    }

    public void setId_matkul(int id_matkul) {
        this.id_matkul = id_matkul;
    }

    public String getNama_matkul() {
        return nama_matkul;
    }

    public void setNama_matkul(String nama_matkul) {
        this.nama_matkul = nama_matkul;
    }

    public String getWaktu_mulai() {
        return waktu_mulai;
    }

    public void setWaktu_mulai(String waktu_mulai) {
        this.waktu_mulai = waktu_mulai;
    }

    public String getWaktu_selesai() {
        return waktu_selesai;
    }

    public void setWaktu_selesai(String waktu_selesai) {
        this.waktu_selesai = waktu_selesai;
    }

    public String getRuang_matkul() {
        return ruang_matkul;
    }

    public void setRuang_matkul(String ruang_matkul) {
        this.ruang_matkul = ruang_matkul;
    }

    public String getDosen_id() {
        return dosen_id;
    }

    public void setDosen_id(String dosen_id) {
        this.dosen_id = dosen_id;
    }

    public String getUsers_id() {
        return users_id;
    }

    public void setUsers_id(String users_id) {
        this.users_id = users_id;
    }

    public String getKelas_id() {
        return kelas_id;
    }

    public void setKelas_id(String kelas_id) {
        this.kelas_id = kelas_id;
    }

    public String getDays_id() {
        return days_id;
    }

    public void setDays_id(String days_id) {
        this.days_id = days_id;
    }
    
}
