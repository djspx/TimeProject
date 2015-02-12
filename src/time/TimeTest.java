/**
 * Name: Sergio Parracho
 * ID: 991293834
 * Class: Software Config and Process MGmt
 * Professor: Elizabeth Dancy
 */
package time;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TimeTest {

	/**
	 * This test provides valid input to the getTotalSeconds method and expects valid output in return.
	 */
	@Test
	public void testGetTotalSecondsGoodInput() {
		
		int result = Time.getTotalSeconds("00:00:05");
		assertTrue("The actual result was not equal to the expected number of seconds.", result==5);		
	}

	@Test
	public void testGetTotalSecondsBoundaryInput() {
		
		int result = Time.getTotalSeconds("00:00:00");
		assertTrue("The actual result was not equal to the expected number of seconds.", result==0);		
	}
	
	@Test (expected = StringIndexOutOfBoundsException.class)
	public void testGetTotalSecondsStringIndexOutOfBoundsException() {
		
		Time.getTotalSeconds("");
	}
	
	@Test (expected = NumberFormatException.class)
	public void testGetTotalSecondsNumberFormatException() {
		
		Time.getTotalSeconds("sp:sp:sp");
	}	
	
	
	@Test
	public void testGetSecondsGoodInput() {

		int result = Time.getSeconds("12:12:55");
		assertTrue("The actual result was not equal to the expected number of seconds.", result==55);	
	}

	@Test
	public void testGetSecondsBoundaryInput() {
		
		int result = Time.getSeconds("00:00:00");
		assertTrue("The actual result was not equal to the expected number of seconds.", result==0);		
	}
	
	@Test (expected = StringIndexOutOfBoundsException.class)
	public void testGetSecondsStringIndexOutOfBoundsException() {

		Time.getTotalSeconds("");
	}
	
	@Test (expected = NumberFormatException.class)
	public void testGetSecondsNumberFormatException() {

		Time.getSeconds("00:00:sp");
	}
		
	
	@Test
	public void testGetTotalMinutesGoodInput() {

		int result = Time.getTotalMinutes("12:12:55");
		assertTrue("The actual result was not equal to the expected number of minutes.", result==12);	
	}

	@Test
	public void testGetTotalMinutesBoundaryInput() {
		
		int result = Time.getTotalMinutes("00:00:00");
		assertTrue("The actual result was not equal to the expected number of minutes.", result==0);		
	}
	
	@Test (expected = StringIndexOutOfBoundsException.class)
	public void testGetTotalMinutesStringIndexOutOfBoundsException() {

		Time.getTotalMinutes("");
	}
	
	@Test (expected = NumberFormatException.class)
	public void testGetTotalMinutesNumberFormatException() {

		Time.getTotalMinutes("00:sp:45");
	}

	
	@Test
	public void testGetTotalHoursGoodInput() {

		int result = Time.getTotalHours("12:12:55");
		assertTrue("The actual result was not equal to the expected number of hours.", result==12);	
	}

	@Test
	public void testGetTotalHoursBoundaryInput() {
		
		int result = Time.getTotalHours("00:00:00");
		assertTrue("The actual result was not equal to the expected number of hours.", result==0);		
	}
	
	@Test (expected = StringIndexOutOfBoundsException.class)
	public void testGetTotalHoursStringIndexOutOfBoundsException() {

		Time.getTotalHours("");
	}
	
	@Test (expected = NumberFormatException.class)
	public void testGetTotalHoursNumberFormatException() {

		Time.getTotalHours("spx");
	}

	@Test
	public void testGetMilliseconds() {
		int result = Time.getMilliseconds("10:05:05:05");
		assertTrue("The actual result was not equal to the expected number of milliseconds.", result==5);		
	}
}
