package com.edu.tecazuay.model.service;

import java.util.List;

import com.edu.tecazuay.model.entity.Playlist;

public interface IPlayListService {

	public List<Playlist> listAllPlayLists();

	public Playlist savePlaylist(Playlist playlist);

	public Playlist findPlaylistByID(String playListId);

	public void deletePlaylistByID(String playListId);

}
