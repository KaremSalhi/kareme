package Entretien;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String prenom;
		char reponse = 'O';
		Scanner sc = new Scanner(System.in);
		while (reponse == 'O')
		{
		System.out.println("Donnez un prénom : ");
		prenom = sc.nextLine();
		System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");
		//Sans ça, nous n'entrerions pas dans la deuxième boucle
		reponse = ' ';
		//Tant que la réponse n'est pas O ou N, on repose la question
		while(reponse != 'O' && reponse != 'N')
		{
		//On demande si la personne veut faire un autre essai
		System.out.println("Voulez-vous réessayer ? (O/N)");
		reponse = sc.nextLine().charAt(0);
		}
		}System.out.println("Au revoir…");*/
		/*int a = 1, b = 15;
		while (a < b)
		{
		System.out.println("coucou " +a+ " fois !!");
		a++;
		}*/
		/*int a = 1, b = 15;
		while (a++ < b)
		System.out.println("coucou " +a+ " fois !!");*/
		/*for(int i = 0, j = 2; (i < 10 && j < 6); i++, j+=2){
			System.out.println("i = " + i + ", j = " + j);
			}*/
		/*int premiersNombres[][] = { {0,2,4,6,8},{1,3,5,7,9} };
		System.out.println(+premiersNombres[1][3]);*/
		/*char tableauCaractere[] = {'a','b','c','d','e','f','g'};
		for(int i = 0; i < tableauCaractere.length; i++)
		{
		System.out.println("À l'emplacement " + i +" du tableau nous avons= " + tableauCaractere[i]);
		}*/
		/*int premiersNombres[][] = { {0,2,4,6,8},{1,3,5,7,9} }, i = 0, j = 0;
		while (i < 2)
		{
		j = 0;
		while(j < 5)
		{
		System.out.print(premiersNombres[i][j]);
		j++;
		}
		System.out.println("");
		i++;}*/
		/*int premiersNombres[][] = { {0,2,4,6,8},{1,3,5,7,9} };
		for(int i = 0; i < 2; i++)
		{
		for(int j = 0; j < 5; j++)
		{
		System.out.print(premiersNombres[i][j]);
		}
		System.out.println("");
		}*/
		/*String tab[] = {"toto", "titi", "tutu", "tete", "tata"};
		for(String str : tab)
		System.out.println(str);*/
		/*String tab[][]={{"toto", "titi", "tutu", "tete", "tata"}, {"1", "2","3", "4"}};
			int i = 0, j = 0;
			for(String sousTab[] : tab)
			{
			i = 0;
			for(String str : sousTab)
			{
			System.out.println("La valeur de la nouvelle boucle est : " +
			str);
			System.out.println("La valeur du tableau à l'indice["+j+"]["+i+"] est : " + tab[j][i]);
			i++;
			}
			j++;
			}*/
		/*String chaine = new String("la paix niche"), chaine2 = new String();
		chaine2 = chaine.substring(3,13);
		System.out.println(chaine2);*/
		String[] tab = {"toto", "tata", "titi", "tete"};
		parcourirTableau(tab);
		System.out.println(toString(tab));
		}
		static void parcourirTableau(String[] tab)
		{
		for(String str : tab)
		System.out.println(str);
		}
		static String toString(String[] tab)
		{
		System.out.println("Méthode toString() !\n----------");
		String retour = "";
		for(String str : tab)
		retour += str + "\n";
		return retour;
		}
		
	}


