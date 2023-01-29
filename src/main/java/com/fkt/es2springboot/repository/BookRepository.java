package com.fkt.es2springboot.repository;

import com.fkt.es2springboot.model.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookRepository extends JpaRepository<BookEntity,Long> {
    List<BookEntity> findBookByAuthorOrTitle(String author, String title);
}
