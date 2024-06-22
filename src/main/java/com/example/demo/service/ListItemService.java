package com.example.demo.service;

import com.example.demo.model.ListDemo;
import com.example.demo.model.ListItem;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ListItemService {
    ListDemo listDemo = new ListDemo();

    public ListItem[] getAll() {
        return listDemo.getItems();
    }

    public ListItem[] sort() {
        ListItem[] result = Arrays.copyOf(listDemo.getItems(), listDemo.getItems().length);
        Arrays.sort(result);
        return result;
    }
}
