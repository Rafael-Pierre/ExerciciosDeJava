package bancoDeTalentos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class bancoDeTalentos {
	
	public static String opcao1() throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		String[][] matrizCandidatos = leArquivoCandidatos();
		int maior = 0;
		String Maior=null;
		int ContadordeCasosIguais = 0;
		List<Integer> linhasDosMaiores = new ArrayList<>();
		
		System.out.println("Escolha uma das tecnologias a seguir e digite seu respectivo numero:");
		System.out.println("1.Java -  2.Front-end - 3.Python - 4.Back-end - 5.Gerência de projetos ");
		int tecEscolhida = sc.nextInt();
		while(tecEscolhida > 5 || tecEscolhida < 1) {
			System.out.println("digite um numero correto");
			tecEscolhida = sc.nextInt();
		}
		
		
		for(int i = 0; i < matrizCandidatos.length ; i++) {			
				
				if(Integer.parseInt(matrizCandidatos[i][tecEscolhida]) > maior) {
					
					maior = Integer.parseInt(matrizCandidatos[i][tecEscolhida]);
					
					Maior = matrizCandidatos[i][0];
				}
				
						
		}
		
		for(int i = 0; i < matrizCandidatos.length ; i++) {			
			
			if(maior == Integer.parseInt(matrizCandidatos[i][tecEscolhida])) {
				
				ContadordeCasosIguais++;
				linhasDosMaiores.add(i);
			}				
		}
		
		if(ContadordeCasosIguais > 1) {
			
			System.out.println("A maior Nota eh apresentada por dois candidatos, escolha uma nova tecnologia para decidir o desempate:");
			System.out.println("1.Java -  2.Front-end - 3.Python - 4.Back-end - 5.Gerência de projetos ");
			tecEscolhida = sc.nextInt();
			
			maior = 0;
			Maior=null;
			for(int linha : linhasDosMaiores) {

				if(Integer.parseInt(matrizCandidatos[linha][tecEscolhida]) > maior){
					maior = Integer.parseInt(matrizCandidatos[linha][tecEscolhida]);
					Maior = matrizCandidatos[linha][0];
				}
			}

		}
		
		System.out.println();
		System.out.println(Maior);
		System.out.println();
		
		sc.close();
		return Maior;
		
	}
	
	
	public static String opcao2() throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		String[][] matrizCandidatos = leArquivoCandidatos();
		double maior = 0;
		String melhorCandidato=null;	
		int obrigatoria = 0, importante=0;
		double mediaPonderada;
		int ContadordeCasosIguais=0;
		List<Double> mediasPonderadasCandidatos = new ArrayList<>();
		List<Integer> linhasDosMaiores = new ArrayList<>();

		System.out.println("Escolha qual das tecnologias a seguir eh obrigatoria digite seu respectivo numero:");
		System.out.println("1.Java -  2.Front-end - 3.Python - 4.Back-end - 5.Gerência de projetos ");
		int tecObrigatoria = sc.nextInt();
		while(tecObrigatoria > 5 || tecObrigatoria < 1) {
			System.out.println("digite um numero correto");
			tecObrigatoria = sc.nextInt();
		}
		System.out.println("Agora escolha uma tecnologia importante:");
		int tecImportante = sc.nextInt();
		while(tecImportante > 5 || tecImportante < 1) {
			System.out.println("digite um numero correto");
			tecImportante = sc.nextInt();
		}
		
		for(int i = 0; i < matrizCandidatos.length ; i++) {			
			
			mediaPonderada = 0;
			
			if(Integer.parseInt(matrizCandidatos[i][tecObrigatoria]) == 0) {
				mediasPonderadasCandidatos.add(0.0);
			}
			else {
				obrigatoria = Integer.parseInt(matrizCandidatos[i][tecObrigatoria]);
				importante = Integer.parseInt(matrizCandidatos[i][tecImportante]);
				mediaPonderada = obrigatoria * 2 + importante * 1.5;
						
				mediasPonderadasCandidatos.add(mediaPonderada);		
			}
			
		}
			
		for(int i = 0; i < mediasPonderadasCandidatos.size() ; i++) {			
				
				if(mediasPonderadasCandidatos.get(i) > maior) {
					
					maior = mediasPonderadasCandidatos.get(i);
					
					melhorCandidato = matrizCandidatos[i][0];
				}
				
						
		}
		
		for(int i = 0; i < mediasPonderadasCandidatos.size() ; i++) {			
			
			if(maior == mediasPonderadasCandidatos.get(i) ) {
				
				ContadordeCasosIguais++;
				linhasDosMaiores.add(i);
			}				
		}
		
		if(ContadordeCasosIguais > 1) {
			
			System.out.println("Há candidatos com uma media ponderada igual, escolha uma tecnologia para desempate:");
			System.out.println("1.Java -  2.Front-end - 3.Python - 4.Back-end - 5.Gerência de projetos ");
			int tecDesempanta = sc.nextInt();
			while(tecDesempanta > 5 || tecDesempanta < 1) {
				System.out.println("digite um numero correto");
				tecDesempanta = sc.nextInt();
			}
			
			maior = 0;
			melhorCandidato=null;
			
			for(int linha : linhasDosMaiores) {

				if(Integer.parseInt(matrizCandidatos[linha][tecDesempanta]) > maior){
					maior = Integer.parseInt(matrizCandidatos[linha][tecDesempanta]);
					melhorCandidato = matrizCandidatos[linha][0];
				}
			}
	
		}

		System.out.println();
		System.out.println(melhorCandidato);
		System.out.println();
		
		sc.close();
		return melhorCandidato;				
	}
	
	public static String opcao3() throws FileNotFoundException {
		
		float somaDeNotas = 0;
		String[][] matrizCandidatos = leArquivoCandidatos();
		String melhorCandidato=null;
		float maior = 0;
		int indiceDoMaior = 0;
		List<Float> MediasCandidatos = new ArrayList<>();
			
				
		for(int i = 0; i < matrizCandidatos.length ; i++) {				
			somaDeNotas = 0;
			
			for(int j = 1; j < 6 ; j++) {
				somaDeNotas +=  Integer.parseInt(matrizCandidatos[i][j]);		
			}
			MediasCandidatos.add(somaDeNotas/5);	
		}	
		
		System.out.println("O candidato com a maior media entre os selecionados eh");
			
		for(int k = 0; k < MediasCandidatos.size() ; k++) {
			
			if(MediasCandidatos.get(k) > maior) {
			
				indiceDoMaior = k;
				maior = MediasCandidatos.get(k);
			}
		
		}
		
		melhorCandidato = matrizCandidatos[indiceDoMaior][0];
		System.out.println(melhorCandidato + " com uma media de " + maior);

		return melhorCandidato;
	}
	
	
	public static String[][] leArquivoCandidatos() throws FileNotFoundException {
		
		File file = new File("C:/arquivos/candidatos.txt");
		
		Scanner sc = new Scanner(file);
		
		List<String> lines = new ArrayList<>();
		
		List<String> listSeparado = new ArrayList<>();
		
		
		while(sc.hasNextLine()) {	
		
			lines.add(sc.nextLine());
		}
		
		int tamanhoMatriz = lines.size();
		
		String[][] matrix = new String[tamanhoMatriz][6];
		
		
		
		 for (int l = 0; l < tamanhoMatriz; l++) {
	            
			 
			 String linhaSeparada = lines.get(l);
			 linhaSeparada = linhaSeparada.trim();			 
			 
			 for(String item : linhaSeparada.split(";")){     	
				 
			         listSeparado.add(item);             	
			         
				 }
			 
			 
		 	 for (int c2 = 0; c2 < 6; c2++) {
	            	
	            	matrix[l][c2] = listSeparado.get(c2);
	         }      
		 
		 	 listSeparado.clear();
		 	 
		 }		 
		
		 sc.close();
		 return matrix;
	}
	
	
	public static List<String> leArquivoTecnologias() throws FileNotFoundException {
		
		File file = new File("C:/arquivos/tecnologias.txt");
		
		Scanner sc = new Scanner(file);
		
		List<String> tecs = new ArrayList<>();
		
		while(sc.hasNextLine()) {	
		
			tecs.add(sc.nextLine());
		}
		
		sc.close();
		return tecs;
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("Este programa le uma base de arquivos para retornar o melhor candidato com base nas suas habilidades.");
		System.out.println();
		
		System.out.println("Escolha uma das formas abaixo para poder decidir qual é o melhor candidato");
		System.out.println();
		
		System.out.println("1. Dada uma habilidade, quem seria o melhor candidato. ");
		System.out.println("2. Dadas uma habilidade obrigatória e uma importante, quem seria o melhor candidato.");
		System.out.println("3. Considerando o conjunto de habilidades, quem seria mais interessante para uma vaga.");
		
		Scanner sc = new Scanner(System.in);
		
		int opcaoDeEscolha = sc.nextInt();
		while(opcaoDeEscolha > 3 || opcaoDeEscolha < 1) {
			System.out.println("opcao invalida!");
			opcaoDeEscolha = sc.nextInt();
		}
		
		switch (opcaoDeEscolha) {
			case 1: {
				opcao1();
				break;
			}
			case 2: {
				
				opcao2();
				break;
			}
			case 3: {
		
				opcao3();
				break;
			}
			default:
				System.out.println("entrada de opcao invalida..");
				break;
		}
	}

}