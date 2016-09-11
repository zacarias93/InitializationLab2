package lee.zac.InitializationLab22;

import static org.junit.Assert.*;
import org.junit.Test;



public class ThingContainerTest {

    @Test
    public void addTest(){
        ThingContainer thingContainer = new ThingContainer(1);
        ColorfulThing colorfulThing = new ColorfulThing(ColorfulThing.Color.BLUE);
        thingContainer.add(colorfulThing);
        ColorfulThing expected = colorfulThing;
        ColorfulThing actual = thingContainer.getArrayOfColorfulThings()[0];
        assertEquals("Added colorfulThing to thingContainer",expected, actual );
        }


    @Test
    public void popTest() {
        ThingContainer thingContainer = new ThingContainer(3);
        ColorfulThing colorfulThing = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing colorfulThing1 = new ColorfulThing(ColorfulThing.Color.RED);
        thingContainer.add(colorfulThing);
        thingContainer.add(colorfulThing1);
        assertEquals("should pop off colorfulThing1", colorfulThing1, thingContainer.pop());
        thingContainer.pop();
        assertEquals("Pop an empty Array?", null, thingContainer.pop());
    }

    @Test
    public void removeTest() {
        ThingContainer thingContainer = new ThingContainer(3);
        ColorfulThing colorfulThing = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing colorfulThing1 = new ColorfulThing(ColorfulThing.Color.RED);
        thingContainer.add(colorfulThing);
        thingContainer.add(colorfulThing1);
        assertEquals("Remove blue", colorfulThing, thingContainer.remove(ColorfulThing.Color.BLUE));
        assertEquals("Remove colorfulThing1", colorfulThing1, thingContainer.remove(colorfulThing1));
    }

    @Test
    public void sortArrayNullTest() {
        ThingContainer thingContainer = new ThingContainer(3);
        ColorfulThing colorfulThing = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing colorfulThing1 = new ColorfulThing(ColorfulThing.Color.RED);
        ColorfulThing colorfulThing2 = new ColorfulThing(ColorfulThing.Color.GREEN);

        thingContainer.add(colorfulThing);
        thingContainer.add(colorfulThing1);
        thingContainer.add(colorfulThing2);
        thingContainer.remove(colorfulThing1);
        thingContainer.sortArrayNull();

        // assertEquals("Should sort array to put null from [1] to [2]", "[BLUE, GREEN, NULL]", thingContainer.printThings());
    }

}

