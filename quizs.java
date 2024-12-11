import java.util.Enumeration;
import java.util.Vector;

import products.returnproduct;

enum Difficulty {
    EASY, MEDIUM , HARD;
}

class Question{
    private String questionText;
    private String[] options;
    private int correctOptionIndex;
    private Difficulty difficulty;

    public Question(String questionText, String[] options, int correctOptionIndex, Difficulty difficulty){
        this.questionText = questionText;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
        this.difficulty = difficulty;
    }

    public String getQuestion(){
        return questionText;
    }

    public String[] getOptions(){
        return options;
    }

    public Difficulty geDifficulty(){
        return difficulty;
    }

    public boolean checkAnswer(int selectedoption){
        return selectedoption == correctOptionIndex;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Question :").append(questionText).append("\n");
        sb.append("Questions: \n");
        for(int i = 0; i< options.length; i++){
            sb.append(i+1).append(". ").append(options[i]).append("\n");
        }

        sb.append("Difficulty: " ).append(difficulty);

        return sb.toString();
    }
}

class Quiz{
   private Vector<Question>  questions;

   public Quiz(){
    questions = new Vector<>();


   }


   public void addquestions(Question question){
    questions.add(question);
   }

   public void displayQuestion(){
    Enumeration<Question> questionEnum = questions.elements();
    while (questionEnum.hasMoreElements()) {
        System.out.println(questionEnum.nextElement());
        System.out.println();
        
    }
   }


   public void takeQuiz(){
    Enumeration<Question> questionEnum = questions.elements();
     
    int score = 0;
    while (questionEnum.hasMoreElements()) {
      Question question = questionEnum.nextElement();
      
      System.out.println(question);
      System.out.println("Enter yor answer (1-4)");

      int userAnswer = new java.util.Scanner(System.in).nextInt();
      if(question.checkAnswer(userAnswer-1)){
        System.out.println("Correct \n");
        score++;
      }
      else{
        System.out.println("Wrong , the correct answer was" + (question.checkAnswer(userAnswer)? "Yes" : "NO") + ".\n");
      }
    }

    System.out.println("Quiz completed! Your Score :" + score + "/" + questions.size());
   }
}


public class quizs {
    public static void main(String[] args) {
        Quiz quiz= new Quiz();

        quiz.addquestions(new Question(
            "What is the capital of France?",
            new String[]{"Berlin", "Madrid", "Paris", "Rome"},
            3,
            Difficulty.EASY
        ));

        quiz.addquestions(new Question(
            "Which programming language is platform-independent?",
            new String[]{"C++", "Python", "Java", "JavaScript"},
            1,
            Difficulty.MEDIUM
        ));

        quiz.addquestions(new Question(
            "What is the time complexity of binary search?",
            new String[]{"O(n)", "O(log n)", "O(n^2)", "O(1)"},
            1,
            Difficulty.HARD
        ));

        System.out.println("Quiz questions");
        quiz.displayQuestion();

        System.out.println("\n Starting the quiz : \n");
        quiz.takeQuiz();

    }
}
