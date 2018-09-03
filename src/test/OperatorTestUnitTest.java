package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.OperatorTestClass;

class OperatorTestUnitTest {
	OperatorTestClass oT = new OperatorTestClass();
	
	@Test
	void opeatorTestUnitTestArithmetic() {
		//Arithmetic Operator
		assertEquals(5,oT.addition(2,3),"");
		assertEquals(5,oT.subtraction(7,2),"");
		assertEquals(4.0,oT.division(12,3),"");
		assertEquals(6,oT.multiplication(2,3),"");
		assertEquals(5,oT.modulus(12,7),"");
	}
	
	@Test
	void opeatorTestUnitTestBitwise() {
		//Bitwise Operator
		assertEquals(-3,oT.bitNot(2),"");
		assertEquals(34,oT.bitAnd(12, 14),"");
		assertEquals(23,oT.bitOr(12, 14),"");
		assertEquals(56,oT.bitExOr(12, 14),"");
		assertEquals(6,oT.bitShiftRight(12),"");
		assertEquals(6,oT.bitShiftRightZero(12),"");
		assertEquals(6,oT.bitShiftLeft(12),"");
		assertEquals(6,oT.bitShiftLeftZero(12),"");
	}
	@Test
	void opeatorTestUnitTestRelational() {
		//Relational Operator
		assertEquals(true,oT.equalTo(12,12),"");
		assertEquals(true,oT.notEqualTo(12,12),"");
		assertEquals(true,oT.greaterThan(12,12),"");
		assertEquals(true,oT.greaterThanOrEqual(12,12),"");
		assertEquals(true,oT.lessThan(12,12),"");
		assertEquals(true,oT.lessThanOrEqual(12,12),"");
	}
	@Test
	void opeatorTestUnitTestLogical() {
		//Logical Operator
		assertEquals(false,oT.logicalNot(true),"");
		assertEquals(false,oT.logicalAnd(true, true),"");
		assertEquals(false,oT.logicalOr(true, false),"");
		assertEquals(false,oT.logicalExOr(true, false),"");
		assertEquals(false,oT.shortCircuitAnd(true, false),"");
		assertEquals(false,oT.shortCircuitOr(true, false),"");
		
		//fail("Not yet implemented");
	}

}
