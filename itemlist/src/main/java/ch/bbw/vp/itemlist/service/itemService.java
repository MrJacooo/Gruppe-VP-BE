package ch.bbw.vp.itemlist.service;

import ch.bbw.vp.itemlist.model.item;
import ch.bbw.vp.itemlist.persistence.itemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @class: itemService
 * @author: anesh
 * @version: 26.05.2021
 **/

@Service
public class itemService {

    private final itemRepository itemRepository;

    @Autowired
    public itemService(itemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public ArrayList<item> getItems(){
        return itemRepository.getItemList();
    }
}
