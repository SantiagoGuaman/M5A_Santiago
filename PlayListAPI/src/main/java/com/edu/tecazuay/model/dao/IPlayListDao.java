package com.edu.tecazuay.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.edu.tecazuay.model.entity.Playlist;

public interface IPlayListDao extends CrudRepository<Playlist, String> {

}
