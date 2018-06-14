package com.edupay.pay.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edupay.pay.entity.Reader;

public interface ReaderRepository extends JpaRepository<Reader, String> {
}