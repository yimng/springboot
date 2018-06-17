package com.zgb.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zgb.entity.Book;

public interface ReadingListRepository extends JpaRepository<Book, Long> {
  List<Book> findByReader(String reader);
}
