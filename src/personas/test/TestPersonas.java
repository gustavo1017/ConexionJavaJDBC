/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.test;
import java.sql.SQLException;
import java.util.List;
import personas.dto.PersonaDTO;
import personas.jdbc.PersonaDao;
import personas.jdbc.PersonaDaoJDBC;

/**
 *
 * @author Gustavo
 */
public class TestPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaDao personaDao = new PersonaDaoJDBC();
        PersonaDTO persona = new PersonaDTO();
        persona.setNombre("Maria");
        persona.setApellido("Lucia");
        try{
           // personaDao.insert(persona);
           personaDao.delete(new PersonaDTO(6));
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        
    }
    
}
