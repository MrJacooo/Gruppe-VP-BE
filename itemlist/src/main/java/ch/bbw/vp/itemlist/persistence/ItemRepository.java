package ch.bbw.vp.itemlist.persistence;

import ch.bbw.vp.itemlist.model.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * @class: itemRepository
 * @author: anesh
 * @version: 26.05.2021
 **/

@Repository
public class ItemRepository {
    ArrayList<Item> itemList = new ArrayList<>();

    public ItemRepository() {
        itemList.add(
                new Item("Milk", "Buy milk, it's urgend!", 2, "liters", false)
        );
        itemList.add(
                new Item("Water", "I'm thirsty", 4, "liters", true)
        );
    }

    public ArrayList<Item> getItemList(){
        return itemList;
    }

    public boolean addItem(Item item){
        try {
            item.setId(Item.makeNewId());
            itemList.add(item);
            return true;
        } catch (Exception failedToAdd) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "itemRepository{" +
                "itemList=" + itemList.toString() +
                '}';
    }
}
