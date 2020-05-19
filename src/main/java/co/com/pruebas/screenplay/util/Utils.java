package co.com.pruebas.screenplay.util;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Utils {
	
	private static final String ORIGINAL= "ÁáÉéÍíÓóÚú";
	private static final String REPLACEMENT= "AaEeIiOoUuNnUu";

	public static String stripAccents(String str) {
		if (str == null) {
			return null;
		}
		char[] array = str.toCharArray();
		for (int index = 0; index < array.length; index++) {
			int pos = ORIGINAL.indexOf(array[index]);
			if (pos > -1) {
				array[index] = REPLACEMENT.charAt(pos);
			}
		}
		return new String(array);
	}
	
	public static void captureScreen(String nombre) {
		try 
		{
            BufferedImage captura = new Robot().createScreenCapture(
                    new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()) );
          
              File file = new File("pantallazos\\"+nombre+ ".png");
              ImageIO.write(captura, "png", file);

        }
        catch (AWTException | IOException ex) {
            System.out.println(ex);
        }
	}

}
