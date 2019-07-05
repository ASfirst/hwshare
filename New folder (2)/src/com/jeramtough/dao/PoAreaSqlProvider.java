package com.jeramtough.dao;

import com.jeramtough.bean.PoArea;
import org.apache.ibatis.jdbc.SQL;

public class PoAreaSqlProvider {

    public String insertSelective(PoArea record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("po_area");
        
        if (record.getFdId() != null) {
            sql.VALUES("fd_id", "#{fdId,jdbcType=BIGINT}");
        }
        
        if (record.getCustomerId() != null) {
            sql.VALUES("customer_id", "#{customerId,jdbcType=BIGINT}");
        }
        
        if (record.getAmount() != null) {
            sql.VALUES("amount", "#{amount,jdbcType=DECIMAL}");
        }
        
        if (record.getStartDate() != null) {
            sql.VALUES("start_date", "#{startDate,jdbcType=DATE}");
        }
        
        if (record.getEndDate() != null) {
            sql.VALUES("end_date", "#{endDate,jdbcType=DATE}");
        }
        
        if (record.getCheckedBy() != null) {
            sql.VALUES("checked_by", "#{checkedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getCheckedDate() != null) {
            sql.VALUES("checked_date", "#{checkedDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCheckedRemark() != null) {
            sql.VALUES("checked_remark", "#{checkedRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getCreaterId() != null) {
            sql.VALUES("creater_id", "#{createrId,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastAlterId() != null) {
            sql.VALUES("last_alter_id", "#{lastAlterId,jdbcType=VARCHAR}");
        }
        
        if (record.getLastAlterTime() != null) {
            sql.VALUES("last_alter_time", "#{lastAlterTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(PoArea record) {
        SQL sql = new SQL();
        sql.UPDATE("po_area");
        
        if (record.getCustomerId() != null) {
            sql.SET("customer_id = #{customerId,jdbcType=BIGINT}");
        }
        
        if (record.getAmount() != null) {
            sql.SET("amount = #{amount,jdbcType=DECIMAL}");
        }
        
        if (record.getStartDate() != null) {
            sql.SET("start_date = #{startDate,jdbcType=DATE}");
        }
        
        if (record.getEndDate() != null) {
            sql.SET("end_date = #{endDate,jdbcType=DATE}");
        }
        
        if (record.getCheckedBy() != null) {
            sql.SET("checked_by = #{checkedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getCheckedDate() != null) {
            sql.SET("checked_date = #{checkedDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCheckedRemark() != null) {
            sql.SET("checked_remark = #{checkedRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getCreaterId() != null) {
            sql.SET("creater_id = #{createrId,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastAlterId() != null) {
            sql.SET("last_alter_id = #{lastAlterId,jdbcType=VARCHAR}");
        }
        
        if (record.getLastAlterTime() != null) {
            sql.SET("last_alter_time = #{lastAlterTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("fd_id = #{fdId,jdbcType=BIGINT}");
        
        return sql.toString();
    }
}