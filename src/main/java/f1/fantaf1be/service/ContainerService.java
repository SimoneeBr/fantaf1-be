package f1.fantaf1be.service;

import f1.fantaf1be.entity.Container;
import f1.fantaf1be.repository.ContainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContainerService {

    @Autowired
    ContainerRepository containerRepository;

    public Container createContainer(Container container){
       return containerRepository.save(container);
    }

    public Container getContainer(String id){
        return containerRepository.findById(id).orElse(null);
    }

    public void deleteContainer(String id){
        containerRepository.deleteById(id);
    }

    public Container updateContainer(Container container){
        return containerRepository.save(container);
    }

    public List<Container> getAllContainers(){
        return containerRepository.findAll();
    }

    public List<Container> getAllPiloti() {
        return containerRepository.findAllByType("piloti");
    }

    public List<Container> getAllCostruttori() {
        return containerRepository.findAllByType("costruttori");
    }

    public List<Container> getAllMotori() {
        return containerRepository.findAllByType("motori");
    }

    /*public void saveCostruttori() {
        List<Container> costruttori = new ArrayList<>();
        costruttori.add(new Container("1","Red Bull", "costruttori", 100));
        costruttori.add(new Container("2","Ferrari", "costruttori", 90));
        costruttori.add(new Container("3","Mercedes", "costruttori", 80));
        costruttori.add(new Container("4","McLaren", "costruttori", 70));
        costruttori.add(new Container("5","Alpine", "costruttori", 60));
        costruttori.add(new Container("6","Aston Martin", "costruttori", 50));
        costruttori.add(new Container("7","Alfa Romeo", "costruttori", 50));
        costruttori.add(new Container("8","Alpha Tauri", "costruttori", 40));
        costruttori.add(new Container("9","Haas", "costruttori", 30));
        costruttori.add(new Container("10","Williams", "costruttori", 20));
        containerRepository.saveAll(costruttori);
    }

    public void savePiloti() {
        List<Container> piloti = new ArrayList<>();
        piloti.add(new Container("11","Verstappen", "piloti", 100));
        piloti.add(new Container("12","Leclerc", "piloti", 95));
        piloti.add(new Container("13","Perez", "piloti", 90));
        piloti.add(new Container("14","Sainz", "piloti", 90));
        piloti.add(new Container("15","Hamilton", "piloti", 85));
        piloti.add(new Container("16","Russel", "piloti", 80));
        piloti.add(new Container("17","Norris", "piloti", 75));
        piloti.add(new Container("18","Ocon", "piloti", 70));
        piloti.add(new Container("19","Gasly", "piloti", 65));
        piloti.add(new Container("20","Alonso", "piloti", 65));
        piloti.add(new Container("21","Bottas", "piloti", 60));
        piloti.add(new Container("22","Piastri", "piloti", 55));
        piloti.add(new Container("23","Stroll", "piloti", 55));
        piloti.add(new Container("24","Zhou", "piloti", 50));
        piloti.add(new Container("25","Tsunoda", "piloti", 45));
        piloti.add(new Container("26","Magnussen", "piloti", 40));
        piloti.add(new Container("27","Hulkenberg", "piloti", 35));
        piloti.add(new Container("28","De Vries", "piloti", 30));
        piloti.add(new Container("29","Albon", "piloti", 25));
        piloti.add(new Container("30","Sargeant", "piloti", 20));
        containerRepository.saveAll(piloti);
    }

    public void saveMotori(){
        List<Container> motori = new ArrayList<>();
        motori.add(new Container("31","Red Bull PowerTrains", "motori", 20));
        motori.add(new Container("32","Ferrari", "motori", 15));
        motori.add(new Container("33","Mercedes", "motori", 10));
        motori.add(new Container("34","Renault", "motori", 5));
        containerRepository.saveAll(motori);
    }

    public void saveShortPiloti(){
        List<Container> shortPiloti = new ArrayList<>();

    }*/
}
