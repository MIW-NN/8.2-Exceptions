package exceptions.project.model;

public class Vierkant {

    private double zijde;

    public Vierkant() {
        this.zijde = 1.0;
    }

    public Vierkant(double zijde) {
        this.zijde = zijde;
    }

    public double getOppervlakte() {
        return zijde * zijde;
    }

    public static double berekenZijde(double oppervlakte) throws  IllegalArgumentException {
        if (oppervlakte < 0) {
            throw new IllegalArgumentException("Je kunt geen negatieve oppervlakte invoeren.");
        }
        return Math.sqrt(oppervlakte);
    }

    @Override
    public String toString() {
        return String.format("Vierkant met zijde %.2f", zijde);
    }

}
