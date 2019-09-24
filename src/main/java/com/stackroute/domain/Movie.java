package com.stackroute.domain;

public class Movie {
    private Actor actor;

    public void setActor(Actor actor) {
        System.out.println("Movie Scripted...");
        this.actor = actor;
    }

    public void getActor(){
        actor.display();
    }
}
