package config;

import java.io.IOException;

import org.testng.annotations.Test;

public class StartStop {
	
	@Test
	public static void start() throws IOException
	{
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe");
	}
	
	public static void stop()
	{
		
	}

}
