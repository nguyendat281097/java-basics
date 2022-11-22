package com.nvd.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nvd.training.entity.File;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}