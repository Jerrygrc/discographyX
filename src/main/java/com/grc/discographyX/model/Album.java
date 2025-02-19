package com.grc.discographyX.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name="album")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAlbum;
    private String title;
    private Integer releaseYear;
    private String label;

    @OneToMany(mappedBy = "album", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Song> songs;

    @ManyToOne
    @JoinColumn(name = "id_artist")
    @JsonBackReference
    private Artist artist;

}