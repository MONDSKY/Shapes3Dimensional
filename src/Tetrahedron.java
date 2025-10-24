public class Tetrahedron extends ThreeDimensionalShape {
    private double edge;

    public Tetrahedron(double edge) {
        setEdge(edge);
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        if (edge <= 0) {
            throw new IllegalArgumentException("Edge length must be positive.");
        }
        this.edge = edge;
    }

    @Override
    public String getName() {
        return "Tetrahedron";
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * Math.pow(edge, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(edge, 3) / (6 * Math.sqrt(2));
    }
}

