package com.example.demo;

import java.util.Collection;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.config.AppConfig;
import com.example.demo.model.Player;

@SpringBootApplication
public class WiproAssignment4Application {

	public static void main(String[] args) {
		//SpringApplication.run(WiproAssignment4Application.class, args);
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	        Collection<Player> players = context.getBeansOfType(Player.class).values();

	        System.out.println("All Players and their Countries:");
	        for (Player player : players) {
	            System.out.println("Player Name: " + player.getPlayerName());
	            System.out.println("Country Name: " + player.getCountry().getCountryName());
	            System.out.println("----------------------");
	        }

	        String desiredCountry = "India";

	        System.out.println("Players from " + desiredCountry + ":");
	        for (Player player : players) {
	            if (player.getCountry().getCountryName().equalsIgnoreCase(desiredCountry)) {
	                System.out.println(player.getPlayerName());
	            }
	        }

	        context.close();
	    }
		
	}





