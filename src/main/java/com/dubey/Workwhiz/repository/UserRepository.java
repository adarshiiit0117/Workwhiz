package com.dubey.Workwhiz.repository;
import com.dubey.Workwhiz.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
     User  findByEmail(String email);

}
