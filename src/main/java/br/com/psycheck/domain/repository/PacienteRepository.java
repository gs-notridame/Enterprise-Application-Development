package br.com.psycheck.domain.repository;

import br.com.psycheck.domain.entity.pessoa.Paciente;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class PacienteRepository implements Repository<Paciente, Long>{
    private static final AtomicReference<PacienteRepository> instance = new AtomicReference<>();

    private final EntityManager manager;

    private PacienteRepository(EntityManager manager) {
        this.manager = manager;
    }

    public static PacienteRepository build(EntityManager manager) {
        instance.compareAndSet(null, new PacienteRepository(manager));
        return instance.get();
    }

    @Override
    public List<Paciente> findAll() {
        return manager.createQuery("From Paciente").getResultList();
    }

    @Override
    public Paciente findById(Long id) {
        return manager.find(Paciente.class, id);
    }


    @Override
    public Paciente persist(Paciente paciente) {
        manager.getTransaction().begin();
        manager.persist(paciente);
        manager.getTransaction().commit();
        return paciente;
    }
}
