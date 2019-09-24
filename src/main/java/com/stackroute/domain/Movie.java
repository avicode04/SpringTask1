package com.stackroute.domain;

public class Movie {
    private Actor actor1;
    private Actor actor2;
    private Actor actor3;

    public Movie(Actor actor1, Actor actor2, Actor actor3) {
        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actor3 = actor3;
    }

    public void getActor(){
        actor1.display();actor2.display();actor3.display();
    }
}
