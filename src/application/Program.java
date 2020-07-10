package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import services.CalculationService;

public class Program {

	public static void main(String[] args) {
	//fazer o programa ler um conjunto de produto a partir de um arquivo
	//depois mostrar o mais caro deles
		
	List<Integer> list = new ArrayList<>();
	
	String path = ":\\Users\\teste\\Desktop\\Workspaces\\ws-eclipse\\71_Genéricos_delimitados\\in.txt";
	
	try(BufferedReader br = new BufferedReader(new FileReader(path)))  {
		String line = br.readLine();
		while(line != null) {
			list.add(Integer.parseInt(line));
			line = br.readLine();
		}
		
		Integer x = CalculationService.max(list);
		System.out.println("Max: ");
		System.out.println(x);
		
	}catch(IOException e) {
		System.out.println("Error: " + e.getMessage());
	}

	}

}
