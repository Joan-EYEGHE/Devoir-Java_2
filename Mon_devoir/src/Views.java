import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Bien;
import entities.Zone;
import services.BienService;
import services.ZoneService;

public class Views {
    public static void main(String[] args) throws Exception {
        ZoneService zoneService=new ZoneService(); 
        BienService bienService =new BienService();
        Scanner sc=new Scanner(System.in);


        int choix;
        do {

            System.out.println("MON MENU");        
            System.out.println("1-Créer une Zone"); 
            System.out.println("2-Lister les zones"); 
            System.out.println("3-Ajouter un bien et lui associer une zone");
            System.out.println("4-Lister les biens en affichant le nom de la zone ");
            System.out.println("5-Quitter"); 
            choix=sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1:
                    System.out.println("Entrer le nom de la zone");
                    String nomZone=sc.nextLine(); 
                    Zone zone=new Zone();
                    
                    zone.setNomZone(nomZone);
                    zoneService.ajouterZone(zone);                
                break;

                
                case 2:
                    List<Zone> zones= zoneService.listerZone();
                    for (Zone zone2 : zones) {
                        System.out.println("Id de la zone " + zone2.getId());
                        System.out.println("Nom de la zone " + zone2.getNomZone());
                        System.out.println("=================================");
                    }
                    
                    break;
                case 3:
                    System.out.println("Entrer la reference ");
                    String reference=sc.nextLine();
                    System.out.println("Entrer la description ");
                    String descriprtion=sc.nextLine();
                    System.out.println("Entrer le prix ");
                    double prix =sc.nextDouble();
                    Bien bien =new Bien();
                    bien.setPrix(prix);
                    bien.setReference(reference);
                    bien.setDescription(descriprtion);
                    bienService.ajouterBien(bien);
                    break;


                case 4:
                List<Bien> biens =new ArrayList<>();
                    for (Bien bien2 : biens) {
                        System.out.println("reference du bien" + bien2.getReference());
                        System.out.println("Ndescription du bien" + bien2.getDescription());
                        // System.out.println("Ndescription du bien" + bien2);
                        // System.out.println("Ndescription du bien" + bien2.getDescription());
                        System.out.println("=================================");
                    }    

                        

                    
                    
                    break;
            
                default:
                    break;
            }

        } while (choix!=5);
        
    }
}
