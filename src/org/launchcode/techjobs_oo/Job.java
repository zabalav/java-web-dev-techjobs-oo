package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String jobList = System.lineSeparator() +
            "ID: " + this.getId() + System.lineSeparator() +
            "Name: " + this.getName() + System.lineSeparator() +
            "Employer: " + this.getEmployer() + System.lineSeparator() +
            "Location: " + this.getLocation() + System.lineSeparator() +
            "Position Type: " + this.getPositionType() + System.lineSeparator() +
            "Core Competency: " + this.getCoreCompetency() +
            System.lineSeparator();
        jobList = jobList.replace("null","Data not available");
        return jobList;
    }

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode () {
        return Objects.hash(id);
    }

    public int getId () {
        return id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer (Employer employer){
        this.employer = employer;
    }

    public Location getLocation () {
        return location;
    }

    public void setLocation (Location location){
        this.location = location;
    }

    public PositionType getPositionType () {
        return positionType;
    }

    public void setPositionType (PositionType positionType){
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency () {
        return coreCompetency;
    }

    public void setCoreCompetency (CoreCompetency coreCompetency){
        this.coreCompetency = coreCompetency;
    }
}
