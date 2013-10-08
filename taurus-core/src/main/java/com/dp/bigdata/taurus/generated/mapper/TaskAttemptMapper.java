package com.dp.bigdata.taurus.generated.mapper;

import com.dp.bigdata.taurus.generated.module.TaskAttempt;
import com.dp.bigdata.taurus.generated.module.TaskAttemptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskAttemptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int countByExample(TaskAttemptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int deleteByExample(TaskAttemptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int deleteByPrimaryKey(String attemptid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int insert(TaskAttempt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int insertSelective(TaskAttempt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    List<TaskAttempt> selectByExample(TaskAttemptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    TaskAttempt selectByPrimaryKey(String attemptid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int updateByExampleSelective(@Param("record") TaskAttempt record, @Param("example") TaskAttemptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int updateByExample(@Param("record") TaskAttempt record, @Param("example") TaskAttemptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int updateByPrimaryKeySelective(TaskAttempt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int updateByPrimaryKey(TaskAttempt record);
}