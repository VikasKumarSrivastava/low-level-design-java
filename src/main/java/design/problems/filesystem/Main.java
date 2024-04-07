package design.problems.filesystem;

public class Main {
    public static void main(String[] args) {
        Directory systemDesign = new Directory("system-design");
        Directory lld = new Directory("lld");
        Directory hld = new Directory("hld");
        Directory lldDay1 = new Directory("day1");
        Directory lldDay2 = new Directory("day2");
        Directory hldDay1 = new Directory("day1");
        Directory hldDay2 = new Directory("day2");

        File notes = new File("lld-day10-notes.txt");
        lldDay1.add(notes);
        lld.add(lldDay1);
        lld.add(lldDay2);
        systemDesign.add(lld);

        hld.add(hldDay1);
        hld.add(hldDay2);
        systemDesign.add(hld);

        File courseCurriculum = new File("course curriculum");
        systemDesign.add(courseCurriculum);

        systemDesign.ls("/lld/day1/");
    }
}
