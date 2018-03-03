package edu.bookcrudproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.bookcrudproject.model.Book;

@Repository
public interface StudentRepository extends JpaRepository<Book, Integer> {

}
