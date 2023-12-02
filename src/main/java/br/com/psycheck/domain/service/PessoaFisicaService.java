package br.com.psycheck.domain.service;

import br.com.psycheck.domain.entity.pessoa.PessoaFisica;
import br.com.psycheck.domain.repository.PessoaFisicaRepository;
import br.com.psycheck.infra.database.EntityManagerFactoryProvider;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class PessoaFisicaService implements Service<PessoaFisica, Long>{

    private static final AtomicReference<PessoaFisicaService> instance = new AtomicReference<>();

    private final PessoaFisicaRepository repo;


    private PessoaFisicaService(PessoaFisicaRepository repo) {
        this.repo = repo;
    }

    public static PessoaFisicaService build(String persistenceUnit) {

        EntityManagerFactory factory = EntityManagerFactoryProvider.of( persistenceUnit ).provide();
        EntityManager manager = factory.createEntityManager();
        PessoaFisicaRepository repo = PessoaFisicaRepository.build( manager );

        instance.compareAndSet( null, new PessoaFisicaService( repo ) );
        return instance.get();
    }

    @Override
    public List<PessoaFisica> findAll() {
        return repo.findAll();
    }

    @Override
    public PessoaFisica findById(Long id) {
        return repo.findById( id );
    }

    @Override
    public PessoaFisica persist(PessoaFisica pessoaFisica) {
        return repo.persist(pessoaFisica);
    }
}
