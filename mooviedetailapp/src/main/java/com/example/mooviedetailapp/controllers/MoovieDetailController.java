package com.example.mooviedetailapp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.mooviedetailapp.entities.Moovie;
import com.example.mooviedetailapp.entities.MoovieFull;
import com.example.mooviedetailapp.entities.MovieDetail;
import com.example.mooviedetailapp.services.MoovieDetailService;

@RestController
public class MoovieDetailController {

	@Autowired
	MoovieDetailService ms;
	
	@RequestMapping("/getMooviedetails/{mid}")
	public MovieDetail getMoovi(@PathVariable Integer mid)
	{
		return  ms.getMoovieDetailById(mid);
	}
	
	@RequestMapping("/getFulldetails")
	public List<MoovieFull> getFullMoovi()
	{
		List<MoovieFull> list=new ArrayList<>();
		RestTemplate rt=new RestTemplate();
		Iterable<MovieDetail> md=ms.getAllMoovieDetail();
		for(MovieDetail m:md)
		{
		Moovie mm=rt.getForObject("http://localhost:8084/getmoovie/"+m.getMid(), Moovie.class);
		MoovieFull mf=new MoovieFull();
		mf.setDetails(m.getDetails());
		mf.setMid(m.getMid());
		mf.setMooviename(mm.getMooviname());
		mf.setRating(m.getRating());
		list.add(mf);
		}
		return   list;
	}
	
	
}
