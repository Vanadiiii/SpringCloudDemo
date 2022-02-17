package me.imatveev.historyquestionsgenerator.web;

import lombok.RequiredArgsConstructor;
import me.imatveev.historyquestionsgenerator.domain.entity.Question;
import me.imatveev.historyquestionsgenerator.storage.QuestionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class HistoryQuestionsController {
    private final QuestionRepository questionRepository;

    @GetMapping("/questions")
    public List<Question> getQuestions(@RequestParam int amount) {
        List<Question> questions = questionRepository.findAll();

        Collections.shuffle(questions);

        return questions.stream()
                .limit(amount)
                .collect(Collectors.toList());
    }
}
