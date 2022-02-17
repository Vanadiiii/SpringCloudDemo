package me.imatveev.historyquestionsgenerator.storage;

import me.imatveev.historyquestionsgenerator.domain.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Optional<Question> findByAnswer(String answer);
}
