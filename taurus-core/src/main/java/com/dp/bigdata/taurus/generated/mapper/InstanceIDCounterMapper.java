package com.dp.bigdata.taurus.generated.mapper;

import com.dp.bigdata.taurus.generated.module.InstanceIDCounter;
import com.dp.bigdata.taurus.generated.module.InstanceIDCounterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstanceIDCounterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int countByExample(InstanceIDCounterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int deleteByExample(InstanceIDCounterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int deleteByPrimaryKey(String instanceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int insert(InstanceIDCounter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int insertSelective(InstanceIDCounter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    List<InstanceIDCounter> selectByExample(InstanceIDCounterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    InstanceIDCounter selectByPrimaryKey(String instanceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int updateByExampleSelective(@Param("record") InstanceIDCounter record, @Param("example") InstanceIDCounterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int updateByExample(@Param("record") InstanceIDCounter record, @Param("example") InstanceIDCounterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int updateByPrimaryKeySelective(InstanceIDCounter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int updateByPrimaryKey(InstanceIDCounter record);
}