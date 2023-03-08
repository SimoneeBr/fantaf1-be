package f1.fantaf1be;

import f1.fantaf1be.entity.Container;
import f1.fantaf1be.repository.ContainerRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Fantaf1BeApplicationTests {

    List<Container> costruttori = new ArrayList<>();
    List<Container> piloti = new ArrayList<>();
    @Autowired
    private ContainerRepository containerRepository;

    @Test
    void contextLoads() {
    }

    @Disabled
    @Test
    void insertCostruttori(){
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

    @Disabled
    @Test
    void insertPiloti(){
        piloti.add(new Container("11","Red Bull", "costruttori", 100));
        piloti.add(new Container("12","Ferrari", "costruttori", 90));
        piloti.add(new Container("13","Mercedes", "costruttori", 80));
        piloti.add(new Container("14","McLaren", "costruttori", 70));
        piloti.add(new Container("15","Alpine", "costruttori", 60));
        piloti.add(new Container("16","Aston Martin", "costruttori", 50));
        piloti.add(new Container("17","Alfa Romeo", "costruttori", 50));
        piloti.add(new Container("18","Alpha Tauri", "costruttori", 40));
        piloti.add(new Container("19","Haas", "costruttori", 30));
        piloti.add(new Container("20","Williams", "costruttori", 20));
        containerRepository.saveAll(piloti);
    }
}
