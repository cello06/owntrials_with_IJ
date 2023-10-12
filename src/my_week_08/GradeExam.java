package my_week_08;

import java.util.Scanner;

public class GradeExam {
    public static void main(String[] args) {
        prepareExam();
    }

    public static void prepareExam() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many students in the class : ");
        int countOfStudents = input.nextInt();
        System.out.print("How many questions that you want to ask : ");
        int countOfQuestion = input.nextInt();
        char[] answerKey = new char[countOfQuestion];

        System.out.print("Enter the answer key for questions :");
        for (int i = 0; i < answerKey.length; i++) {
            answerKey[i] = input.next().charAt(0);
        }
        char[][] answersOfStudents = examTheClass(countOfStudents, countOfQuestion);
        boolean[][] examResults = checkAnswers(answersOfStudents, answerKey);
        printResults(examResults);
    }

    public static char[][] examTheClass(int countOfStudents, int countOfQuestion) {
        char[][] answers = new char[countOfStudents][countOfQuestion];
        for (int students = 0; students < answers.length; students++) {
            for (int questions = 0; questions < answers[students].length; questions++) {
                if (questions == 0) {
                    System.out.println("Student " + (students + 1));
                }
                answers[students][questions] = askQuestion(questions);
            }
        }
        return answers;
    }

    //{'A', 'B', 'C', 'D', 'E', 'A', 'B', 'C', 'D', 'E'
    public static char askQuestion(int questionNumber) {
        Scanner input = new Scanner(System.in);
        int a = (int) (Math.random() * 50);
        int b = (int) (Math.random() * 50);
        char answer;
        System.out.println(a + " + " + b + " = ?");
        if (questionNumber % 5 == 0) {
            System.out.println("A) " + (a + b) + " B) " + (a + b + 1) + " C) " + (a + b + 2) + " D) " + (a + b + 3) + " E) " + (a + b + 4));
            answer = input.next().charAt(0);
        } else if (questionNumber % 5 == 1) {
            System.out.println("A) " + (a + b + 1) + " B) " + (a + b) + " C) " + (a + b + 2) + " D) " + (a + b + 3) + " E) " + (a + b + 4));
            answer = input.next().charAt(0);
        } else if (questionNumber % 5 == 2) {
            System.out.println("A) " + (a + b + 1) + " B) " + (a + b + 2) + " C) " + (a + b) + " D) " + (a + b + 3) + " E) " + (a + b + 4));
            answer = input.next().charAt(0);
        } else if (questionNumber % 5 == 3) {
            System.out.println("A) " + (a + b + 1) + " B) " + (a + b + 2) + " C) " + (a + b + 3) + " D) " + (a + b) + " E) " + (a + b + 4));
            answer = input.next().charAt(0);
        } else if (questionNumber % 5 == 4) {
            System.out.println("A) " + (a + b + 1) + " B) " + (a + b + 2) + " C) " + (a + b + 3) + " D) " + (a + b + 4) + " E) " + (a + b));
            answer = input.next().charAt(0);
        } else {
            System.out.println("Wrong entrance !!!");
            answer = 'F';
        }
        return answer;
    }

    public static boolean[][] checkAnswers(char[][] answersOfStudents, char[] answerKey) {
        boolean[][] examResults = new boolean[answersOfStudents.length][answersOfStudents[0].length];
        for (int student = 0; student < examResults.length; student++) {
            for (int answer = 0; answer < examResults[student].length; answer++) {
                if (answersOfStudents[student][answer] == answerKey[answer]) {
                    examResults[student][answer] = true;
                }
            }
        }
        return examResults;
    }

    public static void printResults(boolean[][] results) {
        for (int student = 0; student < results.length; student++) {
            int countOfTrue = 0;
            for (int result = 0; result < results[student].length; result++) {
                if (results[student][result]) {
                    countOfTrue++;
                }
            }
            System.out.println("Student " + (student + 1) + "'s correct count is " + countOfTrue);
        }
    }
}
