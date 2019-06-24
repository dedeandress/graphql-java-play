package resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import models.Borrower;
import repositories.BorrowerRepository;

import java.util.List;

public class Query implements GraphQLQueryResolver {
    //test code
    private final BorrowerRepository borrowerRepository = new BorrowerRepository();

    public Query(){

    }
    public List<Borrower> getBorrower(){
        return borrowerRepository.getBorrowers();
    }
}
