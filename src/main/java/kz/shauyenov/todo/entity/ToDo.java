package kz.shauyenov.todo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "todo")
public class ToDo {

    @Id
    @GeneratedValue
    @Column(name = "id")
    Long id;

    @Column(name = "title")
    String title;

    @Column(name = "done")
    Boolean done;
}