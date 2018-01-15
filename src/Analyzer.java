import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Analyzer {

	static ArrayList<Double> sosis;
	static ArrayList<Double> kavas;
	static double avg;
	static double k = 0;
	static int kiyarshoor;
	static double max = 1;
	static int linkNumber = 1;
	static int crossNum = 0;

	public Analyzer() {

	}

	public static void Show() {
		// Parser parser1 = new Parser();
		// sosis = (parser1.parser(30, 1));
		// System.out.println(sosis);
		// System.out.println("ghaasem");
		// System.out.println("Total : " + kiyarshoor);
	}

	public static double Average(int round, int linkNumber) {
		sosis = Parser.parser(round, linkNumber);
		int RealsizeOfList = (sosis.size() - 1);
		for (int i = 0; i < RealsizeOfList; i++) {
			// System.out.println(i);
			k += sosis.get(i);
			// System.out.println(sosis.get(i));
		}
		avg = (k / (RealsizeOfList));
		System.out.println("Total Link Average  : " + avg);
		System.out.println("Total Recorded round: " + (sosis.size() - 1));
		return avg;
	}

	public static double CompareAverages() {
		for (int i = 0; i < 48; i++) {
			double kalbas = Analyzer.Average(10, i);
			if (kalbas > max) {
				max = Average(1987, i);
				linkNumber = i;
			}
		}
		System.out.println("linkNumber: " + linkNumber + "\n");

		System.out.println("Max: " + max + "\n");
		return avg;
	}

	public static void SplitAverageAnalyzer() {
		double totalAverage = Average(1987, 1);
		kavas = Parser.parser(19871, 1);
		double avg1 = 0;
		for (int i = 0; i < 1980; i += 60) {
			for (int j = 0; j < 59; j++) {
				k += kavas.get(j);
			}
			avg1 = (k / 60);
			if (avg1 > totalAverage) {
				System.out.println("linkEpisodeNumber: " + i / 60 + "\n");
				System.out.println("avg1 of this episode: " + avg1 + "\n");
			}
			System.out.println("totalAverage" + totalAverage + "\n");
		}
	}

	public static int SplitAverageAnalyzer2(int linkNumber) {

		double totalAverage = Average(1987, linkNumber);
		if (linkNumber < 13) {
			System.out.println("Channel: " + 11);
		} else if (linkNumber == 13 || 13 < linkNumber && linkNumber < 26) {
			System.out.println("Channel: " + 16);
		} else if (linkNumber == 26 || 26 < linkNumber && linkNumber < 37) {
			System.out.println("Channel: " + 21);
		} else if (linkNumber == 37 || 37 < linkNumber && linkNumber < 48) {
			System.out.println("Channel: " + 26);
		} else {
			System.out.println("range of the link Number is not supported");
		}
		System.out.println("RSS linkNumber: " + linkNumber);
		kavas = Parser.parser(1987, 1);
		double avg1 = 0;
		for (int i = 0; i < 1987; i += 60) {
			k = 0;
			for (int j = 0; j < 59; j++) {

				k += kavas.get(i + j);
			}
			System.out.println("i: " + i + "\n");
			System.out.println("K: " + k + "\n");
			avg1 = (k / 60);
			if (avg1 > totalAverage + 1.2) {
				crossNum++;
				System.out.println("RoundEpisodeNumber: " + i / 60 + "\n");
				System.out.println("avg1 of this episode: " + avg1 + "\n"
						+ "So, we had the cross at the interval time between: " + "{" + i + "-" + (i + 60) + "}");
				System.out.println("Total Average: " + totalAverage + "\n");

			}
		}
		return (crossNum);

	}
}
