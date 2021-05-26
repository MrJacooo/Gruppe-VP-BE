package ch.bbw.vp.itemlist.controller;

import ch.bbw.vp.itemlist.service.itemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @class: itemController
 * @author: anesh
 * @version: 26.05.2021
 **/

@RestController
@RequestMapping(path = "/items")
public class itemController {

    private final itemService itemService;

    @Autowired
    public itemController(itemService itemService) {
        this.itemService = itemService;
    }

    @CrossOrigin(origins = "localhost:3000")
    @GetMapping
    public ArrayList getItems(){
        return itemService.getItems();
    }
}
