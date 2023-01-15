package br.com.limas.springapicrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.limas.springapicrud.data.vo.v1.PersonVo;
import br.com.limas.springapicrud.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
