package operators_and_for_loops;

public class BitManipulation03MultipleBitOperations {
	
	/*
	 Lets now look at bit manipulation on multiple bits.
	 
	 We're going to run the NOT operation on a string of 4 bits. What it does is it NOTs each individual bits.
	 
	 
	 NOT		0 1 1 0		= 		1 0 0 1
	 
	 Similarly, let's do a bit more examples of bit manipulations on multiple string of bits.
	 
	 
	 		0 1 0 1 1
	 OR		1 1 0 1 0
_____________________________________________
	 		1 1 0 1 1
	 		
	 		
	 So, you might be wondering what should I do if my bit strings are of different lengths.
	 
	 
	                1 1
	 AND		1 1 0 0 1 0
_____________________________________________



The answer to that is pretty simple. All you have to do is to pad the shorter number with 0's. Why does that work, will if you take
a look at the number 72, calling it 0072 will not change its value i.e. 72 = 0072 
(It still means the same thing, but now it has a longer length)


			0 0 0 0 	1 1
	AND		1 1 0 0 1 0
_____________________________________________
	 		0 0 0 0 1 0
	 		
	 		
	 		1 1 0
	 XOR		0 1 0
_____________________________________________
			1 0 0
			


			1 1 0 0 1 0 1 0
	NAND		0 1 0 1 0 1 0 1
_____________________________________________
	 		1 0 1 1 1 1 1 1
	 		
	 		
	
			1 0 1 0 1 0 1 0
	 NOR		1 0 0 0 0 1 0 0
_____________________________________________
			0 1 0 1 0 0 0 1
			
			
			
			1 0 0 1 0 0 1 0
	XNOR		1 0 1 0 1 0 0 1
_____________________________________________
			1 1 0 0 0 1 0 0
			
			
			
Let me introduce you to two more bit operations i.e. Bitshift operators - left shift and right shift.

Now I have a string that looks like this:


			0 0 0 1 1 1 0
			
			
How can I make it look like this:


			0 1 1 1 0 0 0
			
			
Essentially what you can do is a bit shift and the name actually tells you everything. A bit shift will shift all the bits
and since we have a left bit shift and a right bit shift of course we can shift it in one direction or the other. In this
case we are talking about left bit shift. What do we use to fill in on right? Well, we fill it all in with 0's.


			0 0 0 1 1 1 0	<<	2
__________________________________________________________________________________________
			0 1 1 1 0 0 0
			
			
The same goes for right bit shift as well. Similar to the left bit shift, for all the new bits you stuff on the left hand 
side, you stuff them with 0's.


			0 1 0 1 1 0 0 0		>>	1
__________________________________________________________________________________________
			0 0 1 0 1 1 0 0
			

The syntax for using bit shift operators is provided below:

		m	>>	n
		m	<<	n
		
where m is the original number, >> is right bit shift operator, << is left bit shift operator and n is the number of left or right bit shifts.


	 */
	
