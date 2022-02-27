package mitocode.java.se.daoInterfaces;

import mitocode.java.se.model.Persona;

import java.util.List;

public interface DAOPersona {

    public void registrar(Persona per) throws Exception;
    public void modificar(Persona per) throws Exception;
    public void eliminar(Persona per) throws Exception;
    public List<Persona> listar() throws Exception;
}
