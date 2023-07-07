package nodo;

import java.util.Arrays;
import java.util.Objects;

public class Polinomio{

	private double coef;// base---
	private int exp;
	private double[] coeficientesSuma;
	public Polinomio(double coef, int exp) {
		super();
		this.coef = coef;
		this.exp = exp;
	}
	public Polinomio(double[] coeficientesSuma) {
		// TODO Auto-generated constructor stub
		super();
		this.coeficientesSuma= coeficientesSuma; 
	}
	public double getCoef() {
		return coef;
	}
	public void setCoef(double coef) {
		this.coef = coef;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Punto [coef=" + coef + ", exp=" + exp + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(coeficientesSuma);
		result = prime * result + Objects.hash(coef, exp);
		return Objects.hash(coef)%100;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Polinomio other = (Polinomio) obj;
		return Double.doubleToLongBits(coef) == Double.doubleToLongBits(other.coef)
				&& Arrays.equals(coeficientesSuma, other.coeficientesSuma) && exp == other.exp;
	}
	

}
