package br.edu.faeterj;

public class Triangulo {

	private Ponto p1;
	private Ponto p2;
	private Ponto p3;

	public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
		
		double lado1 = p1.distanciaAte(p2);
		double lado2 = p2.distanciaAte(p3);
		double lado3 = p3.distanciaAte(p1);

		if (lado1 + lado2 > lado3 &&
			lado1 + lado3 > lado2 &&
			lado2 + lado3 > lado1) {
			this.p1 = p1;
			this.p2 = p2;
			this.p3 = p3;
		} else {
			this.p1 = new Ponto(0, 0);
			this.p2 = new Ponto(0, 1);
			this.p3 = new Ponto(1, 0);
		}	
	}

	public Ponto getP1() {
		// TODO Auto-generated method stub
		return p1;
	}

	public Ponto getP2() {
		// TODO Auto-generated method stub
		return p2;
	}

	public Ponto getP3() {
		// TODO Auto-generated method stub
		return p3;
	}

	public void setP3(Ponto ponto) {
		
		double lado1 = p1.distanciaAte(p2);
		double lado2 = p2.distanciaAte(ponto);
		double lado3 = ponto.distanciaAte(p1);

		if (lado1 + lado2 > lado3 &&
			lado1 + lado3 > lado2 &&
			lado2 + lado3 > lado1) {
				
			this.p3 = ponto;
		}
	}

}
