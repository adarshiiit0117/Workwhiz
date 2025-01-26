package com.dubey.Workwhiz.repository;

import com.dubey.Workwhiz.modal.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IssueRepository extends JpaRepository<Issue,Long> {
    public List<Issue>findByProjectID(Long id);
}
