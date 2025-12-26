package com.surest.membermanagementassignment.util;


import com.surest.membermanagementassignment.dto.MemberDTO;
import com.surest.membermanagementassignment.entity.Member;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface MemberMapper {

    MemberMapper  INSTANCE = Mappers.getMapper(MemberMapper.class);
    MemberDTO toMemberDTO(Member member);
    Member toMemberEntity(MemberDTO memberDTO);
}