package com.yourajlearningjava.springsession2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TorontoRaptors implements ITeam{
    private String teamName;
    private String teamCity;

    @Override
    public String getTeamName() {
        return teamName;
    }
}
