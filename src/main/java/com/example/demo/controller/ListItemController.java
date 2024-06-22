package com.example.demo.controller;

import com.example.demo.model.ListItem;
import com.example.demo.service.ListItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ListItems")
public class ListItemController {
    @Autowired
    private ListItemService listItemService;

    @GetMapping("")
    public ListItem[] getAll() {
        return listItemService.getAll();
    }

    @GetMapping("sorted")
    public ListItem[] getAllSorted() {
        return listItemService.sort();
    }
}
