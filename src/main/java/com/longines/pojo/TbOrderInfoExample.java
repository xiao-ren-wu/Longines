package com.longines.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOrderInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOIdIsNull() {
            addCriterion("o_id is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("o_id is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(Integer value) {
            addCriterion("o_id =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(Integer value) {
            addCriterion("o_id <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(Integer value) {
            addCriterion("o_id >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_id >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(Integer value) {
            addCriterion("o_id <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(Integer value) {
            addCriterion("o_id <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<Integer> values) {
            addCriterion("o_id in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<Integer> values) {
            addCriterion("o_id not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(Integer value1, Integer value2) {
            addCriterion("o_id between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(Integer value1, Integer value2) {
            addCriterion("o_id not between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andCreDateIsNull() {
            addCriterion("cre_date is null");
            return (Criteria) this;
        }

        public Criteria andCreDateIsNotNull() {
            addCriterion("cre_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreDateEqualTo(Date value) {
            addCriterion("cre_date =", value, "creDate");
            return (Criteria) this;
        }

        public Criteria andCreDateNotEqualTo(Date value) {
            addCriterion("cre_date <>", value, "creDate");
            return (Criteria) this;
        }

        public Criteria andCreDateGreaterThan(Date value) {
            addCriterion("cre_date >", value, "creDate");
            return (Criteria) this;
        }

        public Criteria andCreDateGreaterThanOrEqualTo(Date value) {
            addCriterion("cre_date >=", value, "creDate");
            return (Criteria) this;
        }

        public Criteria andCreDateLessThan(Date value) {
            addCriterion("cre_date <", value, "creDate");
            return (Criteria) this;
        }

        public Criteria andCreDateLessThanOrEqualTo(Date value) {
            addCriterion("cre_date <=", value, "creDate");
            return (Criteria) this;
        }

        public Criteria andCreDateIn(List<Date> values) {
            addCriterion("cre_date in", values, "creDate");
            return (Criteria) this;
        }

        public Criteria andCreDateNotIn(List<Date> values) {
            addCriterion("cre_date not in", values, "creDate");
            return (Criteria) this;
        }

        public Criteria andCreDateBetween(Date value1, Date value2) {
            addCriterion("cre_date between", value1, value2, "creDate");
            return (Criteria) this;
        }

        public Criteria andCreDateNotBetween(Date value1, Date value2) {
            addCriterion("cre_date not between", value1, value2, "creDate");
            return (Criteria) this;
        }

        public Criteria andDelDateIsNull() {
            addCriterion("del_date is null");
            return (Criteria) this;
        }

        public Criteria andDelDateIsNotNull() {
            addCriterion("del_date is not null");
            return (Criteria) this;
        }

        public Criteria andDelDateEqualTo(Date value) {
            addCriterion("del_date =", value, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateNotEqualTo(Date value) {
            addCriterion("del_date <>", value, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateGreaterThan(Date value) {
            addCriterion("del_date >", value, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateGreaterThanOrEqualTo(Date value) {
            addCriterion("del_date >=", value, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateLessThan(Date value) {
            addCriterion("del_date <", value, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateLessThanOrEqualTo(Date value) {
            addCriterion("del_date <=", value, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateIn(List<Date> values) {
            addCriterion("del_date in", values, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateNotIn(List<Date> values) {
            addCriterion("del_date not in", values, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateBetween(Date value1, Date value2) {
            addCriterion("del_date between", value1, value2, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateNotBetween(Date value1, Date value2) {
            addCriterion("del_date not between", value1, value2, "delDate");
            return (Criteria) this;
        }

        public Criteria andTbDateIsNull() {
            addCriterion("tb_date is null");
            return (Criteria) this;
        }

        public Criteria andTbDateIsNotNull() {
            addCriterion("tb_date is not null");
            return (Criteria) this;
        }

        public Criteria andTbDateEqualTo(Date value) {
            addCriterion("tb_date =", value, "tbDate");
            return (Criteria) this;
        }

        public Criteria andTbDateNotEqualTo(Date value) {
            addCriterion("tb_date <>", value, "tbDate");
            return (Criteria) this;
        }

        public Criteria andTbDateGreaterThan(Date value) {
            addCriterion("tb_date >", value, "tbDate");
            return (Criteria) this;
        }

        public Criteria andTbDateGreaterThanOrEqualTo(Date value) {
            addCriterion("tb_date >=", value, "tbDate");
            return (Criteria) this;
        }

        public Criteria andTbDateLessThan(Date value) {
            addCriterion("tb_date <", value, "tbDate");
            return (Criteria) this;
        }

        public Criteria andTbDateLessThanOrEqualTo(Date value) {
            addCriterion("tb_date <=", value, "tbDate");
            return (Criteria) this;
        }

        public Criteria andTbDateIn(List<Date> values) {
            addCriterion("tb_date in", values, "tbDate");
            return (Criteria) this;
        }

        public Criteria andTbDateNotIn(List<Date> values) {
            addCriterion("tb_date not in", values, "tbDate");
            return (Criteria) this;
        }

        public Criteria andTbDateBetween(Date value1, Date value2) {
            addCriterion("tb_date between", value1, value2, "tbDate");
            return (Criteria) this;
        }

        public Criteria andTbDateNotBetween(Date value1, Date value2) {
            addCriterion("tb_date not between", value1, value2, "tbDate");
            return (Criteria) this;
        }

        public Criteria andAAmountIsNull() {
            addCriterion("a_amount is null");
            return (Criteria) this;
        }

        public Criteria andAAmountIsNotNull() {
            addCriterion("a_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAAmountEqualTo(Long value) {
            addCriterion("a_amount =", value, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountNotEqualTo(Long value) {
            addCriterion("a_amount <>", value, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountGreaterThan(Long value) {
            addCriterion("a_amount >", value, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("a_amount >=", value, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountLessThan(Long value) {
            addCriterion("a_amount <", value, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountLessThanOrEqualTo(Long value) {
            addCriterion("a_amount <=", value, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountIn(List<Long> values) {
            addCriterion("a_amount in", values, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountNotIn(List<Long> values) {
            addCriterion("a_amount not in", values, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountBetween(Long value1, Long value2) {
            addCriterion("a_amount between", value1, value2, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountNotBetween(Long value1, Long value2) {
            addCriterion("a_amount not between", value1, value2, "aAmount");
            return (Criteria) this;
        }

        public Criteria andFreightIsNull() {
            addCriterion("freight is null");
            return (Criteria) this;
        }

        public Criteria andFreightIsNotNull() {
            addCriterion("freight is not null");
            return (Criteria) this;
        }

        public Criteria andFreightEqualTo(Long value) {
            addCriterion("freight =", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotEqualTo(Long value) {
            addCriterion("freight <>", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThan(Long value) {
            addCriterion("freight >", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThanOrEqualTo(Long value) {
            addCriterion("freight >=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThan(Long value) {
            addCriterion("freight <", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThanOrEqualTo(Long value) {
            addCriterion("freight <=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightIn(List<Long> values) {
            addCriterion("freight in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotIn(List<Long> values) {
            addCriterion("freight not in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightBetween(Long value1, Long value2) {
            addCriterion("freight between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotBetween(Long value1, Long value2) {
            addCriterion("freight not between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andSNumIsNull() {
            addCriterion("s_num is null");
            return (Criteria) this;
        }

        public Criteria andSNumIsNotNull() {
            addCriterion("s_num is not null");
            return (Criteria) this;
        }

        public Criteria andSNumEqualTo(Integer value) {
            addCriterion("s_num =", value, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumNotEqualTo(Integer value) {
            addCriterion("s_num <>", value, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumGreaterThan(Integer value) {
            addCriterion("s_num >", value, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_num >=", value, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumLessThan(Integer value) {
            addCriterion("s_num <", value, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumLessThanOrEqualTo(Integer value) {
            addCriterion("s_num <=", value, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumIn(List<Integer> values) {
            addCriterion("s_num in", values, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumNotIn(List<Integer> values) {
            addCriterion("s_num not in", values, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumBetween(Integer value1, Integer value2) {
            addCriterion("s_num between", value1, value2, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumNotBetween(Integer value1, Integer value2) {
            addCriterion("s_num not between", value1, value2, "sNum");
            return (Criteria) this;
        }

        public Criteria andDMethodIsNull() {
            addCriterion("d_method is null");
            return (Criteria) this;
        }

        public Criteria andDMethodIsNotNull() {
            addCriterion("d_method is not null");
            return (Criteria) this;
        }

        public Criteria andDMethodEqualTo(String value) {
            addCriterion("d_method =", value, "dMethod");
            return (Criteria) this;
        }

        public Criteria andDMethodNotEqualTo(String value) {
            addCriterion("d_method <>", value, "dMethod");
            return (Criteria) this;
        }

        public Criteria andDMethodGreaterThan(String value) {
            addCriterion("d_method >", value, "dMethod");
            return (Criteria) this;
        }

        public Criteria andDMethodGreaterThanOrEqualTo(String value) {
            addCriterion("d_method >=", value, "dMethod");
            return (Criteria) this;
        }

        public Criteria andDMethodLessThan(String value) {
            addCriterion("d_method <", value, "dMethod");
            return (Criteria) this;
        }

        public Criteria andDMethodLessThanOrEqualTo(String value) {
            addCriterion("d_method <=", value, "dMethod");
            return (Criteria) this;
        }

        public Criteria andDMethodLike(String value) {
            addCriterion("d_method like", value, "dMethod");
            return (Criteria) this;
        }

        public Criteria andDMethodNotLike(String value) {
            addCriterion("d_method not like", value, "dMethod");
            return (Criteria) this;
        }

        public Criteria andDMethodIn(List<String> values) {
            addCriterion("d_method in", values, "dMethod");
            return (Criteria) this;
        }

        public Criteria andDMethodNotIn(List<String> values) {
            addCriterion("d_method not in", values, "dMethod");
            return (Criteria) this;
        }

        public Criteria andDMethodBetween(String value1, String value2) {
            addCriterion("d_method between", value1, value2, "dMethod");
            return (Criteria) this;
        }

        public Criteria andDMethodNotBetween(String value1, String value2) {
            addCriterion("d_method not between", value1, value2, "dMethod");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}