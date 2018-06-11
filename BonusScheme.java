import javax.swing.JOptionPane;

// Employee data type
class Employee
{
	int profitScore;
	int hardworkScore;
}

public class BonusScheme {

	public static void main(String[] args){
		// Creates our Employee
		createEmployee();
		// Return to OS
		System.exit(0);
	}
	
	public static void createEmployee(){
		// Create an Employee
		Employee employee = new Employee();
		// Ask for profit and hard work scores
		int profitScore = input("Profit Score?");
		int hardworkScore = input("Hard Work Score?");
		// Set the values
		setProfitScore(employee, profitScore);
		setHardworkScore(employee, hardworkScore);
		// Work out the performance and bonus scores
		int performanceScore = performanceScore(employee);
		int bonus = calcBonus(performanceScore);
		// Output the values
		output("Your performance score this year is " + performanceScore + " out of 10.");
		output("Your bonus is " + bonus + " pounds.");
				
	}
	
	/* Setters
	 * 
	 */
	public static Employee setProfitScore(Employee _emp, int _profitScore){
		_emp.profitScore = _profitScore;
		return _emp;
	}
	
	public static Employee setHardworkScore(Employee _emp, int _hardworkScore){
		_emp.hardworkScore = _hardworkScore;
		return _emp;
	}
	
	/*
	 * Getters
	 */
	public static int getProfitScore(Employee _emp){
		return _emp.profitScore;
	}
	
	public static int getHardworkScore(Employee _emp){
		return _emp.hardworkScore;
	}
	
	// Outputs data to the screen
	public static void output(String _text){
		JOptionPane.showMessageDialog(null, _text);
	}
	
	// Returns inputs to integers without validations
	public static int input(String _question){
		return Integer.parseInt(JOptionPane.showInputDialog(_question));
	}
	
	// Write a method that given a number ( a profit score) as an argument returns the result of multplying by 2
	public static int multiplyByTwo(int _profitScore){
		return _profitScore * 2;
	}
	
	// Write a second that given a number (hard work score) as an argument returns the result of multiplyng it by 5
	public static int multiplyByFive(int _hardworkScore){
		return _hardworkScore * 5;
	}
	
	/* Write a third method that given an employee record (holding a profit and hard score) 
 	argument, calls the two above methods in turn, then adds the answers to get a score out of 70
 	then divides it by 7 to give a final performance score (an int)
 	*/
	public static int performanceScore(Employee _employee){
		// Create performance score
		int _performanceScore = multiplyByTwo(getHardworkScore(_employee)) + multiplyByFive(getProfitScore(_employee));
		// then divides itself by 7 to give a final performance score (an int)
		_performanceScore /= 7;
		return _performanceScore;
	}
	
	// Write a fourth method that given a number ( performance score) multiplies by 5000 to find bonus
	public static int calcBonus(int _performanceScore){
		return _performanceScore * 5000;
	}
}
