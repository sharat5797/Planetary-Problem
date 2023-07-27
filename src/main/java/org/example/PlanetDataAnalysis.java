package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlanetDataAnalysis {

    public int moonsCountIfRingsPresent(List<Planet> planets){
        int totalMoons = 0;
        for(Planet planet : planets){
            if(planet.isRings()){
                totalMoons += planet.getNumberOfMoons();
            }
        }
        return  totalMoons;
    }

    public List<String> gasFoundOnMaximumPlanets(List<Planet> planets){
        List<String> maxFoundGases = new ArrayList<>();
        Map<String,Integer> planetGases = new HashMap<>();
        for (Planet planet : planets) {
            for(String gasName: planet.getSurfaceGases()) {
                planetGases.put(gasName, planetGases.getOrDefault(gasName, 0) + 1);
            }
        }
        int maxFoundGasCount = 0;
        for (Map.Entry<String, Integer> stringIntegerEntry : planetGases.entrySet()) {
            if(maxFoundGasCount < stringIntegerEntry.getValue()){
                maxFoundGasCount = stringIntegerEntry.getValue();
            }
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : planetGases.entrySet()) {
            if(stringIntegerEntry.getValue() == maxFoundGasCount){
                maxFoundGases.add(stringIntegerEntry.getKey());
            }
        }
        return maxFoundGases;
    }
}
