import java.util.Scanner;
import javax.swing.JOptionPane;
public class LearningPlatform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		Scanner reader2 = new Scanner(System.in);
		int a;
		int b;
		System.out.println("What is your name?");
		String c = reader2.nextLine();
		
		//Addition
		int correct = 0;
		int incorrect = 0;
		for(int i = 0; i < 8; i++) {
		if((double)correct/i<0.9||i<5){
		a = (int)(Math.random()*5+1);
		b = (int)(Math.random()*5+1);
		} else {
			a = (int)(Math.random()*5+6);
			b = (int)(Math.random()*5+6);
		}
		System.out.println(c + ", what is " + a + " + " + b + "?");
		int x = reader.nextInt();
		if(x==a+b) {
			if(i%2==0)
			System.out.println("Good job!");
			else
			System.out.println("Nice!");
			correct++;
			} else {
			System.out.println("Not quite, let's try a different problem.");
			incorrect++;
		}
		if((double)correct/i>=0.9&&i>=5&&a<6){
			System.out.println("You're doing great, let's ramp it up.");
		}
		}
		System.out.println("You got " + correct + " problems correct out of 8.");
		System.out.println("That is a " + (double)correct/8*100 + "%.");
		if(correct>5) {
			System.out.println("Awesome job " + c + "!");
			//String firstName = JOptionPane.showInputDialog("Enter your first name.");
			//JOptionPane.showMessageDialog(null, "Name: "+ firstName);
			//JOptionPane.showMessageDialog(null, "Number correct: " + correct );
			//JOptionPane.showMessageDialog(null, "You are the addition king!");
		}
			 else {
				System.out.println(c + ", it looks like you could benefit from some help. Visit"
						+ " the following link to play games, complete quizzes, and much more.");
				System.out.println("This will make you the master of addition. Have fun!:");
				System.out.println("https://www.coolmath4kids.com/math-help/addition");
			}
		System.out.println("Now, let's try a word problem.");
		System.out.println(c + ", what is your favorite animal?");
		String k = reader2.nextLine();
		System.out.println("What food does a " + k + " like to eat?");
		String q = reader2.nextLine();
		a = (int)(Math.random()*5+1);
		b = (int)(Math.random()*5+1);
		System.out.println("A " + k + " eats " + a + " " + q + ". The owner then buys " +
		b + " more " + q + " and the " + k + " eats the " + b + " " + q + ". How many " +
		q + " did the " + k + " eat total?");
		int wordProblem = reader.nextInt();
		if(a+b==wordProblem) {
			System.out.println("Awesome job " + c + "!");
		} else {
			System.out.println("Not quite. These can be tricky, just keep on practicing addition and it will"
					+ " be a lot easier next time.");
		}
		//Subtraction
		System.out.println();
		System.out.println("Now let's move on to subtraction.");
		int correctSubt = 0;
		int incorrectSubt = 0;
		for(int j = 0; j < 20; j++) {
		if((double)correctSubt/j<0.9||j<5){
		a = (int)(Math.random()*5+1);
		b = (int)(Math.random()*5+1);
		} else {
			a = (int)(Math.random()*5+6);
			b = (int)(Math.random()*5+6);
		}
		System.out.println(c + ", what is " + Math.max(a, b) + " - " + Math.min(a, b) + "?");
		int y = reader.nextInt();
		if(y==Math.abs(a-b)){
			if(j%2==0)
			System.out.println("Good job!");
			else
			System.out.println("Nice!");
			correctSubt++;
		} else {
			System.out.println("Not quite, let's try a different problem.");
			incorrectSubt++;
		}
		if((double)correctSubt/j>=0.9&&j>=5&&a<6){
			System.out.println("You're doing great, let's ramp it up.");
		}
		}
		System.out.println("You got " + correctSubt + " problems correct out of 20.");
		System.out.println("That is a " + (double)correctSubt/20*100 + "%.");
		if(correctSubt>13) {
			System.out.println("Awesome job " + c + "!");
		}
			 else {
				System.out.println(c + ", it looks like you could benefit from some help. Visit"
						+ " the following link to play games, complete quizzes, and much more.");
				System.out.println("This will make you the master of subtraction. Have fun!:");
				System.out.println("https://www.coolmath4kids.com/math-help/subtraction");
			}
		
		
		//Ends User Input
		reader.close();
		reader2.close();
	}
	}


