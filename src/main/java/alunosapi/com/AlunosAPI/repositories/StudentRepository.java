package alunosapi.com.AlunosAPI.repositories;

import alunosapi.com.AlunosAPI.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
