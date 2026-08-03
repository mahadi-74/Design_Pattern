public abstract class OnlineExam {

    // Template method
    public final void startExam() {
        authenticateStudent();
        loadQuestions();
        conductExamination();
        evaluateAnswers();
        calculateFinalScore();
        publishResult();
    }

    private void authenticateStudent() {
        System.out.println("Authenticating the student...");
    }

    private void loadQuestions() {
        System.out.println("Loading the examination questions...");
    }

    private void conductExamination() {
        System.out.println("Conducting the examination...");
    }

    // Abstract method to be implemented by subclasses
    protected abstract void evaluateAnswers();

    private void calculateFinalScore() {
        System.out.println("Calculating the final score...");
    }

    private void publishResult() {
        System.out.println("Publishing the examination result...");
        System.out.println("------------------------------------------------");
    }
}
