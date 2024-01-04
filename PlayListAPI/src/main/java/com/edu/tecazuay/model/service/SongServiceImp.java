package com.edu.tecazuay.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.tecazuay.model.dao.ISongDao;
import com.edu.tecazuay.model.entity.Song;

@Service
public class SongServiceImp implements ISongService {

	@Autowired
	ISongDao songDao;
	
	@Override
	@Transactional (readOnly = true)
	public List<Song> listAllSongs() {
		return (List<Song>) songDao.findAll();
	}

	@Override
	public Song saveSong(Song song) {
		return songDao.save(song);
	}

	@Override
	@Transactional (readOnly = true)
	public Song findSongByID(String songId) {
		return songDao.findById(songId).orElse(null);
	}

	@Override
	public void deleteUSongByID(String songId) {
		songDao.deleteById(songId);
	}

}
