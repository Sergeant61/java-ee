package com.recep.islem;

import java.util.List;
import java.util.Scanner;

import com.recep.dao.DAO;
import com.recep.entity.Parti;
import com.recep.entity.Secmen;

public class Islem {
	
	private static final String TEXT_A="a";
	private static final String TEXT_B="b";
	private static final String TEXT_C="c";
	private static final String TEXT_D="d";

	
	public static void main(String[] args) {
		Islem islem = new Islem();
		Scanner scanner = new Scanner(System.in);
		DAO dao = new DAO();

		 //for (int i = 0 ; i < 4 ; i ++){islem.PartiEkle(dao, scanner);}
		 //for (int i = 0 ; i < 10 ; i ++){islem.SecmenEkle(dao,scanner);}

		 List<Secmen> list = islem.getSecmenList(dao);
		 List<Parti> list2 = islem.getPartiList(dao);
		 int sayacA=0,sayacB=0,sayacC=0,sayacD=0;
		 for(Secmen secmen : list){
			 
			 if(secmen.getOyVerilenParti().equals(TEXT_A)){
				 sayacA= sayacA+1;
			 }
			  
			 if(secmen.getOyVerilenParti().equals(TEXT_B)){
				 sayacB= sayacB+1;
			 }
			 
			 if(secmen.getOyVerilenParti().equals(TEXT_C)){
				 sayacC= sayacC+1;
			 }
			 
			 if(secmen.getOyVerilenParti().equals(TEXT_D)){
				 sayacD= sayacD+1;
			 }
		 
		 }
		 
		 for(Parti parti : list2){
			 if(parti.getName().equals(TEXT_A)){
				 islem.PartiUpdate(dao, parti.getId(),TEXT_A,sayacA); 
			 }
			 if(parti.getName().equals(TEXT_B)){
				 islem.PartiUpdate(dao, parti.getId(),TEXT_B,sayacB); 
			 }
			 if(parti.getName().equals(TEXT_C)){
				 islem.PartiUpdate(dao, parti.getId(),TEXT_C,sayacC); 
			 }
			 if(parti.getName().equals(TEXT_D)){
				 islem.PartiUpdate(dao, parti.getId(),TEXT_D,sayacD); 
			 }
		 }
		 
		List<Parti> listParti = islem.getPartiList(dao);

		for (Parti parti1 : listParti) {

			System.out.println(parti1.getName() + " isimli partinin " + parti1.getOysayisi() + " oyu bulunmaktadýr.");
		}

		dao.close();
		scanner.close();
	}

	public void SecmenEkle(DAO dao, Scanner scanner) {

		System.out.println("Seçmen adýný ve seçtiði partiyi giriniz.");
		dao.add(new Secmen(scanner.next(), scanner.next()));
	}

	public void SecmenUpdate(DAO dao, Scanner scanner) {

		System.out.println("Seçmen adýný giriniz.");
		dao.update(new Secmen(scanner.nextInt(), scanner.next()));
	}

	public void PartiEkle(DAO dao, Scanner scanner) {

		System.out.println("Parti adýný giriniz.");
		dao.add(new Parti(scanner.next(), 0));
	}

	public void PartiUpdate(DAO dao, int id, String name, int oySayisi) {

		System.out.println("Parti adýný giriniz.");
		dao.update(new Parti(id,name,oySayisi));
	}

	private static List<Secmen> getSecmenList(DAO dao) {
		System.out.println("Secmen Listele");
		List<Secmen> list = dao.getSecmenList();

		return list;
	}

	public Parti getParti(DAO dao, int id) {
		return dao.getPartiId(id);
	}

	private static List<Parti> getPartiList(DAO dao) {
		System.out.println("Parti Listele");
		List<Parti> list = dao.getPartiList();

		return list;
	}

}
