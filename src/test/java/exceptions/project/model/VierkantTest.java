package exceptions.project.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VierkantTest {

    // --- getOppervlakte ---

    @Test
    void getOppervlakte_zijde5_geeft25() {
        Vierkant vierkant = new Vierkant(5.0);
        assertEquals(25.0, vierkant.getOppervlakte(), 0.001);
    }

    @Test
    void getOppervlakte_zijde1_geeft1() {
        Vierkant vierkant = new Vierkant(1.0);
        assertEquals(1.0, vierkant.getOppervlakte(), 0.001);
    }

    // --- berekenZijde ---

    @Test
    void berekenZijde_oppervlakte25_geeft5() {
        assertEquals(5.0, Vierkant.berekenZijde(25.0), 0.001);
    }

    @Test
    void berekenZijde_oppervlakte4_geeft2() {
        assertEquals(2.0, Vierkant.berekenZijde(4.0), 0.001);
    }

    // --- assertThrows voor negatieve oppervlakte ---

    @Test
    void berekenZijde_negatiefOppervlak_gooidException() {
        assertThrows(IllegalArgumentException.class,
                () -> Vierkant.berekenZijde(-1.0));
    }

    @Test
    void berekenZijde_nulOppervlak_gooidException() {
        assertThrows(IllegalArgumentException.class,
                () -> Vierkant.berekenZijde(0.0));
    }

    // --- constructors ---

    @Test
    void allArgsConstructor_staatZijdeCorrectIn() {
        Vierkant vierkant = new Vierkant(5.0);
        assertEquals(5.0, vierkant.getZijde(), 0.001);
    }

    @Test
    void defaultConstructor_zijdeIsNul() {
        Vierkant vierkant = new Vierkant();
        assertEquals(0.0, vierkant.getZijde(), 0.001);
    }
}
