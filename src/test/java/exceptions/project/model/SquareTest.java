package exceptions.project.model;


import org.junit.Assert;
import org.junit.Test;

import java.util.InputMismatchException;

public class SquareTest {
    @Test
    public void testGetSurface() {
        var square = new Square(3);

        Assert.assertEquals(9,square.getSurface(),0.0);
    }

    @Test
    public void expectCalculateSideToThrow_whenHavingANegativeSide() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            Square.CalculateSide(-9);
        });
    }

}