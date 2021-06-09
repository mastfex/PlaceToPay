package request.create.estructura;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
@AllArgsConstructor
public class Auth {
	private String tranKey;
    private String seed;
    private String login;
    private String nonce;
}
