/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjadwalanpribadi.library;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import penjadwalanpribadi.entity.Dosen;
import penjadwalanpribadi.entity.Hari;
import penjadwalanpribadi.entity.Kelas;
import penjadwalanpribadi.entity.Matkul;
import penjadwalanpribadi.entity.Users;
import system.dbconnection;

/**
 *
 * @author Sys5
 */
public class CRUD {
    
    public ResultSet login(String user,String pass){
        try {
            ResultSet rs = dbconnection.query_get("SELECT * FROM users WHERE password =  MD5('"+pass+"') AND username = '"+user+"'");
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ResultSet getPengajar(){
        try {
            ResultSet rs = dbconnection.query_get("SELECT * FROM dosen");
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public int setJadwal(Matkul o){
        String[] data = {o.getNama_matkul(),o.getWaktu_mulai(),o.getWaktu_selesai(),o.getRuang_matkul(),o.getDosen_id(),o.getUsers_id(),o.getKelas_id(),o.getDays_id()};
        int rs = dbconnection.query_update("INSERT INTO matkul (nama_matkul,waktu_mulai,waktu_selesai,ruang_matkul,dosen_id,users_id,kelas_id,days_id) VALUES (?,?,?,?,?,?,?,?)", data);
        return rs;
    }
    public ResultSet getListHari(){
        try {
            ResultSet rs = dbconnection.query_get("SELECT * FROM list_days ORDER BY id_days ASC");
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ResultSet getListMateri(String sesi){
        try {
            ResultSet rs = dbconnection.query_get("SELECT * FROM materi JOIN matkul ON matkul.id_matkul = materi.matkul_id WHERE matkul.users_id = '"+sesi+"' ORDER BY materi.id_materi DESC");
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ResultSet getListMateriByID(String sesi){
        try {
            ResultSet rs = dbconnection.query_get("SELECT * FROM materi JOIN matkul ON matkul.id_matkul = materi.matkul_id WHERE materi.id_materi = '"+sesi+"' ORDER BY materi.id_materi DESC");
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ResultSet getListMatkul(String id){
        try {
            ResultSet rs = dbconnection.query_get("SELECT * FROM matkul WHERE users_id = '"+id+"' ORDER BY id_matkul DESC");
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ResultSet getListKelas(String id){
        try {
            ResultSet rs = dbconnection.query_get("SELECT * FROM kelas WHERE users_id = '"+id+"' ORDER BY id_kelas ASC");
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int delKelas(Kelas o){
        String[] data = {String.valueOf(o.getId_kelas())};
        int rs = dbconnection.query_update("DELETE FROM kelas WHERE id_kelas = ?", data);
        return rs;
    }
    public int upKelas(Kelas o){
        String[] data = {o.getNama_kelas(),String.valueOf(o.getId_kelas())};
        int rs = dbconnection.query_update("UPDATE kelas SET nama_kelas = ? WHERE id_kelas = ? ", data);
        return rs;
    }
    public int insKelas(Kelas o){
        String[] data = {o.getNama_kelas(),o.getUsers_id()};
        int rs = dbconnection.query_update("INSERT INTO kelas(nama_kelas,users_id) VALUES(?,?)", data);
        return rs;
    }
    public int insMateri(String[] data){
        int rs = dbconnection.query_update("INSERT INTO materi(judul_materi,isi_materi,users_id,matkul_id) VALUES(?,?,?,?)", data);
        return rs;
    }
    public int upMateri(String[] data){
        String sql = "UPDATE `materi` SET `judul_materi`= ?,`isi_materi`= ?,`matkul_id`= ? WHERE `id_materi`= ?";
        int rs = dbconnection.query_update(sql, data);
        return rs;
    }
    public int delMateri(String o){
        String[] data = {o};
        int rs = dbconnection.query_update("DELETE FROM materi WHERE id_materi = ?", data);
        return rs;
    }
    public int delJadwal(Matkul o){
        String[] data = {String.valueOf(o.getId_matkul())};
        int rs = dbconnection.query_update("DELETE FROM matkul WHERE id_matkul = ?", data);
        return rs;
    }
    public ResultSet getJadwal(int session){
        try {
            ResultSet rs = dbconnection.query_get("SELECT list_days.hari,matkul.*,kelas.* ,dosen.* FROM matkul JOIN list_days ON list_days.id_days = matkul.days_id JOIN dosen ON dosen.id_dosen = matkul.dosen_id JOIN kelas ON kelas.id_kelas = matkul.kelas_id JOIN users ON users.id_users = matkul.users_id WHERE users.id_users="+session+" ORDER BY matkul.days_id ASC");
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ResultSet getPengajar(Dosen pengajar){
        try {
            ResultSet rs = dbconnection.query_get("SELECT * FROM dosen WHERE id_dosen = '"+pengajar.getUsers_id()+"'");
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public int register(Users o){
        String[] data = {o.getNim(),o.getNama(),o.getUsername(),o.getPassword(),o.getSekolah()};
        int ts = dbconnection.query_update("INSERT INTO users (id_users,nama_users,username,password,sekolah) VALUES (?,?,?,MD5(?),?)", data);
        return ts;       
    }
}
