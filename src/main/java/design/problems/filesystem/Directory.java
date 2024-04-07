package design.problems.filesystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    private String name;
    private List<FileSystem> fileSystemList;

    public Directory(String name) {
        // put validation on directory name, eg "/" shouldn't be part of it.
        this.name = name;
        this.fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystem) {
        this.fileSystemList.add(fileSystem);
    }

    @Override
    public void ls(String path) {
        if (path.equals("/")) {
            // return the files/ and directories of this file.
            for (FileSystem fileSystem : this.fileSystemList) {
                System.out.println("Name: " + fileSystem.name() + "  , is directory: " + fileSystem.isDirectory());
            }
            return;
        }
        // try to enter into directory eg. /lld/day1/
        // lld --> day1/
        String currentDirectory = "", remainingDirectory = "";
        // i=0 will always be '/'

        for (int i = 1; i < path.length(); ++i) {
            if (path.charAt(i) == '/') {
                remainingDirectory = path.substring(i);
                currentDirectory=path.substring(1, i);
                break;
            }
        }

        // find if current directory exists or not, if not. simply throw error. else enter into the directory and call
        // the function again.
        for (FileSystem fileSystem : this.fileSystemList) {
            if (fileSystem.isDirectory() && fileSystem.name().equals(currentDirectory)) {
                fileSystem.ls(remainingDirectory);
                return;
            }
        }
        System.out.println("Path doesn't exist");
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public boolean isDirectory() {
        return true;
    }
}
