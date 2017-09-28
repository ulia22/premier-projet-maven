package dev;

import java.io.IOException;

import com.github.lalyos.jfiglet.FigletFont;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String asciiArt1;
		try {
			asciiArt1 = FigletFont.convertOneLine("Bonjour !");
			 System.out.println(asciiArt1);
		} catch (IOException e) {
			e.printStackTrace();
		} 
    }
}
