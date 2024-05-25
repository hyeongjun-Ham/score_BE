package com.score.game.dto;

import com.score.game.entity.Game;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GameResDto {

    private Long id;
    private String name;

    public static GameResDto from(Game game) {
        return new GameResDto(game.getId(), game.getName());
    }
}
