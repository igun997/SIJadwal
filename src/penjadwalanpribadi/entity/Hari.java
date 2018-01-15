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
public class Hari extends CRUD{
    private int id_days;
    private String hari;

    public int getId_days() {
        return id_days;
    }

    public void setId_days(int id_days) {
        this.id_days = id_days;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    
    
    
}
