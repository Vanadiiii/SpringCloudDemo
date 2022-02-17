package me.imatveev.examinator.domain.entity;

import java.util.List;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class Exam {
    String title;
    List<Section> sections;
}
