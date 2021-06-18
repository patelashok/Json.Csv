package adressbook;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class CSVData {

    public static void main(String args[]) throws Exception {

        CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\Ashok\\IdeaProjects\\untitled\\src\\adressbook\\entry.csv"));

        List<String[]> list = new ArrayList<String[]>();
        String header[] = {"fname", "lname", "city", "State"};
        String line2[] = {"Ashok", "Patel", "pali", "Raj"};
        String line3[] = {"Ram", "Kumar", "pali", "Raj"};
        String line4[] = {"Syam", "sharma", "pali", "Raj"};

        list.add(header);
        list.add(line2);
        list.add(line3);
        list.add(line4);

        writer.writeAll(list);
        writer.flush();
        System.out.println("Data entered");
    }
}
