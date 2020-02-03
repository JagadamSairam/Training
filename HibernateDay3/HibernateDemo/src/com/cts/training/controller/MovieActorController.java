package com.cts.training.controller;

import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.cts.training.model.Actor;
import com.cts.training.model.Movie;

public class MovieActorController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory= cfg.buildSessionFactory();
		Session session= sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		Movie movie1 = new Movie();
//		movie1.setName("***RRR***");
//		
//		Actor actor1= new Actor();
//		actor1.setActorname("RamCharanTej");
//		actor1.setMovie(movie1);
//		
//		Actor actor2 = new Actor();
//		actor2.setActorname("NTR");
//		actor2.setMovie(movie1);
//		
//		Actor actor3= new Actor();
//		actor3.setActorname("Aliyabutt");
//		actor3.setMovie(movie1);
//		
//		session.save(movie1);
//		session.save(actor1);
//		session.save(actor2);
//		session.save(actor3);

		Criteria criteria1= session.createCriteria(Actor.class);
		criteria1.add(Restrictions.eq("actorname","Aliyabutt"));
		Actor actress= (Actor) criteria1.uniqueResult();
		System.out.print("Actress was "+actress);
		System.out.println("  Acting on "+actress.getMovie()+" Movie");
		

		
//		Criteria criteria2 = session.createCriteria(Movie.class);
//		criteria2.add(Restrictions.gt("id",15));
//		Movie movie = (Movie) criteria2.uniqueResult();
//		System.out.println(movie);
//		
//		Set<Actor> actors=movie.getActors();
//		for(Actor actor:actors)
//		System.out.println(actor);
		
//		Criteria criteria = session.createCriteria(Movie.class);
//		Movie movie = (Movie)criteria.add(Restrictions.eq("id", 18)).uniqueResult();
//		
//		//System.out.println(movie.getName());
//		
//		Set<Actor> actors = movie.getActors();
//		for(Actor actor : actors)
//		{
//			System.out.println(actor.getActorname());
//		}
//		
		transaction.commit();
		session.close();
				
	}

}
