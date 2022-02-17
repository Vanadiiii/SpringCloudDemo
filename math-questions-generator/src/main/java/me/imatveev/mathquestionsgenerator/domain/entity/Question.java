package me.imatveev.mathquestionsgenerator.domain.entity;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Question {
    String question;
    String answer;
}
