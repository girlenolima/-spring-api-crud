package br.com.limas.springapicrud.mapper;

import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.limas.springapicrud.data.vo.v2.PersonVoV2;
import br.com.limas.springapicrud.model.Person;

@Service
public class PersonMapper {

    public PersonVoV2 converteEntityToVo(Person person) {

        PersonVoV2 vo2 = new PersonVoV2();

        vo2.setId(person.getId());
        vo2.setAddresss(person.getAddresss());
        vo2.setFirstName(person.getFirstName());
        vo2.setGender(person.getGender());
        vo2.setLastName(person.getLastName());
        vo2.setBirthday(new Date());

        return vo2;

    }

    public Person converteVoTOEntity(PersonVoV2 person) {

        Person entityPerson = new Person();

        entityPerson.setId(person.getId());
        entityPerson.setAddresss(person.getAddresss());
        entityPerson.setFirstName(person.getFirstName());
        entityPerson.setGender(person.getGender());
        entityPerson.setLastName(person.getLastName());
        //vo2.setBirthday(new Date());

        return entityPerson;

    }

}
