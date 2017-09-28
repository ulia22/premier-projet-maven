package dev;

import java.io.IOException;
import com.github.lalyos.jfiglet.FigletFont;
import java.util.ResourceBundle;
/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		try {
			String titre = ResourceBundle.getBundle("application").getString("titre");
			String asciiArt1 = FigletFont.convertOneLine(titre);
			System.out.println(asciiArt1);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		String environnement = ResourceBundle.getBundle("application").getString("environnement");
		System.out.println("Environnement : " + environnement);
	}
}
