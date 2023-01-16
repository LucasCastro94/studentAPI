package alunosapi.com.AlunosAPI.services;

import alunosapi.com.AlunosAPI.dto.mapper.StudentMapper;
import alunosapi.com.AlunosAPI.dto.request.StudentDTO;
import alunosapi.com.AlunosAPI.dto.response.MessageResponseDTO;
import alunosapi.com.AlunosAPI.entities.Student;
import alunosapi.com.AlunosAPI.repositories.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public MessageResponseDTO create(StudentDTO studentDTO)
    {
        Student student = studentMapper.toModel(studentDTO);
        Student savedStudent = studentRepository.save(student);

        MessageResponseDTO messageResponseDTO = createMessageResponse("Person successfully created with ID",savedStudent.getId());

        return messageResponseDTO;
    }

    private MessageResponseDTO createMessageResponse(String s, Long id)
    {
        return MessageResponseDTO.builder().message(s+id).build();
    }


}

