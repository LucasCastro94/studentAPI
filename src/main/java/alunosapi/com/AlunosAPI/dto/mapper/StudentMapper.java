package alunosapi.com.AlunosAPI.dto.mapper;

import alunosapi.com.AlunosAPI.dto.request.StudentDTO;
import alunosapi.com.AlunosAPI.entities.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    Student toModel(StudentDTO dto);

    StudentDTO toDTO(Student dto);
}
