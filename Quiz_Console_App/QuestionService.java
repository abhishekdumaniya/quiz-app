package Quiz_Console_App;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selectedOption = new String[5];
    String[] opt = new String[4];

    public QuestionService(){
        opt[0] = "2";
        opt[1] = "1";
        opt[2] = "8";
        opt[3] = "4";

        questions[0] = new Question(1,"Size of int", opt,"4");
        questions[1] = new Question(2,"Size of float", opt,"4");
        questions[2] = new Question(3,"Size of double", opt,"8");
        questions[3] = new Question(4,"Size of long", opt,"8");
        questions[4] = new Question(5,"Size of char", opt,"2");
    }
    public void playQuiz(){
        int i = 0;
        char ch = 'A';
        for (Question q: questions){
            System.out.println("Question no. : " + q.getId());
            System.out.println("Question : " + q.getQuestion());
            for (int j = 0; j < opt.length; j++) {
                System.out.print(ch + " : " + opt[j] + " ");
                ch++;
                if (ch > 'D') {
                    ch = 'A';
                }
            }

            System.out.println();
            System.out.print("Enter your Ans::::: ");
            Scanner sc = new Scanner(System.in);
            selectedOption[i] = sc.nextLine();
            if (selectedOption[i].equals(q.getCorrectAnswer())) {
                System.out.println("Your answer is correct");
            } else {
                System.out.println("Oops your answer is not Correct");
            }
            i++;
        }
        for (String s : selectedOption) {
                System.out.println("Your ans is : " + s + "Correct ans is : "  );

        }
    }

}
