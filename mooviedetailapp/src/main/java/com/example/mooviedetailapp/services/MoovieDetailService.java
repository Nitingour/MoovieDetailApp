package com.example.mooviedetailapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mooviedetailapp.dao.MoovieDetailDao;
import com.example.mooviedetailapp.entities.MovieDetail;
@Service
public class MoovieDetailService {
@Autowired
	    MoovieDetailDao md;
	public MovieDetail getMoovieDetailById(int id)
	{
		return md.findOne(id);
	}
	public Iterable<MovieDetail> getAllMoovieDetail()
	{
		return md.findAll();
	}
}
