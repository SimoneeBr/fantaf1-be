package f1.fantaf1be;

import f1.fantaf1be.entity.Container;
import f1.fantaf1be.entity.Lega;
import f1.fantaf1be.repository.ContainerRepository;
import f1.fantaf1be.repository.LegaRepository;
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
    List<Lega> leghe = new ArrayList<>();
    @Autowired
    private ContainerRepository containerRepository;

    @Autowired
    private LegaRepository legaRepository;

    @Test
    void contextLoads() {
    }

    /*@Disabled
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
    }*/

    /*@Test
    void insertLeghe(){
        leghe.add(new Lega(""));
        leghe.add(new Lega(""));
        leghe.add(new Lega(""));
        legaRepository.saveAll(leghe);
    }*/
}
