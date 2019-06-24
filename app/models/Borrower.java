package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Borrower extends Model {

    @Id
    public Integer id;
    public String name;
    public String email;

    public Borrower(){}

    public Borrower(String name, String email){
        this.email=email;
        this.name = name;
    }

//    public long getId() {
//        return id;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }

    public static Finder<Integer, Borrower> find = new Finder<>(Borrower.class);
}
