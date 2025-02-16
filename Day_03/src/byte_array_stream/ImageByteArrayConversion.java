package byte_array_stream;

import java.io.*;

public class ImageByteArrayConversion {

    public static void main(String[] args) {
        String inputImagePath = "src/byte_array_stream/original_image.jpg.jpg";  // Path to the original image
        String outputImagePath = "src/byte_array_stream/copied_image.jpg.bmp";  // Path to save the copied image

        try {
            // Step 1: Convert image to byte array
            byte[] imageBytes = convertImageToByteArray(inputImagePath);
            System.out.println("Image successfully converted to byte array.");

            // Step 2: Write the byte array back to an image file
            writeByteArrayToImage(imageBytes, outputImagePath);
            System.out.println("Image successfully written to " + outputImagePath);

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Method to convert an image file into a byte array
    static byte[] convertImageToByteArray(String imagePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(imagePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096];  // Read in chunks of 4 KB
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                 baos.write(buffer, 0, bytesRead);
            }

            return baos.toByteArray();
        }
    }

    // Method to write a byte array back to an image file
    static void writeByteArrayToImage(byte[] imageBytes, String outputPath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            byte[] buffer = new byte[4096];  // Write in chunks of 4 KB
            int bytesRead;

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }
}
