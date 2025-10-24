public abstract class ThreeDimensionalShape extends Shape {

    // displays 3D shape details
    public void displayDetails() {
        System.out.println("Shape: " + getName());
        System.out.printf("Surface Area: %.2f%n", getArea());
        System.out.printf("Volume: %.2f%n%n", getVolume());
    }
}

