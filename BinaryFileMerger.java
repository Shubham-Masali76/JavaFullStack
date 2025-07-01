// Merging Large Binary Files: Given multiple large binary files, implement a program that merges them into a single binary file using BufferedInputStream and BufferedOutputStream.

import java.io.*;
import java.util.List;

public class BinaryFileMerger {

    public void mergeFiles(List<String> inputFiles, String outputFilePath) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFilePath))) {
            for (String filePath : inputFiles) {
                try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath))) {
                    byte[] buffer = new byte[8192];
                    int bytesRead;
                    while ((bytesRead = bis.read(buffer)) != -1) {
                        bos.write(buffer, 0, bytesRead);
                    }
                }
            }
            System.out.println("Files merged into: " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<String> filesToMerge = List.of("part1.bin", "part2.bin", "part3.bin");
        new BinaryFileMerger().mergeFiles(filesToMerge, "merged_output.bin");
    }
}
