/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaswing.service;

import com.javaswing.dao.NhanVienDao;
import com.javaswing.model.NhanVien;
import java.util.List;

/**
 *
 * @author phamn
 */
public class NhanVienService {
    private NhanVienDao nhanVienDao;

    public NhanVienService() {
        nhanVienDao = new NhanVienDao();
    }
    
    public List<NhanVien> getAllNhanVien(){
        return nhanVienDao.getAllNhanVien();
    }
    
    public void addNhanVien(NhanVien nhanVien){
        nhanVienDao.addNV(nhanVien);
    }
    
    public void deleteNhanVien(NhanVien nhanVien){
        nhanVienDao.deleteNhanVien(nhanVien);
    }
    
    public void updateNhanVien(NhanVien nhanVien){
        nhanVienDao.updateNhanVien(nhanVien);
    }
}
