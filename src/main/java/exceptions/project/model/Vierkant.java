package exceptions.project.model;

public class Vierkant {

    private double zijde;

    public Vierkant() {
        this.zijde = 0.0;
    }

    public Vierkant(double zijde) {
        this.zijde = zijde;
    }

    public double getOppervlakte() {
        return zijde * zijde;
    }

    public double getZijde() {
        return zijde;
    }

    public static double berekenZijde(double oppervlakte) throws IllegalArgumentException {
        if (oppervlakte <= 0) {
            throw new IllegalArgumentException("Je kunt geen negatieve of nul oppervlakte invoeren.");
        }
        return Math.sqrt(oppervlakte);
    }

    @Override
    public String toString() {
        return String.format("Vierkant met zijde %.2f", zijde);
    }

}
