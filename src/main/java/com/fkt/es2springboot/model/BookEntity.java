package com.fkt.es2springboot.model;

import javax.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String author;
    private Double price;
    private Date createTime = new Date();
    private Date updateTime = new Date();
}