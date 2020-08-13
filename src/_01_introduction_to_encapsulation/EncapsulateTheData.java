package _01_introduction_to_encapsulation;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */

public class EncapsulateTheData {
	// 1. Encapsulate the member variables.
	// Add restrictions to the setters according to the comment.
	public void setItemsReceived(int itemsReceived) {
		if (itemsReceived < 0) {
			itemsReceived = 0;
		}
		this.itemsReceived = itemsReceived;
	}

	public int getItemsReceived() {
		return itemsReceived;
	}

	public void setDegreesTurned(float d) {
		if (d > 360.0 || d < 0.0) {
			d = (float) 180.0;
		}
		this.degreesTurned = d;
	}

	public float getDegreesTurned() {
		return degreesTurned;
	}

	public void setNomenclature(String nomenclature) {
		if (nomenclature.equals("")) {
			nomenclature = " ";
		}

		this.nomenclature = nomenclature;
	}

	public String getNomenclature() {
		return nomenclature;
	}

	public void setMemberObj(Object memberObj) {
		if(memberObj.getClass().equals(new String())) {
			memberObj = new Object();
		}
		this.memberObj = memberObj;
	}

	public Object getMemberObj() {
		return memberObj;
	}

	// 2. Create a new JUnit Test case and write tests to verify that
	// the member variables' getters and setters are working
	@Test
	public void testGetAndSet() {
		setItemsReceived(5);
		assertEquals(5, getItemsReceived());
		setItemsReceived(-20);
		assertEquals(0, getItemsReceived());
		setDegreesTurned((float) 50.0);
		assertEquals((float)50.0, getDegreesTurned(), 0.0);
		setDegreesTurned((float)-20.0);
		assertEquals((float)180.0, getDegreesTurned(), 0.0);
		setNomenclature("hui");
		assertEquals("hui", getNomenclature());
		setNomenclature("");
		assertEquals(" ", getNomenclature());
		setMemberObj(new Object());
		assertEquals(memberObj, getMemberObj());
		setMemberObj("");
		assertEquals(memberObj, getMemberObj());
	}

	private int itemsReceived; // must not be negative. All negative arguments get set to 0.
	private float degreesTurned; // must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = ""; // must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj; // must not be a String. If it is a String, set it equal to a new Object();

	public static void main(String[] args) {

	}
}
