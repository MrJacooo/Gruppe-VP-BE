package ch.bbw.vp.itemlist.controller;

import ch.bbw.vp.itemlist.model.Person;
import ch.bbw.vp.itemlist.service.ItemService;
import ch.bbw.vp.itemlist.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @class: PersonController
 * @author: anesh
 * @version: 02.06.2021
 **/

@RestController
@RequestMapping(path = "/person")
public class PersonController {

    private final ItemService itemService;
    private final PersonService personService;

    @Autowired
    public PersonController(ItemService itemService, PersonService personService) {
        this.itemService = itemService;
        this.personService = personService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public ArrayList getPerson(){
        return personService.getPersons();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public ArrayList newPerson(@RequestBody Person person) {
        personService.createPerson(person);
        return personService.getPersons();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping(path = "{id}")
    public ArrayList deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
        return personService.getPersons();
    }


}
