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

    private final ProjectRepository projectRepository;

    @Autowired
    public ItemService(ProjectRepository itemRepository) {
        this.projectRepository = itemRepository;
    }

    public ArrayList<Item> getItems(){
        return projectRepository.getItemList();
    }

    public void createItem(Item item){
        projectRepository.addItem(item);
    }

    public void deleteItemById(long id) {
        projectRepository.deleteItemById(id);
    }

    public Item getItemById(long id) {
        return projectRepository.getItemById(id);
    }

    public void updateBoughtStatusById(long id) {
        projectRepository.updateBoughtStatusById(id);
    }
}
