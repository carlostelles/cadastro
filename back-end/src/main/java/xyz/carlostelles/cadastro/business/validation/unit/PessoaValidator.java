package xyz.carlostelles.cadastro.business.validation.unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.stereotype.Component;

import xyz.carlostelles.cadastro.persistence.Pessoa;
import xyz.carlostelles.cadastro.persistence.PessoaRepository;

@Component
public class PessoaValidator implements ValidationUnit<Pessoa> {

    private final PessoaRepository repository;

    public PessoaValidator(PessoaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<String> validateCreate(Pessoa entity) {
        List<String> message = new ArrayList<>();

        this.validateIdCreate(entity, message);
        this.validateNome(entity, message);
        this.validadeTipo(entity, message);
        this.validadeDataNascimento(entity, message);
        this.validateUf(entity, message);
        this.validateCidade(entity, message);

        return message;
    }

    @Override
    public List<String> validateUpdate(Pessoa entity) {
        List<String> message = new ArrayList<>();

        this.validateIdUpdate(entity, message);
        this.validateNome(entity, message);
        this.validadeTipo(entity, message);
        this.validadeDataNascimento(entity, message);
        this.validateUf(entity, message);
        this.validateCidade(entity, message);

        return message;
    }

    private void validateIdUpdate(Pessoa entity, List<String> message) {
        if (Objects.isNull(entity.getId()) || !repository.existsById(entity.getId())) {
            message.add(VIOLATION_UPDATE_ID_MESSAGE);
        }
    }

    private void validateIdCreate(Pessoa entity, List<String> message) {
        if (Objects.nonNull(entity.getId())) {
            message.add(VIOLATION_CREATE_ID_MESSAGE);
        }
    }

    private void validateNome(Pessoa entity, List<String> message) {
        if (Objects.isNull(entity.getNome())) {
            message.add(String.format(VIOLATION_TEXT_MESSAGE, "Nome"));
        }
    }

    private void validadeTipo(Pessoa entity, List<String> message) {
        if (Objects.isNull(entity.getTipo())) {
            message.add(String.format(VIOLATION_TEXT_MESSAGE, "Tipo Pessoa"));
        }
    }

    private void validadeDataNascimento(Pessoa entity, List<String> message) {
        if (Objects.isNull(entity.getDataNascimento())) {
            message.add(String.format(VIOLATION_TEXT_MESSAGE, "Data Nascimento"));
        }
    }

    private void validateUf(Pessoa entity, List<String> message) {
        if (Objects.isNull(entity.getUf())) {
            message.add(String.format(VIOLATION_TEXT_MESSAGE, "Estado"));
        }
    }

    private void validateCidade(Pessoa entity, List<String> message) {
        if (Objects.isNull(entity.getCidade())) {
            message.add(String.format(VIOLATION_TEXT_MESSAGE, "Cidade"));
        }
    }
}
