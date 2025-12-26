package com.surest.membermanagementassignment;

import org.springframework.boot.SpringApplication;

public class TestMemberManagementAssignmentApplication {

    public static void main(String[] args) {
        SpringApplication.from(MemberManagementAssignmentApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
