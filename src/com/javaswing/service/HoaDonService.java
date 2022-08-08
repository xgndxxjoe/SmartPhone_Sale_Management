/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaswing.service;

import com.javaswing.dao.HoaDonDao;
import com.javaswing.model.HoaDon;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author phamn
 */
public class HoaDonService {
    private HoaDonDao hoaDonDao;
    
    public HoaDonService(){
        hoaDonDao = new HoaDonDao();
    }
    
    public List<HoaDon> getAllHoaDon(){
        return hoaDonDao.getAllHoaDon();
    }
    
    public List<HoaDon> findByName(String name){
        return hoaDonDao.findByName(name);
    }
    
}
