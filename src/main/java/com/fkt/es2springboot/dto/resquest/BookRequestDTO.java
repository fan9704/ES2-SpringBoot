package com.fkt.es2springboot.dto.resquest;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookRequestDTO {
    private String title;
    private String author;
    private Double price;
}
