package design.problems.filesystem;

public abstract class FileSystem {
    private String name;
    public FileSystem(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    abstract boolean isDirectory();

}
