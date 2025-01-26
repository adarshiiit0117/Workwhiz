package com.dubey.Workwhiz.modal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Comments;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
public class Issue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String status;
    private Long projectId;
    private String priority;
    private List<String>tags=new ArrayList<>();
    @ManyToOne
    private User assignee;
    @JsonIgnore
    @ManyToOne
    private Project project;
    @JsonIgnore
    @OneToMany(mappedBy = "issue",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Comment>comments=new ArrayList<>();


}