	public static void main(String[] args) {
		
		System.out.println("\n");
		System.out.println("Lets now look at bit manipulation on multiple bits.\n" + 
				"	 \n" + 
				"	 We're going to run the NOT operation on a string of 4 bits. What it does is it NOTs each individual bits.\n" + 
				"	 \n" + 
				"	 \n" + 
				"	 NOT		0 1 1 0		= 		1 0 0 1\n" + 
				"	 \n" + 
				"	 Similarly, let's do a bit more examples of bit manipulations on multiple string of bits.\n" + 
				"	 \n" + 
				"	 \n" + 
				"	 		0 1 0 1 1\n" + 
				"	 OR		1 1 0 1 0\n" + 
				"_____________________________________________\n" + 
				"	 		1 1 0 1 1\n" + 
				"	 		\n" + 
				"	 		\n" + 
				"	 So, you might be wondering what should I do if my bit strings are of different lengths.\n" + 
				"	 \n" + 
				"	 \n" + 
				"	                1 1\n" + 
				"	 AND		1 1 0 0 1 0\n" + 
				"_____________________________________________\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"The answer to that is pretty simple. All you have to do is to pad the shorter number with 0's. Why does that work, will if you take\n" + 
				"a look at the number 72, calling it 0072 will not change its value i.e. 72 = 0072 \n" + 
				"(It still means the same thing, but now it has a longer length)\n" + 
				"\n" + 
				"\n" + 
				"			0 0 0 0 	1 1\n" + 
				"	AND		1 1 0 0 1 0\n" + 
				"_____________________________________________\n" + 
				"	 		0 0 0 0 1 0\n" + 
				"	 		\n" + 
				"	 		\n" + 
				"	 		1 1 0\n" + 
				"	 XOR		0 1 0\n" + 
				"_____________________________________________\n" + 
				"			1 0 0\n" + 
				"			\n" + 
				"\n" + 
				"\n" + 
				"			1 1 0 0 1 0 1 0\n" + 
				"	NAND		0 1 0 1 0 1 0 1\n" + 
				"_____________________________________________\n" + 
				"	 		1 0 1 1 1 1 1 1\n" + 
				"	 		\n" + 
				"	 		\n" + 
				"	\n" + 
				"			1 0 1 0 1 0 1 0\n" + 
				"	 NOR		1 0 0 0 0 1 0 0\n" + 
				"_____________________________________________\n" + 
				"			0 1 0 1 0 0 0 1\n" + 
				"			\n" + 
				"			\n" + 
				"			\n" + 
				"			1 0 0 1 0 0 1 0\n" + 
				"	XNOR		1 0 1 0 1 0 0 1\n" + 
				"_____________________________________________\n" + 
				"			1 1 0 0 0 1 0 0\n" + 
				"			\n" + 
				"			\n" + 
				"			\n" + 
				"Let me introduce you to two more bit operations i.e. Bitshift operators - left shift and right shift.\n" + 
				"\n" + 
				"Now I have a string that looks like this:\n" + 
				"\n" + 
				"\n" + 
				"			0 0 0 1 1 1 0\n" + 
				"			\n" + 
				"			\n" + 
				"How can I make it look like this:\n" + 
				"\n" + 
				"\n" + 
				"			0 1 1 1 0 0 0\n" + 
				"			\n" + 
				"			\n" + 
				"Essentially what you can do is a bit shift and the name actually tells you everything. A bit shift will shift all the bits\n" + 
				"and since we have a left bit shift and a right bit shift of course we can shift it in one direction or the other. In this\n" + 
				"case we are talking about left bit shift. What do we use to fill in on right? Well, we fill it all in with 0's.\n" + 
				"\n" + 
				"\n" + 
				"			0 0 0 1 1 1 0	<<	2\n" + 
				"__________________________________________________________________________________________\n" + 
				"			0 1 1 1 0 0 0\n" + 
				"			\n" + 
				"			\n" + 
				"The same goes for right bit shift as well. Similar to the left bit shift, for all the new bits you stuff on the left hand \n" + 
				"side, you stuff them with 0's.\n" + 
				"\n" + 
				"\n" + 
				"			0 1 0 1 1 0 0 0		>>	1\n" + 
				"__________________________________________________________________________________________\n" + 
				"			0 0 1 0 1 1 0 0\n" + 
				"			\n" + 
				"\n" + 
				"The syntax for using bit shift operators is provided below:\n" + 
				"\n" + 
				"		m	>>	n\n" + 
				"		m	<<	n\n" + 
				"		\n" + 
				"where m is the original number, >> is right bit shift operator, << is left bit shift operator and n is the number of left or right bit shifts.");
		System.out.println();
		System.out.println("**********************************************************************");
		System.out.println("Reference URL: https://www.youtube.com/watch?v=VRXsJ5J-CvI");
	}

}
