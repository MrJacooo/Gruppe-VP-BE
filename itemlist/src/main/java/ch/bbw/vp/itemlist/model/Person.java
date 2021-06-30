package ch.bbw.vp.itemlist.model;

import java.util.ArrayList;

/**
 * @class: Person
 * @author: anesh
 * @version: 02.06.2021
 **/

public class Person {

    private static long newestId = 0;

    private long id;
    private String name;
    private ArrayList<Item> itemList = new ArrayList<>();

    public Person(String name) {
        this.id = newestId;
        newestId++;
        this.name = name;
    }

    public boolean addItem(Item item){
        try{
            itemList.add(item);
            item.setPersonId(this.id);
            return true;
        } catch (Exception couldNotAddItem){
            return false;
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    public static long makeNewId() {
        newestId++;
        return newestId-1;
    }
}
