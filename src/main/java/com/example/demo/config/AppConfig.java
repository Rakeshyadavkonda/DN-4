package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Country;
import com.example.demo.model.Player;

@Configuration
public class AppConfig {

    @Bean
    public Country india() {
        Country country = new Country();
        country.setCountryID("001");
        country.setCountryName("India");
        return country;
    }

    @Bean
    public Country australia() {
        Country country = new Country();
        country.setCountryID("002");
        country.setCountryName("Australia");
        return country;
    }

    @Bean
    public Player sachin(Country india) {
        Player player = new Player();
        player.setPlayerID("001");
        player.setPlayerName("Sachin");
        player.setCountry(india);
        return player;
    }

    @Bean
    public Player virat(Country india) {
        Player player = new Player();
        player.setPlayerID("002");
        player.setPlayerName("Virat");
        player.setCountry(india);
        return player;
    }

    @Bean
    public Player steve(Country australia) {
        Player player = new Player();
        player.setPlayerID("003");
        player.setPlayerName("Steve");
        player.setCountry(australia);
        return player;
    }

    @Bean
    public Player david(Country australia) {
        Player player = new Player();
        player.setPlayerID("004");
        player.setPlayerName("David");
        player.setCountry(australia);
        return player;
    }

    @Bean
    public Player adam(Country australia) {
        Player player = new Player();
        player.setPlayerID("005");
        player.setPlayerName("Adam");
        player.setCountry(australia);
        return player;
    }
}
