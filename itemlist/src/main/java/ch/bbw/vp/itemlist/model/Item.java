package ch.bbw.vp.itemlist.model;

import java.time.LocalDate;

/**
 * @class: item
 * @author: anesh
 * @version: 26.05.2021
 **/

public class Item {

    private static long newestId = 0;

    private long id;
    private String name;
    private String description;
    private int amount;
    private String amountType;
    private boolean alreadyBought;
    private LocalDate addedDate;
    private Person zugewiesenePerson;


    public Item(String name, String description, int amount, String amountType, boolean alreadyBought) {
        this.id = newestId;
        newestId++;
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.amountType = amountType;
        this.alreadyBought = alreadyBought;
        this.addedDate = LocalDate.now();
    }

    public Item(String name, String description, int amount, String amountType, boolean alreadyBought, Person zugewiesenePerson) {
        this.id = newestId;
        newestId++;
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.amountType = amountType;
        this.alreadyBought = alreadyBought;
        this.addedDate = LocalDate.now();
        this.zugewiesenePerson = zugewiesenePerson;
    }

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Item() { }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getAmountType() {
        return amountType;
    }

    public void setAmountType(String amountType) {
        this.amountType = amountType;
    }

    public boolean isAlreadyBought() {
        return alreadyBought;
    }

    public void setAlreadyBought(boolean alreadyBought) {
        this.alreadyBought = alreadyBought;
    }

    public LocalDate getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(LocalDate addedDate) {
        this.addedDate = addedDate;
    }

    public static long makeNewId() {
        newestId++;
        return newestId-1;
    }
}
