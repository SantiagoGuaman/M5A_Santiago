package com.edu.tecazuay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.edu.tecazuay.model.entity.Playlist;
import com.edu.tecazuay.model.entity.Song;
import com.edu.tecazuay.model.service.IPlayListService;

@RestController
@RequestMapping("/api")
public class PlayListRestController {

	@Autowired
	IPlayListService playListService;
	

	@GetMapping("/playlists")
	public List<Playlist> findAll() {
		return playListService.listAllPlayLists();
	}
	
	@GetMapping("/playlist/{id}")
	public ResponseEntity<?> findPlayListById(@PathVariable("id") String playListId) {
		if (playListService.findPlaylistByID(playListId) == null) {
			return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} else {
			return null;
		}
	}
	
	@PostMapping("/create-playlist")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> savePlayList(@RequestBody Playlist playlist) {
		if (!playlist.getName().trim().isEmpty()) {
			playListService.savePlaylist(playlist);
			return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.CREATED).build();
		} else {
			return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}


	@PutMapping("/update-playlist/{id}")
	public ResponseEntity<?> updatePlayList(@RequestBody Playlist playlist, @PathVariable("id") String playListId) {

		if (playListService.findPlaylistByID(playListId) != null) {
			Playlist currentPlayList = playListService.findPlaylistByID(playListId);
			List<Song> songList = currentPlayList.getSongs();
			currentPlayList.setSongs(songList);
			if (currentPlayList.getName() == currentPlayList.getName()) {
				playListService.savePlaylist(currentPlayList);
				return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			} else { 
				return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.CONFLICT).build();
			}
		} else { 
			return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}

	@DeleteMapping("/delete-playlist/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public ResponseEntity<?> deletePlayList(@PathVariable("id") String playListId) {
		if (playListService.findPlaylistByID(playListId) != null) {
			playListService.deletePlaylistByID(playListId);
			return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	
}
