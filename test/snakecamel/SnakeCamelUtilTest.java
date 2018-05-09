package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;


public class SnakeCamelUtilTest {

	@Test
	public void snakeToCamelcaseにsnake_camel() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Snake";
		String actual = scu.snakeToCamelcase("snake_case");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecaseにCaMeL() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "cCa_mMe_lL";
		String actual = scu.camelToSnakecase("CaMeL");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void capitalizeにcapitalize() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Capitalize";
		String actual = scu.capitalize("capitalize");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizeにUncapitalize() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "uncapitalize";
		String actual = scu.uncapitalize("Uncapitalize");
		assertThat(actual, is(expected));
	}

}
