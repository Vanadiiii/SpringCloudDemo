package me.imatveev.historyquestionsgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.annotation.RestResource;

@SpringBootApplication
@RestResource
public class HistoryQuestionsGeneratorApplication {
    public static void main(String[] args) {
        SpringApplication.run(HistoryQuestionsGeneratorApplication.class, args);
    }
}
