package fr.algorithmie;

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
@Exercice(nom="Rotation")
public class Ex13_Rotation {

	// NE PAS CHANGER LES NOMS
	// mais vous pouvez modifier les valeurs contenues dans array
	int[] array = { 0, 1, 2, 3};

	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void afficherAlgo() {

		// TODO Effectuez une rotation à droite des éléments du tableau array
		// Exemple : si le tableau contient {0,1,2,3} alors il contiendra {3,0,1,2}
		// après rotation
	
		// TODO Afficher le contenu du tableau après rotation avec Resultat.log
		for(int loop=0; loop<array.length-1; loop++){
	        int a = array[loop+1];								//sauvegarde la valeur de l'index supérieur dans a
	        array[loop+1] = array[0];				       		// deplace la valeur dans l'index supérieur
	        array[0] = a;										// stock la valeur de l'index supérieur dans le premier
		}
		for(int loop1=0; loop1< array.length; loop1++) {
			Resultat.log(array[loop1]);
			
		}
		
	}

}
