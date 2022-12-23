import java.util.Scanner;

class Rock_paper_20_Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You can attempt only 5 times");
        String choice[] = { "Rock", "Paper", "Scissor" };
        int userScore = 0, computerScore = 0; // Stores the scores of user as well as computer
        for (int i = 0; i < 5; i++) {
            String computerInput = choice[(int) (Math.random() * 3)]; // Computer randomly selects from the choice
            System.out.println("---------------\nRock\nPaper\nScissor\nEnter your choice below");
            String userInput = sc.next(); // User will enter the choice as a String
            System.out.println("---------------");
            if (userInput.equals("Rock")) {
                if (computerInput == "Paper") {
                    System.out.println("Computer won");
                    computerScore++;
                } else if (computerInput == "Scissor") {
                    System.out.println("You won");
                    userScore++;
                } else {
                    System.out.println("Draw");
                }
            } else if (userInput.equals("Paper")) {
                if (computerInput == "Scissor") {
                    System.out.println("Computer won");
                    computerScore++;
                } else if (computerInput == "Rock") {
                    System.out.println("You won");
                    userScore++;
                } else {
                    System.out.println("Draw");
                }
            } else if (userInput.equals("Scissor")) {
                if (computerInput == "Rock") {
                    System.out.println("Computer won");
                    computerScore++;
                } else if (computerInput == "Paper") {
                    System.out.println("You won");
                    userScore++;
                } else {
                    System.out.println("Draw");
                }
            } else {
                System.out.println("Invalid choice");
            }

        }
        System.out.println("***************");
        if (computerScore > userScore) {
            System.out.println("Computer won the match");
        } else if (computerScore < userScore) {
            System.out.println("You won the match");
        } else {
            System.out.println("Match is draw");
        }
    }
}