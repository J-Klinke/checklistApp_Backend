package com.example.demo.transport;

import com.example.demo.model.CheckListItem;
import com.example.demo.model.enums.CheckListItemState;

import java.util.UUID;

public class CheckListItemRestModel {

    private UUID uuid;
    private String title;
    private CheckListItemState state;

    public CheckListItemRestModel(CheckListItem listItem) {
        this.uuid = listItem.getUuid();
        this.title = listItem.getTitle();
        this.state = listItem.getState();

    }

    public CheckListItemRestModel() {
        this.state = CheckListItemState.UNCHECKED;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setState(CheckListItemState state) {
        this.state = state;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getTitle() {
        return title;
    }

    public CheckListItemState getState() {
        return state;
    }
}
