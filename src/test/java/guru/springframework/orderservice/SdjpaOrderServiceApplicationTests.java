package guru.springframework.orderservice;

import guru.springframework.orderservice.repositories.OrderHeaderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ActiveProfiles("local")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@SpringBootTest
class SdjpaOrderServiceApplicationTests {

    @Autowired
    OrderHeaderRepository orderHeaderRepository;

    @Test
    void contextLoads() {
        assertThat(orderHeaderRepository).isNotNull();
    }

}
