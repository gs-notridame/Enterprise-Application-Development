package br.com.psycheck.domain.resource;

import br.com.psycheck.Main;
import br.com.psycheck.domain.dto.NewPessoaFisicaDTO;
import br.com.psycheck.domain.dto.PacienteDTO;
import br.com.psycheck.domain.entity.pessoa.Paciente;
import br.com.psycheck.domain.service.PacienteService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriBuilder;
import jakarta.ws.rs.core.UriInfo;

import java.net.URI;
import java.util.Objects;

@Path("/paciente")
public class PacienteResource implements Resource<PacienteDTO, Long> {

    @Context
    private UriInfo uriInfo;

    private PacienteService service = PacienteService.build( Main.PERSISTENCE_UNIT );


    @GET
    @Override
    public Response findAll() {

        var pacientes = service.findAll()
                .stream()
                .map( PacienteDTO::of )
                .toList();

        return Response.ok( pacientes ).build();
    }


    @GET
    @Path("/{id}")
    @Override
    public Response findById(@PathParam("id") Long id) {

        Paciente paciente = service.findById( id );

        if (Objects.isNull( paciente )) return Response.status( 404 ).build();

        return Response.ok( PacienteDTO.of( paciente ) ).build();

    }

    @POST
    @Override
    public Response persist(PacienteDTO v) {

        var paciente = PacienteDTO.of( v );

        Paciente persisted = service.persist( paciente );

        if (Objects.isNull( persisted )) return Response.status( 400 ).build();

        UriBuilder ub = uriInfo.getAbsolutePathBuilder();
        URI uri = ub.path( String.valueOf( persisted.getCodPaciente() ) ).build();

        return Response.created( uri ).entity( PacienteDTO.of( persisted ) ).build();
    }

}
