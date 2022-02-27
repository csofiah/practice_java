package mitocode.java.se.dao;

import mitocode.java.se.daoInterfaces.DAOPersona;
import mitocode.java.se.model.Persona;

public class MainDAO {

    public static void main(String[] args) {
        Persona per = new Persona();
        per.setNombre("Mitocode");
       // per.setId(11);
        try{
            DAOPersona dao = new DAOPersonaImpl();
            dao.registrar(per);
           // dao.modificar(per);

            //listar
            for (Persona p: dao.listar()) {
                System.out.println(p.getNombre());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
