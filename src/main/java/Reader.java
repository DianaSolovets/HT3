import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Reader {

	public List<String> data;

	public Reader(String file) throws IOException {
		FileInputStream fstream = new FileInputStream (file);
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		data = new ArrayList<String>();
		String strLine = null;
		while((strLine = br.readLine()) != null) {
			data.add(strLine);
		}
		br.close();
	}

}
