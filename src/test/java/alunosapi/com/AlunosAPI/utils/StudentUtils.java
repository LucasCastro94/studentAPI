package alunosapi.com.AlunosAPI.utils;

import alunosapi.com.AlunosAPI.dto.request.StudentDTO;
import alunosapi.com.AlunosAPI.entities.Student;

import java.util.Collections;

public class StudentUtils {

    private static final long STUDENT_ID = 1L;
    private static final String NAME = "Ana";
    private static final String RA = "0502222";
    private static final String ENROLLED="8°";


    public static StudentDTO createFakeDTO()
    {
        return StudentDTO.builder()
                .name(NAME)
                .studentRA(RA)
                .enrolled(ENROLLED)
                .classes(Collections.singletonList(ClassesUtils.createFakeEntity()))
                .teachers(Collections.singletonList(TeacherUtils.TeacherFakeEntity()))
                .build();
    }

    public static Student createFakeEntity()
    {
        return Student.builder()
                .id(STUDENT_ID)
                .name(NAME)
                .studentRA(RA)
                .enrolled(ENROLLED)
                .classes(Collections.singletonList(ClassesUtils.createFakeEntity()))
                .teachers(Collections.singletonList(TeacherUtils.TeacherFakeEntity()))
                .build();
    }

}
