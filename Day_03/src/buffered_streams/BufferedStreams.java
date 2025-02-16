package buffered_streams;

import java.io.*;

public class BufferedStreams {
    public static void main(String[] args) {
        // File paths
        String sourceFile = "src/buffered_streams/sourceFile.txt"; // Update with your source file path
        String destFileBuffered = "src/buffered_streams/destFileBuffered.txt";
        String destFileUnbuffered = "src/buffered_streams/destFileUnbuffered.txt";

        try {
            // Copy using buffered streams
            long bufferedTime = copyWithBufferedStreams(sourceFile, destFileBuffered);

            // Copy using unbuffered streams
            long unbufferedTime = copyWithUnbufferedStreams(sourceFile, destFileUnbuffered);

            // Print the execution times
            System.out.println("Time taken with Buffered Streams: " + bufferedTime + " ns");
            System.out.println("Time taken with Unbuffered Streams: " + unbufferedTime + " ns");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static long copyWithBufferedStreams(String sourceFile, String destFile) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile))) {

            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;

            long startTime = System.nanoTime();
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            bos.flush();
            long endTime = System.nanoTime();

            return endTime - startTime; // Return elapsed time
        }
    }

    public static long copyWithUnbufferedStreams(String sourceFile, String destFile) throws IOException {
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;

            long startTime = System.nanoTime();
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            fos.flush();
            long endTime = System.nanoTime();

            return endTime - startTime; // Return elapsed time
        }
    }
}
