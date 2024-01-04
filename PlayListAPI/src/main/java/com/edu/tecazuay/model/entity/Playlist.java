package com.edu.tecazuay.model.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Playlist implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1693371636528688468L;

	@Id
	private String name;
	/*
	@ManyToOne
	@JoinColumn (name = "id_song", referencedColumnName = "title")
	private Song song;
	*/
	
	@OneToMany(mappedBy = "playlist", cascade = CascadeType.ALL)
	private List<Song> songs;
}
