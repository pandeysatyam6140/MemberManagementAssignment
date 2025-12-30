package com.surest.membermanagementassignment;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
@SpringBootTest
@ActiveProfiles("test")
@ImportAutoConfiguration(exclude = {
        org.springframework.boot.testcontainers.service.connection.ServiceConnectionAutoConfiguration.class
})
class MemberManagementAssignmentApplicationTests {

    @Test
    void contextLoads() {
    }
}
