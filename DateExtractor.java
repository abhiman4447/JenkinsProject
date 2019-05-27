package testProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DateExtractor {

	private static List<SimpleDateFormat> formatList = new ArrayList<>();
	
	public static void main(String[] args) throws FileNotFoundException, ParseException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(new File("//Users//abhimandas//eclipse-workspace//testProject//src//testProject//a.csv"));
		SimpleDateFormat formatter1 = new SimpleDateFormat("dd/mm/yyyy");
		SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy/mm/dd");
		SimpleDateFormat formatter3 = new SimpleDateFormat("mm/dd/yyyy");
		SimpleDateFormat targetFormat = new SimpleDateFormat("dd-mm-yyyy");
		
		
		formatList.add(formatter1);
		formatList.add(formatter2);
		formatList.add(formatter3);
		
		while(sc.hasNext()) {
			String tokens = sc.next();
			String dates[] = tokens.split(",");
			Date d = null;
			for(String date : dates) {
				
			  d = formatParser(date);
			  String targetDate = targetFormat.format(d);
			  System.out.println(targetDate);	
			}
		}
		
	}
	
	
	public static Date formatParser(String date) {
		Date d = null;
		for(SimpleDateFormat format : formatList) {
			try {
				d = format.parse(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return d;
	}

}
