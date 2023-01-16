package alunosapi.com.AlunosAPI.dto.request;

import alunosapi.com.AlunosAPI.entities.Classes;
import alunosapi.com.AlunosAPI.entities.Teacher;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

    private Long id;

    @NotBlank
    @Size(min = 2, max = 100)
    private String name;

    @NotBlank
    @Size(max = 10)
    private String studentRA;

    @Size(max = 2)
    @NotBlank
    private String enrolled;

    @Valid
    @NotBlank
    private List<Classes> classes;

    @Valid
    @NotBlank
    private List<Teacher> teachers;



}
