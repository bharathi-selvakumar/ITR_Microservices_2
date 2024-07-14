package ITR_Customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Customer")
public class Coustomer_MappingController {
    @Autowired
    Customer_Services services;

    @GetMapping("/get")
    public List<CustomerEntity> read() {
        return services.get();
    }

    @GetMapping("/getCustomer/{id}")
    public CustomerEntity readID(@PathVariable("id") long id){
        return services.getID(id);
    }

    @PostMapping("/post")
    public CustomerEntity post(@RequestBody CustomerEntity data){
        return services.create(data);
    }

    @PutMapping("/put")
    public CustomerEntity update(@RequestBody CustomerEntity data){
        return services.create(data);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("/delete") long id){
            services.delete(id);
            return "The ID " +id+" is deleted";
    }

}
