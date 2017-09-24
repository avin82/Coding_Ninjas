package classes_and_objects;

public class Polynomial {
	
	DynamicArray coefficients = new DynamicArray();
	int degree = 0;
	int coeff = 0;
	int x = 0;
	
	public Polynomial() {
		coefficients.add(coeff);
	}
	
	public void setCoefficient(int degree, int coeff) {
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
	
	public int degree() {
		int i = 0;
		int count = 0;
		while (coefficients.get(i) != -1) {
			count++;
			i++;
		}
		return count - 1;
	}
	
	public void print() {
		String polynomial = "";
		for (int i = 0; i < coefficients.size(); i++) {
			if (coefficients.get(i) != 0) {
				if (i == coefficients.size() - 1) {
					polynomial += coefficients.get(i) + "x^" + i;
					break;
				}
				polynomial += coefficients.get(i) + "x^" + i + " + ";
			} 
		}
		System.out.println(polynomial);
	}
	
	public void add(Polynomial p) {
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
	}
	
	public void subtract(Polynomial p) {
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
	}
	
	public void multiply(Polynomial p) {
		Polynomial tempPol = new Polynomial();
		int i = 0, j, k = 0;
		while(coefficients.get(i) != -1) {
			int temp = coefficients.get(i);
			j = 0;
			while (p.getCoefficient(j) != -1) {
				Polynomial tempPol2 = new Polynomial();
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
	}
	
	public static Polynomial add(Polynomial p1, Polynomial p2) {
		Polynomial p3 = new Polynomial();
		int i = 0;
		while (p1.getCoefficient(i) != -1 && p2.getCoefficient(i) != -1) {
			p3.coeff = p1.getCoefficient(i) + p2.getCoefficient(i);
			p3.setCoefficient(i, p3.coeff);
			i++;
		}
		return p3;
	}

}
