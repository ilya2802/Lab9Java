package ua.lviv.iot.fortifications.manager;

import ua.lviv.iot.fortifications.models.Fortifications;

import java.io.*;
import java.util.List;

public class Writer {
    public void writeToFile(final List<Fortifications> fortifications)
            throws IOException {
        File myFile = new File("fortifications.csv");

        try (FileOutputStream fos = new FileOutputStream(myFile);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bufWriter = new BufferedWriter(osw)) {

            fortifications.stream().forEach(fortification -> {
                try {
                    bufWriter.write(fortification.getHeaders());
                    bufWriter.newLine();
                    bufWriter.write(fortification.toCSV());
                    bufWriter.newLine();
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            });

        } finally {
            System.out.println(" ");
        }
    }
}
