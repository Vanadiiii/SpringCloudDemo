package me.imatveev.mathquestionsgenerator.service;

import lombok.RequiredArgsConstructor;
import me.imatveev.mathquestionsgenerator.domain.MathService;
import me.imatveev.mathquestionsgenerator.domain.entity.Question;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class MathServiceImpl implements MathService {
    private static final int MAX = 10;
    private final Random random = new Random();

    @Override
    public Question getRandom() {
        int a = random.nextInt(MAX);
        int b = random.nextInt(MAX);

        return Question.builder()
                .question(a + " + " + b + " = ?")
                .answer(String.valueOf(a + b))
                .build();
    }
}
