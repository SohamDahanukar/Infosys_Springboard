public class SubjectMarks {
    private int[] marksArray = new int[5];

    public void storeMarks(int[] marks) {
        if (marks.length == marksArray.length) {
            for (int i = 0; i < marksArray.length; i++) {
                marksArray[i] = marks[i];
            }
        }
    }

    public void displayMarks() {
        for (int mark : marksArray) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SubjectMarks subjectMarks = new SubjectMarks();
        int[] studentMarks = {80, 90, 75, 85, 95};
        subjectMarks.storeMarks(studentMarks);
        subjectMarks.displayMarks();
    }
}
