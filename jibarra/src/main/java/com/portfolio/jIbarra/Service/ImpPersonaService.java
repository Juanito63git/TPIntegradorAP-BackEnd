package com.portfolio.jIbarra.Service;

import com.portfolio.jIbarra.Entity.Persona;
import com.portfolio.jIbarra.Interface.IPersonaService;
import com.portfolio.jIbarra.Repository.IPersonaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService {

    @Autowired
    IPersonaRepository ipersonaRepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> listaPer = ipersonaRepository.findAll();
        return listaPer;
    }

    @Override
    public void savePersona(Persona per) {
        ipersonaRepository.save(per);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona per = ipersonaRepository.findById(id).orElse(null);
        return per;
    }

}
