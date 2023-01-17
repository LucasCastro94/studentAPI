package alunosapi.com.AlunosAPI.mapper;

import alunosapi.com.AlunosAPI.dto.mapper.StudentMapper;
import alunosapi.com.AlunosAPI.dto.request.ClassesDTO;
import alunosapi.com.AlunosAPI.dto.request.StudentDTO;
import alunosapi.com.AlunosAPI.entities.Classes;
import alunosapi.com.AlunosAPI.entities.Student;
import alunosapi.com.AlunosAPI.utils.StudentUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class StudentMapperTest {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    void testGivenStudentDTOThenReturnStudentEntity() {
        StudentDTO studentDTO = StudentUtils.createFakeDTO();
        Student student = studentMapper.toModel(studentDTO);

        assertEquals(studentDTO.getName(),student.getName());
        assertEquals(studentDTO.getStudentRA(),student.getStudentRA());
        assertEquals(studentDTO.getEnrolled(),student.getEnrolled());

        assertEquals(studentDTO.getClasses().get(0),student.getClasses().get(0));
        assertEquals(studentDTO.getTeachers().get(0),student.getTeachers().get(0));
    }

    @Test
    void testGivenStudentEntityThenReturnStudentDTO() {
        Student student = StudentUtils.createFakeEntity();
        StudentDTO studentDTO = studentMapper.toDTO(student);

        assertEquals(student.getName(),studentDTO.getName());
        assertEquals(student.getStudentRA(),studentDTO.getStudentRA());
        assertEquals(student.getEnrolled(),studentDTO.getEnrolled());

        assertEquals(student.getClasses().get(0),studentDTO.getClasses().get(0));
        assertEquals(student.getTeachers().get(0),studentDTO.getTeachers().get(0));
    }

}
