package com.example.demo.service;

import com.example.demo.model.CheckListItem;
import com.example.demo.repository.ListItemRepository;
import com.example.demo.transport.CheckListItemRestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckListItemService {
    @Autowired
    ListItemRepository listItemRepo;

    public List<CheckListItem> getAll() {
        return listItemRepo.findAll();
    }

    /*
    public List<CheckListItem> getAllSorted() {
        return listItemRepo.findAll();
    }
     */

    public CheckListItem createCheckListItem(CheckListItemRestModel restModel) {
        return listItemRepo.save(new CheckListItem(restModel));
    }

    public CheckListItem updateCheckListItem(CheckListItemRestModel restModel) {
        CheckListItem checkListItem = listItemRepo.findByUuid(restModel.getUuid());
        return updateFromRestModel(checkListItem, restModel);
    }

    private CheckListItem updateFromRestModel(CheckListItem checkListItem, CheckListItemRestModel restModel) {
        return null;
    }
}
