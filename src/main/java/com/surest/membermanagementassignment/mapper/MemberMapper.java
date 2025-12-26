package com.surest.membermanagementassignment.mapper;

import com.surest.membermanagementassignment.dto.MemberResponse;
import com.surest.membermanagementassignment.entity.Member;
import org.springframework.stereotype.Component;

@Component
public class MemberMapper {

    public MemberResponse mapToMemberResponse(Member member) {
        return new MemberResponse(
                member.getId(),
                member.getFirstName(),
                member.getLastName(),
                member.getDateOfBirth(),
                member.getEmail(),
                member.getCreatedAt(),
                member.getUpdatedAt()
        );
    }
}
