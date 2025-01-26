package com.dubey.Workwhiz.service;

import com.dubey.Workwhiz.modal.Issue;
import com.dubey.Workwhiz.modal.User;
import com.dubey.Workwhiz.request.IssueRequest;

import java.util.List;
import java.util.Optional;

public interface IssueService {
    Issue getIssueById(Long issueId)throws  Exception;
    List<Issue>getIssueByProjectId(Long projectId)throws Exception;
    Issue createIssue(IssueRequest issue, User user)throws Exception;
    void deleteIssue(Long issueId,Long userid)throws Exception;
    Issue addUserToIssue(Long issueId,Long userId)throws Exception;
    Issue updateStatus(Long issueId,String status)throws Exception;




}
