/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaswing.service;

import com.javaswing.dao.KhoDao;
import com.javaswing.model.Kho;

import java.util.List;

/**
 *
 * @author phamn
 */
public class KhoService {
    KhoDao khoDao;

    public KhoService() {
        khoDao = new KhoDao();
    }
    
    public List<Kho> getAllKho(){
        return khoDao.getAllKho();
    }
    
    public void addKho(Kho kho){
        khoDao.addKho(kho);
    }
    
    public void deleteKho(Kho kho){
        khoDao.deleteKho(kho);
    }
    
    public void updateKho(Kho kho){
        khoDao.updateKho(kho);
    }
    
}
