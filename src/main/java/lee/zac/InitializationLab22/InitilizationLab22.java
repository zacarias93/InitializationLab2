package lee.zac.InitializationLab22;

/**
 * Created by zaclee on 9/10/16.
 */
public class InitilizationLab22 {

    public static void main(String[] args) {
        ThingContainer container = new ThingContainer(3);
        ColorfulThing colorfulThing1 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing colorfulThing2 = new ColorfulThing(ColorfulThing.Color.RED);
        ColorfulThing colorfulThing3 = new ColorfulThing(ColorfulThing.Color.GREEN);
        container.add(colorfulThing1);
        container.add(colorfulThing2);
        container.add(colorfulThing3);
        container.printThings();
        container.pop();
        container.printThings();
        container.remove(ColorfulThing.Color.RED);
        container.printThings();
        container.remove(colorfulThing1);
        container.printThings();

        System.out.println();

        ThingContainer thingContainer1 = new ThingContainer(5);
        ColorfulThing colorfulThing4 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing colorfulThing5 = new ColorfulThing(ColorfulThing.Color.GREEN);
        ColorfulThing colorfulThing6 = new ColorfulThing(ColorfulThing.Color.RED);
        ColorfulThing colorfulThing7 = new ColorfulThing(ColorfulThing.Color.RED);
        thingContainer1.add(colorfulThing4);
        thingContainer1.add(colorfulThing5);
        thingContainer1.printThings();
        ThingContainer thingContainer2 = new ThingContainer(thingContainer1.getArrayOfColorfulThings());
        thingContainer2.printThings();

        System.out.println();

        thingContainer2.add(colorfulThing6);
        thingContainer2.add(colorfulThing7);
        thingContainer2.printThings();
        thingContainer2.remove(ColorfulThing.Color.GREEN);
        thingContainer2.printThings();

        thingContainer2.printThings();




    }
}
