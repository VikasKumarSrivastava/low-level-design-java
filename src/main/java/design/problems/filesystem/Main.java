package design.problems.filesystem;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        fileManager.createFileSystem("/system-design/lld/day1/");
        fileManager.createFileSystem("/system-design/lld/day1/notes.txt");
        fileManager.createFileSystem("/system-design/lld/day1/notes2.txt");
        fileManager.createFileSystem( "/system-design/lld/day2/");
        fileManager.createFileSystem("/system-design/lld/day2/notes.txt");
        fileManager.createFileSystem( "/system-design/hld/day1/");
        fileManager.createFileSystem("/system-design/hld/day1/notes.txt");
        fileManager.createFileSystem("/system-design/hld/day2/");
        fileManager.createFileSystem("/system-design/hld/day2/notes.txt");
        fileManager.ls("/system-design/lld/day1/");
    }
}
