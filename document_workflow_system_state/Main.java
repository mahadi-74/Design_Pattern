public class Main {
    public static void main(String[] args) {
        Document document = new Document();

        System.out.println("--- Valid Transitions Demonstration ---");
        // Draft -> Under Review
        System.out.println("Current State: " + document.getState().getClass().getSimpleName());
        document.submitForReview();
        
        // Under Review -> Approved
        System.out.println("\nCurrent State: " + document.getState().getClass().getSimpleName());
        document.approve();

        // Approved -> Published
        System.out.println("\nCurrent State: " + document.getState().getClass().getSimpleName());
        document.publish();

        System.out.println("\n--- Invalid Transitions Demonstration ---");
        System.out.println("Current State: " + document.getState().getClass().getSimpleName());
        // Attempt an invalid transition
        // Document is published now, let's try to modify it
        document.modify();
        
        // Let's try to submit for review from published state
        document.submitForReview();
    }
}
