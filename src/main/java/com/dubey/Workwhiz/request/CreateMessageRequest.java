package com.dubey.Workwhiz.request;

public class CreateMessageRequest {
    private Long senderId;
    private String content;
    private Long projectId;

    // No-args constructor
    public CreateMessageRequest() {}

    // All-args constructor
    public CreateMessageRequest(Long senderId, String content, Long projectId) {
        this.senderId = senderId;
        this.content = content;
        this.projectId = projectId;
    }

    // Getter for senderId
    public Long getSenderId() {
        return senderId;
    }

    // Setter for senderId
    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    // Getter for content
    public String getContent() {
        return content;
    }

    // Setter for content
    public void setContent(String content) {
        this.content = content;
    }

    // Getter for projectId
    public Long getProjectId() {
        return projectId;
    }

    // Setter for projectId
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    // toString method
    @Override
    public String toString() {
        return "CreateMessageRequest{" +
                "senderId=" + senderId +
                ", content='" + content + '\'' +
                ", projectId=" + projectId +
                '}';
    }

    // hashCode and equals methods (optional)
    @Override
    public int hashCode() {
        int result = senderId != null ? senderId.hashCode() : 0;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        CreateMessageRequest that = (CreateMessageRequest) obj;

        if (senderId != null ? !senderId.equals(that.senderId) : that.senderId != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        return projectId != null ? projectId.equals(that.projectId) : that.projectId == null;
    }
}
