import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCS {

	public static void main(String[] args) {

		ReadCS obj = new ReadCS();
		obj.run();

	}

	public void run() {

		String file = "/home/gabriel/Desktop/file.csv";
		BufferedReader br = null;
		String line = "";
		String csvDivisor = ",";
		try {

			br = new BufferedReader(new FileReader(file));
			while ((line = br.readLine()) != null) {

				String[] mail = line.split(csvDivisor);
				System.out.println("{name: " + mail[mail.length - 2] + " , email:" + mail[mail.length - 1] + "}");

			}

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
	}
}