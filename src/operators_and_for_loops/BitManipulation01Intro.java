package operators_and_for_loops;

public class BitManipulation01Intro {
	
	public static void main(String[] args) {
		
		/*
		 
		 Bit Manipulation - Something that happens all the time at the low level in computing. At a high level, sometimes we do it, because
		 sometimes we need to. We're going to look precisely at why we need it, when we need it and of course more importantly, how its done.
		 
		 We want to see how bits is actually used to form numbers and how we can exploit a property that a number is essentially a bunch of bits to do 
		 some cool things. As one knows a number and actually everything in a computer is made up of bits. You can think of bit like just an old
		 number, except your number can get larger and larger. A bit only has two unique states: 
		 a) 0 which is also known as "off" is also known as false
		 	or
		 b) 1 which is known as "on" or true.
		 
		 Essentially that is all a computer has to work with. Now if we can only work with numbers with two distinct values, of course it's not very 
		 meaningful but what we can do is put a whole bunch of these bits together to actually form more meaningful information. For example, when you
		 put 8 of these bits together, you can actually toggle each of them and every possible combination will represent a different number.
		 
		 1 0 1 0 0 0 1 1
		 0 1 1 0 1 0 1 1
		 
		 Each of the 8 bit combination displayed above represent different numbers.
		 In fact, if you have 8 bits, you'll be able to produce 256 different numbers = 2^n (i.e. 2 to the power of n)
		 
		 We want to look at things from the point of view of: we have a number and we sort of once break it down into its bits in a way
		 that we cannot see but can exploit. Sometimes in programming what we have are these values called boolean values. Essentially they can 
		 be represented by a single bit. The reason for that of course is that a boolean value only has two unique states: true or false. 
		 Now, what happens when we have a bunch of boolean values what we can do is we can put them together in a structure known as an array, however, 
		 generally speaking this is not the most efficient way to do things. Depending on how individual programming languages are actually written, 
		 things might behave a little bit differently, but what this boils down to is the fact that sometimes certain programming languages do not save 
		 boolean values as just a single bit. Programming languages like Java, do not normally reserved just a single bit to store a boolean value.
		 Its just not practical to work with individual bits. As a result, a boolean value when starting ram actually takes up an entire byte of 8 bits.
		 What this means is that even though your information only requires one bit worth of memory to store, a full byte of 8 bits is used even though 
		 really 7 of these bits are wasted. What happens then is that if you have an array of boolean variables, you might be raising 7 bits times the 
		 number of boolean variables you have. Our goal is to not have this wastage. We're actually going to use a number but the actual value of the 
		 number doesn't matter to us. Instead, we want to work with all its individual bits and well, use them as individual boolean variables.
		 */
		
		
		System.out.println("\n");
		System.out.println("Bit Manipulation - Something that happens all the time at the low level in computing. At a high level, sometimes we do it, because\n" + 
				"	 sometimes we need to. We're going to look precisely at why we need it, when we need it and of course more importantly, how its done.\n" + 
				"	 \n" + 
				"	 We want to see how bits is actually used to form numbers and how we can exploit a property that a number is essentially a bunch of bits to do \n" + 
				"	 some cool things. As one knows a number and actually everything in a computer is made up of bits. You can think of bit like just an old\n" + 
				"	 number, except your number can get larger and larger. A bit only has two unique states: \n" + 
				"	 a) 0 which is also known as \"off\" is also known as false\n" + 
				"	 	or\n" + 
				"	 b) 1 which is known as \"on\" or true.\n" + 
				"	 \n" + 
				"	 Essentially that is all a computer has to work with. Now if we can only work with numbers with two distinct values, of course it's not very \n" + 
				"	 meaningful but what we can do is put a whole bunch of these bits together to actually form more meaningful information. For example, when you\n" + 
				"	 put 8 of these bits together, you can actually toggle each of them and every possible combination will represent a different number.\n" + 
				"	 \n" + 
				"	 1 0 1 0 0 0 1 1\n" + 
				"	 0 1 1 0 1 0 1 1\n" + 
				"	 \n" + 
				"	 Each of the 8 bit combination displayed above represent different numbers.\n" + 
				"	 In fact, if you have 8 bits, you'll be able to produce 256 different numbers = 2^n (i.e. 2 to the power of n)\n" + 
				"	 \n" + 
				"	 We want to look at things from the point of view of: we have a number and we sort of once break it down into its bits in a way\n" + 
				"	 that we cannot see but can exploit. Sometimes in programming what we have are these values called boolean values. Essentially they can \n" + 
				"	 be represented by a single bit. The reason for that of course is that a boolean value only has two unique states: true or false. \n" + 
				"	 Now, what happens when we have a bunch of boolean values what we can do is we can put them together in a structure known as an array, however, \n" + 
				"	 generally speaking this is not the most efficient way to do things. Depending on how individual programming languages are actually written, \n" + 
				"	 things might behave a little bit differently, but what this boils down to is the fact that sometimes certain programming languages do not save \n" + 
				"	 boolean values as just a single bit. Programming languages like Java, do not normally reserved just a single bit to store a boolean value.\n" + 
				"	 Its just not practical to work with individual bits. As a result, a boolean value when starting ram actually takes up an entire byte of 8 bits.\n" + 
				"	 What this means is that even though your information only requires one bit worth of memory to store, a full byte of 8 bits is used even though \n" + 
				"	 really 7 of these bits are wasted. What happens then is that if you have an array of boolean variables, you might be raising 7 bits times the \n" + 
				"	 number of boolean variables you have. Our goal is to not have this wastage. We're actually going to use a number but the actual value of the \n" + 
				"	 number doesn't matter to us. Instead, we want to work with all its individual bits and well, use them as individual boolean variables.");
		
		System.out.println();
		System.out.println("**********************************************************************");
		System.out.println("Reference URL: https://www.youtube.com/watch?v=uUtb0BaeosQ&t=2s");
		
	}
	
	

}
