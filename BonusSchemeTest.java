
import static org.junit.Assert.*;
import org.junit.Test;

public class BonusSchemeTest {

	@Test
	public void testEmployees() {
		// Create an Employee
		Employee employee = new Employee();
				
		// Ask for profit and hard work scores
		int profitScore = 5;
		int hardworkScore = 4;
		
		// Set the values
		BonusScheme.setProfitScore(employee, profitScore);
		BonusScheme.setHardworkScore(employee, hardworkScore);
		
		// Check if it is set correctly by getting the value
		assertEquals(profitScore, BonusScheme.getProfitScore(employee));
		assertEquals(hardworkScore, BonusScheme.getHardworkScore(employee));
		
		// Check for performance values
		// Work out the performance and bonus scores
		int performanceScore = BonusScheme.performanceScore(employee);
		
		assertEquals(performanceScore, 4);
		
		int bonus = BonusScheme.calcBonus(performanceScore);
		
		assertEquals(bonus, 20000);
	}

}
