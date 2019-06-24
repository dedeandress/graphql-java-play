package repositories;

import models.Borrower;

import java.util.ArrayList;
import java.util.List;

public class BorrowerRepository {
    //test code
    public BorrowerRepository(){}

//    public List<Borrower> getBorrower (){
//
//        List<Borrower> borrowers = new ArrayList<>();
//
//        borrowers.add(new Borrower("dede","dede.andres@dana.id"));
//        return borrowers;
//    }

    public void addUser(String name, String email){
        Borrower borrower = new Borrower(name, email);
        borrower.save();
    }

    public List<Borrower> getBorrowers() {
        List<Borrower> borrowers = Borrower.find.all();
        return borrowers;
    }

    public Borrower getBorrrowerbyId(int id) {
        Borrower borrower = Borrower.find.byId(id);
        return borrower;
    }

    public Borrower getBorrrowerbyName(String name) {
        Borrower borrower = Borrower.find.query().where().icontains("name", name).findOne();
        return borrower;
    }

    public Borrower deleteBorrower(String name) {
        Borrower borrower = getBorrrowerbyName(name);
        borrower.delete();
        return borrower;
    }

    public Borrower updateBorrower(String nameNow ,String updateName, String email) {
        int borrower = Borrower.find.query().where().icontains("name", nameNow).asUpdate().set("name", updateName).set("email", email).update();
        return getBorrrowerbyName(nameNow);
    }

}
