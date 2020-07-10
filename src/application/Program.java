package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
	//fazer o programa ler um conjunto de produto a partir de um arquivo
	//depois mostrar o mais caro deles
	//AGORA TRABALHANDO COM PRODUTOS
	
	Locale.setDefault(Locale.US);
	
	List<Product> list = new ArrayList<>();
	
	String path = "C:\\Users\\teste\\Desktop\\Workspaces\\ws-eclipse\\71_Genéricos_delimitados\\in.txt";
	
	try(BufferedReader br = new BufferedReader(new FileReader(path)))  {
		String line = br.readLine();
		String[] fields;
		while(line != null) {
			fields = line.split(",");
			list.add(new Product(fields[0],Double.parseDouble(fields[1])));
			line = br.readLine();
		}
		
		Product x = CalculationService.max(list);
		System.out.println("Most Expensive: ");
		System.out.print(x);
		
	}catch(IOException e) {
		System.out.println("Error: " + e.getMessage());
	}

	}

}
