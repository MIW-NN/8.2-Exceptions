package exceptions.project.model;


import org.junit.Assert;
import org.junit.Test;

import java.util.InputMismatchException;

public class VierkantTest {
    @Test
    public void testGetOppervlakte() {
        var vierkant = new Vierkant(3);

        Assert.assertEquals(9,vierkant.getOppervlakte(),0.0);
    }

    @Test
    public void expectBerekenZijdeToThrow_whenHavingANegativeSide() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            Vierkant.berekenZijde(-9);
        });
    }

}
