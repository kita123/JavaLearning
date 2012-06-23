package jp.itacademy.samples.oop.calc;

public class Calculator {
	
	public static void main(String[] args) {
		
		Operator[]operators={
			new AddOperator(),new SubtractOperator()};
		
		Calculator c=new Calculator();
		c.installOperators(operators);
		System.out.println(c.calc)
		}
	}


}
