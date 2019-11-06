package com.offcn.Mapper;

import com.offcn.POJO.MUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MUserMapper {

    List<MUser> getUserList();
}
