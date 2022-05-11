package com.example.hw4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="form")

public class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "address")
    private String addr;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zip")
    private String zip;

    @Column(name = "date")
    private String date;

    @Column(name = "students")
    private boolean students;

    @Column(name = "location")
    private boolean location;

    @Column(name = "campus")
    private boolean campus;

    @Column(name = "atmosphere")
    private boolean atmosphere;

    @Column(name = "dorms")
    private boolean dorms;
    
    @Column(name = "sports")
    private boolean sports;


    @Column(name = "interest")
    private String interest;

    @Column(name = "rating")
    private String rating;

    @Column(name = "phone")
    private String phone;

    @Column(name = "comments")
    private String comments;

    public Form(){
        
        
    }


    public Form(String f, String l, String e, 
    String a, String c, String s, String z, 
    boolean stud, boolean loc, boolean camp,
    boolean atmos, boolean dorms, boolean sports,
    String interest, String rating, String p, String comments){
        super();
        this.firstName=f;
        this.lastName=l;
        this.emailId=e;
        this.addr=a;
        this.city=c;
        this.state=s;
        this.zip=z;
        this.students=stud;
        this.location=loc;
        this.campus=camp;
        this.atmosphere=atmos;
        this.dorms=dorms;
        this.sports=sports;
        this.interest=interest;
        this.rating=rating;
        this.phone=p;
        this.comments=comments;
    }

    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String f){
        this.firstName=f;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String l){
        this.lastName = l;
    }
    public String getEmailId(){
        return emailId;
    }
    public void setEmailId(String e){
        this.emailId = e;
    }
    public String getAddr() {
		return addr;
	}
	public void setAddr(String a) {
		this.addr = a;
	}
    public String getCity() {
		return city;
	}
	public void setCity(String c) {
		this.city = c;
	}
    public String getState() {
		return state;
	}
	public void setState(String s) {
		this.state = s;
	}
    public String getZip() {
		return zip;
	}
	public void setZip(String z) {
		this.zip = z;
	}
    public String getDate() {
		return date;
	}
	public void setDate(String d) {
		this.date = d;
	}
    public String getPhone() {
		return phone;
	}
	public void setPhone(String p) {
		this.phone = p;
	}
    public boolean getStudents() {
		return students;
	}
	public void setStudents(boolean stud) {
		this.students = stud;
	}
    public boolean getLocation() {
		return location;
	}
	public void setLocation(boolean loc) {
		this.location = loc;
	}
    public boolean getCampus() {
		return campus;
	}
	public void setCampus(boolean camp) {
		this.campus = camp;
	}
    public boolean getAtmosphere() {
		return atmosphere;
	}
	public void setAtmosphere(boolean atmos) {
		this.atmosphere = atmos;
	}
    public boolean getDorms() {
		return dorms;
	}
	public void setDorms(boolean dorms) {
		this.dorms = dorms;
	}
    public boolean getSports() {
		return sports;
	}
	public void setSports(boolean sports) {
		this.sports = sports;
	}

    public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
    public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
    public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
    
    


}