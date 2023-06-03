import java.util.InputMismatchException;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        // présentation du jeu
        System.out.println("Bonjour et bienvenue dans mon nouveau jeu,\nLes métiers de la forêt.");
        System.out.println("\n - Principes - \n");
        System.out.println("Pour commencer, vous allez devoir choisir un métier de la forêt.\n");
        
        
        boolean test = true;

        // boucle se répétant tant que l'utilisateur n'a pas entré un des caractères demandés.
        
        try(Scanner sc = new Scanner(System.in))
        {
            while(test)
            {
                // demande de l'entrée d'un caractère pour le choix du métier
                System.out.println("Entrez le chiffre précisé après le nom de métier.");
                System.out.print("Bûcheron : 1, chasseur : 2, pêcheur : 3, trapeur : 4. Votre métier : ");
            
                int job = sc.nextInt();
                
                if(job == 1 || job == 2 || job == 3 || job == 4)
                {
                    System.out.println("Votre choix : " + job);

                    test = false;
                }
                else
                {
                    System.out.println("Vous n'avez pas entré ce qu'on vous a demandé.\n");
                }
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println(" - ERREUR - \nVous n'avez pas entré le bon type. Veuillez entrer ce que l'on vous demande.");
        }
        
    }
}