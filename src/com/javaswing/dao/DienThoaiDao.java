/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaswing.dao;

import com.connectsqlserver.ConnectToSQLServer;
import com.javaswing.model.DienThoai;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phamn
 */
public class DienThoaiDao {
    
    public List<DienThoai> getAllDienThoai(){
        List<DienThoai> list = new ArrayList<>();
        Connection connection = ConnectToSQLServer.getConnectToSQLServer();
        String sql = "SELECT * FROM [DIENTHOAI]";
        
        try {
            PreparedStatement pre = connection.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            
            while(rs.next()){
                DienThoai dt = new DienThoai();
                
                dt.setMaDT(rs.getInt(1));
                dt.setTenDT(rs.getString(2));
                dt.setHeDieuHanh(rs.getString(3));
                dt.setRam(rs.getString(4));
                dt.setBoNho(rs.getString(5));
                dt.setGia(rs.getFloat(6));
                dt.setSoLuong(rs.getInt(7));
                
                list.add(dt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(DienThoaiDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return list;
    }
    
    public void addDienThoai(DienThoai dienThoai){
        Connection connection = ConnectToSQLServer.getConnectToSQLServer();
        
        String sql = "INSERT INTO [DIENTHOAI] ([MaDT], [TenDT], [HeDieuHanh], [RAM],"
                + "[BoNho], [Gia], [SoLuongKho])"
                + "VALUES(?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, dienThoai.getMaDT());
            preparedStatement.setString(2, dienThoai.getTenDT());
            preparedStatement.setString(3, dienThoai.getHeDieuHanh());
            preparedStatement.setString(4, dienThoai.getRam());
            preparedStatement.setString(5, dienThoai.getBoNho());
            preparedStatement.setFloat(6, dienThoai.getGia());
            preparedStatement.setInt(7, dienThoai.getSoLuong());
            
            int rs = preparedStatement.executeUpdate();
            if(rs == 1){
                System.out.println("Success");
            } else {
                System.out.println("Fail!");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ChiNhanhDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(ChiNhanhDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void deleteDienThoai(DienThoai dienThoai){
        Connection connection = ConnectToSQLServer.getConnectToSQLServer();
        
        String sql = "DELETE FROM [DIENTHOAI] WHERE MaDT = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, dienThoai.getMaDT());
            
            int rs = preparedStatement.executeUpdate();
            if(rs == 1){
                System.out.println("Success");
            } else {
                System.out.println("Fail!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiNhanhDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(ChiNhanhDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void updateDienThoai(DienThoai dienThoai){
        Connection conn = ConnectToSQLServer.getConnectToSQLServer();
        String sql = "UPDATE [DIENTHOAI] SET [TenDT] = ?, [HeDieuHanh] = ?, "
                + "[RAM] = ?, [BoNho] = ?, [Gia] = ?, [SoLuongKho] = ? WHERE [MaDT] = ?";
        
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            
            pre.setString(1, dienThoai.getTenDT());
            pre.setString(2, dienThoai.getHeDieuHanh());
            pre.setString(3, dienThoai.getRam());
            pre.setString(4, dienThoai.getBoNho());
            pre.setFloat(5, dienThoai.getGia());
            pre.setInt(6, dienThoai.getSoLuong());
            pre.setInt(7, dienThoai.getMaDT());
            
            int rs = pre.executeUpdate();
            if(rs == 1){
                System.out.println("Success");
            } else {
                System.out.println("Fail!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiNhanhDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ChiNhanhDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
