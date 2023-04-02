package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID id){
        return CustomerDto.builder().id(UUID.randomUUID()).name("Vaibhav").build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return null;
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
//todo  impl
        log.debug("Updating.....");
    }

    @Override
    public void deleteById(UUID customerId) {

//        todo impl
        log.debug("Deleting....");
    }

}
