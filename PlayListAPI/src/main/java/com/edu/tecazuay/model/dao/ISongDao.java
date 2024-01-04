package com.edu.tecazuay.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.edu.tecazuay.model.entity.Song;

public interface ISongDao extends CrudRepository<Song, String> {

}
