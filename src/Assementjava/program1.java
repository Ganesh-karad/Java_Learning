package Assementjava;
import java.io.FileReader;
import java.util.Map;
import java.util.TreeMap;
class InvalidValueException extends Exception //custom exception
{
	InvalidValueException(String msg) 
	{
		System.out.println(msg);
	}

}

public class program1 {

	
		/**
		 this method reads the file 
		 */
		static String readFile(String loc) 
		{
			try {
				FileReader read = new FileReader(loc);
				int i;
				char c;
				String str = "";
				while ((i = read.read()) != -1) {
					c = (char) i;
					str = str + String.valueOf(c); //chracter convert into String (store into string)

				}
				read.close();
				return str;
				
			} catch (Exception e) {
				System.out.println(e);
			}

			return null;
		}
	/**
	 This method stores the data read in TreeMap and throws a custom exception.
	 */
		public static TreeMap<String, String> defaultStore(String str) 
		{
			String sar[] = str.split("\n");

			TreeMap<String, String> map = new TreeMap<String, String>();

			for (int i = 0; i < sar.length; i++) 
			{

				String[] st = sar[i].split("=");

				map.put(st[0], st[1]);
			}

			
			for (Map.Entry<String, String> entry : map.entrySet()) 
			{
				try 
				{
					if (entry.getValue().isBlank()) //check value is empty
					{
						String s = entry.getKey();
						String p = String.format("the value of %s key is empty ", s);
						System.out.println(p);
						throw new InvalidValueException("Exception:");//Throw custom Exception
					}
				} 
				catch (InvalidValueException e)
				{
					System.out.println(e);
					String key = entry.getKey();
					String value = "DEFAULT_VALUE";
					map.put(key, value);// Empty key put Defalutvalue

				}

			}
			
			return map;

		}
	/**
	  This method prints the data in key value format
	 */
		public static void displayFormat(TreeMap<String, String> smap) 
		{
			System.out.println("KEY \t\t" + "VALUE");
			for (Map.Entry<String, String> m : smap.entrySet())
			{
				
				if (m.getKey().length() > 7) 
				{
					System.out.println(m.getKey() + "\t" + m.getValue());
				}
				if (m.getKey().length() <= 7)
				{
					System.out.println(m.getKey() + "\t\t" + m.getValue());
				}

			}

		}

		public static void main(String[] args) {
			
			String location = "E:\\sample file.txt";
			String read = readFile(location);
			TreeMap<String, String> store = defaultStore(read);
			displayFormat(store);

		}

	}
