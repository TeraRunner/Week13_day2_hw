package com.codeclan.example.Week13_day2_homework.repositories;

import com.codeclan.example.Week13_day2_homework.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
