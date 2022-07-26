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
		groupList.add("IT");  
		RolesList.add("Software Developer");
		p.setUsername("Admin");
		p.setFirstName("Preeti");
		p.setLastName("Vishnoi");
		p.setEmail("preeti@gmail.com");
		p.setBirthday("1");
		p.setGender("female");
		p.setGroups(groupList);
		p.setRoles(RolesList);

		return p;
	}



}
