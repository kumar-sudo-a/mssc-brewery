package ska.springframework.msscbrewery.web.contoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ska.springframework.msscbrewery.services.CustomerService;
import ska.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;


/*//with-response-entity
@RestController
@RequestMapping("/api/greet")
public class GreetingController {

    @GetMapping("/with-response-entity")
    public ResponseEntity<String> greetWithResponseEntity() {
        String message = "Hello, using ResponseEntity!";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}

//without-response-entity
@RestController
@RequestMapping("/api/greet")
public class GreetingController {

    @GetMapping("/without-response-entity")
    public String greetWithoutResponseEntity() {
        return "Hello, without ResponseEntity!";
    }
}
*/

@RequestMapping("api/v1/customer")
@RestController
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {

        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId){

        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }
}


