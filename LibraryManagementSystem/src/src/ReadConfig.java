package src;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class ReadConfig {
	public static Map<String,String> diConfig;
	
	public ReadConfig()
	{
		diConfig = new HashMap<String,String>();
		String strConfigFilePath = System.getProperty("user.dir") + "\\src\\ConfigFile.csv";
		try {
			BufferedReader br = Files.newBufferedReader(Paths.get(strConfigFilePath));
			String line = br.readLine();
			 while(line != null) 
			 {
				 String[] keyValue = line.split(",");
				 diConfig.put(keyValue[0], keyValue[1]);
				 line = br.readLine();
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
/*	public static void main(String args[]) {
		System.out.println(System.getProperty("user.dir") + "\\src\\ConfigFile.csv");
		new ReadConfig();
		System.out.println(ReadConfig.diConfig);
	}*/
}

