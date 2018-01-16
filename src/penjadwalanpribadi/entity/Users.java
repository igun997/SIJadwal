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
public class Users extends CRUD{
    private int id_users;
    private String nama;
    private String username;
    private String password;
    private String sekolah;
    private String nim;
    private String log_masuk;

    public int getId_users() {
        return id_users;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
          
    public void setId_users(int id_users) {
        this.id_users = id_users;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSekolah() {
        return sekolah;
    }

    public void setSekolah(String sekolah) {
        this.sekolah = sekolah;
    }

    public String getLog_masuk() {
        return log_masuk;
    }

    public void setLog_masuk(String log_masuk) {
        this.log_masuk = log_masuk;
    }
    
    
}
