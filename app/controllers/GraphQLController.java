package controllers;

import com.coxautodev.graphql.tools.SchemaParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import graphql.ExecutionInput;
import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;

import models.ExceptionErrorMessage;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import repositories.BorrowerRepository;
import resolvers.Mutation;
import resolvers.Query;

public class GraphQLController extends Controller {

    BorrowerRepository borrowerRepository = new BorrowerRepository();
    public Result index() {
        borrowerRepository.addUser("rudi", "secret");
        return ok("OK");
    }

    public Result graphql(Http.Request request){
        JsonNode json = request.body().asJson();

        String query = json.get("query").asText();
        GraphQL graphQL = GraphQL.newGraphQL(buildSchema()).build();

        ExecutionInput executionInput = ExecutionInput.newExecutionInput().query(query).build();
        ExecutionResult result = graphQL.execute(executionInput);
        ObjectNode jsonObject = Json.newObject();
        jsonObject.putPOJO("headers", Json.toJson(new ExceptionErrorMessage("200", "Everything is ok")));
        jsonObject.putPOJO("body", Json.toJson(result.toSpecification()));
        return ok(Json.toJson(jsonObject));
    }

    private static GraphQLSchema buildSchema() {
        return SchemaParser.newParser()
                .file("./schema.graphql")
                .resolvers(new Query(), new Mutation())
                .build()
                .makeExecutableSchema();
    }

}
