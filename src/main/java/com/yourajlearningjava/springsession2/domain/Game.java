package com.yourajlearningjava.springsession2.domain;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Game {
    private int score = 1;
    private ITeam home;
    private ITeam away;

    public Game(@Qualifier("raptors") ITeam home, @Qualifier("lakers") ITeam away) {
        this.home = home;
        this.away = away;
    }
    public ITeam startGame() {
        return score > 2? home:away;
    }
}
