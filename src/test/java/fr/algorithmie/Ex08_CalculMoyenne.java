package fr.algorithmie;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/** Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * Utilisez Resultat.log pour afficher les résultats
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="CalculMoyenne")
public class Ex08_CalculMoyenne {
	
	int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	/**
	 * Ne pas modifier les informations portées par l'annotation
	 */
	@Test
	@Question(numero=1)
	public void calculMoyenne() {
		double calcul=0;
		//TODO Calculez et LOGUEZ la moyenne des valeurs du tableau (la moyenne doit être une valeur décimale).
		for(int loop=1;loop<=array.length;loop++) {
			calcul=calcul+array[loop-1];
			
		}
		Resultat.log(calcul/array.length);
	}
	
	@Test
	@Question(numero=2)
	public void calculMoyenneValeursPositives() {
		double calculPos=0d;
		int valeurT=0;
		//TODO Calculez et LOGUEZ la moyenne des valeurs POSITIVES du tableau
		for(int loop=1;loop<=array.length;loop++) {
			if(array[loop-1]>=0) {
				calculPos=calculPos+array[loop-1];
				valeurT++;
			}
		}
		Resultat.log(calculPos/valeurT);
		
	}

}
