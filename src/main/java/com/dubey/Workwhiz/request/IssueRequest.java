package com.dubey.Workwhiz.request;

import java.time.LocalDate;

public class IssueRequest {
    private String title;
    private String description;
    private String status;
    private Long projectID;
    private String priority;
    private LocalDate dueDate;

    // No-args constructor
    public IssueRequest() {}

    // All-args constructor
    public IssueRequest(String title, String description, String status, Long projectID, String priority, LocalDate dueDate) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.projectID = projectID;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    // Getter and Setter Methods
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Long getProjectID() { return projectID; }
    public void setProjectID(Long projectID) { this.projectID = projectID; }

    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

    @Override
    public String toString() {
        return "IssueRequest{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", projectID=" + projectID +
                ", priority='" + priority + '\'' +
                ", dueDate=" + dueDate +
                '}';
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (projectID != null ? projectID.hashCode() : 0);
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        result = 31 * result + (dueDate != null ? dueDate.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        IssueRequest that = (IssueRequest) obj;

        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (projectID != null ? !projectID.equals(that.projectID) : that.projectID != null) return false;
        if (priority != null ? !priority.equals(that.priority) : that.priority != null) return false;
        return dueDate != null ? dueDate.equals(that.dueDate) : that.dueDate == null;
    }
}
