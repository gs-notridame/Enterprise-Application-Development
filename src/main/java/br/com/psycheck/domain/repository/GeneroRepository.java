package br.com.psycheck.domain.repository;

import br.com.psycheck.domain.entity.Genero;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class GeneroRepository implements Repository<Genero, Long> {

    private static final AtomicReference<GeneroRepository> instance = new AtomicReference<>();

    private final EntityManager manager;

    private GeneroRepository(EntityManager manager) {
        this.manager = manager;
    }

    public static GeneroRepository build(EntityManager manager) {
        instance.compareAndSet(null, new GeneroRepository(manager));
        return instance.get();
    }

    @Override
    public List<Genero> findAll() {
        return manager.createQuery("From Genero").getResultList();
    }

    @Override
    public Genero findById(Long id) {
        return manager.find(Genero.class, id);
    }


    @Override
    public Genero persist(Genero genero) {
        manager.getTransaction().begin();
        manager.merge(genero);
        manager.getTransaction().commit();
        return genero;
    }

}
