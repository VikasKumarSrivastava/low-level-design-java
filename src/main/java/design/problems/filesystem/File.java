package design.problems.filesystem;

public class File extends FileSystem {
    private String content;

    public File(String name) {
        super(name);
    }

    @Override
    public boolean isDirectory() {
        return false;
    }
}
