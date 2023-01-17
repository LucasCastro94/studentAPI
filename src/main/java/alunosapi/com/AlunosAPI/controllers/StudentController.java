package alunosapi.com.AlunosAPI.controllers;

import alunosapi.com.AlunosAPI.dto.request.StudentDTO;
import alunosapi.com.AlunosAPI.dto.response.MessageResponseDTO;
import alunosapi.com.AlunosAPI.exception.StudentNotFoundException;
import alunosapi.com.AlunosAPI.services.StudentService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO create(@RequestBody @Valid StudentDTO studentDTO) {
        return studentService.create(studentDTO);
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public StudentDTO findById(@PathVariable Long id) throws StudentNotFoundException {
        return studentService.findById(id);
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<StudentDTO> listAll() {
        return studentService.listAll();
    }


    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MessageResponseDTO update(@PathVariable Long id, @RequestBody @Valid StudentDTO studentDTO) throws StudentNotFoundException{
        return studentService.update(id, studentDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) throws StudentNotFoundException {
        studentService.delete(id);
    }






}
