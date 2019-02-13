package com.example.mooviedetailapp.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.mooviedetailapp.entities.MovieDetail;

public interface MoovieDetailDao extends CrudRepository<MovieDetail,Integer>{

}
