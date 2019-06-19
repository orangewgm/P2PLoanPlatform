package com.scut.p2ploanplatform.entity;

import lombok.Data;

/**
 * @author: Light
 * @date: 2019/6/17 10:59
 * @description:
 */

@Data
public class CreditInfo {

    /**
     * 用户Id
     */
    private String userId;

    /**
     * 收入（单位:人民币）
     */
    private Double income;

    /**
     * 家庭收入 （单位:人民币）
     */
    private Double familyIncome;

    /**
     *资产 （单位:人民币）
     */
    private Double assets;

    /**
     * 家庭成员人数
     */
    private Integer familyNumber;

    /**
     * 负载 （单位:人民币）
     */
    private Double debt;

    /**
     * 信用分数
     */
    private Integer creditScore;

    /**
     *
     * @return true完整;false不完整
     */
    public boolean isComplete() {
        return  (userId != null && income != null && familyIncome != null && assets != null && familyNumber != null && debt != null && creditScore != null);
    }
}
