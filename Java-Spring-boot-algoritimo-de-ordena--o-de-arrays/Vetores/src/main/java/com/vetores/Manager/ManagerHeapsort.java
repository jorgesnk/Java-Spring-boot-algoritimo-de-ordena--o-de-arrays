package com.vetores.Manager;

import com.vetores.model.Vetor;

public class ManagerHeapsort {

	
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
		heapSort(vCem);
		long f = System.currentTimeMillis();
		long t = f - i;
		retorno = "<tr><td>heap Sort</td> <td>"+ t+"</td>"  ;

		i = System.currentTimeMillis();
		heapSort(vMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td>";

		i = System.currentTimeMillis();
		heapSort(vCemMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td>";

		i = System.currentTimeMillis();
		heapSort(vMilhao);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td> </tr>";

		return retorno;
	}
	
	public String decrescentbuble() {

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
		heapSort(vCem);
		long f = System.currentTimeMillis();
		long t = f - i;
		retorno = "<tr><td>heap Sort</td> <td>"+ t+"</td>"  ;

		i = System.currentTimeMillis();
		heapSort(vMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td>";

		i = System.currentTimeMillis();
		heapSort(vCemMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td>";

		i = System.currentTimeMillis();
		heapSort(vMilhao);
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
		heapSort(vCem);
		long f = System.currentTimeMillis();
		long t = f - i;
		retorno = "<tr><td>heap Sort</td> <td>"+ t+"</td>"  ;

		i = System.currentTimeMillis();
		heapSort(vMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td>";

		i = System.currentTimeMillis();
		heapSort(vCemMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td>";

		i = System.currentTimeMillis();
		heapSort(vMilhao);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>"+ t+"</td> </tr>";

		return retorno;
	}
	
	public  void heapSort(int[] v) {
		buildMaxHeap(v);
		int n = v.length;

		for (int i = v.length - 1; i > 0; i--) {
			swap(v, i, 0);
			maxHeapify(v, 0, --n);
		}
		
		
	}

	private  void buildMaxHeap(int[] v) {
		for (int i = v.length / 2 - 1; i >= 0; i--)
			maxHeapify(v, i, v.length);

	}

	private  void maxHeapify(int[] vetor, int pos, int tamanhoDoVetor) {

		int max = 2 * pos + 1, right = max + 1;
		if (max < tamanhoDoVetor) {

			if (right < tamanhoDoVetor && vetor[max] < vetor[right])
				max = right;

			if (vetor[max] > vetor[pos]) {
				swap(vetor, max, pos);
				maxHeapify(vetor, max, tamanhoDoVetor);
			}
		}
	}

	public  void swap(int[] v, int j, int aposJ) {
		int aux = v[j];
		v[j] = v[aposJ];
		v[aposJ] = aux;
	}


}
