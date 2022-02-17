package me.imatveev.examinator.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder(toBuilder = true)
@AllArgsConstructor
public class Section {
    List<Question> questions;
}
