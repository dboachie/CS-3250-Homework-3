import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class address_bookTest {
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	@Test
	void testAddress() {
		address_book a = new address_book("367 Field Court");
		assertEquals("367 Field Court", a.getName());
	
	}
	
	@Test
	void testCombineAddresses() {
		address_book a = new address_book("123 Field Court");
		address_book b = new address_book("456 Field Court");
		assertEquals("123 Field Court" + "456 Field Court" , a.getName() + b.getName());

	}
}
