package me.imatveev.historyquestionsgenerator.domain.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Question {
    @Id
    @Generated
    @GeneratedValue
    private Integer id;

    private String question;
    private String answer;
}
