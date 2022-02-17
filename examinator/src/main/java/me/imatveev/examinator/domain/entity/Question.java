package me.imatveev.examinator.domain.entity;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class Question {
    String question;
    String answer;
}
