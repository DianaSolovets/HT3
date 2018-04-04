import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Logger {
	private String logFile = "output.txt";
	private File file = new File(logFile);

	List<String> output;

	static int testsPassed = 0;
	static int testsFailed = 0;
	static double totalTime = 0;

	public Logger() {
		output = new ArrayList<String>();
	}

	public void logError() {
		output.add("Incorrect command!");
	}

	public void log(boolean res, String commands, double time) throws IOException {
		String resultLine = "";
		if (res) {
			resultLine += "+ ";
			testsPassed++;
		} else {
			resultLine += "! ";
			testsFailed++;
		}
		resultLine += "[" + commands + "] ";
		resultLine += String.format("%.3g%n", time / 1000);

		output.add(resultLine);
		totalTime += time;
	}

	public void writeLog() throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(file, false));

		for (String line: output) {
			out.write(line);
		}

		out.write("\r\nTotal tests: " + (testsPassed + testsFailed));
		out.write("\r\nPassed/Failed: " + testsPassed + "/" + testsFailed);
		out.write("\r\nTotal time: " + String.format("%.3g", totalTime/1000));
		out.write("\r\nAverage time: " + String.format("%.3g",(totalTime/((testsPassed + testsFailed)*1000))));
		out.close();
	}




}
