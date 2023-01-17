package alunosapi.com.AlunosAPI.utils;

import alunosapi.com.AlunosAPI.dto.request.ClassesDTO;
import alunosapi.com.AlunosAPI.entities.Classes;
import alunosapi.com.AlunosAPI.enums.SubjectsType;

public class ClassesUtils {

    private static final long CLASSES_ID = 1l;
    private static final SubjectsType SUBJECT = SubjectsType.GEOGRAFIA;

    public static ClassesDTO createFakeDTO()
    {
        return ClassesDTO.builder()
                .subject(SUBJECT)
                .build();
    }

    public static Classes createFakeEntity()
    {
        return Classes.builder()
                .id(CLASSES_ID)
                .subject(SUBJECT)
                .build();
    }
}
