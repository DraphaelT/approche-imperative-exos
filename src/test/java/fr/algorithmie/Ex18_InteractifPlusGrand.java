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
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="InteractifPlusGrand")
public class Ex18_InteractifPlusGrand {
	
	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void interactif() {
		
		Scanner scanner = new Scanner(System.in) ;
		
		// TODO Demander à l'utilisateur de saisir 10 nombres entiers
		// TODO Affichez chaque nombre saisi avec Resultat.log
		// TODO Enfin affichez avec Resultat.log le max des 10 nombres
		int maxValue = 0;
		int[] array = new int[10];
		System.out.println("Donnez moi 10 chiffre :");
		for(int loop=1;loop<=10;loop++) {			
			int nb = scanner.nextInt();			
			if(maxValue<nb) {
				maxValue=nb;
			}
			array[loop-1] = nb;
		}
		for(int loop=1;loop<=10;loop++) {			
			Resultat.log(array[loop-1]);
		}
		
		Resultat.log(maxValue);
		scanner.close();
	}

}
