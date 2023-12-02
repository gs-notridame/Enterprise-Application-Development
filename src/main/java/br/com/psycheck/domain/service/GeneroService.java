package br.com.psycheck.domain.service;

import br.com.psycheck.domain.entity.Genero;
import br.com.psycheck.domain.repository.GeneroRepository;
import br.com.psycheck.infra.database.EntityManagerFactoryProvider;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class GeneroService implements Service<Genero, Long>{

    private static final AtomicReference<GeneroService> instance = new AtomicReference<>();

    private final GeneroRepository repo;


    private GeneroService(GeneroRepository repo) {
        this.repo = repo;
    }

    public static GeneroService build(String persistenceUnit) {

        EntityManagerFactory factory = EntityManagerFactoryProvider.of( persistenceUnit ).provide();
        EntityManager manager = factory.createEntityManager();
        GeneroRepository repo = GeneroRepository.build( manager );

        instance.compareAndSet( null, new GeneroService( repo ) );
        return instance.get();
    }

    @Override
    public List<Genero> findAll() {
        return repo.findAll();
    }

    @Override
    public Genero findById(Long id) {
        return repo.findById( id );
    }

    @Override
    public Genero persist(Genero genero) {
        return repo.persist(genero);
    }
}
