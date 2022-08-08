/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaswing.service;

import com.javaswing.dao.DienThoaiDao;
import com.javaswing.model.DienThoai;
import java.util.List;

/**
 *
 * @author phamn
 */
public class DienThoaiService {
    private DienThoaiDao dienThoaiDao;

    public DienThoaiService() {
        dienThoaiDao = new DienThoaiDao();
    }
    
    public List<DienThoai> getAllDienThoai(){
        return dienThoaiDao.getAllDienThoai();
    }
    
    public void addDienThoai(DienThoai dienThoai){
        dienThoaiDao.addDienThoai(dienThoai);
    }
    
    public void updateDienThoai(DienThoai dienThoai){
        dienThoaiDao.updateDienThoai(dienThoai);
    }
    
    public void deleteDienThoai(DienThoai dienThoai){
        dienThoaiDao.deleteDienThoai(dienThoai);
    }
}
