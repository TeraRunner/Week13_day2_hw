package com.codeclan.example.Week13_day2_homework.repositories;

import com.codeclan.example.Week13_day2_homework.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
