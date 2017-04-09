/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class DAO {
    public static Connection connectNow() throws SQLException {
        String url = GlobalConfig.getCONNECTION_URL_PREFIX() + GlobalConfig.getHOST() + GlobalConfig.getDATABASE();
        Connection conn = DriverManager.getConnection(url, GlobalConfig.getUSERNAME(), GlobalConfig.getPASSWORD());

        return conn;
    }
}
