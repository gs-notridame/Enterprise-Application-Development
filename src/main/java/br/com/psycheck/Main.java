package br.com.psycheck;


import br.com.psycheck.infra.configuration.cors.CORSFilter;
//import br.com.psycheck.infra.configuration.jwt.JsTokenFilterNeeded;
import br.com.psycheck.infra.database.EntityManagerFactoryProvider;
import br.com.psycheck.infra.database.EntityManagerProvider;
import jakarta.inject.Singleton;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceContext;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.process.internal.RequestScoped;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

public class Main {

    public static final String BASE_URI = "http://localhost/api";

    public static final String PERSISTENCE_UNIT = "oracle";

    @PersistenceContext
    static EntityManager manager;


    public static HttpServer startServer() {


        final ResourceConfig rc = new ResourceConfig()
                // Configure container response filters (CORSFilter)
                .register(CORSFilter.class)
                // .register( UpdatableBCrypt.build(10))
//                 Configure container request filters (JsTokenFilterNeeded)
//                .register(JsTokenFilterNeeded.class)
                .register(EntityManagerFactoryProvider.class)
                .register(EntityManagerProvider.class)
                .register(
                        new AbstractBinder() {
                            @Override
                            protected void configure() {
                                bindFactory(EntityManagerFactoryProvider.class)
                                        .to(EntityManagerFactory.class)
                                        .in(Singleton.class);
                                bindFactory(EntityManagerProvider.class)
                                        .to(EntityManager.class)
                                        .in(RequestScoped.class);
                            }
                        }
                ).register(EntityManagerFactoryProvider.of(PERSISTENCE_UNIT).provide())


                .packages("br.com.psycheck.domain.resource");
        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
    }


    public static void main(String[] args) {
        final HttpServer server = startServer();
        System.out.printf("App PsyCheck started with endpoints / as %s%nHit Ctrl-C to stop it....%n", BASE_URI + "/paciente");
        try {
            System.in.read();
            server.stop();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}