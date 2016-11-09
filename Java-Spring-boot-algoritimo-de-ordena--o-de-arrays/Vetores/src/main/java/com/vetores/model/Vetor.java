package com.vetores.model;

import com.vetores.model.Vetor;

public class Vetor {

	int[] cem = new int[100];
	int[] mil = new int[1000];
	int[] cemMil = new int[100000];
	int[] milhao = new int[1000000];

	public int[] getCem() {
		return cem;
	}

	public void setCem(int[] cem) {
		this.cem = cem;
	}

	public int[] getMil() {
		return mil;
	}

	public void setMil(int[] mil) {
		this.mil = mil;
	}

	public int[] getCemMil() {
		return cemMil;
	}

	public void setCemMil(int[] cemMil) {
		this.cemMil = cemMil;
	}

	public int[] getMilhao() {
		return milhao;
	}

	public void setMilhao(int[] milhao) {
		this.milhao = milhao;
	}

	public void crescte(Vetor v) {
		int i = 0;
		int[] cem1 = new int[100];
		int[] mil1 = new int[1000];
		int[] cemMil1 = new int[100000];
		int[] milhao1 = new int[1000000];

		for (i = 0; i < cem1.length; i++) {
			cem1[i] = i;

		}
		setCem(cem1);

		for (i = 0; i < mil1.length; i++) {
			mil1[i] = i;

		}
		setMil(mil1);

		for (i = 0; i < cemMil1.length; i++) {
			cemMil1[i] = i;

		}
		setCemMil(cemMil1);

		for (i = 0; i < milhao1.length; i++) {
			milhao1[i] = i;

		}
		setMilhao(milhao1);

	}

	public void decrecente(Vetor v) {
		int i = 0;
		int[] cem1 = new int[100];
		int[] mil1 = new int[1000];
		int[] cemMil1 = new int[100000];
		int[] milhao1 = new int[1000000];

		for (i = 99; i > 0; i--) {
			cem1[i] = i;

		}
		setCem(cem1);

		for (i = 999; i <= 0; i--) {
			mil1[i] = i;

		}
		setMil(mil1);

		for (i = 99999; i <= 0; i--) {
			cemMil1[i] = i;

		}
		setCemMil(cemMil1);

		for (i = 999999; i <= 0; i--) {
			milhao1[i] = i;
			i--;
		}
		setMilhao(milhao1);

	}

	public void aleatorio(Vetor v) {
		int i = 0;
		int[] cem1 = new int[100];
		int[] mil1 = new int[1000];
		int[] cemMil1 = new int[100000];
		int[] milhao1 = new int[1000000];

		for (i = 0; i < cem1.length; i++) {
			cem1[i] = (int) (Math.random()*1000);
		}
		setCem(cem1);
		
		for (i = 0; i < mil1.length; i++) {
			mil1[i] = (int) (Math.random()*1000);
		}
		setMil(mil1);
		for (i = 0; i < cemMil1.length; i++) {
			cemMil1[i] = (int) (Math.random()*1000);
		}
		setCemMil(cemMil1);
		for (i = 0; i < milhao1.length; i++) {
			milhao1[i] = (int) (Math.random()*1000);
		}
		setMilhao(milhao1);
		
	}

}
