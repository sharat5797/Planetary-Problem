package org.example;

import java.util.List;

public class Planet {
    private String name;
    private int numberOfMoons;
    private boolean rings;
    private List<String> surfaceGases;

    public Planet(String name, int numberOfMoons, boolean rings, List<String> surfaceGases) {
        this.name = name;
        this.numberOfMoons = numberOfMoons;
        this.rings = rings;
        this.surfaceGases = surfaceGases;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }

    public List<String> getSurfaceGases() {
        return surfaceGases;
    }

    public boolean hasRings() {
        return rings;
    }
}
