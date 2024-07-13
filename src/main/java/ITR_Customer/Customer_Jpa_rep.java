package ITR_Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Customer_Jpa_rep extends JpaRepository<CustomerEntity,Long> {
}
