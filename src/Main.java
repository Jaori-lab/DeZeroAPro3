import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Main {

	public static void main(String[] args) {
		System.out.println("Les collections");
		System.out.println("Les objets List stockent tout et n'importe quoi");
		System.out.println("Les Objets Set sont plus restrictifs, il ne sotockent jamais deux fois la même valeur");
		System.out.println("Les Objets Map eux fonctionnent avec un système clé-valeur");
		System.out.println("\n");
		System.out.println("Les linkedList sont liées les une aux autres avant et après");
		System.out.println("Les ArrayList sont plus rapide en lecture mais plus lente pour supprimer "
				+ "\nou modifer en milieu de tableau"+"\nLes array list conviennent pour des listes non ordonnées\n ");
		
		System.out.println("Les Objets Map : \n");
		System.out.println("La clé est unique tandis que la valeur peut être associée à plusieurs clés");
		System.out.println("Hashtable n'accepte pas la valeur null , parcontre il est Thread Safe");
		System.out.println("L'Objet Enumeration permet de parcourir une Hashtable");
		System.out.println("HashMap lui accepte la valeur null mais n'est pas Thread Safe");
		System.out.println("Les objets Set eux n'acceptent pas les doublons, \nil existe des objets Set plus restrictifs encore\n");
		
		HashMap ht = new HashMap();
		ht.put(1, "Printemps");
		ht.put(5, "Eté");
		ht.put(14, "Automne");
		ht.put(4, "Hiver");
		
		Iterator iterator = ht.entrySet().iterator();
        while (iterator.hasNext()) {
          Map.Entry mapentry = (Map.Entry) iterator.next();
          System.out.println("clé: "+mapentry.getKey()
                            + " | valeur: " + mapentry.getValue());
	}
	}
}



