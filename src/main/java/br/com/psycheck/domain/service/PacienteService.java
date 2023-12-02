package br.com.psycheck.domain.service;

import br.com.psycheck.domain.entity.pessoa.Paciente;
import br.com.psycheck.domain.repository.PacienteRepository;
import br.com.psycheck.infra.database.EntityManagerFactoryProvider;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class PacienteService implements Service<Paciente, Long>{
    private static final AtomicReference<PacienteService> instance = new AtomicReference<>();

    private final PacienteRepository repo;


    private PacienteService(PacienteRepository repo) {
        this.repo = repo;
    }

    public static PacienteService build(String persistenceUnit) {

        EntityManagerFactory factory = EntityManagerFactoryProvider.of( persistenceUnit ).provide();
        EntityManager manager = factory.createEntityManager();
        PacienteRepository repo = PacienteRepository.build( manager );

        instance.compareAndSet( null, new PacienteService( repo ) );
        return instance.get();
    }

    @Override
    public List<Paciente> findAll() {
        return repo.findAll();
    }

    @Override
    public Paciente findById(Long id) {
        return repo.findById( id );
    }

    @Override
    public Paciente persist(Paciente paciente) {
        return repo.persist(paciente);
    }
}
