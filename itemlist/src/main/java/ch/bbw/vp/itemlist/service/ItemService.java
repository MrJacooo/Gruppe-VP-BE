package ch.bbw.vp.itemlist.service;

import ch.bbw.vp.itemlist.model.Item;
import ch.bbw.vp.itemlist.persistence.ItemRepository;
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

    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public ArrayList<Item> getItems(){
        return itemRepository.getItemList();
    }

    public void createItem(Item item){
        itemRepository.addItem(item);
    }
}
