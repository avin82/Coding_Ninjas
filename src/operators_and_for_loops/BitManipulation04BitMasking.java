package operators_and_for_loops;

public class BitManipulation04BitMasking {
	
	/*
	 
	 We're going to use an entire number like it is a bunch of bits. There are of course many ways we can do this; you can use a loop
	 and go in and get messy but the process we're going to use today is going to be a lot more elegant. Now essentially the idea for
	 bit masking is that we're going to use a number and we're going to actually talk about its individual bits and check to see if they're
	 true or false, we can set them to true or false and things like that. For all the operations we're going to discuss we're going to be
	 using bit shifts to point out individual bits. What this means of course is essentially we're going to have two numbers. The first
	 number is your actual data which means its the actual number you're going to use. To talk about it's individual bits and then for each
	 action we're going to create a new number that we can actually use to point out individual bits.
	 
	 First, lets talk about turning a bit on. That means regardless of its original value we want to turn it on. Now, if we look at it in
	 terms of a single bit, obviously, all you have to do is to do an OR operation with 1 and that will guarantee you that regardless of
	 its original value we will be able to turn a bit into 1.
	 
	 x OR 1 = 1
	 
	  
	 Essentially for a string of bits that's exactly what we do except for that
	 string of bits we only want to change one particular bit. Let's say in the string of bits below, we want to change (turn on) the third bit
	 from the right.
	 
	 
	 1 0 1 1 0 0 1 1
	           _
	           
	           
	           
	 All we have to do is to introduce a new number. We're going to set the value of this number to 1. What this means of course is in binary 
	 form its going to be all 0's except the right most digit (which is going to be 1) Note: 1 in decimal is 1 in binary.
	 
	 
	 1 0 1 1 0 0 1 1	
	 0 0 0 0 0 0 0 1
	 
	 
	 Then, we're going to bit shift it however many times until it lines up with the bit we want to change.
	 
	 
	 1 0 1 1 0 0 1 1	
	 0 0 0 0 0 0 0 1  <<  2
	 
	 
	 Now the 1 lines up with the bit we want to change and everything else is 0.
	 
	 	
	 1 0 1 1 0 0 1 1	
	 0 0 0 0 0 1 0 0
	 
	 
	 Now, we do an OR operation between these two numbers. The result of this is a string of bits that looks almost like the
	 original except now we have set that bit to 1. And remember, no matter what the bit was originally it's going to be set to 1
	 because of the OR operation.
	 
	 
	 1 0 1 1 0 0 1 1		
OR	 0 0 0 0 0 1 0 0
__________________________
	 1 0 1 1 0 1 1 1
	
	 
	 Now, I hope you can grasp this idea because essentially we're going to do this again and again for everything else. So what
	 do I do with this new number? Obviously, I want this change to apply and of course what I have to do is this answer actually
	 becomes the new number. So now instead of holding that previous number I use this new one and of course that will reflect
	 the bit that has been changed (turned on).
	 
	 Now there is another operation. Let's say we want to toggle the way of a bit. That means if it was 0 we want it to become 1, 
	 if it was 1 we want it to become 0. To do this you XOR it with 1. This can be visualized from the XOR truth table lines 
	 2 and 4. 
	 
	 
	 _________________________________
	 	A	B	A XOR B
	 _________________________________
	 	0	0	0
	 	0	1	1
	 	1	0	1
	 	1	1	0
	 _________________________________
	 
	 Line 2 - 0 XOR 1 = 1 (The original value 0 has been changed to 1). 
	 Line 4 - 1 XOR 1 = 0 (The original value 1 has been changed to 0).
	 
	 How do we do this practically to a string of bits? Obviously, we just give it 1 bit, shift it however many times and do
	 an XOR operation. Whatever, the bit was at that point of time, it will turn from true to false or false to true.
	 
	 For example, we want to toggle the second bit from the right for the below number.
	 
	 
	 0 0 1 0
	     _
	     
	 
	 0 0 1 0
	 0 0 0 1 << 1
	 
	 
	 0 0 1 0
XOR	 0 0 1 0
________________
	 0 0 0 0
	 
	 
	 So now when we have looked at switching a bit on and toggling the value of a bit let us now take a look at switching a bit off.
	 This one actually requires an extra step. Now you see to switch a bit off, all you have to do is to AND it with 0.
	 
	 x AND 0 = 0
	 
	 Obviously, the AND truth table guarantees that the answer will be zero.
	 
	 Line 1 - 0 AND 0 = 0 (The original value 0 has been kept as it is i.e. 0). 
	 Line 3 - 1 AND 0 = 0 (The original value 1 has been changed to 0).

	 _________________________________
	 	A	B	A AND B
	 _________________________________
	 	0	0	0
	 	0	1	0
	 	1	0	0
	 	1	1	1
	 _________________________________
	 
	 However, the normal steps we use to set to 1 and a bit shift isn't going to give you the correct value to do this operation.
	 
	 
	         -
	 1 0 0 1 1 1 0 1
AND	 0 0 0 0 1 0 0 0
___________________________________
	 0 0 0 0 1 0 0 0


	If you did it like the displayed above what happens is that you wipe all the values before and after the bit you selected to turn off
	 which is not what you want.
	 
	 What this means is that we actually have to NOT our new value before we perform an AND operation.	 During the AND operation after you've
	 done the NOT to the new number will actually guarantee that the bit you selected will be set to 0 and everything else is going to be
	 reflected exactly.
	 
	         -
	 1 0 0 1 1 1 0 1
	 0 0 0 0 0 0 0 1 << 3
	 
	 
	         -
	 1 0 0 1 1 1 0 1
NOT	 0 0 0 0 1 0 0 0


	         -
	 1 0 0 1 1 1 0 1
AND	 1 1 1 1 0 1 1 1
_________________________
	 1 0 0 1 0 1 0 1
	 
	 
	 Now for all the operations we have seen they work with only 1 bit i.e. they only modify the value of 1 bit. Obviously, if
	 the input variable you give it is something more complex then of course the effect will happen everywhere. We have 1 instead
	 of 0 in the new number. 
	 
	     -   -   -
	 1 0 1 1 0 0 1 1
XOR	 0 0 1 0 1 0 1 0			=> new number
___________________________
	 1 0 0 1 1 0 0 1	
	 

	 As mentioned, this applies for the previous three operations we have looked at that is setting the 0, setting to 1 
	 and toggling. Now that we have looked at the three operations that change the actual value, you realize that its not very
	 useful in a sense that just being able to write to a number isn't useful if you can't read it back which is why we are going
	 to take a look at the last operation that is to query. Essentially the difference between this operation and the rest is that 
	 answer from this operation will not be written back into the original number. The answer of this operation is going to be used 
	 for own reference. Once we're done with that it will be thrown away. And of course the way you query is very simple.
	 
	 This is your original number.You introduce a new number like you always would, use a bit shift to the bit you want to look at
	 and then you perform an AND operation.
	 
	 If the bit you are querying is 0, essentially what happens is you'll get a number that is all zeroes.
	 
	 	   -
	 1 0 1 0 1 1 1 0
	 0 0 0 0 0 0 0 1 << 4
	 
	 
	 	   -
	 1 0 1 0 1 1 1 0
AND	 0 0 0 1 0 0 0 0
____________________________
	 0 0 0 0 0 0 0 0
	 
	 
	 If the bit you are querying is 1, essentially what happens is you'll get all 0's with a 1 at that position.
	 
	 
	         -
	 1 0 1 0 1 1 1 0
	 0 0 0 0 0 0 0 1 << 3
	 
	 
	 	     -
	 1 0 1 0 1 1 1 0
AND	 0 0 0 0 1 0 0 0
____________________________
	 0 0 0 0 1 0 0 0		=> new number
	 
	 
	 So, how is this a query? You see, what you have to do is you take the new number and you actually look at its value. If its value is 0,
	 essentially what that means is that the value you were querying was false. But what if the bit you're trying to query was true? Essentially
	 what happens is for any bit string that looks like new number it's numerical value is non-zero. It can be any value as small as 2 or 4 or 8
	 to huge values like 10242048 but you don't have to worry about the exact value because you're guaranteed that it is non-zero. What this
	 means is that at the end of a query operation if you get a value that is non-zero it means that the bit you queried was set to true.
	 Essentially that's all there is to bit masking.Essentially we have taken a number and we've turned it into a bunch of bits that we can 
	 individually address, individually change individually query.
	 
	 
	 */
	
