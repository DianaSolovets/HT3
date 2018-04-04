import java.io.*;
import java.util.Date;

// Вариант 2.
// В силу того, что использовать Selenium для выполнения этой задачи было нельзя, этот "фреймворк" имитирует обращение к страницам:
// в методах рандомно генерируется период ожидания на выполнение.

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		Reader reader = new Reader("input.txt");
		Logger logger = new Logger();
		Actions actions = new Actions();

		for (String line : reader.data) {
			String[] command = line.split(" ");

			boolean res = false;
			boolean error = false;
			long start = new Date().getTime();

			if (command[0].equals("open")) {
				res = actions.open(command[1], Integer.parseInt(command[2].substring(1, command[2].length() - 1)));
			}
			else if (command[0].equals("checkLinkPresentByHref")) {
				res = actions.checkLinkPresentByHref(command[1]);
			}
			else if (command[0].equals("checkLinkPresentByName")) {
				res = actions.checkLinkPresentByHref(command[1]);
			}
			else if (command[0].equals("checkPageTitle")) {
				res = actions.checkPageTitle(command[1]);
			}
			else if (command[0].equals("checkPageContains")) {
				res = actions.checkPageTitle(command[1]);
			}
			else {
				error = true;
			}

			if (error) {
				logger.logError();
			}
			else {
				long end = new Date().getTime();
				logger.log(res, line, end - start);
			}
		}

		logger.writeLog();
	}
}
