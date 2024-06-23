package com.example.demo.controller;

import com.example.demo.model.CheckListItem;
import com.example.demo.service.CheckListItemService;
import com.example.demo.transport.CheckListItemRestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ListItems")
public class CheckListItemController {
    @Autowired
    private CheckListItemService checkListItemService;

    @GetMapping("")
    public List<CheckListItemRestModel> getAll() {
        List<CheckListItemRestModel> restModels = new ArrayList<>();
        for (CheckListItem item : checkListItemService.getAll()) {
            restModels.add(new CheckListItemRestModel(item));
        }
        return restModels;
    }

    @GetMapping("sorted")
    public List<CheckListItemRestModel> getAllSorted() {
        List<CheckListItemRestModel> restModels = new ArrayList<>();
        for (CheckListItem item : checkListItemService.getAll()) {
            restModels.add(new CheckListItemRestModel(item));
        }
        return restModels;
    }

    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    public CheckListItem createListItem(@RequestBody CheckListItemRestModel restModel) {
        return checkListItemService.createCheckListItem(restModel);
    }
}
