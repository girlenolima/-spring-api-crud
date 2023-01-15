package br.com.limas.springapicrud.services;

import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import org.springframework.stereotype.Service;

import br.com.limas.springapicrud.controllers.PersonController;
import br.com.limas.springapicrud.data.vo.v1.PersonVo;
import br.com.limas.springapicrud.data.vo.v2.PersonVoV2;
import br.com.limas.springapicrud.exception.RequiredObjectIsNullException;
import br.com.limas.springapicrud.exception.ResourceNotFoundException;
import br.com.limas.springapicrud.mapper.DozerMapper;
import br.com.limas.springapicrud.mapper.PersonMapper;
import br.com.limas.springapicrud.model.Person;
import br.com.limas.springapicrud.repositories.PersonRepository;

//Esta anotaçao serve para injetar este objeto em rumtime em outras classes
@Service
public class PersonServices {

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    @Autowired
    PersonRepository personRepository; // injetando a dependencia

    @Autowired
    PersonMapper mapper;

    public PersonVo findById(Long id) {

        logger.info("Finding one person!");

        var entity = personRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("ID not found."));

        var vo = DozerMapper.parseObject(entity, PersonVo.class);

        try {
            vo.add(linkTo(methodOn(PersonController.class).findById(id)).withSelfRel());
        

        } catch (Exception e) {

            e.printStackTrace();
        }

        return vo;
    }

    public List<PersonVo> findByAll() {
        logger.info("Finding all people!");
        var persons = DozerMapper.parseListObjects(personRepository.findAll(), PersonVo.class);

        persons.stream()
                .forEach(p -> {
                    try {
                        p.add(linkTo(methodOn(PersonController.class).findById(p.getKey())).withSelfRel());
                    } catch (Exception e) {

                        e.printStackTrace();
                    }
                });

        return persons;

    }

    public PersonVo create(PersonVo person) {

        if(person == null ) throw new RequiredObjectIsNullException();
        logger.info("create one person!");

        var entity = DozerMapper.parseObject(person, Person.class);
        var vo = DozerMapper.parseObject(personRepository.save(entity), PersonVo.class);

        try {
            vo.add(linkTo(methodOn(PersonController.class).findById(vo.getKey())).withSelfRel());
        } catch (Exception e) {

            e.printStackTrace();
        }
        return vo;

    }

    public PersonVoV2 createV2(PersonVoV2 person) {

        logger.info("create one person! ---> v2 <--- ");

        var entity = mapper.converteVoTOEntity(person);
        var vo = mapper.converteEntityToVo(personRepository.save(entity));

        return vo;

    }

    public PersonVo update(PersonVo person) {

        if(person == null ) throw new RequiredObjectIsNullException();
        
        logger.info("update one person!");

        var entity = personRepository.findById(person.getKey())
                .orElseThrow(() -> new ResourceNotFoundException("ID not found."));

        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddresss(person.getAddresss());
        entity.setGender(person.getGender());

        var vo = DozerMapper.parseObject(personRepository.save(entity), PersonVo.class);
        try {
            vo.add(linkTo(methodOn(PersonController.class).findById(vo.getKey())).withSelfRel());
        } catch (Exception e) {

            e.printStackTrace();
        }
        return vo;

    }

    public void delete(Long id) {

        var entity = personRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("ID not found."));

        personRepository.delete(entity);

        logger.info("deleting one person!");

    }

}
