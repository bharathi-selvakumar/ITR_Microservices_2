package ITR_Customer;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CustomerEntity {
    @Id
    private long aadhaarNumber;
    private String name;
    private String panNumber;
    private String emailId;
    private long contact;
    private long bankAccountNumber;
    private int itrNumber;
    transient private List<ITR_Returns_Entity> itrReturns;


}
