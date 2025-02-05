package com.grc.discographyX.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="song")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSong;
    private String title;
    private String composer;

    @ManyToOne
    @JoinColumn(name = "id_album")
    @JsonBackReference
    private Album album;


}