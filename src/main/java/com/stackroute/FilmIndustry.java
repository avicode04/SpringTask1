package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class FilmIndustry {
    public static void main(String args[]){
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie =  factory.getBean("movie",Movie.class);
        System.out.println("Movie");
        movie.getActor();
    }
}
