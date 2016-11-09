package com.vetores.Manager;

import com.vetores.model.Vetor;

public class ManagerInsert {
	public void insertSort(int[] vetor) {

		int j;
		int key;
		int i;

		for (j = 1; j < vetor.length; j++) {
			key = vetor[j];
			for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
				vetor[i + 1] = vetor[i];
			}
			vetor[i + 1] = key;
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
		insertSort(vCem);
		long f = System.currentTimeMillis();
		long t = f - i;
		retorno = "<tr><td>insert Sort</td> <td>"+ t+"</td>"  ;

		i = System.currentTimeMillis();
		insertSort(vMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td>";

		i = System.currentTimeMillis();
		insertSort(vCemMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td>";

		i = System.currentTimeMillis();
		insertSort(vMilhao);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td> </tr>";

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
		insertSort(vCem);
		long f = System.currentTimeMillis();
		long t = f - i;
		retorno = "<tr><td>insert Sort</td> <td>"+ t+"</td>"  ;

		i = System.currentTimeMillis();
		insertSort(vMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td>";

		i = System.currentTimeMillis();
		insertSort(vCemMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td>";

		i = System.currentTimeMillis();
		insertSort(vMilhao);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td> </tr>";

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
		insertSort(vCem);
		long f = System.currentTimeMillis();
		long t = f - i;
		retorno = "<tr><td>insert Sort</td> <td>"+ t+"</td>"  ;

		i = System.currentTimeMillis();
		insertSort(vMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td>";

		i = System.currentTimeMillis();
		insertSort(vCemMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td>";

		i = System.currentTimeMillis();
		insertSort(vMilhao);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td> </tr>";

		return retorno;
	}
}
