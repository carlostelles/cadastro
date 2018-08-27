package xyz.carlostelles.cadastro.business.data;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum PessoaTipo {
    PF("Pessoa Física", "PF"),
    PJ("Pessoa Jurídica", "PJ");

    private String code;
    private String name;

    PessoaTipo(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
