package com.vetores.Manager;

import com.vetores.model.Vetor;

public class ManagerSelection {

	public void selectionSort(int[] vetor) {
		for (int fixo = 0; fixo < vetor.length - 1; fixo++) {
			int menor = fixo;

			for (int i = menor + 1; i < vetor.length; i++) {
				if (vetor[i] < vetor[menor]) {
					menor = i;
				}
			}
			if (menor != fixo) {
				int t = vetor[fixo];
				vetor[fixo] = vetor[menor];
				vetor[menor] = t;
			}

		}
	}

	public String crescente() {

		String retorno = "";
		Vetor vt = new Vetor();
		vt.crescte(vt);
		int vCem[] = new int[100];
		int vMil[] = new int[1000];
		int vCemMil[] = new int[100000];
		int vMilhao[] = new int[1000000];
		vCem = vt.getCem();
		vMil = vt.getMil();
		vCemMil = vt.getCemMil();
		vMilhao = vt.getMilhao();

		long i = System.currentTimeMillis();
		selectionSort(vCem);
		long f = System.currentTimeMillis();
		long t = f - i;
		retorno = "<tr><td>selection Sortt</td> <td>" + t + "</td>";

		i = System.currentTimeMillis();
		selectionSort(vMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>" + t + "</td>";

		i = System.currentTimeMillis();
		selectionSort(vCemMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>" + t + "</td>";

		i = System.currentTimeMillis();
		selectionSort(vMilhao);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>" + t + "</td> </tr>";

		return retorno;
	}

	public String decrescente() {

		String retorno = "";
		Vetor vt = new Vetor();
		vt.decrecente(vt);
		int vCem[] = new int[100];
		int vMil[] = new int[1000];
		int vCemMil[] = new int[100000];
		int vMilhao[] = new int[1000000];
		vCem = vt.getCem();
		vMil = vt.getMil();
		vCemMil = vt.getCemMil();
		vMilhao = vt.getMilhao();

		long i = System.currentTimeMillis();
		selectionSort(vCem);
		long f = System.currentTimeMillis();
		long t = f - i;
		retorno = "<tr><td>selection Sortt</td> <td>" + t + "</td>";

		i = System.currentTimeMillis();
		selectionSort(vMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>" + t + "</td>";

		i = System.currentTimeMillis();
		selectionSort(vCemMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>" + t + "</td>";

		i = System.currentTimeMillis();
		selectionSort(vMilhao);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>" + t + "</td> </tr>";

		return retorno;
	}

	public String aleatorio() {

		String retorno = "";
		Vetor vt = new Vetor();
		vt.aleatorio(vt);
		int vCem[] = new int[100];
		int vMil[] = new int[1000];
		int vCemMil[] = new int[100000];
		int vMilhao[] = new int[1000000];
		vCem = vt.getCem();
		vMil = vt.getMil();
		vCemMil = vt.getCemMil();
		vMilhao = vt.getMilhao();

		long i = System.currentTimeMillis();
		selectionSort(vCem);
		long f = System.currentTimeMillis();
		long t = f - i;
		retorno = "<tr><td>selection Sortt</td> <td>" + t + "</td>";

		i = System.currentTimeMillis();
		selectionSort(vMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>" + t + "</td>";

		i = System.currentTimeMillis();
		selectionSort(vCemMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>" + t + "</td>";

		i = System.currentTimeMillis();
		selectionSort(vMilhao);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>" + t + "</td> </tr>";

		return retorno;
	}
}
