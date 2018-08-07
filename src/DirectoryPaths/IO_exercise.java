package DirectoryPaths;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class IO_exercise {
    public static void main(String[] args){

        String directory = "data";
        String filename = "info.txt";
            Path dataDirectory = Paths.get(directory);
            Path dataFile = Paths.get(directory, filename);

            if (!Files.isDirectory(dataDirectory)) {
                try {
                    Files.createDirectories(dataDirectory);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!Files.exists(dataFile)) {
                try {
                    Files.createFile(dataFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

    }

}


