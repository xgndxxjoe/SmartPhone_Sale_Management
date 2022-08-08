/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaswing.service;

import com.javaswing.dao.KhachHangDao;
import com.javaswing.model.KhachHang;
import java.util.List;

/**
 *
 * @author phamn
 */
public class KhachHangService {
    KhachHangDao khachHangDao;

    public KhachHangService() {
        khachHangDao = new KhachHangDao();
    }
    
    public List<KhachHang> getAllKhachHang(){
        return khachHangDao.getAllKhachHang();
    }
    
    public List<KhachHang> findByName(String name){
        return khachHangDao.findByName(name);
    }
}
