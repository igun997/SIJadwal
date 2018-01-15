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
public class Dosen extends CRUD{
    private int id_dosen;
    private String nama;
    private String nomor;
    private String users_id;

    public void setId_dosen(int id_dosen) {
        this.id_dosen = id_dosen;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public void setUsers_id(String users_id) {
        this.users_id = users_id;
    }

    public int getId_dosen() {
        return id_dosen;
    }

    public String getNama() {
        return nama;
    }

    public String getNomor() {
        return nomor;
    }

    public String getUsers_id() {
        return users_id;
    }
    
    
}
