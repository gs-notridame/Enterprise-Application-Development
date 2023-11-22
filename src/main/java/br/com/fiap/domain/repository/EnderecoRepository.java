package br.com.fiap.domain.repository;

import br.com.fiap.domain.entity.Endereco;
import jakarta.persistence.EntityManager;

import java.util.concurrent.atomic.AtomicReference;

public class EnderecoRepository {

    private static final AtomicReference<EnderecoRepository> instance = new AtomicReference<>();

    private final EntityManager manager;

    private EnderecoRepository(EntityManager manager) {
        this.manager = manager;
    }

    public static EnderecoRepository build(EntityManager manager) {
        instance.compareAndSet(null, new EnderecoRepository(manager));
        return instance.get();
    }

    public Endereco persist(Endereco endereco) {
        manager.getTransaction().begin();
        manager.persist(endereco);
        manager.getTransaction().commit();
        return endereco;
    }
}
