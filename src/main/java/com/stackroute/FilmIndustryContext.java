package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class FilmIndustryContext {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1 =  context.getBean("movieA",Movie.class);
        System.out.println("Movie Scripted...");
        Movie movie2 = context.getBean("movieB",Movie.class);
        System.out.println("Movie Scripted...");
        movie1.getActor();
        movie2.getActor();
        System.out.println(movie1==movie2);
    }

}
