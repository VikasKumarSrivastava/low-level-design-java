package design.problems.filesystem;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystem {
    private List<FileSystem> fileSystemList;

    public List<FileSystem> getFileSystemList() {
        return fileSystemList;
    }

    public void addFileSystem(FileSystem fileSystem){
        this.fileSystemList.add(fileSystem);
    }
    public Directory(String name) {
        super(name);
        fileSystemList = new ArrayList<>();
    }

    @Override
    public boolean isDirectory() {
        return true;
    }

    public void ls(String path) {
        // "/system-design/lld/"
        if ("/".equals(path)) {
            for (FileSystem fileSystem : this.fileSystemList) {
                System.out.println("Name: " + fileSystem.getName() + ", Is directory: " + fileSystem.isDirectory());
            }
        }
    }
}
