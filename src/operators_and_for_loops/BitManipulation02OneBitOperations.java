package operators_and_for_loops;

public class BitManipulation02OneBitOperations {
	
	
	/*
	 
	 The basic thing we need to actually perform bit manipulations are what is know as bitwise operations. As its name implies, 
	 what we are doing is an operation, similar to addition, subtraction etc, except now the operation we are working on works with 
	 bits. To be precise, this actually works with bits of any length, so in fact you can use an entire number to do bit operations on.
	 That's what we are eventually going to do, but not here. For now, we're going to look at individual bits and of course once you get
	 what's going on, we can then extend the ideas to working with actual numbers which are basically strings of bits. Now, for the purpose
	 of this explanation, what we're going to do is we're going to look at bits as true or false. So, of course 0 means false and 1 means true.
	 Essentially, our perspective here is one of logic and not math. So we're dealing with true or false instead of dealing with 0 or 1.
	 Once you learn today's concept in terms of logic you can then sort of apply it to the numerical form and they actually work the similar way.
	 
	 Lets look at some of the bit operations that can be done on a single bit.
	 
	 1) NOT operation - Not only takes in one parameter. Essentially what that means is unlike the addition operation which works with two
	 	numbers, NOT only works with one. Remember, the only values we can give it are true or false. If you think about it, you probably already
	 	know what the answers are.
	 	
	 	NOT true = false
	 	NOT false = true
	 	
	 	The NOt operator is essentially an inverter. Whatever value you give it, it gives you the opposite. Since there are only two, well it
	 	essentially gives you the other value.
	 	
	 	
	 2) OR Operation - OR is an operation that requires two  parameters. Its meaningless to say "or true" because that doesn't really work.
	 	What you're going to need are two variables say "false or true". That is how you lay things out for it to make sense. But what does "OR"
	 	means in the sense. The name of the operator itself "OR" already gives you a clue. Essentially for the result of an OR operation to be
	 	true, either one of its inputs must be true. To represent all of the possible answers you can get out of an OR operation just between two
	 	bits, we use what is called a truth table.
	 	
	 	________________________________
	 	A	B	A OR B
	 	________________________________
	 	F	F	F
	 	T	F	T
	 	F	T	T
	 	T	T	T
	 	________________________________
	 	
	 	
	 3) AND Operation - A AND B => A and B both have to be true for the result to be true
	 	
	 	_________________________________
	 	A	B	A AND B
	 	_________________________________
	 	F	F	F
	 	T	F	F
	 	F	T	F
	 	T	T	T
	 	_________________________________
	 	
	 	
	 4) XOR Operation - This is a stricter version of the OR operation. The full name of the XOR operation is the Exclusive-Or operation.
	 	What this means is that instead of the actual OR operation which says if either one is true and even if they both are true, it still
	 	accepts it, the XOR operation is strict in the sense that it only wants one of the two inputs to be true.
	 	
	 	_________________________________
	 	A	B	A XOR B
	 	_________________________________
	 	F	F	F
	 	T	F	T
	 	F	T	T
	 	T	T	F
	 	_________________________________
	 	
	 	
	 5) NAND Operation (i.e. NOT AND) - The NAND gate, essentially is the same as an AND gate and you take the answer and you NOT the answer.
	 
	    _________________________________                 
	 	A	B	A AND B
	 	_________________________________
	 	F	F	F
	 	T	F	F
	 	F	T	F
	 	T	T	T
	 	_________________________________
	 	
	 	
	 	_________________________________                 
	 	A	B	A NAND B	
	 	_________________________________
	 	F	F	T
	 	T	F	T
	 	F	T	T
	 	T	T	F
	 	________________________________
	 	
	 	
	 6) NOR Operation (i.e. NOT OR) - NOR operation is just the inverse of the OR operation.
	 
	 	________________________________
	 	A	B	A OR B
	 	________________________________
	 	F	F	F
	 	T	F	T
	 	F	T	T
	 	T	T	T
	 	________________________________
	 	
	 	
	 	________________________________
	 	A	B	A NOR B
	 	________________________________
	 	F	F	T
	 	T	F	F
	 	F	T	F
	 	T	T	F
	 	________________________________
	 	
	 	
	 7)	XNOR Operation (i.e. NOT XOR)
	 
	 	_________________________________
	 	A	B	A XOR B
	 	_________________________________
	 	F	F	F
	 	T	F	T
	 	F	T	T
	 	T	T	F
	 	_________________________________
	 	
	 	
	 	_________________________________			
	 	A	B	A XNOR B
	 	_________________________________			
	 	F	F	T
	 	T	F	F
	 	F	T	F
	 	T	T	T
	 	_________________________________
	 	
	 */
	
	
	
