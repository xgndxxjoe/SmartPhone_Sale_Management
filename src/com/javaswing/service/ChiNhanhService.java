/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaswing.service;

import com.javaswing.dao.ChiNhanhDao;
import com.javaswing.model.ChiNhanh;
import java.util.List;

/**
 *
 * @author phamn
 */
public class ChiNhanhService {
    private ChiNhanhDao chiNhanhDao;
    
    public ChiNhanhService(){
        chiNhanhDao = new ChiNhanhDao();
    }
    
    public List<ChiNhanh> getAllChiNhanh(){
        return chiNhanhDao.getAllChiNhanh();
    }
    
    public void addChiNhanh(ChiNhanh chiNhanh) {
        chiNhanhDao.addChiNhanh(chiNhanh);
    }
    
    public void deleteChiNhanh(ChiNhanh chiNhanh) {
        chiNhanhDao.deleteChiNhanh(chiNhanh);
    }
    
    public void updateChiNhanh(ChiNhanh chiNhanh){
        chiNhanhDao.updateChiNhanh(chiNhanh);
    }
    
}
