package br.com.psycheck.domain.dto;

import br.com.psycheck.Main;
import br.com.psycheck.domain.entity.pessoa.PessoaFisica;
import br.com.psycheck.domain.service.PessoaFisicaService;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.PastOrPresent;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.util.Objects;

public record PessoaFisicaDTO(
        Long codPessoa,
        String nome,
        @Email String email,
        Boolean softDelete,
        String usuario,
        String senha,
        @PastOrPresent LocalDate dataNasc,
        @CPF String cpf,
        GeneroDTO genero
) {

    private static PessoaFisicaService service = PessoaFisicaService.build(Main.PERSISTENCE_UNIT);

    public static PessoaFisica of(PessoaFisicaDTO p) {

        PessoaFisica pessoa = null;

        if (Objects.isNull(p)) return null;

        if (Objects.nonNull(p.codPessoa)) {
            pessoa = service.findById(p.codPessoa());
            return pessoa;
        }

        pessoa = new PessoaFisica();
        pessoa.setNome(p.nome);
        pessoa.setEmail(p.email);
        pessoa.setSoftDelete(p.softDelete);
        pessoa.setUsuario(p.usuario);
        pessoa.setSenha(p.senha);
        pessoa.setDataNasc(p.dataNasc);
        pessoa.setCpf(p.cpf);
        pessoa.setGenero(GeneroDTO.of(p.genero));

        return pessoa;
    }

    public static PessoaFisicaDTO of(PessoaFisica p) {
        return new PessoaFisicaDTO( p.getCodPessoa(),p.getNome(), p.getEmail(), p.getSoftDelete(), p.getUsuario(), p.getSenha(), p.getDataNasc(), p.getCpf(), GeneroDTO.of(p.getGenero()) );
    }
}
