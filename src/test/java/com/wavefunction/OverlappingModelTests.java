package com.wavefunction;
import static org.junit.Assert.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;

import org.junit.Test;

public class OverlappingModelTests {

    @Test
    public void cityTemplateTest() {
        try {
			BufferedImage image_buffered = ImageIO.read(new File("citytemplate.png"));
			Random random = new Random();

			OverlappingModel model = new OverlappingModel(
			  image_buffered,
			  3,
			  32,
			  32,
			  true,
			  false,
		  2,
			102
			);
			boolean finished = model.run(random.nextInt(), 0);

			assertTrue(finished);
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
    }

    @Test
    public void flowersTest() {
        try {
			BufferedImage image_buffered = ImageIO.read(new File("Flowers.png"));
			Random random = new Random();

			OverlappingModel model = new OverlappingModel(
			  image_buffered,
			  3,
			  32,
			  32,
			  true,
			  false,
		  2,
			102
			);
			boolean finished = model.run(random.nextInt(), 0);

			assertTrue(finished);
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
    }

    @Test
    public void knotTest() {
        try {
			BufferedImage image_buffered = ImageIO.read(new File("Knot.png"));
			Random random = new Random();

			OverlappingModel model = new OverlappingModel(
			  image_buffered,
			  3,
			  32,
			  32,
			  true,
			  false,
		  2,
			102
			);
			boolean finished = model.run(random.nextInt(), 0);

			assertTrue(finished);
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
    }

    @Test
    public void lairTest() {
        try {
			BufferedImage image_buffered = ImageIO.read(new File("lair3.png"));
			Random random = new Random();

			OverlappingModel model = new OverlappingModel(
			  image_buffered,
			  3,
			  32,
			  32,
			  true,
			  false,
		  2,
			102
			);
			boolean finished = model.run(random.nextInt(), 0);

			assertTrue(finished);
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
    }
    
}
