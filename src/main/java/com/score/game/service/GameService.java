package com.score.game.service;

import com.score.game.dto.GameAddDto;
import com.score.game.dto.GameResDto;
import com.score.game.entity.Game;
import com.score.game.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GameRepository gameRepository;

    public List<GameResDto> getGameList() {

        return gameRepository.findAll().stream()
                .map(GameResDto::from)
                .collect(Collectors.toList());
    }

    public void add(GameAddDto gameAddDto) {
        Game game = Game.create(gameAddDto.getName());
        gameRepository.save(game);
    }
}
