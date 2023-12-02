package br.com.psycheck.domain.dto;

import br.com.psycheck.Main;
import br.com.psycheck.domain.entity.pessoa.Paciente;
import br.com.psycheck.domain.entity.pessoa.PessoaFisica;
import br.com.psycheck.domain.service.PacienteService;
import br.com.psycheck.domain.service.PessoaFisicaService;

import java.util.Objects;

public record PacienteDTO(
        Long codPaciente,
        String historico,
        Long numSeguroSaude,
        PessoaFisicaDTO pessoa
) {

    private static PacienteService service = PacienteService.build(Main.PERSISTENCE_UNIT);
    private static PessoaFisicaService pfService = PessoaFisicaService.build(Main.PERSISTENCE_UNIT);

    public static Paciente of(PacienteDTO dto) {
        Paciente paciente = new Paciente();

        if (Objects.isNull(dto)) return null;

        if (Objects.isNull(dto.pessoa)) return null;

        PessoaFisica pessoaFisica = new PessoaFisica();

        if (Objects.nonNull(dto.pessoa.codPessoa())) {
            pessoaFisica = pfService.findById(dto.pessoa.codPessoa());
        } else {
            pessoaFisica.setNome(dto.pessoa.nome());
            pessoaFisica.setEmail(dto.pessoa.email());
            pessoaFisica.setSoftDelete(dto.pessoa.softDelete());
            pessoaFisica.setUsuario(dto.pessoa.usuario());
            pessoaFisica.setSenha(dto.pessoa.senha());
            pessoaFisica.setDataNasc(dto.pessoa.dataNasc());
            pessoaFisica.setCpf(dto.pessoa.cpf());
            pessoaFisica.setGenero(GeneroDTO.of(dto.pessoa.genero()));
        }

        if (Objects.nonNull(dto.codPaciente)) return service.findById(dto.codPaciente);

        paciente.setPessoa(pessoaFisica);

        return paciente;
    }

    public static PacienteDTO of(Paciente paciente) {
        return new PacienteDTO(paciente.getCodPaciente(), paciente.getHistorico(), paciente.getNumSeguroSaude(), PessoaFisicaDTO.of(paciente.getPessoa()));
    }
}
