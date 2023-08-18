import java.util.Scanner;


public class AdditionQuiz {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("We will ask you same math question "+
			"then you will anwer them.");
			int firstNumber=(int)(System.currentTimeMillis() % 10);
			int secondNumber=(int)(System.currentTimeMillis() % 100);

		System.out.print("What is the result of this question ;\n\n\n"
			+firstNumber+" + "+secondNumber+" = ");
		int answer=input.nextInt();
		
		if(answer==(firstNumber+secondNumber)){
			System.out.println("Good you are clever!");
		}
		else{
			System.out.println("Brother you need to study:)");
		}			

	}
}