package com.rainscape.backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "reports")
@Data   // Lombok: generates getters, setters, toString, etc.
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    private Long id;

    private String description;

    private double latitude;
    private double longitude;

    private String photoUrl; // later we’ll handle photo storage
}
