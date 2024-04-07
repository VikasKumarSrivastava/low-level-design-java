package design.problems.filesystem;

public class File implements FileSystem {
    private String name;
    private String content;

    public File(String name) {
        this.name = name;
        this.content = "";
    }

    @Override
    public void ls(String path) {
        System.out.println("File name " + this.name);
    }
    @Override
    public String name() {
        return this.name;
    }

    @Override
    public boolean isDirectory() {
        return false;
    }
}
