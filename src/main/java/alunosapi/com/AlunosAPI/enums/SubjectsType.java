package alunosapi.com.AlunosAPI.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
public enum SubjectsType {
    MATEMATICA("Matematíca"),
    PORTUGUES("Português"),
    GEOGRAFIA("Geografia");

    private String description;


}
