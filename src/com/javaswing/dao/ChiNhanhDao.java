/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaswing.dao;

import com.connectsqlserver.ConnectToSQLServer;
import com.javaswing.model.ChiNhanh;
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
public class ChiNhanhDao {
    public List<ChiNhanh> getAllChiNhanh(){
        List<ChiNhanh> chiNhanhList = new ArrayList<>();
        
        Connection connection = ConnectToSQLServer.getConnectToSQLServer();
        String sql = "SELECT * FROM [CHINHANH]";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                ChiNhanh cn = new ChiNhanh();
                
                cn.setMaCN(rs.getInt("MaCN"));
                cn.setTenCN(rs.getString("TenCN"));
                cn.setDiaChi(rs.getString("DiaChi"));
                cn.setSdt(rs.getInt("SDT"));
                
                chiNhanhList.add(cn);
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
        
        return chiNhanhList;
    }
    
    public void addChiNhanh(ChiNhanh chiNhanh){
        Connection connection = ConnectToSQLServer.getConnectToSQLServer();
        
        String sql = "INSERT INTO [CHINHANH] (MaCN, TenCN, DiaChi, SDT)"
                + "VALUES(?, ?, ?, ?)";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, chiNhanh.getMaCN());
            preparedStatement.setString(2, chiNhanh.getTenCN());
            preparedStatement.setString(3, chiNhanh.getDiaChi());
            preparedStatement.setInt(4, chiNhanh.getSdt());
            
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
    
    public void deleteChiNhanh(ChiNhanh chiNhanh){
        Connection connection = ConnectToSQLServer.getConnectToSQLServer();
        
        String sql = "DELETE FROM [CHINHANH] WHERE MaCN = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, chiNhanh.getMaCN());
            
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
    
    public void updateChiNhanh(ChiNhanh chiNhanh){
        Connection conn = ConnectToSQLServer.getConnectToSQLServer();
        String sql = "UPDATE [CHINHANH] SET TenCN = ?, DiaChi = ?, SDT = ? WHERE MaCN = ?";
        
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            
            pre.setString(1, chiNhanh.getTenCN());
            pre.setString(2, chiNhanh.getDiaChi());
            pre.setInt(3, chiNhanh.getSdt());
            pre.setInt(4, chiNhanh.getMaCN());
            
            
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
