package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlanetDataAnalysis {
    private Map<String,Integer> planetGases = new HashMap<>();
    public int moonsCountIfRingsPresent(List<Planet> planets){
        int totalMoons = 0;
        for(Planet planet : planets){
            if(planet.hasRings()){
                totalMoons += planet.getNumberOfMoons();
            }
        }
        return  totalMoons;
    }

    private void addPlanetGasesToMap(List<Planet> planets){
        for (Planet planet : planets) {
            for(String gasName: planet.getSurfaceGases()) {
                planetGases.put(gasName, planetGases.getOrDefault(gasName, 0) + 1);
            }
        }
    }
    private int maxFoundGas(){
        int maxFoundGasCount = 0;
        for (Map.Entry<String, Integer> stringIntegerEntry : planetGases.entrySet()) {
            if(maxFoundGasCount < stringIntegerEntry.getValue()){
                maxFoundGasCount = stringIntegerEntry.getValue();
            }
        }
        return maxFoundGasCount;
    }

    public List<String> gasFoundOnMaximumPlanets(List<Planet> planets){
        addPlanetGasesToMap(planets);
        List<String> maxFoundGases = new ArrayList<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : planetGases.entrySet()) {
            if(stringIntegerEntry.getValue() == maxFoundGas()){
                maxFoundGases.add(stringIntegerEntry.getKey());
            }
        }
        return maxFoundGases;
    }
}
