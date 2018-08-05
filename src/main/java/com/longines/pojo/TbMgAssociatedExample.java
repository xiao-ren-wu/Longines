package com.longines.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbMgAssociatedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbMgAssociatedExample() {
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

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_id not between", value1, value2, "mId");
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

        public Criteria andInvIsNull() {
            addCriterion("inv is null");
            return (Criteria) this;
        }

        public Criteria andInvIsNotNull() {
            addCriterion("inv is not null");
            return (Criteria) this;
        }

        public Criteria andInvEqualTo(Integer value) {
            addCriterion("inv =", value, "inv");
            return (Criteria) this;
        }

        public Criteria andInvNotEqualTo(Integer value) {
            addCriterion("inv <>", value, "inv");
            return (Criteria) this;
        }

        public Criteria andInvGreaterThan(Integer value) {
            addCriterion("inv >", value, "inv");
            return (Criteria) this;
        }

        public Criteria andInvGreaterThanOrEqualTo(Integer value) {
            addCriterion("inv >=", value, "inv");
            return (Criteria) this;
        }

        public Criteria andInvLessThan(Integer value) {
            addCriterion("inv <", value, "inv");
            return (Criteria) this;
        }

        public Criteria andInvLessThanOrEqualTo(Integer value) {
            addCriterion("inv <=", value, "inv");
            return (Criteria) this;
        }

        public Criteria andInvIn(List<Integer> values) {
            addCriterion("inv in", values, "inv");
            return (Criteria) this;
        }

        public Criteria andInvNotIn(List<Integer> values) {
            addCriterion("inv not in", values, "inv");
            return (Criteria) this;
        }

        public Criteria andInvBetween(Integer value1, Integer value2) {
            addCriterion("inv between", value1, value2, "inv");
            return (Criteria) this;
        }

        public Criteria andInvNotBetween(Integer value1, Integer value2) {
            addCriterion("inv not between", value1, value2, "inv");
            return (Criteria) this;
        }

        public Criteria andSTimeIsNull() {
            addCriterion("s_time is null");
            return (Criteria) this;
        }

        public Criteria andSTimeIsNotNull() {
            addCriterion("s_time is not null");
            return (Criteria) this;
        }

        public Criteria andSTimeEqualTo(Date value) {
            addCriterion("s_time =", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotEqualTo(Date value) {
            addCriterion("s_time <>", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeGreaterThan(Date value) {
            addCriterion("s_time >", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("s_time >=", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeLessThan(Date value) {
            addCriterion("s_time <", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeLessThanOrEqualTo(Date value) {
            addCriterion("s_time <=", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeIn(List<Date> values) {
            addCriterion("s_time in", values, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotIn(List<Date> values) {
            addCriterion("s_time not in", values, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeBetween(Date value1, Date value2) {
            addCriterion("s_time between", value1, value2, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotBetween(Date value1, Date value2) {
            addCriterion("s_time not between", value1, value2, "sTime");
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