package com.dubey.Workwhiz.repository;

public class InviteRequest {
    private Long projectId;
    private String email;

    // No-args constructor
    public InviteRequest() {}

    // All-args constructor
    public InviteRequest(Long projectId, String email) {
        this.projectId = projectId;
        this.email = email;
    }

    // Getter for projectId
    public Long getProjectId() {
        return projectId;
    }

    // Setter for projectId
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // toString method
    @Override
    public String toString() {
        return "InviteRequest{" +
                "projectId=" + projectId +
                ", email='" + email + '\'' +
                '}';
    }

    // hashCode and equals methods
    @Override
    public int hashCode() {
        int result = projectId != null ? projectId.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        InviteRequest that = (InviteRequest) obj;

        if (projectId != null ? !projectId.equals(that.projectId) : that.projectId != null) return false;
        return email != null ? email.equals(that.email) : that.email == null;
    }
}
