package com.example.compelk.entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@NoArgsConstructor
@Entity
@Table(name = "merchand")
public class Merchand {

    @Id
    @Column(nullable = false)
    private String sku; // SKU du produit (identifiant unique)

    @Column(nullable = false)
    private String productName; // Nom du produit

    @Column
    private String productUrl; // URL du produit

    @Column
    private String imageUrl; // URL de l'image du produit

    @Column(nullable = false)
    private float price; // Prix

    @Column(nullable = false)
    private String currency; // Devise

    @Column
    private String brand; // Marque

    @Column
    private String category; // Identifiant de catégorie

    @Column
    private String variantGroup; // Identifiant de groupe de la variante

    @Column
    private String variantSize; // Taille de la variante

    @Column
    private String color; // Couleur

    @Column
    private String material; // Matériau

    @Column
    private String model; // Modèle

    @Column
    private String ageRange; // Tranche d'âge

    @Column
    private String gender; // Genre/sexe

    @Column(nullable = false)
    private String operation; // Opération (INSERT, UPDATE, DELETE)

    // Getters and setters (omitted for brevity)

    // Constructors (omitted for brevity)
}
