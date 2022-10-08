import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
class address_book {
	String string;
	public address_book(String string) {
		// TODO Auto-generated constructor stub
		this.string = string;
	}	
	/*String name;
	public address_book(String name) {
		// TODO Auto-generated constructor stub
		this.string = name;
	}
	field
*/
	public static void main(String[] args) {         
		// Accepts two address books
        String[] strArray = new String[2]; 
 
        System.out.print(strArray[0] + " " +strArray[1]);
    }

	public String getName() {
		// TODO Auto-generated method stub

		return string;
	}

	
	
}
