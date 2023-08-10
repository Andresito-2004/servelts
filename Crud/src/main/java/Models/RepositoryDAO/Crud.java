package Models.RepositoryDAO;

import Models.Beans.Programa;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface Crud {
    public List listar() throws SQLException;
    public Programa listarID(Integer id) throws SQLException;
    public String Guardar( String name, String estado) throws SQLException;
    public String Editar(Integer id, String name, String estado) throws SQLException;
    public Programa Delete(Integer id) throws SQLException;

}
