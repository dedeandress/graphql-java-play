package resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import models.Borrower;
import repositories.BorrowerRepository;

public class Mutation implements GraphQLMutationResolver {
    private BorrowerRepository borrowerRepository = new BorrowerRepository();
    public Mutation(){}

    public Borrower createBorrower(String name, String email) {
        borrowerRepository.addUser(name, email);
        return borrowerRepository.getBorrrowerbyName(name);
    }

    public Borrower deleteBorrower(String name){
        return borrowerRepository.deleteBorrower(name);
    }

    public Borrower updateBorrower(String nameNow, String updateName, String email) {
        return borrowerRepository.updateBorrower(nameNow, updateName, email);
    }
}
