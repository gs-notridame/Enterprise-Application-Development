package br.com.psycheck.domain.repository;

import br.com.psycheck.domain.entity.pessoa.PessoaFisica;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class PessoaFisicaRepository implements Repository<PessoaFisica, Long> {
    private static final AtomicReference<br.com.psycheck.domain.repository.PessoaFisicaRepository> instance = new AtomicReference<>();

    private final EntityManager manager;

    private PessoaFisicaRepository(EntityManager manager) {
        this.manager = manager;
    }

    public static PessoaFisicaRepository build(EntityManager manager) {
        instance.compareAndSet(null, new PessoaFisicaRepository(manager));
        return instance.get();
    }

    @Override
    public List<PessoaFisica> findAll() {
        return manager.createQuery("From PessoaFisica").getResultList();
    }

    @Override
    public PessoaFisica findById(Long id) {
        return manager.find(PessoaFisica.class, id);
    }


    @Override
    public PessoaFisica persist(PessoaFisica pessoaFisica) {
        manager.getTransaction().begin();
        manager.merge(pessoaFisica);
        manager.getTransaction().commit();
        return pessoaFisica;
    }
}


