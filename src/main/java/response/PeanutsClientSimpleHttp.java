package response;

import com.fasterxml.jackson.core.type.TypeReference;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import response.PeanutsClient;

import javax.ws.rs.*;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


@Slf4j
public class PeanutsClientSimpleHttp implements PeanutsClient {

	@Override
	public Integer getPeanutsCount() {
				return 2;
	}
    
	@GET
	@Path("/same")
	 public String hello() {
        return "Hello from RESTEasy Reactive";
    }

	@Override
	public Peanut getPeanutById(String id) {
		Peanut p = new Peanut();
		List<String> groupList = new ArrayList<>();
		List<String> RolesList = new ArrayList<>();
		groupList.add("peanuts");
		RolesList.add("child");
		p.setUsername("charlie");
		p.setFirstName("Charlie");
		p.setLastName("Brown");
		p.setEmail("charlie.brown@peanuts.com");
		p.setBirthday("1948-05-30");
		p.setGender("male");
		p.setGroups(groupList);
		p.setRoles(RolesList);

		return p;

	}

	@Override
	public CredentialData getCredentialData(String id) {
		CredentialData p = new CredentialData();
		p.setValue("/bVkHA4G/VOskjaCgNYyTz1BhgD+9X8bxCNEPGGpnDCJbWHDXIW0G8IlSBhDdJsXTjrXt/7yQguBwJ3sxSmSKA==");
		p.setSalt("lZtleWv1DeEcNIr8MTzdeg==");
		p.setAlgorithm("pbkdf2-sha256");
		p.setIterations(27500);
		p.setType("password");

		return p;
	}


}
