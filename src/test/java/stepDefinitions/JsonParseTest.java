package stepDefinitions;


import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import data.Json;
import data.Payload;
import data.RowDetails;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JsonParseTest {
	
	String jsonStr;
	Json json ;
	
	
	@Given("^user has json file$")
    public void user_has_json_file() throws Throwable {
		jsonStr =  Payload.sampleJson();
		
    }

    @When("^user parse json$")
    public void user_parse_json() throws Throwable {
    	ObjectMapper objectMapper = new ObjectMapper();
    	json = objectMapper.readValue(jsonStr, Json.class);	
    }

    @Then("^user retrives all keys from json$")
    public void user_retrives_all_keys_from_json() throws Throwable {
    	List<RowDetails> rowDatails = json.getRows();
    	for (int i = 0 ; i < rowDatails.size() ; i ++) {
    		System.out.println(rowDatails.get(i).getKey());
    	}
    	
    	
    }
}
