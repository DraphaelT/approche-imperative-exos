package fr.algorithmie;

import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * Utilisez Resultat.log pour afficher les résultats
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="InteractifTableMult")
public class Ex17_InteractifTableMult {
	
	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void interactif() {
		
		Scanner scanner = new Scanner(System.in) ;
		
		// TODO Tant que le nombre saisi par l'utilisateur n'est pas compris
		// entre 1 et 10 l'application continue à demander un nombre à l'utilisateur.
		
		// Si ce nombre est compris entre 1 et 10, l'application affiche la table de multiplication
		// de ce nombre sous la forme : 3*1=3, 3*2=6, etc... jusqu'à 3*2=10
		boolean oui = false;
		
		while(oui==false) {
			System.out.println("Donnez moi un chiffre entre 1 et 10 :");
			int nb = scanner.nextInt();
			
			if(nb>=1 && nb<=10) {
				for(int loop=1;loop<=10;loop++) {
					
					Resultat.log(nb+"*"+loop+"="+nb*loop);
				}
				
				
				oui = true;
			}
		}
		
		scanner.close();
	}

}
