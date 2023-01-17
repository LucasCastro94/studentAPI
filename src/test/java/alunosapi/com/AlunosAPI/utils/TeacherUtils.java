package alunosapi.com.AlunosAPI.utils;


import alunosapi.com.AlunosAPI.dto.request.TeacherDTO;
import alunosapi.com.AlunosAPI.entities.Teacher;

public class TeacherUtils {

    private static final long TEACHER_ID = 1l;

    private static final String NAME = "MARCOS";

    private static final String PROF_RA = "185555";

    public static TeacherDTO createFakeDTO()
    {
        return TeacherDTO.builder()
                .name(NAME)
                .profRA(PROF_RA)
                .build();
    }

    public static Teacher TeacherFakeEntity()
    {
        return Teacher.builder()
                .id(TEACHER_ID)
                .name(NAME)
                .profRA(PROF_RA)
                .build();
    }

}
