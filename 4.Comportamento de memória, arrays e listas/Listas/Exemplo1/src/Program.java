import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<>();
		
		list.add("Mario");
		list.add("Marcio");
		list.add("Mariah");
		list.add("Maria");
		list.add("Ana");
		list.add("Alexo");
		list.add(2, "Mariano");
		list.add("Doroteio");
		
		list.remove("Alexo");
		list.remove(1);		
		
		System.out.println(list.size());
		for(String nome : list) {
			System.out.println(nome);
		}
		System.out.println("-----------------------------------");	
		
		list.removeIf(nome -> nome.charAt(0) == 'M');
		
		for(String nome : list) {
			System.out.println(nome);
		}
		
		System.out.println("------------------------------------");
	}

}
