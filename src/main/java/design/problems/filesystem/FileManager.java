package design.problems.filesystem;

import java.nio.file.Path;

public class FileManager {
    private Directory root;

    public FileManager() {
        this.root = new Directory("");
    }

    public void createFileSystem(String path) {
        // todo: do some path validation
        createFileSystem(this.root, path);

    }
    public void ls(String path) {
        ls(this.root, path);
    }

    private void ls(Directory parentDirectory, String path) {
        if (path.equals("/")) {
            for (FileSystem fileSystem : parentDirectory.getFileSystemList()) {
                System.out.println("Name: " + fileSystem.getName() + ", " + "is directory: " + fileSystem.isDirectory());
            }
            return;
        }
        for (FileSystem fileSystem : parentDirectory.getFileSystemList()) {
            if (fileSystem.getName().equals(PathUtil.firstDirectoryName(path)) && fileSystem.isDirectory() == true) {
                ls((Directory) fileSystem, PathUtil.remainingPath(path));
            }
        }

    }
    private void createFileSystem(Directory parentDirectory, String path) {
        // if path doesn't end with "/", it means it's a file. else it's a directory.
        // base case for directory.
        if ("/".equals(path)) {
            return;
        }

        // base case for file
        int countSlashes = 0;
        for (int i = 0; i < path.length(); ++i) {
            if (path.charAt(i) == '/') {
                countSlashes++;
            }
        }
        if (countSlashes == 1 && path.charAt(path.length() - 1) != '/') {
            File file = new File(path.substring(1));
            parentDirectory.addFileSystem(file);
            return;
        }

        // 1. Whether current directory exists or not? if not, then create it first.
        // 2. Create directory from remaining path.
        // 3. Add that returned directory from step, add that into current directory.
        Directory currentDirectory = null;
        for (FileSystem fileSystem : parentDirectory.getFileSystemList()) {
            if (fileSystem.getName().equals(PathUtil.firstDirectoryName(path))) {
                currentDirectory = (Directory) fileSystem;
                break;
            }
        }
        if (currentDirectory == null) {
            currentDirectory = new Directory(PathUtil.firstDirectoryName(path));
            parentDirectory.addFileSystem(currentDirectory);
        }
        createFileSystem(currentDirectory, PathUtil.remainingPath(path));
    }


    // todo: we can add delete, rename, etc.
}
