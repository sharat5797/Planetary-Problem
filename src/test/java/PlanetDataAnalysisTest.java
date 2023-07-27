import org.example.Planet;
import org.example.PlanetDataAnalysis;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlanetDataAnalysisTest {
    public List<Planet> planets;
    public PlanetDataAnalysis planetDataAnalysis;
    @BeforeClass
    public void beforeClass() {
        planetDataAnalysis = new PlanetDataAnalysis();
        planets =new ArrayList<>();
        Planet mercury =new Planet("Mercury", 0,false, new ArrayList<>());
        Planet venus = new Planet("Venus", 0, false, new ArrayList<>(Arrays.asList("Carbon Dioxide", "Nitrogen")));
        Planet earth = new Planet("Earth", 1, false, new ArrayList<>(Arrays.asList("Nitrogen","Oxygen")));
        Planet jupitor = new Planet("Jupitor", 79, true, new ArrayList<>(Arrays.asList("Hydrogen","Helium")));
        Planet saturn = new Planet("Saturn", 83, true, new ArrayList<>(Arrays.asList("Hydrogen","Helium")));
        Planet uranus = new Planet("Uranus", 27, true, new ArrayList<>(Arrays.asList("Hydrogen","Helium","Methane")));
        planets.add(mercury);
        planets.add(venus);
        planets.add(earth);
        planets.add(jupitor);
        planets.add(saturn);
        planets.add(uranus);
    }

    @Test
    public void testMoonsCountIfRingsPresent() {
        Assert.assertEquals(planetDataAnalysis.moonsCountIfRingsPresent(planets),189);
    }

    @Test
    public void testMoonsCountIfRingsPresentNegetive() {
        Assert.assertEquals(planetDataAnalysis.moonsCountIfRingsPresent(planets),190);
    }

    @Test
    public void gasFoundOnMaximumPlanetsTest() {
        Assert.assertEquals(planetDataAnalysis.gasFoundOnMaximumPlanets(planets),new ArrayList<>(Arrays.asList("Hydrogen","Helium")));
    }

    @Test
    public void gasFoundOnMaximumPlanetsTestNegetive() {
        Assert.assertEquals(planetDataAnalysis.gasFoundOnMaximumPlanets(planets),new ArrayList<>(Arrays.asList("Hydrogen")));
    }
}
