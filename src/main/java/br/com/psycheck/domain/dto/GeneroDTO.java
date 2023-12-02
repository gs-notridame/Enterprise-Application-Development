package br.com.psycheck.domain.dto;

import br.com.psycheck.Main;
import br.com.psycheck.domain.entity.Genero;
import br.com.psycheck.domain.entity.pessoa.PessoaFisica;
import br.com.psycheck.domain.service.GeneroService;
import br.com.psycheck.domain.service.PessoaFisicaService;

import java.util.Objects;

public record GeneroDTO (
        Long codGenero,
        String genero
) {
    private static GeneroService service = GeneroService.build(Main.PERSISTENCE_UNIT);

    public static Genero of(GeneroDTO p) {

        Genero genero = null;

        if (Objects.isNull(p)) return null;

        if (Objects.nonNull(p.codGenero)) {
            genero = service.findById(p.codGenero());
            return genero;
        }

        genero = new Genero();
        genero.setGenero(p.genero);

        return genero;
    }

    public static GeneroDTO of(Genero p) {
        return new GeneroDTO(p.getCodGenero(), p.getGenero() );
    }
}
