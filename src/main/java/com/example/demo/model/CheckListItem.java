package com.example.demo.model;

import com.example.demo.model.enums.CheckListItemState;
import com.example.demo.transport.CheckListItemRestModel;
import jakarta.persistence.*;

import java.time.ZonedDateTime;
import java.util.UUID;

@Entity
public class CheckListItem implements Comparable<CheckListItem> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, updatable = false, unique = true)
    private UUID uuid;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private CheckListItemState state;

    @Column
    private ZonedDateTime createdAt;

    @Column
    private ZonedDateTime expiresAt;

    @Column
    private int duration;

    @ManyToOne
    private CheckList checkList;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public CheckListItem() {
        this.state = CheckListItemState.UNCHECKED;
        this.uuid = UUID.randomUUID();
    }

    public CheckListItem(String title) {
        this();
        this.title = title;
    }

    public CheckListItem(CheckListItemRestModel restModel) {
        if (restModel.getUuid() == null) {
            this.uuid = UUID.randomUUID();
        } else {
            this.uuid = restModel.getUuid();
        }
        if (restModel.getState() == null) {
            this.state = CheckListItemState.UNCHECKED;
        } else {
            this.state = restModel.getState();
        }
        this.title = restModel.getTitle();
    }

    public String getTitle() {
        return title;
    }

    public boolean isChecked() {
        return state == CheckListItemState.CHECKED;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void check() {
        this.state = CheckListItemState.CHECKED;
    }

    public void unCheck() {
        this.state = CheckListItemState.UNCHECKED;
    }

    @Override
    public int compareTo(CheckListItem other) {
        return this.title.compareTo(other.title);
    }

    public CheckListItemState getState() {
        return this.state;
    }
}
