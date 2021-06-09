package request.create.estructura;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
@AllArgsConstructor
public class Buyer {
	private String documentType;
    private String surname;
    private String document;
    private String name;
    private String mobile;
    private String email;
}
