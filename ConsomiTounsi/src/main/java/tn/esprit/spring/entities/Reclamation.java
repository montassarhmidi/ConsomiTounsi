package tn.esprit.spring.entities;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

/**
 * 
 */
@Entity @Data
public class Reclamation {

 
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String typeReclamation;
    private String objet;
    private boolean state;
    @Enumerated(EnumType.STRING)
    private Decision decision;
    private Date dateLimit;
    @ManyToOne()
    User users;

    public Reclamation() {
    }

}