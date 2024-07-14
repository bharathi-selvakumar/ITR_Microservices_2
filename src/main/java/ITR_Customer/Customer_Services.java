package ITR_Customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Customer_Services {
    @Autowired
    Customer_Jpa_rep jpa;
    @Autowired
    Fieng fieng;

    public List<CustomerEntity> get(){
        return jpa.findAll();
    }

    public CustomerEntity create(CustomerEntity data){
       return jpa.save(data);
    }

    public CustomerEntity getID(long id){
        CustomerEntity new_data= jpa.findById(id).orElse(new CustomerEntity());
        if(new_data!=null){
            new_data.setItrReturns(fieng.get_itr(new_data.getItrNumber()));
        }
        return new_data;
    }

    public void delete(long id){
        jpa.deleteById(id);
    }


}
