package ska.springframework.msscbrewery.services;

import org.springframework.stereotype.Service;
import ska.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

@Service
public class  CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Joe Rogan")
                .build();
    }
}
