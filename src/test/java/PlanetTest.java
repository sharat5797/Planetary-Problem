import org.example.Planet;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

public class PlanetTest {
    @Test
    public void testPlanet() {
        String name = "Venus";
        int numberOfMoons = 0;
        boolean hasRings = false;
        List<String> surfaceGases = Arrays.asList("Carbon Dioxide", "Nitrogen");
        Planet venus = new Planet(name, numberOfMoons, hasRings, surfaceGases);
        Assert.assertEquals(venus.getNumberOfMoons(), numberOfMoons);
        Assert.assertEquals(venus.isRings(), hasRings);
        Assert.assertEquals(venus.getSurfaceGases(), surfaceGases);
    }

    @Test
    public void testGetNumberOfMoons() {
        Planet venus = new Planet("Venus", 0, false, Arrays.asList("Carbon Dioxide", "Nitrogen"));
        int numberOfMoons = venus.getNumberOfMoons();
        Assert.assertEquals(numberOfMoons, 0);
    }
    @Test
    public void testGetNumberOfMoonsNegetive() {
        Planet venus = new Planet("Venus", 0, false, Arrays.asList("Carbon Dioxide", "Nitrogen"));
        int numberOfMoons = venus.getNumberOfMoons();
        Assert.assertEquals(numberOfMoons, 1);
    }

    @Test
    public void testGetSurfaceGases() {
        Planet venus = new Planet("Venus", 0, false, Arrays.asList("Carbon Dioxide", "Nitrogen"));
        List<String> surfaceGases = venus.getSurfaceGases();
        Assert.assertEquals(surfaceGases, Arrays.asList("Carbon Dioxide", "Nitrogen"));
    }
    @Test
    public void testGetSurfaceGasesNegetive() {
        Planet venus = new Planet("Venus", 0, false, Arrays.asList("Carbon Dioxide", "Nitrogen"));
        List<String> surfaceGases = venus.getSurfaceGases();
        Assert.assertEquals(surfaceGases, Arrays.asList("Carbon Dioxide"));
    }

    @Test
    public void testIsRings() {
        Planet venus = new Planet("Venus", 0, false, Arrays.asList("Carbon Dioxide", "Nitrogen"));
        boolean hasRings = venus.isRings();
        Assert.assertFalse(hasRings);
    }
    @Test
    public void testIsRingsFalse() {
        Planet venus = new Planet("Venus", 0, false, Arrays.asList("Carbon Dioxide", "Nitrogen"));
        boolean hasRings = venus.isRings();
        Assert.assertTrue(hasRings);
    }
}
