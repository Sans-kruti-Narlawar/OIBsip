import java.util.Scanner;

public class OnlineExam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Login
        System.out.println("Welcome to the Online Examination System!");
        System.out.print("Enter your username: ");
        String username = sc.nextLine();
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        // Update Profile and Password
        System.out.println("Do you want to update your profile and password? (Y/N)");
        String updateChoice = sc.nextLine();
        if (updateChoice.equalsIgnoreCase("Y")) {
            System.out.print("Enter your new username: ");
            username = sc.nextLine();
            System.out.print("Enter your new password: ");
            password = sc.nextLine();
            System.out.println("Profile and password updated successfully!");
        }

        // MCQ Selection
        String[][] questions = {{"What is the capital of India?", "A. Mumbai", "B. New Delhi", "C. Kolkata", "D. Chennai", "B"}, 
                                {"Who is the current US President?", "A. Joe Biden", "B. Barack Obama", "C. Donald Trump", "D. George Bush", "A"}, 
                                {"What is the currency of Japan?", "A. Yen", "B. Dollar", "C. Euro", "D. Pound", "A"}, 
                                {"What is the national animal of Australia?", "A. Kangaroo", "B. Koala", "C. Emu", "D. Tasmanian Devil", "A"}, 
                                {"What is the largest continent in the world?", "A. Africa", "B. Europe", "C. Asia", "D. North America", "C"}};

        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i][0]);
            System.out.println(questions[i][1]);
            System.out.println(questions[i][2]);
            System.out.println(questions[i][3]);
            System.out.println(questions[i][4]);
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase(questions[i][5])) {
                score++;
            }
        }

        // Timer and Auto-Submit
        System.out.println("You have 1 minute to complete the exam.");
        long startTime = System.currentTimeMillis();
        long elapsedTime = 0L;
        while (elapsedTime < 300000) {
            elapsedTime = System.currentTimeMillis() - startTime;
        }
        System.out.println("Time is up! Your final score is " + score + " out of 5.");

        // Closing session and Logout
        System.out.println("Thank you for taking the exam, " + username + "!");
        System.out.println("You are now logged out.");
    }
}
