package alunosapi.com.AlunosAPI.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SubjectsType {
    MATEMATICA("Matematíca"),
    PORTUGUES("Português"),
    GEOGRAFIA("Geografia");

    SubjectsType(String description) {
        this.description = description;
    }

    private String description;


}
