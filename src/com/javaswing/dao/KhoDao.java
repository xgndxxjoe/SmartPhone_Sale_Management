/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaswing.dao;

import com.connectsqlserver.ConnectToSQLServer;
import com.javaswing.model.Kho;
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
public class KhoDao {
    public List<Kho> getAllKho(){
        List<Kho> list = new ArrayList<>();
        Connection connection = ConnectToSQLServer.getConnectToSQLServer();
        String sql = "SELECT * FROM [KHO]";
        
        try {
            PreparedStatement pre = connection.prepareStatement(sql);
            
            ResultSet rs = pre.executeQuery();
            
            while(rs.next()){
                Kho kho = new Kho();
                kho.setMaKho(rs.getInt("MaKho"));
                kho.setTenKho(rs.getString("TenKho"));
                kho.setDiaChi(rs.getString("DiaChi"));
                kho.setMaCN(rs.getInt("MaCN"));
                
                list.add(kho);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(KhoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return list;
    }
    
    public void addKho(Kho kho){
        Connection connection = ConnectToSQLServer.getConnectToSQLServer();
        
        String sql = "INSERT INTO [KHO] (MaKho, TenKho, DiaChi, MaCN)"
                + "VALUES(?, ?, ?, ?)";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, kho.getMaKho());
            preparedStatement.setString(2, kho.getTenKho());
            preparedStatement.setString(3, kho.getDiaChi());
            preparedStatement.setInt(4, kho.getMaCN());
            
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
    
    public void deleteKho(Kho kho){
        Connection connection = ConnectToSQLServer.getConnectToSQLServer();
        
        String sql = "DELETE FROM [KHO] WHERE MaKho = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, kho.getMaCN());
            
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
    
    public void updateKho(Kho kho){
        Connection conn = ConnectToSQLServer.getConnectToSQLServer();
        String sql = "UPDATE [KHO] SET [TenKho] = ?, [DiaChi] = ?, [MaCN] = ? WHERE [MaKho] = ?";
        
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            
            pre.setString(1, kho.getTenKho());
            pre.setString(2, kho.getDiaChi());
            pre.setInt(3, kho.getMaCN());
            pre.setInt(4, kho.getMaKho());
            
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
