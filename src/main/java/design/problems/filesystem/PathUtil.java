package design.problems.filesystem;

public class PathUtil {
    public static String firstDirectoryName(String path) {
        int i = 0;
        for (i = 1; i < path.length(); ++i) {
            if (path.charAt(i) == '/') {
                return path.substring(1, i);
            }
        }
        return "";
    }

    public static String remainingPath(String path) {
        int i = 0;
        for (i = 1; i < path.length(); ++i) {
            if (path.charAt(i) == '/') {
                return path.substring(i);
            }
        }
        return "";
    }
}
