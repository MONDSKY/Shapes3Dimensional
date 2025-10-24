import java.util.Scanner;

public class ShapeHierarchyTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter radius of Sphere: ");
            double radius = input.nextDouble();
            Sphere sphere = new Sphere(radius);

            System.out.print("Enter side length of Cube: ");
            double side = input.nextDouble();
            Cube cube = new Cube(side);

            System.out.print("Enter edge length of Tetrahedron: ");
            double edge = input.nextDouble();
            Tetrahedron tetrahedron = new Tetrahedron(edge);

            // Demonstrate polymorphism using an array of the parent type
            ThreeDimensionalShape[] shapes = {sphere, cube, tetrahedron};

            System.out.println("\n     3D Shape Details    ");
            for (ThreeDimensionalShape shape : shapes) {
                shape.displayDetails();
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}

