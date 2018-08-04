package com.longines.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbPayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPayExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "pId");
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

        public Criteria andPMethodIsNull() {
            addCriterion("p_method is null");
            return (Criteria) this;
        }

        public Criteria andPMethodIsNotNull() {
            addCriterion("p_method is not null");
            return (Criteria) this;
        }

        public Criteria andPMethodEqualTo(String value) {
            addCriterion("p_method =", value, "pMethod");
            return (Criteria) this;
        }

        public Criteria andPMethodNotEqualTo(String value) {
            addCriterion("p_method <>", value, "pMethod");
            return (Criteria) this;
        }

        public Criteria andPMethodGreaterThan(String value) {
            addCriterion("p_method >", value, "pMethod");
            return (Criteria) this;
        }

        public Criteria andPMethodGreaterThanOrEqualTo(String value) {
            addCriterion("p_method >=", value, "pMethod");
            return (Criteria) this;
        }

        public Criteria andPMethodLessThan(String value) {
            addCriterion("p_method <", value, "pMethod");
            return (Criteria) this;
        }

        public Criteria andPMethodLessThanOrEqualTo(String value) {
            addCriterion("p_method <=", value, "pMethod");
            return (Criteria) this;
        }

        public Criteria andPMethodLike(String value) {
            addCriterion("p_method like", value, "pMethod");
            return (Criteria) this;
        }

        public Criteria andPMethodNotLike(String value) {
            addCriterion("p_method not like", value, "pMethod");
            return (Criteria) this;
        }

        public Criteria andPMethodIn(List<String> values) {
            addCriterion("p_method in", values, "pMethod");
            return (Criteria) this;
        }

        public Criteria andPMethodNotIn(List<String> values) {
            addCriterion("p_method not in", values, "pMethod");
            return (Criteria) this;
        }

        public Criteria andPMethodBetween(String value1, String value2) {
            addCriterion("p_method between", value1, value2, "pMethod");
            return (Criteria) this;
        }

        public Criteria andPMethodNotBetween(String value1, String value2) {
            addCriterion("p_method not between", value1, value2, "pMethod");
            return (Criteria) this;
        }

        public Criteria andTNumIsNull() {
            addCriterion("t_num is null");
            return (Criteria) this;
        }

        public Criteria andTNumIsNotNull() {
            addCriterion("t_num is not null");
            return (Criteria) this;
        }

        public Criteria andTNumEqualTo(String value) {
            addCriterion("t_num =", value, "tNum");
            return (Criteria) this;
        }

        public Criteria andTNumNotEqualTo(String value) {
            addCriterion("t_num <>", value, "tNum");
            return (Criteria) this;
        }

        public Criteria andTNumGreaterThan(String value) {
            addCriterion("t_num >", value, "tNum");
            return (Criteria) this;
        }

        public Criteria andTNumGreaterThanOrEqualTo(String value) {
            addCriterion("t_num >=", value, "tNum");
            return (Criteria) this;
        }

        public Criteria andTNumLessThan(String value) {
            addCriterion("t_num <", value, "tNum");
            return (Criteria) this;
        }

        public Criteria andTNumLessThanOrEqualTo(String value) {
            addCriterion("t_num <=", value, "tNum");
            return (Criteria) this;
        }

        public Criteria andTNumLike(String value) {
            addCriterion("t_num like", value, "tNum");
            return (Criteria) this;
        }

        public Criteria andTNumNotLike(String value) {
            addCriterion("t_num not like", value, "tNum");
            return (Criteria) this;
        }

        public Criteria andTNumIn(List<String> values) {
            addCriterion("t_num in", values, "tNum");
            return (Criteria) this;
        }

        public Criteria andTNumNotIn(List<String> values) {
            addCriterion("t_num not in", values, "tNum");
            return (Criteria) this;
        }

        public Criteria andTNumBetween(String value1, String value2) {
            addCriterion("t_num between", value1, value2, "tNum");
            return (Criteria) this;
        }

        public Criteria andTNumNotBetween(String value1, String value2) {
            addCriterion("t_num not between", value1, value2, "tNum");
            return (Criteria) this;
        }

        public Criteria andPmDataIsNull() {
            addCriterion("pm_data is null");
            return (Criteria) this;
        }

        public Criteria andPmDataIsNotNull() {
            addCriterion("pm_data is not null");
            return (Criteria) this;
        }

        public Criteria andPmDataEqualTo(Date value) {
            addCriterion("pm_data =", value, "pmData");
            return (Criteria) this;
        }

        public Criteria andPmDataNotEqualTo(Date value) {
            addCriterion("pm_data <>", value, "pmData");
            return (Criteria) this;
        }

        public Criteria andPmDataGreaterThan(Date value) {
            addCriterion("pm_data >", value, "pmData");
            return (Criteria) this;
        }

        public Criteria andPmDataGreaterThanOrEqualTo(Date value) {
            addCriterion("pm_data >=", value, "pmData");
            return (Criteria) this;
        }

        public Criteria andPmDataLessThan(Date value) {
            addCriterion("pm_data <", value, "pmData");
            return (Criteria) this;
        }

        public Criteria andPmDataLessThanOrEqualTo(Date value) {
            addCriterion("pm_data <=", value, "pmData");
            return (Criteria) this;
        }

        public Criteria andPmDataIn(List<Date> values) {
            addCriterion("pm_data in", values, "pmData");
            return (Criteria) this;
        }

        public Criteria andPmDataNotIn(List<Date> values) {
            addCriterion("pm_data not in", values, "pmData");
            return (Criteria) this;
        }

        public Criteria andPmDataBetween(Date value1, Date value2) {
            addCriterion("pm_data between", value1, value2, "pmData");
            return (Criteria) this;
        }

        public Criteria andPmDataNotBetween(Date value1, Date value2) {
            addCriterion("pm_data not between", value1, value2, "pmData");
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