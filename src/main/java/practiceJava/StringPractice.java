package practiceJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class StringPractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		String inputPath="src/main/java/input.txt";

		StringPractice strPrac=new StringPractice();
//		strPrac.FileReadPara(inputPath);
		strPrac.frequency(inputPath);
	}

	public void FileReadPara(String path) throws IOException
	{
		
		BufferedReader reader=new BufferedReader(new FileReader(path));
		
		String line;
		int maxPara=0;
		StringBuilder contents =new StringBuilder();
		Map<Integer, String> map=new HashMap<Integer, String>();
		while((line=reader.readLine())!=null)
		{
			contents.append(line).append("\n");
			
		}
//		System.out.println(contents);
		String[] paraSplit=contents.toString().split("\\n\\s*\\n");
//		for(String para :paraSplit)
//		{
//		
////			System.out.println(para);
//			int paralength=para.length();
//			if(paralength>maxPara)
//			{
//				maxPara=paralength;
//			}
//			
//		}
		for(int i=0; i<paraSplit.length; i++)
		{
			int paralength=paraSplit[i].length();
			if(paralength>maxPara) {
				maxPara=paralength;
				map.put(maxPara, paraSplit[i]);
				
			}
			
		}
		System.out.println(map.get(maxPara));
//		System.out.println(map);
		System.out.println("length of biggeest para"+ "  " +maxPara);
	}


void frequency(String path) throws IOException

{
	
	BufferedReader br=new BufferedReader(new FileReader(path));
	
	
	String line;
	int count=0;
	Map<String,Integer> map=new HashMap<String,Integer>();
	StringBuilder contents=new StringBuilder();
	
	while((line=br.readLine())!=null)
	{
		//String[] split = line.split("\\s+|\\p{Punct}");
		contents.append(line).append(' ');
	}
	String[] split = contents.toString().split(" ");
	for(int i=0;i<split.length;i++)
	{
		System.out.println(split[i]);
		for(int j=i+1;j<split.length;j++)
		{
			System.out.println(split[j]);
			if(split[i].equals(split[j]))
			{
				map.put(split[i], count++);
				
			}
			
//			
//			else {
//				map.put(split[i], 1);
//			}
		}
//		map.put(split[i], 1);
	}
	
	 for (Map.Entry<String, Integer> entry : map.entrySet()) {
  String key = entry.getKey();
  Integer value = entry.getValue();
  System.out.println("Key: " + key + "--> " + value);
}


	}

}


