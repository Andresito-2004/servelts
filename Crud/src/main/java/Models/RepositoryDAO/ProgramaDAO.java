package Models.RepositoryDAO;

import Models.Beans.Programa;
import Models.Util.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProgramaDAO implements Crud{
    private static final String SQL_SELECT = "SELECT * FROM programa";
    @Override
    public List listar()  {
        ResultSet rs = null;
        PreparedStatement ps = null;
        Connection conn = null;
        List<Programa> programas = new ArrayList<>();
        try {
            conn = ConnectionPool.getConnection();
            ps = conn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();
            while (rs.next()) {
                Programa p = new Programa();
                p.setIdentification_program(rs.getInt("ide_Pro"));
                p.setName_program(rs.getString("nom_Pro"));
                p.setState_program(rs.getString("est_Pro"));
                programas.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            ConnectionPool.Close(rs);
            ConnectionPool.Close(ps);
            ConnectionPool.Close(conn);
        }
        return programas;
    }

    @Override
    public Programa listarID(Integer id) throws SQLException {
        return null;
    }

    @Override
    public String Guardar(String name, String estado) throws SQLException {
        return null;
    }

    @Override
    public String Editar(Integer id, String name, String estado) throws SQLException {
        return null;
    }

    @Override
    public Programa Delete(Integer id) throws SQLException {
        return null;
    }
}
