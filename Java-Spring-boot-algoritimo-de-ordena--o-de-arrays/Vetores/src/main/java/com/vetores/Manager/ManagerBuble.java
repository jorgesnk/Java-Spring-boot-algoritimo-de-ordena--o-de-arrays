package com.vetores.Manager;

import com.vetores.model.Vetor;

public class ManagerBuble {
	public void bubule(int[] vetor) {
		boolean troca = true;
		int aux;
		while (troca) {
			troca = false;
			for (int i = 0; i < vetor.length - 1; i++) {
				if (vetor[i] > vetor[i + 1]) {
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					troca = true;
				}
			}
		}
	}

	public String crescentbuble() {

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
		bubule(vCem);
		long f = System.currentTimeMillis();
		long t = f - i;
		retorno = "<tr><td>Bublle Sort</td> <td>"+ t+"</td>"  ;

		i = System.currentTimeMillis();
		bubule(vMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td>";

		i = System.currentTimeMillis();
		bubule(vCemMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td>";

		i = System.currentTimeMillis();
		bubule(vMilhao);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td> </tr>";

		return retorno;
	}

	public String decrecentetbuble() {

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
		bubule(vCem);
		long f = System.currentTimeMillis();
		long t = f - i;
		retorno = "<tr><td>Bublle Sort</td> <td>"+ t+"</td>"  ;

		i = System.currentTimeMillis();
		bubule(vMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td>";

		i = System.currentTimeMillis();
		bubule(vCemMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td>";

		i = System.currentTimeMillis();
		bubule(vMilhao);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td> </tr>";

		return retorno;
	}
	
	public String aleatorioBuble() {

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
		bubule(vCem);
		long f = System.currentTimeMillis();
		long t = f - i;
		retorno = "<tr><td>Bublle Sort</td> <td>"+ t+"</td>"  ;

		i = System.currentTimeMillis();
		bubule(vMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td>";

		i = System.currentTimeMillis();
		bubule(vCemMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td>";

		i = System.currentTimeMillis();
		bubule(vMilhao);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td> </tr>";

		return retorno;
	}
	
}
