package alunosapi.com.AlunosAPI.services;

import alunosapi.com.AlunosAPI.dto.mapper.StudentMapper;
import alunosapi.com.AlunosAPI.dto.request.StudentDTO;
import alunosapi.com.AlunosAPI.dto.response.MessageResponseDTO;
import alunosapi.com.AlunosAPI.entities.Student;
import alunosapi.com.AlunosAPI.repositories.StudentRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static alunosapi.com.AlunosAPI.utils.StudentUtils.createFakeDTO;
import static alunosapi.com.AlunosAPI.utils.StudentUtils.createFakeEntity;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {
    
    @Mock
    private StudentRepository studentRepository;
    
    @Mock
    private StudentMapper studentMapper;
    
    @InjectMocks
    private StudentService studentService;
    
    @Test
    void testGivenStudentDTOThenReturnSuccessSavedMessage() {
        StudentDTO StudentDTO = createFakeDTO();
        Student expectedSavedStudent = createFakeEntity();

        when(studentMapper.toModel(StudentDTO)).thenReturn(expectedSavedStudent);
        when(studentRepository.save(any(Student.class))).thenReturn(expectedSavedStudent);

        MessageResponseDTO expectedSuccessMessage = createExpectedSuccessMessage(expectedSavedStudent.getId());
        MessageResponseDTO successMessage = studentService.create(StudentDTO);

        assertEquals(expectedSuccessMessage, successMessage);





    }

    private MessageResponseDTO createExpectedSuccessMessage(Long savedPersonId) {
        return MessageResponseDTO.builder()
                .message("Student successfully created with ID"+savedPersonId)
                .build();
    }



}
