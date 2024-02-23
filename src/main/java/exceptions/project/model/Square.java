package exceptions.project.model;

public class Square {

    private double side;

    public Square() {
        this.side = 1.0;
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSurface() {
        return side * side;
    }

    public static double CalculateSide(double surface) throws  IllegalArgumentException {
        if (surface < 0) {
            throw new IllegalArgumentException("Je kunt geen negatieve oppervlakte invoeren.");
        }
        return Math.sqrt(surface);
    }

    @Override
    public String toString() {
        return String.format("Vierkant met zijde %.2f", side);
    }

}
