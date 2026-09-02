package com.riwi.solid.exercises.dip.ex05;

public class OutfitRecommendationService {
    private final ExternalWeatherApi weatherApi = new ExternalWeatherApi();
    public String recommend() {
        return weatherApi.currentTemperature() > 25 ? "Usa ropa ligera" : "Lleva chaqueta";
    }
}
