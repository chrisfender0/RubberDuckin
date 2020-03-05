package com.cova;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ModelTest {
	
	Model model = new Model();
	static Model modelStatic = new Model();
	
	static Stream<Arguments> data(){
		return Stream.of(
				Arguments.of("SELECT * FROM product", modelStatic.selectAllFromProduct()),
				Arguments.of("SELECT * FROM customers", modelStatic.selectAllFromCustomers()),
				Arguments.of("SELECT * FROM orders", modelStatic.selectAllFromOrders())
				);
	}
	
	@ParameterizedTest
	@MethodSource("data")
	void pTest(String query, String method) {
		assertEquals(query, method);
	}
	
}
