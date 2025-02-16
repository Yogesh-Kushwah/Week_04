package read_write_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteFile {

    public static void main(String[] args) {
        // Define the source and destination file paths
        String sourceFilePath = "src/read_write_file/source.txt";
        String destinationFilePath = "src/read_write_file/destination.txt";

        // Create File objects for source and destination files
        File sourceFile = new File(sourceFilePath);
        File destinationFile = new File(destinationFilePath);

        // Check if the source file exists
        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        // Use try-with-resources to automatically close the streams
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            // Create the destination file if it does not exist
            if (!destinationFile.exists()) {
                destinationFile.createNewFile();
            }

            // Read from the source file and write to the destination file
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
