package ch.bbw.vp.itemlist.persistence;

import ch.bbw.vp.itemlist.model.Item;
import ch.bbw.vp.itemlist.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * @class: itemRepository
 * @author: anesh
 * @version: 26.05.2021
 **/

@Repository
public class ProjectRepository {
    ArrayList<Item> itemList = new ArrayList<>();
    ArrayList<Person> personList = new ArrayList<Person>();

    public ProjectRepository() {
        itemList.add(
                new Item("Milk", "Buy milk, it's urgend!", 2, "liters", false, 3)
        );
        itemList.add(
                new Item("Water", "I'm thirsty", 4, "liters", true, 1)
        );
        itemList.add(
                new Item("Cookies", "Yes", 10, "pieces", false, 4)
        );

        personList.add(
                new Person ("At everyone")
        );
        personList.add(
                new Person("Mathoolika")
        );
        personList.add(
                new Person("Anes")
        );
        personList.add(
                new Person("Sebastian")
        );

        personList.get(0).addItem(itemList.get(0));
        personList.get(0).addItem(itemList.get(1));
        personList.get(1).addItem(itemList.get(2));
    }

    public ArrayList<Item> getItemList(){
        return itemList;
    }

    public ArrayList<Person> getPersonList(){
        return personList;
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

    public boolean addPerson(Person person) {
        try {
            person.setId(Person.makeNewId());
            personList.add(person);
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

    public boolean deletePersonById(long id) {
        try {
            for (int i = 0; i < personList.size(); i++) {
                if (personList.get(i).getId() == id) {
                    personList.remove(i);
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

    public boolean updateChangedById(long id, Item newItem){
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getId() == id) {
                if (!itemList.get(i).getName().equals(newItem.getName())) {
                    itemList.get(i).setName(newItem.getName());
                }
                if (itemList.get(i).getAmount() != newItem.getAmount()) {
                    itemList.get(i).setAmount(newItem.getAmount());
                }
                if (!itemList.get(i).getDescription().equals(newItem.getDescription())) {
                    itemList.get(i).setDescription(newItem.getDescription());
                }
                if (!itemList.get(i).getAmountType().equals(newItem.getAmountType())) {
                    itemList.get(i).setAmountType(newItem.getAmountType());
                }
                if (itemList.get(i).getAlreadyBought() != newItem.getAlreadyBought()) {
                    itemList.get(i).setAlreadyBought(newItem.getAlreadyBought());
                }
                if (itemList.get(i).getDringlichkeit() != newItem.getDringlichkeit()) {
                    itemList.get(i).setDringlichkeit(newItem.getDringlichkeit());
                }
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
