package com.portfolio.jIbarra.Interface;

import com.portfolio.jIbarra.Entity.Persona;
import java.util.List;

/**
 *
 * @author Juanito
 */
public interface IPersonaService {

    /* Traer Lista de Personas */
    public List<Persona> getPersona();

    /* Guardar objeto Persona */
    public void savePersona(Persona per);
    
    /* Eliminar Persona x id */
    public void deletePersona(Long id);
    
      /* Buscar Persona x id */
    public Persona findPersona(Long id);
    
}
