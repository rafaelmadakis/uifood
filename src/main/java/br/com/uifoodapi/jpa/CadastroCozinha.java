package br.com.uifoodapi.jpa;

import br.com.uifoodapi.domain.model.Cozinha;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @Author: Rafael Madakis
 */
@Component
public class CadastroCozinha {

    @PersistenceContext
    private EntityManager manager;

    public List<Cozinha> listar(){
        return manager.createQuery("from Cozinha", Cozinha.class).getResultList();
    }
}
