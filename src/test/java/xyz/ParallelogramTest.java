package xyz;

/**
 * Classname: ParallelogramTest
 *
 * @version 09.08.2020
 * @author Kopach Daria
 * <p>
 * 1. Create tests and logs for parallelogram
 * 2. Create Pallindrom check
 */

import org.junit.Assert;
import xyz.Parallelogram;

import java.util.logging.Logger;


public class ParallelogramTest {
    Parallelogram parallelogram = new Parallelogram(3, 4, Math.PI / 6);
    private static final Logger LOGGER = Logger.getLogger(Parallelogram.class.getName());

    @org.junit.Test
    public void whenSmallSide3BigSide4Angle30ThenPerimeter14() {
        LOGGER.info("PARALLELOGRAM_GET_PERIMETER_INFO");
        Assert.assertEquals(14, parallelogram.getPerimeter(), 0.001);
    }

    @org.junit.Test
    public void whenSmallSide3BigSide4Angle30ThenArea6() {
        LOGGER.info("PARALLELOGRAM_GET_AREA_INFO");
        Assert.assertEquals(6, parallelogram.getArea(), 0.001);
    }

    @org.junit.Test
    public void whenSmallSide3BigSide4Angle30ThenShortDiagonal() {
        LOGGER.info("PARALLELOGRAM'S_SHORT_DIAGONAL_GET_AREA_INFO");
        Assert.assertEquals(2.05, parallelogram.getShortDiagonal(), 0.2);
    }

    @org.junit.Test
    public void whenSmallSide3BigSide4Angle30ThenLongDiagonal() {
        LOGGER.info("PARALLELOGRAM'S_LONG_DIAGONAL_GET_AREA_INFO");
        Assert.assertEquals(6.77, parallelogram.getLongDiagonal(), 0.2);
    }

    @org.junit.Test
    public void whenSmallSide3BigSide4ThenRhombus() {
        LOGGER.info("PARALLELOGRAM_IS_A_RHOMBUS_INFO");
        Assert.assertEquals(1, parallelogram.isRhombus(), 0.2);
    }

}
