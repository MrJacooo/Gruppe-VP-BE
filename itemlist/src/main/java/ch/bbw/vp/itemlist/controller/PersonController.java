package ch.bbw.vp.itemlist.controller;

import ch.bbw.vp.itemlist.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @Autowired
    public PersonController(ItemService itemService) {
        this.itemService = itemService;
    }

    @CrossOrigin(origins = "localhost:3000")
    @GetMapping
    public ArrayList getPerson(){
        return itemService.getPersons();
    }
}
