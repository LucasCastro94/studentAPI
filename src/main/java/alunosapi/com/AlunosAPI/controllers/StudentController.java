package alunosapi.com.AlunosAPI.controllers;

import alunosapi.com.AlunosAPI.dto.request.StudentDTO;
import alunosapi.com.AlunosAPI.dto.response.MessageResponseDTO;
import alunosapi.com.AlunosAPI.services.StudentService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
}
