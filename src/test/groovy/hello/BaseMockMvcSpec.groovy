package hello

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc
import spock.lang.Specification

public class BaseMockMvcSpec extends Specification {

    def setup() {
        RestAssuredMockMvc.standaloneSetup(new GreetingController())
    }

    void isProperCorrelationId(Integer correlationId) {
        assert correlationId == 123456
    }
}