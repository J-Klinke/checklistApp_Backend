package com.example.demo.model;

import java.util.UUID;

public class ListItem implements Comparable<ListItem> {
    private final UUID id;
    private String title;
    private ListItemState state;

    enum ListItemState {
        UNCHECKED, CHECKED;
    }
    public ListItem(String title) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.state = ListItemState.UNCHECKED;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isChecked() {
        return state == ListItemState.CHECKED;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void check() {
        this.state = ListItemState.CHECKED;
    }

    public void unCheck() {
        this.state = ListItemState.UNCHECKED;
    }

    @Override
    public int compareTo(ListItem other) {
        return this.title.compareTo(other.title);
    }
}
