package com.dubey.Workwhiz.modal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Assuming Project and User are custom classes in the same package or another package
import com.dubey.Workwhiz.modal.Project;
import com.dubey.Workwhiz.modal.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class IssueDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generate the ID
    private Long id;
    private String title;
    private String description;
    private String status;
    private Long ProjectID;
    private String priority;
    private LocalDate dueDate;
    private List<String> tags = new ArrayList<>();
    private Project project;
    private User assignee;

    // No-args constructor
    public IssueDTO() {}

    // All-args constructor
    public IssueDTO(Long id, String title, String description, String status, Long ProjectID, String priority, LocalDate dueDate, List<String> tags, Project project, User assignee) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.ProjectID = ProjectID;
        this.priority = priority;
        this.dueDate = dueDate;
        this.tags = tags;
        this.project = project;
        this.assignee = assignee;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getProjectID() {
        return ProjectID;
    }

    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public User getAssignee() {
        return assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }

    // toString method
    @Override
    public String toString() {
        return "IssueDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", ProjectID=" + ProjectID +
                ", priority='" + priority + '\'' +
                ", dueDate=" + dueDate +
                ", tags=" + tags +
                ", project=" + project +
                ", assignee=" + assignee +
                '}';
    }
}
