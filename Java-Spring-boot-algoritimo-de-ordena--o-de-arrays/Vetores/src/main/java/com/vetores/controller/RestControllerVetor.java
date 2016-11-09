package com.vetores.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vetores.Manager.ManagerBuble;
import com.vetores.Manager.ManagerHeapsort;
import com.vetores.Manager.ManagerInsert;
import com.vetores.Manager.ManagerMerge;
import com.vetores.Manager.ManagerQuick;
import com.vetores.Manager.ManagerSelection;
import com.vetores.model.Vetor;

@RestController
public class RestControllerVetor {
	
	@RequestMapping(value="/crescente")
	public String crescente(){
	ManagerBuble mbuble= new ManagerBuble();
	ManagerHeapsort mhepa= new ManagerHeapsort();
	ManagerInsert minsert= new ManagerInsert();
	ManagerMerge mmager= new ManagerMerge();	
	ManagerQuick mquiqck=new ManagerQuick();
	ManagerSelection msele=new ManagerSelection();
		String retorno="";
		String tabelaAbre="<center><p>Vetor crescente</p>"
				+ "<Table border=1> \n"
				+ "<tr> <th> Algoritmo </th> "
				+ "<th>100</th>"
				+ "<th>1000</th>"
				+ "<th>100000</th>"
				+ "<th>1000000</th> </tr>";
		
		String buble="",heap="",mins=""
				,marge="",quick ,sele;
		buble= mbuble.crescentbuble();
		heap=mhepa.crescentbuble();
		mins=minsert.crescente();
		marge=mmager.crecente();
		quick=mquiqck.crecente();
		sele= msele.crescente();
		retorno=tabelaAbre+buble+heap+mins+marge+quick+sele+" </table> </center>";
		
		return retorno;
	}
	
	@RequestMapping(value="/decrescente")
	public String decrescente(){
		ManagerBuble mbuble= new ManagerBuble();
		ManagerHeapsort mhepa= new ManagerHeapsort();
		ManagerInsert minsert= new ManagerInsert();
		ManagerMerge mmager= new ManagerMerge();	
		ManagerQuick mquiqck=new ManagerQuick();
		ManagerSelection msele=new ManagerSelection();
			String retorno="";
			String tabelaAbre="<center><p>Vetor decrescente</p>"
					+ "<Table border=1> \n"
					+ "<tr> <th> Algoritmo </th> "
					+ "<th>100</th>"
					+ "<th>1000</th>"
					+ "<th>100000</th>"
					+ "<th>1000000</th> </tr>";
			
			String buble="",heap="",mins=""
					,marge="",quick ,sele;
			buble= mbuble.decrecentetbuble();
			heap=mhepa.decrescentbuble();
			mins=minsert.decrescente();
			marge=mmager.decrecente();
			quick=mquiqck.decrecete();
			sele= msele.decrescente();
			retorno=tabelaAbre+buble+heap+mins+marge+quick+sele+" </table> </center>";
			
			return retorno;
		}
	
	@RequestMapping(value="/aleatorio")
	public String aleatorio(){
		ManagerBuble mbuble= new ManagerBuble();
		ManagerHeapsort mhepa= new ManagerHeapsort();
		ManagerInsert minsert= new ManagerInsert();
		ManagerMerge mmager= new ManagerMerge();	
		ManagerQuick mquiqck=new ManagerQuick();
		ManagerSelection msele=new ManagerSelection();
			String retorno="";
			String tabelaAbre="<center><p>Vetor aleatorio</p>"
					+ "<Table border=1> \n"
					+ "<tr> <th> Algoritmo </th> "
					+ "<th>100</th>"
					+ "<th>1000</th>"
					+ "<th>100000</th>"
					+ "<th>1000000</th> </tr>";
			
			String buble="",heap="",mins=""
					,marge="",quick ,sele;
			buble= mbuble.aleatorioBuble();
			heap=mhepa.aleatorio();
			mins=minsert.aleatorio();
			marge=mmager.aleatorio();
			quick=mquiqck.aleatorio();
			sele= msele.aleatorio();
			retorno=tabelaAbre+buble+heap+mins+marge+quick+sele+" </table> </center>";
			
			return retorno;
		}
	
	
	
	
}
