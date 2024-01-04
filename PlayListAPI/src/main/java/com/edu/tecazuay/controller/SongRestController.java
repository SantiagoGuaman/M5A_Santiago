package com.edu.tecazuay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.edu.tecazuay.model.entity.Song;
import com.edu.tecazuay.model.service.ISongService;

@RestController
@RequestMapping("/api")
public class SongRestController {

	@Autowired
	ISongService songService;
	
	@GetMapping("/songs")
	public List<Song> findAll() {
		return songService.listAllSongs();
	}
	
	@GetMapping("/song/{id}")
	public Song findSongById(@PathVariable("id") String songId) {
		return songService.findSongByID(songId);
	}
	
	@PostMapping("/create-song")
	@ResponseStatus(HttpStatus.CREATED)
	public Song saveSong(@RequestBody Song song) {
		songService.saveSong(song);
		return song;
	}


	@PutMapping("/update-song/{id}")
	public Song updateSong(@RequestBody Song song, @PathVariable("id") String songId) {

		Song currentSong = songService.findSongByID(songId);
		currentSong.setArtist(song.getArtist());
		currentSong.setAlbum(song.getAlbum());
		return songService.saveSong(currentSong);
	}

	@DeleteMapping("/delete-song/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteSong(@PathVariable("id") String songId) {
		songService.deleteUSongByID(songId);
	}
	
}
