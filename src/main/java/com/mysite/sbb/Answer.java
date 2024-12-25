package com.mysite.sbb;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition="TEXT")
    private String content;

    private LocalDateTime createDate;

    //질문1 : 답변 다 연결을 위해
    //ManytoOne 애노테이션 설정
    @ManyToOne
    private Question question;

}