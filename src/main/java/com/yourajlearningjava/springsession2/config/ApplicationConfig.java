package com.yourajlearningjava.springsession2.config;

import com.yourajlearningjava.springsession2.domain.ITeam;
import com.yourajlearningjava.springsession2.domain.Lakers;
import com.yourajlearningjava.springsession2.domain.TorontoRaptors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:teams.properties")
@PropertySource("classpath:person.properties")
public class ApplicationConfig {

    @Value("${team.name}")
    private String teamName;
    @Value("${team.city}")
    private String teamCity;
    @Bean
    public ITeam raptors() {
        return new TorontoRaptors(teamName, teamCity);
    }
    @Value("${team1.name}")
    private String team2;
    @Value("${team1.city}")
    private String city2;

    @Bean
    public ITeam lakers() {
        return new Lakers(team2, city2);
    }
}
