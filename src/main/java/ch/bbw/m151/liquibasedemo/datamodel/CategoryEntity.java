package ch.bbw.m151.liquibasedemo.datamodel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * The entity for the category table
 */
@Getter
@Setter
@Entity
@Table(name = "category")
public class CategoryEntity {
    //the name of the category
    @Id
    private String name;

    //the category description
    private String description;
}