package com.huang.sbp03.mapper;

import com.huang.sbp03.pojo.Message;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MessageMapper {
    int addMessage(Message message);
    List<Message> selectMessage();
}
