package com.vetores.Manager;

import com.vetores.model.Vetor;

public class ManagerQuick {

	public String decrecete() {
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
		
		
		
		int qq=vCem.length-1;
		long i = System.currentTimeMillis();
		quickSort(vCem, 0,qq );
		long f = System.currentTimeMillis();
		long t = f - i;
		retorno = "<tr> <td>Quick Sort </td> <td>" + t+"</td>" ;
		
		qq=vMil.length-1;
		i = System.currentTimeMillis();
		quickSort(vMil, 0,qq );
		f = System.currentTimeMillis();
		t = f- i;
		retorno = retorno+ "<td>"+t+"</td>";
		
		qq=vCemMil.length-1;
		i = System.currentTimeMillis();
		quickSort(vCemMil, 0,qq );
		f = System.currentTimeMillis();
		t = f- i;
		retorno = retorno+ "<td>"+t+"</td>";
		qq=vMilhao.length-1;
		i = System.currentTimeMillis();
		quickSort(vMilhao, 0,qq );
		f = System.currentTimeMillis();
		t = f- i;
		retorno = retorno+ "<td>"+t+"</td></tr>";
		
		
		
		return retorno;
	}
	
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
		
		int qq=vCem.length-1;
		long i = System.currentTimeMillis();
		quickSort(vCem, 0,qq );
		long f = System.currentTimeMillis();
		long t = f - i;
		retorno = "<tr> <td>Quick Sort </td> <td>" + t+"</td>" ;
		
		qq=vMil.length-1;
		i = System.currentTimeMillis();
		quickSort(vMil, 0,qq );
		f = System.currentTimeMillis();
		t = f- i;
		retorno = retorno+ "<td>"+t+"</td>";
		
		qq=vCemMil.length-1;
		i = System.currentTimeMillis();
		quickSort(vCemMil, 0,qq );
		f = System.currentTimeMillis();
		t = f- i;
		retorno = retorno+ "<td>"+t+"</td>";
		qq=vMilhao.length-1;
		i = System.currentTimeMillis();
		quickSort(vMilhao, 0,qq );
		f = System.currentTimeMillis();
		t = f- i;
		retorno = retorno+ "<td>"+t+"</td><tr>";
		
		
		
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
		
		
		
		int qq=vCem.length-1;
		long i = System.currentTimeMillis();
		quickSort(vCem, 0,qq );
		long f = System.currentTimeMillis();
		long t = f - i;
		retorno = "<tr> <td>Quick Sort </td> <td>" + t+"</td>" ;
		
		qq=vMil.length-1;
		i = System.currentTimeMillis();
		quickSort(vMil, 0,qq );
		f = System.currentTimeMillis();
		t = f- i;
		retorno = retorno+ "<td>"+t+"</td>";
		
		qq=vCemMil.length-1;
		i = System.currentTimeMillis();
		quickSort(vCemMil, 0,qq );
		f = System.currentTimeMillis();
		t = f- i;
		retorno = retorno+ "<td>"+t+"</td>";
		qq=vMilhao.length-1;
		i = System.currentTimeMillis();
		quickSort(vMilhao, 0,qq );
		f = System.currentTimeMillis();
		t = f- i;
		retorno = retorno+ "<td>"+t+"</td></tr> ";
		
		
		return retorno;
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
	}

}
