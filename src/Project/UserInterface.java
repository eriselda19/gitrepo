package src.Project;

public interface UserInterface {

    void fileAscendingOrder();
    void addFileToDirectory() throws Exception;
    void deleteFileInDirectory() throws Exception;

    void searchFileInDirectory(String name);
    void navigateBack();
    void closeApplication();
}
