package com.example.demo.model.enums;

public enum CheckListItemState {
    // not active yet, start state
    UNCHECKED,
    // not active anymore or 'done' in a ListItem implementation where 'Active' doesn't apply
    CHECKED,
    // in process
    ACTIVE,
    // not active anymore, not relevant for user anymore
    DEACTIVATED
}