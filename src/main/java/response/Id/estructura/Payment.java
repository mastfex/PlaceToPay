package response.Id.estructura;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
@AllArgsConstructor
public class Payment {
	private String reference;
    private Amount amount;
    private String subscribe;
    private String description;
    private String allowPartial;

}
