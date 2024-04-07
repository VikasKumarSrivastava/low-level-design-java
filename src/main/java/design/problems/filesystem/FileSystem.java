package design.problems.filesystem;

public interface FileSystem {
    void ls(String path);
    String name();
    boolean isDirectory();
}
