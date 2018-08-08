package com.longines.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbCollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbCollectionExample() {
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

        public Criteria andGIdIsNull() {
            addCriterion("g_id is null");
            return (Criteria) this;
        }

        public Criteria andGIdIsNotNull() {
            addCriterion("g_id is not null");
            return (Criteria) this;
        }

        public Criteria andGIdEqualTo(Integer value) {
            addCriterion("g_id =", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotEqualTo(Integer value) {
            addCriterion("g_id <>", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThan(Integer value) {
            addCriterion("g_id >", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("g_id >=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThan(Integer value) {
            addCriterion("g_id <", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThanOrEqualTo(Integer value) {
            addCriterion("g_id <=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdIn(List<Integer> values) {
            addCriterion("g_id in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotIn(List<Integer> values) {
            addCriterion("g_id not in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdBetween(Integer value1, Integer value2) {
            addCriterion("g_id between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotBetween(Integer value1, Integer value2) {
            addCriterion("g_id not between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andCollTimeIsNull() {
            addCriterion("coll_time is null");
            return (Criteria) this;
        }

        public Criteria andCollTimeIsNotNull() {
            addCriterion("coll_time is not null");
            return (Criteria) this;
        }

        public Criteria andCollTimeEqualTo(Date value) {
            addCriterion("coll_time =", value, "collTime");
            return (Criteria) this;
        }

        public Criteria andCollTimeNotEqualTo(Date value) {
            addCriterion("coll_time <>", value, "collTime");
            return (Criteria) this;
        }

        public Criteria andCollTimeGreaterThan(Date value) {
            addCriterion("coll_time >", value, "collTime");
            return (Criteria) this;
        }

        public Criteria andCollTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("coll_time >=", value, "collTime");
            return (Criteria) this;
        }

        public Criteria andCollTimeLessThan(Date value) {
            addCriterion("coll_time <", value, "collTime");
            return (Criteria) this;
        }

        public Criteria andCollTimeLessThanOrEqualTo(Date value) {
            addCriterion("coll_time <=", value, "collTime");
            return (Criteria) this;
        }

        public Criteria andCollTimeIn(List<Date> values) {
            addCriterion("coll_time in", values, "collTime");
            return (Criteria) this;
        }

        public Criteria andCollTimeNotIn(List<Date> values) {
            addCriterion("coll_time not in", values, "collTime");
            return (Criteria) this;
        }

        public Criteria andCollTimeBetween(Date value1, Date value2) {
            addCriterion("coll_time between", value1, value2, "collTime");
            return (Criteria) this;
        }

        public Criteria andCollTimeNotBetween(Date value1, Date value2) {
            addCriterion("coll_time not between", value1, value2, "collTime");
            return (Criteria) this;
        }

        public Criteria andCPriceIsNull() {
            addCriterion("c_price is null");
            return (Criteria) this;
        }

        public Criteria andCPriceIsNotNull() {
            addCriterion("c_price is not null");
            return (Criteria) this;
        }

        public Criteria andCPriceEqualTo(Long value) {
            addCriterion("c_price =", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceNotEqualTo(Long value) {
            addCriterion("c_price <>", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceGreaterThan(Long value) {
            addCriterion("c_price >", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("c_price >=", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceLessThan(Long value) {
            addCriterion("c_price <", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceLessThanOrEqualTo(Long value) {
            addCriterion("c_price <=", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceIn(List<Long> values) {
            addCriterion("c_price in", values, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceNotIn(List<Long> values) {
            addCriterion("c_price not in", values, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceBetween(Long value1, Long value2) {
            addCriterion("c_price between", value1, value2, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceNotBetween(Long value1, Long value2) {
            addCriterion("c_price not between", value1, value2, "cPrice");
            return (Criteria) this;
        }

        public Criteria andPurIsNull() {
            addCriterion("pur is null");
            return (Criteria) this;
        }

        public Criteria andPurIsNotNull() {
            addCriterion("pur is not null");
            return (Criteria) this;
        }

        public Criteria andPurEqualTo(Integer value) {
            addCriterion("pur =", value, "pur");
            return (Criteria) this;
        }

        public Criteria andPurNotEqualTo(Integer value) {
            addCriterion("pur <>", value, "pur");
            return (Criteria) this;
        }

        public Criteria andPurGreaterThan(Integer value) {
            addCriterion("pur >", value, "pur");
            return (Criteria) this;
        }

        public Criteria andPurGreaterThanOrEqualTo(Integer value) {
            addCriterion("pur >=", value, "pur");
            return (Criteria) this;
        }

        public Criteria andPurLessThan(Integer value) {
            addCriterion("pur <", value, "pur");
            return (Criteria) this;
        }

        public Criteria andPurLessThanOrEqualTo(Integer value) {
            addCriterion("pur <=", value, "pur");
            return (Criteria) this;
        }

        public Criteria andPurIn(List<Integer> values) {
            addCriterion("pur in", values, "pur");
            return (Criteria) this;
        }

        public Criteria andPurNotIn(List<Integer> values) {
            addCriterion("pur not in", values, "pur");
            return (Criteria) this;
        }

        public Criteria andPurBetween(Integer value1, Integer value2) {
            addCriterion("pur between", value1, value2, "pur");
            return (Criteria) this;
        }

        public Criteria andPurNotBetween(Integer value1, Integer value2) {
            addCriterion("pur not between", value1, value2, "pur");
            return (Criteria) this;
        }

        public Criteria andInvalidIsNull() {
            addCriterion("invalid is null");
            return (Criteria) this;
        }

        public Criteria andInvalidIsNotNull() {
            addCriterion("invalid is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidEqualTo(Integer value) {
            addCriterion("invalid =", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidNotEqualTo(Integer value) {
            addCriterion("invalid <>", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidGreaterThan(Integer value) {
            addCriterion("invalid >", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidGreaterThanOrEqualTo(Integer value) {
            addCriterion("invalid >=", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidLessThan(Integer value) {
            addCriterion("invalid <", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidLessThanOrEqualTo(Integer value) {
            addCriterion("invalid <=", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidIn(List<Integer> values) {
            addCriterion("invalid in", values, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidNotIn(List<Integer> values) {
            addCriterion("invalid not in", values, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidBetween(Integer value1, Integer value2) {
            addCriterion("invalid between", value1, value2, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidNotBetween(Integer value1, Integer value2) {
            addCriterion("invalid not between", value1, value2, "invalid");
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