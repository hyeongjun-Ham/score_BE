package com.score.game.controller;

import com.score.game.dto.GameAddDto;
import com.score.game.dto.GameResDto;
import com.score.game.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/game")
@RequiredArgsConstructor
public class GameController {

    private final GameService gameService;

    @GetMapping("/list")
    public List<GameResDto> getGameList() {
        return gameService.getGameList();
    }

    @PostMapping("/add")
    public void addGame(@RequestBody GameAddDto gameAddDto) {
        gameService.add(gameAddDto);
    }
}
