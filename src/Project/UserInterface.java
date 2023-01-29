package src.Project;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

public interface UserInterface {

    void fileAscendingOrder();
    void addFileToDirectory() throws IOException;
    void deleteFileInDirectory();

    void searchFileInDirectory();
}
