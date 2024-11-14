package org.Insomnia.weAreTheZearthansPlugin.database;


import org.Insomnia.weAreTheZearthansPlugin.WeAreTheZearthansPlugin;

import java.io.File;
import java.sql.*;

public class SQLiteLoader {
    private Connection conn;
    private Statement stmt;
    private ResultSet result;

    public SQLiteLoader(WeAreTheZearthansPlugin instance){
        String path = instance.getDataFolder() + File.separator + "ZDB.db";
        try{
            conn = DriverManager.getConnection("jdbc:sqlite:" + path);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
