package services;

import java.util.List;

import entities.Zone;
import repositories.ZoneRepository;

public class ZoneService {

    ZoneRepository zoneRepo;

    public List<Zone> listerZone(){
        return zoneRepo.selectAll();
    }
     
    public void ajouterZone(Zone zone){
        zoneRepo.insert(zone);
    }

    public Zone rechercherParNom(String nom){
        return zoneRepo.SearchByZone();
    }

}
