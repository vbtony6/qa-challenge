package karate;

import com.intuit.karate.junit5.Karate;

class ApiTestRunner {

    @Karate.Test
    Karate testApi() {
        return Karate.run("karate/login").relativeTo(getClass());
    }
}
