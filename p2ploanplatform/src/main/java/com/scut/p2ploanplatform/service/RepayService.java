package com.scut.p2ploanplatform.service;

import com.scut.p2ploanplatform.entity.RepayPlan;
import com.scut.p2ploanplatform.enums.RepayPlanStatus;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public interface RepayService {
    /**
     * 添加还款计划
     * @param purchaseId 认购ID
     * @param repayDate 还款日期
     * @param amount 还款金额
     * @throws SQLException SQL错误
     * @throws IllegalArgumentException 参数错误
     * @return 添加成功后返回还款计划
     */
    RepayPlan insertPlan(Integer purchaseId, Date repayDate, BigDecimal amount) throws SQLException, IllegalArgumentException;

    /**
     * 根据认购ID查询所有还款计划信息
     * @param id 还款ID
     * @throws SQLException SQL错误
     * @throws IllegalArgumentException ID为空
     * @return 与该认购ID有关的所有还款信息，无记录时返回空List
     */
    List<RepayPlan> findPlanByPurchaseId(Integer id) throws SQLException, IllegalArgumentException;

    /**
     * 根据计划ID查询该还款计划信息
     * @param id 计划ID
     * @throws SQLException SQL错误
     * @throws IllegalArgumentException ID为空
     * @return 与该计划ID有关的还款信息，无记录时返回null
     */
    RepayPlan findPlanById(String id) throws SQLException, IllegalArgumentException;

    /**
     * 更新还款计划信息（不推荐外部调用）
     * @param id 计划ID
     * @param status 还款计划状态
     * @param realRepayDate 实际还款日期（为null则为未还）
     * @throws SQLException SQL错误
     * @throws IllegalArgumentException 参数错误
     */
    @Deprecated
    void updateRepayPlan(String id, RepayPlanStatus status, Date realRepayDate) throws SQLException, IllegalArgumentException;

    /**
     * 执行还款流程，参考详细设计文档的顺序图（定时触发，不推荐模块外部调用）
     */
    @Deprecated
    void doRepay();

}
