package com.xuetang9.house.houselogin.mapper;

import com.xuetang9.house.houselogin.domain.UserType;
import com.xuetang9.house.houselogin.domain.UserTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_type
     *
     * @mbg.generated
     */
    long countByExample(UserTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_type
     *
     * @mbg.generated
     */
    int deleteByExample(UserTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_type
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer utId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_type
     *
     * @mbg.generated
     */
    int insert(UserType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_type
     *
     * @mbg.generated
     */
    int insertSelective(UserType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_type
     *
     * @mbg.generated
     */
    UserType selectOneByExample(UserTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_type
     *
     * @mbg.generated
     */
    UserType selectOneByExampleSelective(@Param("example") UserTypeExample example, @Param("selective") UserType.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_type
     *
     * @mbg.generated
     */
    List<UserType> selectByExampleSelective(@Param("example") UserTypeExample example, @Param("selective") UserType.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_type
     *
     * @mbg.generated
     */
    List<UserType> selectByExample(UserTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_type
     *
     * @mbg.generated
     */
    UserType selectByPrimaryKeySelective(@Param("utId") Integer utId, @Param("selective") UserType.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_type
     *
     * @mbg.generated
     */
    UserType selectByPrimaryKey(Integer utId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_type
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UserType record, @Param("example") UserTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_type
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") UserType record, @Param("example") UserTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserType record);
}