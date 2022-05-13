
interface Calculator
{
	void result();
>>>>>>> branchY
}


class Adder implements Calculator
{
	 @Override
	 public void result()
	 {
		 System.out.println("The sum of the two numbers is: ");
	 }
}


class Subtractor implements Calculator
{
	 @Override
	 public void result()
	 {
		 System.out.println("The subtraction of the two numbers is: ");
	 }
}


class CalculatorFactory
{
 
	 public Calculator getCommand(String type) throws Exception
	 {
		 switch (type)
		 {
			 case "Add":
				 return new Adder();
			 case "Subtract":
				 return new Subtractor();
			 default:
				 throw new Exception( "Command type : "+type+" cannot be instantiated");
		 }
	 }
}

class Main
{
	 public static void main(String[] args) throws Exception
	 {
		 
		 CalculatorFactory calculatorFactory = new CalculatorFactory();
		 Calculator adder=calculatorFactory.getCommand("Add");
		 adder.result();

		 Calculator subtractor=calculatorFactory.getCommand("Subtract");
		 subtractor.result();

		 Calculator multiplier=calculatorFactory.getCommand("Multiply");
		 multiplier.result();

	 }
}