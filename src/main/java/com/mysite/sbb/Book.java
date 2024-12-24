package com.mysite.sbb;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private String title;
    private String author;

    public static void main(String[] args){
        Book book = new Book();
        book.setTitle("책");
        book.setAuthor("저자");

        System.out.println("Book title : " + book.getTitle());
        System.out.println("Book author : " + book.getAuthor());
    }


}
