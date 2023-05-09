
package com.portfolio.jIbarra.Security.Service;

import com.portfolio.jIbarra.Security.Entity.Rol;
import com.portfolio.jIbarra.Security.Enums.RolNombre;
import com.portfolio.jIbarra.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    
    @Autowired
    iRolRepository iRolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return iRolRepository.findByRolNombre(rolNombre);
    } 
    
    public void save(Rol rol){
        iRolRepository.save(rol);
    }
}
