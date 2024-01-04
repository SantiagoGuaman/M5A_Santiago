package com.edu.tecazuay.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.tecazuay.model.dao.IPlayListDao;
import com.edu.tecazuay.model.entity.Playlist;

@Service
public class PlayListServiceImp implements IPlayListService {

	@Autowired
	IPlayListDao playListDao;

	@Override
	@Transactional (readOnly = true)
	public List<Playlist> listAllPlayLists() {
		return (List<Playlist>) playListDao.findAll();
	}

	@Override
	public Playlist savePlaylist(Playlist playlist) {
		return playListDao.save(playlist);
	}

	@Override
	@Transactional (readOnly = true)
	public Playlist findPlaylistByID(String playListId) {
		return playListDao.findById(playListId).orElse(null);
	}

	@Override
	public void deletePlaylistByID(String playListId) {
		playListDao.deleteById(playListId);
	}
}
