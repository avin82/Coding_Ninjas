package classes_and_objects.temp;

import java.util.Scanner;

class DynamicArray {
	private int data[];
	private int nextIndex;
	
	public DynamicArray() {
		data = new int[5];
		nextIndex = 0;
	}
	
	public int size() {
		return nextIndex;
	}
	
	public void add(int element) {
		if (nextIndex == data.length) {
			restructure();
		}
		data[nextIndex] = element;
		nextIndex++;
	}
	
	public void set(int index, int element) {
		if (index > nextIndex) {
			return;
		}
		if (index < nextIndex) {
			data[index] = element;
		} else {
			add(element);
		}
		
	}

	public int get(int index) {
		if (index >= nextIndex) {
			// error out
			return -1;
		}
		return data[index];
	}
	
	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int removeLast() {
		if (size() == 0) {
			// error out
			return -1;
		}
		int value = data[nextIndex - 1];
		data[nextIndex - 1] = 0;
		nextIndex--;
		return value;
	}
	
	private void restructure() {
		int temp[] = data;
		data = new int[data.length * 2];
		for (int i = 0; i < temp.length; i++) {
			data[i] = temp[i];
		}
	}
}

public class PolynomialTest {
	
	 DynamicArray coefficients = new DynamicArray();
	  	int degree = 0;
		int coeff = 0;
		int x = 0;
	  
	  	public PolynomialTest() {
			coefficients.add(coeff);
		}
		
		/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
		 *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
		 *  is already present in the polynomial then previous coefficient is replaced by
		 *  new coefficient value passed as function argument
		*/
	  
		public void setCoefficient(int degree, int coeff){
			if (degree < coefficients.size()) {
				coefficients.set(degree, coeff);
			} else {
				for (int i = coefficients.size(); i <= degree; i++) {
					if (i != degree) {
						coefficients.add(this.coeff);
					} else {
						coefficients.add(coeff);
					}
				}
			}
		}
	  
	  public int getCoefficient(int deg) {
			return coefficients.get(deg);
		}
		
		// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
		public void print(){
	      String polynomial = "";
			for (int i = 0; i < coefficients.size(); i++) {
				if (coefficients.get(i) != 0) {
					if (i == coefficients.size() - 1) {
						polynomial += coefficients.get(i) + "x" + i;
						break;
					}
					polynomial += coefficients.get(i) + "x" + i + " ";
				} 
			}
			System.out.println(polynomial);
		}

		
		// Adds two polynomials and returns a new polynomial which has result
		public PolynomialTest add(PolynomialTest p){
	      int i = 0;
			while (coefficients.get(i) != -1 && p.getCoefficient(i) != -1) {
				coefficients.set(i, coefficients.get(i) + p.getCoefficient(i));
				i++;
			}
			if (coefficients.get(i) == -1) {
				while (p.getCoefficient(i) != -1) {
					coefficients.set(i, p.getCoefficient(i));
					i++;
				}
			} else if (p.getCoefficient(i) == -1) {
				while (coefficients.get(i) != -1) {
					coefficients.set(i, coefficients.get(i));
					i++;
				}
			}
	      return this;
		}
		
		// Subtracts two polynomials and returns a new polynomial which has result
		public PolynomialTest subtract(PolynomialTest p){
			int i = 0;
			while (coefficients.get(i) != -1 && p.getCoefficient(i) != -1) {
				coefficients.set(i, coefficients.get(i) - p.getCoefficient(i));
				i++;
			}
			if (coefficients.get(i) == -1) {
				while (p.getCoefficient(i) != -1) {
					coefficients.set(i, p.getCoefficient(i) * -1);
					i++;
				}
			} else if (p.getCoefficient(i) == -1) {
				while (coefficients.get(i) != -1) {
					coefficients.set(i, coefficients.get(i));
					i++;
				}
			}
	      return this;
		}
		
		// Multiply two polynomials and returns a new polynomial which has result
		public PolynomialTest multiply(PolynomialTest p){
			PolynomialTest tempPol = new PolynomialTest();
			int i = 0, j, k = 0;
			while(coefficients.get(i) != -1) {
				int temp = coefficients.get(i);
				j = 0;
				while (p.getCoefficient(j) != -1) {
					PolynomialTest tempPol2 = new PolynomialTest();
					tempPol2.setCoefficient(i + j, temp * p.getCoefficient(j));
					tempPol.add(tempPol2);
					j++;
				}
				i++;
			}
	      while (tempPol.getCoefficient(k) != -1) {
				this.setCoefficient(k, tempPol.getCoefficient(k));
				k++;
			}
	      return this;
	    }
		
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int degree1[] = new int[n];	
			for(int i = 0; i < n; i++){
				degree1[i] = s.nextInt();
			}
			int coeff1[] = new int[n];
			for(int i = 0; i < n; i++){
				coeff1[i] = s.nextInt();
			}
			PolynomialTest first = new PolynomialTest();
			for(int i = 0; i < n; i++){
				first.setCoefficient(degree1[i],coeff1[i]);
			}
			n = s.nextInt();
			int degree2[] = new int[n];
			for(int i = 0; i < n; i++){
				degree2[i] = s.nextInt();
			}
			 int coeff2[] = new int[n];
			for(int i = 0; i < n; i++){
				coeff2[i] = s.nextInt();
			}
			PolynomialTest second = new PolynomialTest();
			for(int i = 0; i < n; i++){
				second.setCoefficient(degree2[i],coeff2[i]);
			}
			int choice = s.nextInt();
			PolynomialTest result;
			switch(choice){
			// Add
			case 1: 
				 result = first.add(second);
				result.print();
				break;
			// Subtract	
			case 2 :
				 result = first.subtract(second);
				result.print();
				break;
			// Multiply
			case 3 :
				 result = first.multiply(second);
				result.print();
				break;
			}

		}
}
