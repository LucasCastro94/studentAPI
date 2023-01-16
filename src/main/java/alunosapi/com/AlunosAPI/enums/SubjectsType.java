package alunosapi.com.AlunosAPI.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SubjectsType {
    MATEMATICA("Matematíca"),
    PORTUGUES("Português"),
    FISICA("Física"),
    INGLES("Inglês"),
    GEOGRAFIA("Geografia");

    private String description;


}
