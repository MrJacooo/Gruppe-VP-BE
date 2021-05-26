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

    public boolean deleteItemById(long id) {
        try {
            for (int i = 0; i < itemList.size(); i++) {
                if (itemList.get(i).getId() == id) {
                    itemList.remove(i);
                }
            }
            return true;
        } catch (Exception failedToDelete) {
            return false;
        }
    }

    public Item getItemById(long id) {
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getId() == id) {
                return itemList.get(i);
            }
        }
        return new Item("None", "There was no item found with your id");
    }

    public boolean updateBoughtStatusById (long id) {
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getId() == id) {
                itemList.get(i).setAlreadyBought(!getItemById(id).isAlreadyBought());
                return true;
            }
        }
        return false;

    }

    @Override
    public String toString() {
        return "itemRepository{" +
                "itemList=" + itemList.toString() +
                '}';
    }
}
