public class Main {
    public static void main(String[] args) {
        System.out.println("--- Starting Programming Exam ---");
        OnlineExam programmingExam = new ProgrammingExam();
        programmingExam.startExam();

        System.out.println("--- Starting MCQ Exam ---");
        OnlineExam mcqExam = new MCQExam();
        mcqExam.startExam();

        System.out.println("--- Starting Essay Exam ---");
        OnlineExam essayExam = new EssayExam();
        essayExam.startExam();
    }
}
