package kz.shauyenov.todo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "ToDo")
public class ToDo {

    @Id
    @GeneratedValue
    Long id;

    String title;

    Boolean done;
}