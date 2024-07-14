package ITR_Customer;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CustomerEntity {
    @Id
    private long aadhaarNumber;
    private int itrNumber;
    private String name;
    private String panNumber;
    private String emailId;
    private long contact;
    private long bankAccountNumber;
    transient private List<ITR_Returns_Entity> itrReturns;
}
