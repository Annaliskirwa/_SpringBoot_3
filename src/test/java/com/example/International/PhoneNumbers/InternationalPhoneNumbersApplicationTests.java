package com.example.International.PhoneNumbers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class InternationalPhoneNumbersApplicationTests {
	Calculator underTest = new Calculator();

	@Test
	void itShouldAddTwoNumbers() {
		int x = 10;
		int y = 5;

		int add = underTest.add(x,y);

		assertThat(add).isEqualTo(15);
	}
	class Calculator{
		int add(int a, int b){
			return a+b;
		}
	}

}
