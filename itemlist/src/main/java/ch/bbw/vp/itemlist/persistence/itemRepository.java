package ch.bbw.vp.itemlist.persistence;

import ch.bbw.vp.itemlist.model.item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @class: itemRepository
 * @author: anesh
 * @version: 26.05.2021
 **/

@Repository
public class itemRepository {
    ArrayList<item> itemList = new ArrayList<>();

    public itemRepository() {
        itemList.add(new item("Milk", "Buy milk, it's urgend!", 2, "liters", false));
    }

    public ArrayList<item> getItemList(){
        return itemList;
    }

    @Override
    public String toString() {
        return "itemRepository{" +
                "itemList=" + itemList.toString() +
                '}';
    }
}
