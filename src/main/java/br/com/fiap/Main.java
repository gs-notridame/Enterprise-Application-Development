package br.com.fiap;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

    public static final String PERSISTENCE_UNIT = "oracle-fiap";

    public static void main(String[] args) {
        // Cria o EntityManagerFactory com base na unidade de persistência
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);

        // Cria o EntityManager a partir do EntityManagerFactory
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Agora você pode usar o entityManager para interagir com o banco de dados

        // Exemplo: Iniciar uma transação e realizar operações no banco de dados
        entityManager.getTransaction().begin();

        // ... suas operações no banco de dados aqui ...

        // Commit da transação
        entityManager.getTransaction().commit();

        // Fechar o EntityManager e o EntityManagerFactory ao finalizar
        entityManager.close();
        entityManagerFactory.close();
    }
}
