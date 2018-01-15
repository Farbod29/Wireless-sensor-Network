import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Parser {
	static ArrayList<Double> list3 = new ArrayList<Double>();
	static ArrayList<Double> list4 = new ArrayList<Double>();
	static ArrayList<Double> list2 = new ArrayList<Double>();

	public static ArrayList<Double> parser(int round, int linkNumber) {

		String RSSfile = "/Users/farbodaprin/Desktop/Convertor/rss.txt";
		BufferedReader br = null;
		String line = "]";
		String RssSplitBy = ",";
		int i = 0;
		double d = 0;
		try {
			br = new BufferedReader(new FileReader(RSSfile));
			double negetive = 0;
			while ((line = br.readLine()) != null) {
				i++;
				if (i > round)
					break;
				String[] RSS = line.split(RssSplitBy);
				d = Double.parseDouble(RSS[linkNumber]);
				if (d < 0) {
					negetive = d;
					list2.add((-1) * negetive);
				} else {
					list2.add((-1) * negetive);
				}
			}
			for (int k = 0; k < list2.size(); k++) {
				if (list2.get(k) > 0) {
					list4.add(list2.get(k));
				}
			}
			list4.add((double) 0); // to avoid Null NAN in avetage 
			// System.out.println(list4);
			
			// ===================================

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return list4;
	}

	public void Show(int round, int linkNumber) {
		
//		System.out.println("RSS linkNumber: " + linkNumber);
//
//		if (linkNumber < 13) {
//			System.out.println("Channel: " + 11);
//		} else if (linkNumber == 13 || 13 < linkNumber && linkNumber < 26) {
//			System.out.println("Channel: " + 16);
//		} else if (linkNumber == 26 || 26 < linkNumber && linkNumber < 37) {
//			System.out.println("Channel: " + 21);
//		} else if (linkNumber == 37 || 37 < linkNumber && linkNumber < 48) {
//			System.out.println("Channel: " + 26);
//		} else {
//			System.out.println("range of the link Number is not supported");
//		}
		list3 = Parser.parser(round, linkNumber);
//		System.out.println("RSS Round: " + round);
//		for (int x = 0; x < list3.size(); x++) {
//			System.out.println((-1) * list3.get(x));
//		}
	}
}
