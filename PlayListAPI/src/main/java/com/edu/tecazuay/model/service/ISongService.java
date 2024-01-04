package com.edu.tecazuay.model.service;

import java.util.List;

import com.edu.tecazuay.model.entity.Song;

public interface ISongService {

	public List<Song> listAllSongs();

	public Song saveSong(Song song);

	public Song findSongByID(String songId);

	public void deleteUSongByID(String songId);

}
