package com.example.demo.repository;

import com.example.demo.model.CheckListItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ListItemRepository extends JpaRepository<CheckListItem, Long> {

    public CheckListItem findByUuid(UUID uuid);

}
