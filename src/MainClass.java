import java.io.IOException;
import java.io.*;
import javax.swing.SwingUtilities;

/**
 * @author Aida.Azizi ^f
 */
public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		try {
			// ================Parser===============================

			// Parser prs1 = new Parser();
			// prs1.Show(1987, 40); // ( Number of round, linkNumber)

			// ================Analyzer=============================

			// 1987
			// Analyzer.Average(4,1);// ( Number of round, linkNumber)
			// Analyzer.CompareAverages();
			// Analyzer.Show();

			System.out.println("Sessor recorded " + Analyzer.SplitAverageAnalyzer2(1) + " cross nummber");

			// Analyzer.SplitAverageAnalyzer2(25);// linkNumber

			// ================Graph=================================

			// GraphicalPannel Panel1 = new GraphicalPannel();
			//
			// SwingUtilities.invokeLater(new Runnable() {
			// public void run() {
			// Panel1.createAndShowGui(1987, 40); // ( Number of round, linkNumber)
			// }
			// });

			// =============clean buffer==============================
			// ByteBufferClear Bcl = new ByteBufferClear();
			// ByteBufferClear.CLearBuffer();
			// =======================================================
		} catch (Exception e) {
			System.out.println("our sensors had no data!");
		}
		// =======================================================
	}

}
