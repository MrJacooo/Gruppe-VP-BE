package ch.bbw.vp.itemlist.controller;

import ch.bbw.vp.itemlist.model.Item;
import ch.bbw.vp.itemlist.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @class: ItemController
 * @author: anesh
 * @version: 26.05.2021
 **/

@RestController
@RequestMapping(path = "/items")
public class ItemController {

    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public ArrayList getItems(){
        return itemService.getItems();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public ArrayList newItem(@RequestBody Item item){
        itemService.createItem(item);
        return itemService.getItems();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping(path = "{id}")
    public ArrayList deleteItem(@PathVariable long id) {
        itemService.deleteItemById(id);
        return itemService.getItems();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping(path = "{id}")
    public Item updateItem(@PathVariable long id, @RequestBody Item item) {
        itemService.updateChangedById(id, item);
        return itemService.getItemById(id);
    }
}
