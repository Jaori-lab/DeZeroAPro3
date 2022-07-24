import java.util.List;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		System.out.println("Les collections");
		System.out.println("Les objets Lit stockent tout et n'importe quoi");
		System.out.println("Les Objets Set sont plus restrictifs, il ne sotockent jamais deux fois la même valeur");
		System.out.println("Les Objets Map eux fonctionnent avec un système clé-valeur");
		
		List l = new LinkedList<>();
		l.add(12);
		l.add("Du texte");
		l.add(12.20f);
		
		for(int i = 0 ; i<l.size() ; i++) {
			System.out.println("Element à l'index : "+i+ " = "+l.get(i));
		}
	}

}
