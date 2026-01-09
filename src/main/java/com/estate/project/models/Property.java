package com.estate.project.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "properties")
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String city;
    private String type; // e.g., apartment, villa
    private double price;
    private String description;
    private String imageUrl; // store path to image in static/images
}