	public static void main(String[] args) {
		
		System.out.println("\n");
		System.out.println("We're going to use an entire number like it is a bunch of bits. There are of course many ways we can do this; you can use a loop\n" + 
				"	 and go in and get messy but the process we're going to use today is going to be a lot more elegant. Now essentially the idea for\n" + 
				"	 bit masking is that we're going to use a number and we're going to actually talk about its individual bits and check to see if they're\n" + 
				"	 true or false, we can set them to true or false and things like that. For all the operations we're going to discuss we're going to be\n" + 
				"	 using bit shifts to point out individual bits. What this means of course is essentially we're going to have two numbers. The first\n" + 
				"	 number is your actual data which means its the actual number you're going to use. To talk about it's individual bits and then for each\n" + 
				"	 action we're going to create a new number that we can actually use to point out individual bits.\n" + 
				"	 \n" + 
				"	 First, lets talk about turning a bit on. That means regardless of its original value we want to turn it on. Now, if we look at it in\n" + 
				"	 terms of a single bit, obviously, all you have to do is to do an OR operation with 1 and that will guarantee you that regardless of\n" + 
				"	 its original value we will be able to turn a bit into 1.\n" + 
				"	 \n" + 
				"	 x OR 1 = 1\n" + 
				"	 \n" + 
				"	  \n" + 
				"	 Essentially for a string of bits that's exactly what we do except for that\n" + 
				"	 string of bits we only want to change one particular bit. Let's say in the string of bits below, we want to change (turn on) the third bit\n" + 
				"	 from the right.\n" + 
				"	 \n" + 
				"	 \n" + 
				"	 1 0 1 1 0 0 1 1\n" + 
				"	           _\n" + 
				"	           \n" + 
				"	           \n" + 
				"	           \n" + 
				"	 All we have to do is to introduce a new number. We're going to set the value of this number to 1. What this means of course is in binary \n" + 
				"	 form its going to be all 0's except the right most digit (which is going to be 1) Note: 1 in decimal is 1 in binary.\n" + 
				"	 \n" + 
				"	 \n" + 
				"	 1 0 1 1 0 0 1 1	\n" + 
				"	 0 0 0 0 0 0 0 1\n" + 
				"	 \n" + 
				"	 \n" + 
				"	 Then, we're going to bit shift it however many times until it lines up with the bit we want to change.\n" + 
				"	 \n" + 
				"	 \n" + 
				"	 1 0 1 1 0 0 1 1	\n" + 
				"	 0 0 0 0 0 0 0 1  <<  2\n" + 
				"	 \n" + 
				"	 \n" + 
				"	 Now the 1 lines up with the bit we want to change and everything else is 0.\n" + 
				"	 \n" + 
				"	 	\n" + 
				"	 1 0 1 1 0 0 1 1	\n" + 
				"	 0 0 0 0 0 1 0 0\n" + 
				"	 \n" + 
				"	 \n" + 
				"	 Now, we do an OR operation between these two numbers. The result of this is a string of bits that looks almost like the\n" + 
				"	 original except now we have set that bit to 1. And remember, no matter what the bit was originally it's going to be set to 1\n" + 
				"	 because of the OR operation.\n" + 
				"	 \n" + 
				"	 \n" + 
				"	 1 0 1 1 0 0 1 1		\n" + 
				"OR	 0 0 0 0 0 1 0 0\n" + 
				"__________________________\n" + 
				"	 1 0 1 1 0 1 1 1\n" + 
				"	\n" + 
				"	 \n" + 
				"	 Now, I hope you can grasp this idea because essentially we're going to do this again and again for everything else. So what\n" + 
				"	 do I do with this new number? Obviously, I want this change to apply and of course what I have to do is this answer actually\n" + 
				"	 becomes the new number. So now instead of holding that previous number I use this new one and of course that will reflect\n" + 
				"	 the bit that has been changed (turned on).\n" + 
				"	 \n" + 
				"	 Now there is another operation. Let's say we want to toggle the way of a bit. That means if it was 0 we want it to become 1, \n" + 
				"	 if it was 1 we want it to become 0. To do this you XOR it with 1. This can be visualized from the XOR truth table lines \n" + 
				"	 2 and 4. \n" + 
				"	 \n" + 
				"	 \n" + 
				"	 _________________________________\n" + 
				"	 	A	B	A XOR B\n" + 
				"	 _________________________________\n" + 
				"	 	0	0	0\n" + 
				"	 	0	1	1\n" + 
				"	 	1	0	1\n" + 
				"	 	1	1	0\n" + 
				"	 _________________________________\n" + 
				"	 \n" + 
				"	 Line 2 - 0 XOR 1 = 1 (The original value 0 has been changed to 1). \n" + 
				"	 Line 4 - 1 XOR 1 = 0 (The original value 1 has been changed to 0).\n" + 
				"	 \n" + 
				"	 How do we do this practically to a string of bits? Obviously, we just give it 1 bit, shift it however many times and do\n" + 
				"	 an XOR operation. Whatever, the bit was at that point of time, it will turn from true to false or false to true.\n" + 
				"	 \n" + 
				"	 For example, we want to toggle the second bit from the right for the below number.\n" + 
				"	 \n" + 
				"	 \n" + 
				"	 0 0 1 0\n" + 
				"	     _\n" + 
				"	     \n" + 
				"	 \n" + 
				"	 0 0 1 0\n" + 
				"	 0 0 0 1 << 1\n" + 
				"	 \n" + 
				"	 \n" + 
				"	 0 0 1 0\n" + 
				"XOR	 0 0 1 0\n" + 
				"________________\n" + 
				"	 0 0 0 0\n" + 
				"	 \n" + 
				"	 \n" + 
				"	 So now when we have looked at switching a bit on and toggling the value of a bit let us now take a look at switching a bit off.\n" + 
				"	 This one actually requires an extra step. Now you see to switch a bit off, all you have to do is to AND it with 0.\n" + 
				"	 \n" + 
				"	 x AND 0 = 0\n" + 
				"	 \n" + 
				"	 Obviously, the AND truth table guarantees that the answer will be zero.\n" + 
				"	 \n" + 
				"	 Line 1 - 0 AND 0 = 0 (The original value 0 has been kept as it is i.e. 0). \n" + 
				"	 Line 3 - 1 AND 0 = 0 (The original value 1 has been changed to 0).\n" + 
				"\n" + 
				"	 _________________________________\n" + 
				"	 	A	B	A AND B\n" + 
				"	 _________________________________\n" + 
				"	 	0	0	0\n" + 
				"	 	0	1	0\n" + 
				"	 	1	0	0\n" + 
				"	 	1	1	1\n" + 
				"	 _________________________________\n" + 
				"	 \n" + 
				"	 However, the normal steps we use to set to 1 and a bit shift isn't going to give you the correct value to do this operation.\n" + 
				"	 \n" + 
				"	 \n" + 
				"	         -\n" + 
				"	 1 0 0 1 1 1 0 1\n" + 
				"AND	 0 0 0 0 1 0 0 0\n" + 
				"___________________________________\n" + 
				"	 0 0 0 0 1 0 0 0\n" + 
				"\n" + 
				"\n" + 
				"	If you did it like the displayed above what happens is that you wipe all the values before and after the bit you selected to turn off\n" + 
				"	 which is not what you want.\n" + 
				"	 \n" + 
				"	 What this means is that we actually have to NOT our new value before we perform an AND operation.	 During the AND operation after you've\n" + 
				"	 done the NOT to the new number will actually guarantee that the bit you selected will be set to 0 and everything else is going to be\n" + 
				"	 reflected exactly.\n" + 
				"	 \n" + 
				"	         -\n" + 
				"	 1 0 0 1 1 1 0 1\n" + 
				"	 0 0 0 0 0 0 0 1 << 3\n" + 
				"	 \n" + 
				"	 \n" + 
				"	         -\n" + 
				"	 1 0 0 1 1 1 0 1\n" + 
				"NOT	 0 0 0 0 1 0 0 0\n" + 
				"\n" + 
				"\n" + 
				"	         -\n" + 
				"	 1 0 0 1 1 1 0 1\n" + 
				"AND	 1 1 1 1 0 1 1 1\n" + 
				"_________________________\n" + 
				"	 1 0 0 1 0 1 0 1\n" + 
				"	 \n" + 
				"	 \n" + 
				"	 Now for all the operations we have seen they work with only 1 bit i.e. they only modify the value of 1 bit. Obviously, if\n" + 
				"	 the input variable you give it is something more complex then of course the effect will happen everywhere. We have 1 instead\n" + 
				"	 of 0 in the new number. \n" + 
				"	 \n" + 
				"	     -   -   -\n" + 
				"	 1 0 1 1 0 0 1 1\n" + 
				"XOR	 0 0 1 0 1 0 1 0			=> new number\n" + 
				"___________________________\n" + 
				"	 1 0 0 1 1 0 0 1	\n" + 
				"	 \n" + 
				"\n" + 
				"	 As mentioned, this applies for the previous three operations we have looked at that is setting the 0, setting to 1 \n" + 
				"	 and toggling. Now that we have looked at the three operations that change the actual value, you realize that its not very\n" + 
				"	 useful in a sense that just being able to write to a number isn't useful if you can't read it back which is why we are going\n" + 
				"	 to take a look at the last operation that is to query. Essentially the difference between this operation and the rest is that \n" + 
				"	 answer from this operation will not be written back into the original number. The answer of this operation is going to be used \n" + 
				"	 for own reference. Once we're done with that it will be thrown away. And of course the way you query is very simple.\n" + 
				"	 \n" + 
				"	 This is your original number.You introduce a new number like you always would, use a bit shift to the bit you want to look at\n" + 
				"	 and then you perform an AND operation.\n" + 
				"	 \n" + 
				"	 If the bit you are querying is 0, essentially what happens is you'll get a number that is all zeroes.\n" + 
				"	 \n" + 
				"	 	   -\n" + 
				"	 1 0 1 0 1 1 1 0\n" + 
				"	 0 0 0 0 0 0 0 1 << 4\n" + 
				"	 \n" + 
				"	 \n" + 
				"	 	   -\n" + 
				"	 1 0 1 0 1 1 1 0\n" + 
				"AND	 0 0 0 1 0 0 0 0\n" + 
				"____________________________\n" + 
				"	 0 0 0 0 0 0 0 0\n" + 
				"	 \n" + 
				"	 \n" + 
				"	 If the bit you are querying is 1, essentially what happens is you'll get all 0's with a 1 at that position.\n" + 
				"	 \n" + 
				"	 \n" + 
				"	         -\n" + 
				"	 1 0 1 0 1 1 1 0\n" + 
				"	 0 0 0 0 0 0 0 1 << 3\n" + 
				"	 \n" + 
				"	 \n" + 
				"	 	     -\n" + 
				"	 1 0 1 0 1 1 1 0\n" + 
				"AND	 0 0 0 0 1 0 0 0\n" + 
				"____________________________\n" + 
				"	 0 0 0 0 1 0 0 0		=> new number\n" + 
				"	 \n" + 
				"	 \n" + 
				"	 So, how is this a query? You see, what you have to do is you take the new number and you actually look at its value. If its value is 0,\n" + 
				"	 essentially what that means is that the value you were querying was false. But what if the bit you're trying to query was true? Essentially\n" + 
				"	 what happens is for any bit string that looks like new number it's numerical value is non-zero. It can be any value as small as 2 or 4 or 8\n" + 
				"	 to huge values like 10242048 but you don't have to worry about the exact value because you're guaranteed that it is non-zero. What this\n" + 
				"	 means is that at the end of a query operation if you get a value that is non-zero it means that the bit you queried was set to true.\n" + 
				"	 Essentially that's all there is to bit masking.Essentially we have taken a number and we've turned it into a bunch of bits that we can \n" + 
				"	 individually address, individually change individually query.");
		System.out.println();
		System.out.println("**********************************************************************");
		System.out.println("Reference URL: https://www.youtube.com/watch?v=lUzQtTLCglk");
		
	}

}
