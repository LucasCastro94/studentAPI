package alunosapi.com.AlunosAPI.dto.request;

import alunosapi.com.AlunosAPI.enums.SubjectsType;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClassesDTO {
    private Long id;

    @NotBlank
    @Enumerated(EnumType.STRING)
    private SubjectsType subject;
}
