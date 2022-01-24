package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.datamodel.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {
	/*
	@Query(value = "SELECT * FROM Book WHERE (year=SELECT min(year) FROM Book)")
	public Optional<Book> min();

	@Query(value = "SELECT * FROM Book WHERE (year=SELECT max(year) FROM Book)")
	public Optional<Book> max();
*/
}
