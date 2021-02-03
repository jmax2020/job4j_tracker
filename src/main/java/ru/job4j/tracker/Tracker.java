package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll(Item item) {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        int size = 0;
        Item[] massName = new Item[items.length];
        for(int i = 0; i < this.size; i++) {
            if(items[i].getName().equals(key)) {
                massName[size] = items[i];
                size++;
            }
        }
        massName = Arrays.copyOf(massName, size);
        return massName;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for(int i = 0; i < size; i++) {
            if(items[i].getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        item.setId(id);
        if(index != -1) {
            items[index] = item;
            return true;
        } else {
            return false;
        }
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        if(index != -1) {
            System.arraycopy(items,index + 1, items, index, size - 1 - index);
            items[size - 1] = null;
            size--;
            return true;
        }
        return false;
    }

}