package alunosapi.com.AlunosAPI.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false,unique = true)
    private String studentRA;

    @Column(nullable = false)
    private String enrolled;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Classes> classes = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Teacher> teachers = new ArrayList<>();

}
