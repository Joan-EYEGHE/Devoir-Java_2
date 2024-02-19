package services;

import java.util.List;

import entities.Bien;
import entities.Zone;
import repositories.BienRepository;

public class BienService {
    BienRepository bienRepo;

    public void ajouterBien(Bien bien){
        bienRepo.insert(bien);
    }

    public List<Bien> ListerZone(){
        return bienRepo.selectAll();
    }
}
