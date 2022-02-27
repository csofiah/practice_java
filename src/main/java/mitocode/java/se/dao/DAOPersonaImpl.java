package mitocode.java.se.dao;

import mitocode.java.se.daoInterfaces.DAOPersona;
import mitocode.java.se.model.Persona;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOPersonaImpl extends  Conexion implements DAOPersona {

    @Override
    public void registrar(Persona per) throws Exception {
        try {
            this.conectar();
            PreparedStatement st  = this.conexion.prepareStatement("INSERT INTO Persona(nombre) VALUES(?)");
            st.setString(1, per.getNombre());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally {
            this.cerrar();
        }
    }

    @Override
    public void modificar(Persona per) throws Exception {
        try {
            this.conectar();
            PreparedStatement st  = this.conexion.prepareStatement("UPDATE Persona(nombre) set nombre = ? where id = ?");
            st.setString(1, per.getNombre());
            st.setInt(2, per.getId());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally {
            this.cerrar();
        }
    }

    @Override
    public void eliminar(Persona per) throws Exception {
        try {
            this.conectar();
            PreparedStatement st  = this.conexion.prepareStatement("DELETE from Persona where id = ?");
            st.setInt(1, per.getId());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally {
            this.cerrar();
        }
    }

    @Override
    public List<Persona> listar() throws Exception {
        List<Persona> personas = null;
        try {
            this.conectar();
            PreparedStatement st  = this.conexion.prepareStatement("SELECT * from Persona");
            personas = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Persona per = new Persona();
                per.setId(rs.getInt("id"));
                per.setNombre(rs.getString("nombre"));
                personas.add(per);
            }
            rs.close();
            st.close();
        }catch(Exception e){
            throw e;
        }finally {
            this.cerrar();
        }
        return personas;
    }
}
