package com.edu.tecazuay.model.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Song implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = -1982017205097458888L;

	@Id
	@Column (name = "title")
	private String title;
	
	private String artist;
	private String album;
	private short year;
	
	@ManyToOne
	@JoinColumn(name = "playlist_id")
	private Playlist playlist;
	
}
