package lee.zac.InitializationLab22;


import java.util.Arrays;

public class ThingContainer {

    private ColorfulThing[] arrayOfColorfulThings;

    public ThingContainer(int sizeOfArray) {
        this.arrayOfColorfulThings = new ColorfulThing[sizeOfArray];
    }

    public ThingContainer(ColorfulThing[] array) {
        this.arrayOfColorfulThings = new ColorfulThing[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayOfColorfulThings[i] = array[i];
        }
    }

    public void add(ColorfulThing colorfulThing) {
        for (int i = 0; i < arrayOfColorfulThings.length; i++) {
            if (arrayOfColorfulThings[i] == null) {
                arrayOfColorfulThings[i] = colorfulThing;
                return;
            }
        }
        System.out.println("The array is full.");
    }

    public ColorfulThing[] getArrayOfColorfulThings() {
        return arrayOfColorfulThings;
    }

    public void printThings() {
        System.out.println(Arrays.toString(this.getArrayOfColorfulThings()));
    }

    public ColorfulThing pop() {
        int length = arrayOfColorfulThings.length - 1; //

        for (int i = arrayOfColorfulThings.length - 1; i >= 0; i--) {
            if (arrayOfColorfulThings[i] != null) {
                ColorfulThing y = arrayOfColorfulThings[i];
                arrayOfColorfulThings[i] = null;
                return y;
            }
        }
        return null;
    }

    public ColorfulThing remove(ColorfulThing.Color color) {

        for (int i = 0; i < this.arrayOfColorfulThings.length; i++) {
            if (arrayOfColorfulThings[i].getColor() == color) {
                ColorfulThing y = arrayOfColorfulThings[i];
                arrayOfColorfulThings[i] = null;
                sortArrayNull();
                return y;
            }
        }
        return null;
    }

    public ColorfulThing remove(ColorfulThing colorfulThing) {
        for (int i = 0; i < this.arrayOfColorfulThings.length; i++) {
            if (arrayOfColorfulThings[i] == colorfulThing) {
                ColorfulThing y = arrayOfColorfulThings[i];
                arrayOfColorfulThings[i] = null;
                sortArrayNull();
                return y;
            }
        }
        return null;
    }

    public void sortArrayNull() {
        for (int i = 0; i < this.arrayOfColorfulThings.length-1; i++) {
            if (arrayOfColorfulThings[i] == null) {
                    ColorfulThing temp = arrayOfColorfulThings[i];
                    arrayOfColorfulThings[i] = arrayOfColorfulThings[i + 1];
                    arrayOfColorfulThings[i + 1] = temp;
                }
            }

        }
    }






