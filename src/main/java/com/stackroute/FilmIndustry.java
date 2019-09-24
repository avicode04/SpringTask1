package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class FilmIndustry {
    public static void main(String args[]){
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie1 =  factory.getBean("movie",Movie.class);

        System.out.println("Movie Scripted...");
        movie1.getActor();

        Movie movie2 =  factory.getBean("movie2",Movie.class);
        System.out.println("Movie Scripted...");
        movie2.getActor();

//        Movie movie2 = factory.getBean("movieB",Movie.class);
//        System.out.println("Movie Scripted...");
//        movie1.getActor();
//        movie2.getActor();
//        System.out.println(movie1==movie2);
    }
}
