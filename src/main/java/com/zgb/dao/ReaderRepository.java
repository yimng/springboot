package com.zgb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zgb.entity.Reader;

public interface ReaderRepository extends JpaRepository<Reader, String> {
}