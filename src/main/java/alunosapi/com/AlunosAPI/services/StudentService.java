package alunosapi.com.AlunosAPI.services;

import alunosapi.com.AlunosAPI.dto.mapper.StudentMapper;
import alunosapi.com.AlunosAPI.dto.request.StudentDTO;
import alunosapi.com.AlunosAPI.dto.response.MessageResponseDTO;
import alunosapi.com.AlunosAPI.entities.Student;
import alunosapi.com.AlunosAPI.exception.StudentNotFoundException;
import alunosapi.com.AlunosAPI.repositories.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public StudentDTO findById(Long id) throws StudentNotFoundException {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));

        return studentMapper.toDTO(student);
    }

    public List<StudentDTO> listAll() {
        List<Student> people = studentRepository.findAll();
        return people.stream()
                .map(studentMapper::toDTO)//para cada cada um converte para DTO
                .collect(Collectors.toList()); // joga para uma lista
    }


    public MessageResponseDTO update(Long id, StudentDTO personDTO) throws StudentNotFoundException {
        studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id)); // caso não acha essa pessoa lance a exceção

        Student updatedPerson = studentMapper.toModel(personDTO);
        Student savedPerson = studentRepository.save(updatedPerson);

        MessageResponseDTO messageResponse = createMessageResponse("Person successfully updated with ID ", savedPerson.getId());

        return messageResponse;
    }

    public void delete(Long id) throws StudentNotFoundException {
        studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));

        studentRepository.deleteById(id);
    }



    private MessageResponseDTO createMessageResponse(String s, Long id)
    {
        return MessageResponseDTO.builder().message(s+id).build();
    }


}

