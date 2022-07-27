package response;

import lombok.Data;

import java.util.List;

@Data
public class CredentialData {
	private String value;
	private String salt ;
	private String algorithm;
	private Integer iterations;
	private String type;
}



