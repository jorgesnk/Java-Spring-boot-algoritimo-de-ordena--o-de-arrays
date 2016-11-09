package com.vetores.Manager;

import com.vetores.model.Vetor;

public class ManagerMerge {
	public int[] numbers;
	public int[] helper;

	public int number;

	public String crecente() {

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
		sort(vCem);
		long f = System.currentTimeMillis();
		long t = f - i;
		retorno = "<tr><td>Merge</td> <td>" + t + "</td>";

		i = System.currentTimeMillis();
		sort(vMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>" + t + "</td>";

		i = System.currentTimeMillis();
		sort(vCemMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>" + t + "</td>";

		i = System.currentTimeMillis();
		sort(vMilhao);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>" + t + "</td> </tr>";

		return retorno;
	}

	public String decrecente() {

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
		sort(vCem);
		long f = System.currentTimeMillis();
		long t = f - i;
		retorno = "<tr><td>Merge</td> <td>" + t + "</td>";

		i = System.currentTimeMillis();
		sort(vMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>" + t + "</td>";

		i = System.currentTimeMillis();
		sort(vCemMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>" + t + "</td>";

		i = System.currentTimeMillis();
		sort(vMilhao);
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
		sort(vCem);
		long f = System.currentTimeMillis();
		long t = f - i;
		retorno = "<tr><td>Merge</td> <td>" + t + "</td>";

		i = System.currentTimeMillis();
		sort(vMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>" + t + "</td>";

		i = System.currentTimeMillis();
		sort(vCemMil);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>" + t + "</td>";

		i = System.currentTimeMillis();
		sort(vMilhao);
		f = System.currentTimeMillis();
		t = f - i;
		retorno = retorno + "<td>" + t + "</td> </tr>";

		return retorno;
	}

	public void sort(int[] values) {
		this.numbers = values;
		number = values.length;
		this.helper = new int[number];
		mergesort(0, number - 1);

	}

	private void mergesort(int low, int high) {

		if (low < high) {

			int middle = low + (high - low) / 2;

			mergesort(low, middle);

			mergesort(middle + 1, high);

			merge(low, middle, high);
		}
	}

	private void merge(int low, int middle, int high) {

		for (int i = low; i <= high; i++) {
			helper[i] = numbers[i];
		}

		int i = low;
		int j = middle + 1;
		int k = low;

		while (i <= middle && j <= high) {
			if (helper[i] <= helper[j]) {
				numbers[k] = helper[i];
				i++;
			} else {
				numbers[k] = helper[j];
				j++;
			}
			k++;
		}

		while (i <= middle) {
			numbers[k] = helper[i];
			k++;
			i++;
		}

	}
}
