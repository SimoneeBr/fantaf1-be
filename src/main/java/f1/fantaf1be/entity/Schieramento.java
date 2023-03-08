package f1.fantaf1be.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "schieramenti")
public class Schieramento {

    @Id
    private String id;

    private LocalDateTime publishDate;
    private String email;
    private String driver;
    private String squadra;
    private String category;
    private String motor;
    private String pilotFist;
    private String pilotSecond;
    private String pilotThird;
    private String costruttori;
    private String pitstop;
    private String q1;
    private String q2;
    private String q3;
    private String q4;
    private String q5;
    private String p1;
    private String p2;
    private String p3;
    private String p4;
    private String p5;
    private String p6;
    private String p7;
    private String p8;
    private String p9;
    private String p10;
    private String primoRitirato;
    private boolean safetyCar;
    private String numeroRitirati;
    private String tempoPole;
    private String giroVeloce;


}
