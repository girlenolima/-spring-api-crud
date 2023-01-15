package br.com.limas.springapicrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.limas.springapicrud.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
