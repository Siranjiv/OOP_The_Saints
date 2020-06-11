/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceLayer;

import DatabaseLayer.DatabaseConnection;
import Models.Laboratory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class LabService_final {

    ResultSet rs;
    private final DatabaseConnection con;
    Connection conn;

    public LabService_final() {
        con = DatabaseConnection.getSingleConnection();

    }

    public ArrayList<Laboratory> SearchLab(Laboratory l) {
        ArrayList<Laboratory> hallList = new ArrayList<>();
        try {

            String query = "select * from lab ";
            Statement st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {

                l = new Laboratory(rs.getString("Lab_no"), rs.getInt("No_of_tables"), rs.getInt("No_of_chairs"));

                hallList.add(l);
                return hallList;
            }

        } catch (SQLException sql) {
            System.out.println("Error " + sql.getMessage());

        }
        return hallList;

    }
}
