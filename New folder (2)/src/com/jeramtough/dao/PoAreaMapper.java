package com.jeramtough.dao;

import com.jeramtough.bean.PoArea;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface PoAreaMapper {
    @Delete({
        "delete from po_area",
        "where fd_id = #{fdId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long fdId);

    @Insert({
        "insert into po_area (fd_id, customer_id, ",
        "amount, start_date, ",
        "end_date, checked_by, ",
        "checked_date, checked_remark, ",
        "remark, status, ",
        "creater_id, create_time, ",
        "last_alter_id, last_alter_time)",
        "values (#{fdId,jdbcType=BIGINT}, #{customerId,jdbcType=BIGINT}, ",
        "#{amount,jdbcType=DECIMAL}, #{startDate,jdbcType=DATE}, ",
        "#{endDate,jdbcType=DATE}, #{checkedBy,jdbcType=VARCHAR}, ",
        "#{checkedDate,jdbcType=TIMESTAMP}, #{checkedRemark,jdbcType=VARCHAR}, ",
        "#{remark,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, ",
        "#{createrId,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{lastAlterId,jdbcType=VARCHAR}, #{lastAlterTime,jdbcType=TIMESTAMP})"
    })
    int insert(PoArea record);

    @InsertProvider(type=PoAreaSqlProvider.class, method="insertSelective")
    int insertSelective(PoArea record);

    @Select({
        "select",
        "fd_id, customer_id, amount, start_date, end_date, checked_by, checked_date, ",
        "checked_remark, remark, status, creater_id, create_time, last_alter_id, last_alter_time",
        "from po_area",
        "where fd_id = #{fdId,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="fd_id", property="fdId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="customer_id", property="customerId", jdbcType=JdbcType.BIGINT),
        @Result(column="amount", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="start_date", property="startDate", jdbcType=JdbcType.DATE),
        @Result(column="end_date", property="endDate", jdbcType=JdbcType.DATE),
        @Result(column="checked_by", property="checkedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="checked_date", property="checkedDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="checked_remark", property="checkedRemark", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="creater_id", property="createrId", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_alter_id", property="lastAlterId", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_alter_time", property="lastAlterTime", jdbcType=JdbcType.TIMESTAMP)
    })
    PoArea selectByPrimaryKey(Long fdId);

    @UpdateProvider(type=PoAreaSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PoArea record);

    @Update({
        "update po_area",
        "set customer_id = #{customerId,jdbcType=BIGINT},",
          "amount = #{amount,jdbcType=DECIMAL},",
          "start_date = #{startDate,jdbcType=DATE},",
          "end_date = #{endDate,jdbcType=DATE},",
          "checked_by = #{checkedBy,jdbcType=VARCHAR},",
          "checked_date = #{checkedDate,jdbcType=TIMESTAMP},",
          "checked_remark = #{checkedRemark,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "creater_id = #{createrId,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "last_alter_id = #{lastAlterId,jdbcType=VARCHAR},",
          "last_alter_time = #{lastAlterTime,jdbcType=TIMESTAMP}",
        "where fd_id = #{fdId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(PoArea record);
}