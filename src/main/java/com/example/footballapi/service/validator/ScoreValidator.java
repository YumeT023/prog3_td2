package com.example.footballapi.service.validator;

import com.example.footballapi.model.ScoreEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;

import java.nio.charset.Charset;
import java.util.function.Consumer;

@Component
public class ScoreValidator implements Consumer<ScoreEntity> {
    @Override
    public void accept(ScoreEntity scoreEntity) throws HttpClientErrorException {
        if (scoreEntity.getPlayer().isGoalKeeper()) {
            throw HttpClientErrorException.create(HttpStatus.BAD_REQUEST,
                    "goal keeper couldn't score any goal",
                    new HttpHeaders(),
                    null,
                    Charset.defaultCharset());
        }
    }
}
