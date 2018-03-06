package com.ef;

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Parser {
	public static void main(String[] args) {
//		String[] array = {"--startDate=2017-01-01.13:00:00", "--duration=hourly", "--threshold=100"};
		LogAnalyser analyser= new LogAnalyser();
		analyser.readFile("./files/access.log");
//                runApp(analiser, array);


		if(args.length>0){ runApp(analyser,args );}else{
		System.out.println("RUN USING COMMAND LINE.");
		System.out.println("Thanks");
		}
	}

	
	public static  HashMap<String,String> decodeArgs(String[] array){
		return (HashMap<String, String>) Stream.of(array)
		        .map(elem -> elem.split("\\="))
		        .filter(elem -> elem.length==2)
		        .collect(Collectors.toMap(e -> e[0], e -> e[1]))
		        .entrySet()
		        .stream()
		        .collect(
		        		Collectors.toMap(e -> e.getKey().split("\\-\\-")[1], e -> e.getValue()));
		
	}
	
	public static void runApp(LogAnalyser analiser,String[] array){
		
		 String duration=decodeArgs(array).get("duration");
		 String startDate=decodeArgs(array).get("startDate");
		 int threshold=Integer.parseInt(decodeArgs(array).get("threshold"));
		 System.out.println(startDate+" : "+duration+" : "+threshold);
		 
		 analiser.mapIpAddressAgainstComment("2017-01-01.13:00:00","hourly",100);
	}
}
