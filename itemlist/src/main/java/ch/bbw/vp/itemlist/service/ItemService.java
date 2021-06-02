package ch.bbw.vp.itemlist.service;

import ch.bbw.vp.itemlist.model.Item;
import ch.bbw.vp.itemlist.model.Person;
import ch.bbw.vp.itemlist.persistence.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @class: itemService
 * @author: anesh
 * @version: 26.05.2021
 **/

@Service
public class ItemService {

    private final ProjectRepository itemRepository;

    @Autowired
    public ItemService(ProjectRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public ArrayList<Item> getItems(){
        return itemRepository.getItemList();
    }

    public ArrayList<Person> getPersons() {
        return itemRepository.getPersonList();
    }

    public void createItem(Item item){
        itemRepository.addItem(item);
    }

    public void deleteItemById(long id) {
        itemRepository.deleteItemById(id);
    }

    public Item getItemById(long id) {
        return itemRepository.getItemById(id);
    }

    public void updateBoughtStatusById(long id) {
        itemRepository.updateBoughtStatusById(id);
    }
}
