package com.healthcare.menstrualhealth.daos;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.healthcare.menstrualhealth.model.menstrulCycleDetails;
import com.healthcare.menstrualhealth.model.userDetails;

@Mapper
public interface userRepository {
    
    @Insert("INSERT INTO USERS(username, password, age, address) " +
        " VALUES (#{username}, #{password}, #{age}, #{address})")
    public int insertUserDetails(userDetails user_details);

    @Insert("INSERT INTO MENSTRULCYCLE(username, startdate, enddate, numberofpads, flow, cyclelengthindays) " +
        " VALUES (#{username}, #{startDate}, #{endDate},#{numberOfPads},#{flow},#{cycleLengthInDays})")
    public int insertmenstrualCycleDetails(menstrulCycleDetails mCycleDetails);

    @Select("SELECT password FROM USERS WHERE username = #{username}")
    public String findUser(String username);

    @Select("SELECT cycleLengthInDays FROM MENSTRULCYCLE WHERE username = #{username}")
    public List<Integer> getNextCycleDays(String username);

    @Select("SELECT username, startdate, enddate, numberofpads, flow, cyclelengthindays FROM MENSTRULCYCLE WHERE username = #{username}")
    public List<menstrulCycleDetails> getMenstrulCycleDetails(String username);

}
