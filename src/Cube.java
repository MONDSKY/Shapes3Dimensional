public class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side length must be positive.");
        }
        this.side = side;
    }

    @Override
    public String getName() {
        return "Cube";
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }
}
