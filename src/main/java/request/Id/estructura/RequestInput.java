package request.Id.estructura;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import request.create.estructura.Auth;

@Data
@NoArgsConstructor 
@AllArgsConstructor
public class RequestInput {
	private Auth auth;
}
