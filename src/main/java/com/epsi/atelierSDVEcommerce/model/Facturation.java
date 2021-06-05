package com.epsi.atelierSDVEcommerce.model;
import lombok.Data;
import javax.persistence.Column; import javax.persistence.Entity; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType; import javax.persistence.Id; import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "facturation")
public class Facturation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Client acheteur;
    private float montant;
    private String[][] produitQuantite ;
    private String typePaiement;
    private LocalDate date;
}
