package com.huang.sbp03.mapper;

import com.huang.sbp03.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TeacherMapper {
    String teacherLogin(Teacher teacher);
}
