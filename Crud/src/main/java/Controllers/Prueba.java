package Controllers;

import Models.Beans.Programa;
import Models.Util.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Prueba {
    public static void main(String[] args) {
        List<Programa> pro = new ArrayList<>();
        try {
            Connection conn = ConnectionPool.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM programa");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Programa p = new Programa();
                p.setIdentification_program(rs.getInt("ide_Pro"));
                p.setName_program(rs.getString("nom_Pro"));
                p.setState_program(rs.getString("est_Pro"));
                pro.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        for (Programa prgram: pro) {
            System.out.println("ide: "+prgram.getIdentification_program());
            System.out.println("name: "+prgram.getName_program());
            System.out.println("state: "+prgram.getState_program());
            
        }
    }
}
