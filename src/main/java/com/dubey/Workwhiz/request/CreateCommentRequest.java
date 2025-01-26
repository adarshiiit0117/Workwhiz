package com.dubey.Workwhiz.request;

public class CreateCommentRequest {
    private Long issueId;
    private String content;

    // No-args constructor
    public CreateCommentRequest() {}

    // All-args constructor
    public CreateCommentRequest(Long issueId, String content) {
        this.issueId = issueId;
        this.content = content;
    }

    // Getter for issueId
    public Long getIssueId() {
        return issueId;
    }

    // Setter for issueId
    public void setIssueId(Long issueId) {
        this.issueId = issueId;
    }

    // Getter for content
    public String getContent() {
        return content;
    }

    // Setter for content
    public void setContent(String content) {
        this.content = content;
    }

    // toString method
    @Override
    public String toString() {
        return "CreateCommentRequest{" +
                "issueId=" + issueId +
                ", content='" + content + '\'' +
                '}';
    }

    // hashCode and equals (optional but often included for DTOs)
    @Override
    public int hashCode() {
        int result = issueId != null ? issueId.hashCode() : 0;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        CreateCommentRequest that = (CreateCommentRequest) obj;

        if (issueId != null ? !issueId.equals(that.issueId) : that.issueId != null) return false;
        return content != null ? content.equals(that.content) : that.content == null;
    }
}