	public static void main(String[] args) {
		
		System.out.println("\n");
		System.out.println("The basic thing we need to actually perform bit manipulations are what is know as bitwise operations. As its name implies, \n" + 
				"	 what we are doing is an operation, similar to addition, subtraction etc, except now the operation we are working on works with \n" + 
				"	 bits. To be precise, this actually works with bits of any length, so in fact you can use an entire number to do bit operations on.\n" + 
				"	 That's what we are eventually going to do, but not here. For now, we're going to look at individual bits and of course once you get\n" + 
				"	 what's going on, we can then extend the ideas to working with actual numbers which are basically strings of bits. Now, for the purpose\n" + 
				"	 of this explanation, what we're going to do is we're going to look at bits as true or false. So, of course 0 means false and 1 means true.\n" + 
				"	 Essentially, our perspective here is one of logic and not math. So we're dealing with true or false instead of dealing with 0 or 1.\n" + 
				"	 Once you learn today's concept in terms of logic you can then sort of apply it to the numerical form and they actually work the similar way.\n" + 
				"	 \n" + 
				"	 Lets look at some of the bit operations that can be done on a single bit.\n" + 
				"	 \n" + 
				"	 1) NOT operation - Not only takes in one parameter. Essentially what that means is unlike the addition operation which works with two\n" + 
				"	 	numbers, NOT only works with one. Remember, the only values we can give it are true or false. If you think about it, you probably already\n" + 
				"	 	know what the answers are.\n" + 
				"	 	\n" + 
				"	 	NOT true = false\n" + 
				"	 	NOT false = true\n" + 
				"	 	\n" + 
				"	 	The NOt operator is essentially an inverter. Whatever value you give it, it gives you the opposite. Since there are only two, well it\n" + 
				"	 	essentially gives you the other value.\n" + 
				"	 	\n" + 
				"	 	\n" + 
				"	 2) OR Operation - OR is an operation that requires two  parameters. Its meaningless to say \"or true\" because that doesn't really work.\n" + 
				"	 	What you're going to need are two variables say \"false or true\". That is how you lay things out for it to make sense. But what does \"OR\"\n" + 
				"	 	means in the sense. The name of the operator itself \"OR\" already gives you a clue. Essentially for the result of an OR operation to be\n" + 
				"	 	true, either one of its inputs must be true. To represent all of the possible answers you can get out of an OR operation just between two\n" + 
				"	 	bits, we use what is called a truth table.\n" + 
				"	 	\n" + 
				"	 	________________________________\n" + 
				"	 	A	B	A OR B\n" + 
				"	 	________________________________\n" + 
				"	 	F	F	F\n" + 
				"	 	T	F	T\n" + 
				"	 	F	T	T\n" + 
				"	 	T	T	T\n" + 
				"	 	________________________________\n" + 
				"	 	\n" + 
				"	 	\n" + 
				"	 3) AND Operation - A AND B => A and B both have to be true for the result to be true\n" + 
				"	 	\n" + 
				"	 	_________________________________\n" + 
				"	 	A	B	A AND B\n" + 
				"	 	_________________________________\n" + 
				"	 	F	F	F\n" + 
				"	 	T	F	F\n" + 
				"	 	F	T	F\n" + 
				"	 	T	T	T\n" + 
				"	 	_________________________________\n" + 
				"	 	\n" + 
				"	 	\n" + 
				"	 4) XOR Operation - This is a stricter version of the OR operation. The full name of the XOR operation is the Exclusive-Or operation.\n" + 
				"	 	What this means is that instead of the actual OR operation which says if either one is true and even if they both are true, it still\n" + 
				"	 	accepts it, the XOR operation is strict in the sense that it only wants one of the two inputs to be true.\n" + 
				"	 	\n" + 
				"	 	_________________________________\n" + 
				"	 	A	B	A XOR B\n" + 
				"	 	_________________________________\n" + 
				"	 	F	F	F\n" + 
				"	 	T	F	T\n" + 
				"	 	F	T	T\n" + 
				"	 	T	T	F\n" + 
				"	 	_________________________________\n" + 
				"	 	\n" + 
				"	 	\n" + 
				"	 5) NAND Operation (i.e. NOT AND) - The NAND gate, essentially is the same as an AND gate and you take the answer and you NOT the answer.\n" + 
				"	 \n" + 
				"	    _________________________________                 \n" + 
				"	 	A	B	A AND B\n" + 
				"	 	_________________________________\n" + 
				"	 	F	F	F\n" + 
				"	 	T	F	F\n" + 
				"	 	F	T	F\n" + 
				"	 	T	T	T\n" + 
				"	 	_________________________________\n" + 
				"	 	\n" + 
				"	 	\n" + 
				"	 	_________________________________                 \n" + 
				"	 	A	B	A NAND B	\n" + 
				"	 	_________________________________\n" + 
				"	 	F	F	T\n" + 
				"	 	T	F	T\n" + 
				"	 	F	T	T\n" + 
				"	 	T	T	F\n" + 
				"	 	________________________________\n" + 
				"	 	\n" + 
				"	 	\n" + 
				"	 6) NOR Operation (i.e. NOT OR) - NOR operation is just the inverse of the OR operation.\n" + 
				"	 \n" + 
				"	 	________________________________\n" + 
				"	 	A	B	A OR B\n" + 
				"	 	________________________________\n" + 
				"	 	F	F	F\n" + 
				"	 	T	F	T\n" + 
				"	 	F	T	T\n" + 
				"	 	T	T	T\n" + 
				"	 	________________________________\n" + 
				"	 	\n" + 
				"	 	\n" + 
				"	 	________________________________\n" + 
				"	 	A	B	A NOR B\n" + 
				"	 	________________________________\n" + 
				"	 	F	F	T\n" + 
				"	 	T	F	F\n" + 
				"	 	F	T	F\n" + 
				"	 	T	T	F\n" + 
				"	 	________________________________\n" + 
				"	 	\n" + 
				"	 	\n" + 
				"	 7)	XNOR Operation (i.e. NOT XOR)\n" + 
				"	 \n" + 
				"	 	_________________________________\n" + 
				"	 	A	B	A XOR B\n" + 
				"	 	_________________________________\n" + 
				"	 	F	F	F\n" + 
				"	 	T	F	T\n" + 
				"	 	F	T	T\n" + 
				"	 	T	T	F\n" + 
				"	 	_________________________________\n" + 
				"	 	\n" + 
				"	 	\n" + 
				"	 	_________________________________			\n" + 
				"	 	A	B	A XNOR B\n" + 
				"	 	_________________________________			\n" + 
				"	 	F	F	T\n" + 
				"	 	T	F	F\n" + 
				"	 	F	T	F\n" + 
				"	 	T	T	T\n" + 
				"	 	_________________________________");
		
		System.out.println();
		System.out.println("**********************************************************************");
		System.out.println("Reference URL: https://www.youtube.com/watch?v=9QL-4NiSKWs");
	}

}
