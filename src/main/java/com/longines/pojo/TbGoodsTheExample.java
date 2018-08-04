package com.longines.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbGoodsTheExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbGoodsTheExample() {
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

        public Criteria andTheIdIsNull() {
            addCriterion("the_id is null");
            return (Criteria) this;
        }

        public Criteria andTheIdIsNotNull() {
            addCriterion("the_id is not null");
            return (Criteria) this;
        }

        public Criteria andTheIdEqualTo(Integer value) {
            addCriterion("the_id =", value, "theId");
            return (Criteria) this;
        }

        public Criteria andTheIdNotEqualTo(Integer value) {
            addCriterion("the_id <>", value, "theId");
            return (Criteria) this;
        }

        public Criteria andTheIdGreaterThan(Integer value) {
            addCriterion("the_id >", value, "theId");
            return (Criteria) this;
        }

        public Criteria andTheIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("the_id >=", value, "theId");
            return (Criteria) this;
        }

        public Criteria andTheIdLessThan(Integer value) {
            addCriterion("the_id <", value, "theId");
            return (Criteria) this;
        }

        public Criteria andTheIdLessThanOrEqualTo(Integer value) {
            addCriterion("the_id <=", value, "theId");
            return (Criteria) this;
        }

        public Criteria andTheIdIn(List<Integer> values) {
            addCriterion("the_id in", values, "theId");
            return (Criteria) this;
        }

        public Criteria andTheIdNotIn(List<Integer> values) {
            addCriterion("the_id not in", values, "theId");
            return (Criteria) this;
        }

        public Criteria andTheIdBetween(Integer value1, Integer value2) {
            addCriterion("the_id between", value1, value2, "theId");
            return (Criteria) this;
        }

        public Criteria andTheIdNotBetween(Integer value1, Integer value2) {
            addCriterion("the_id not between", value1, value2, "theId");
            return (Criteria) this;
        }

        public Criteria andThePicIsNull() {
            addCriterion("the_pic is null");
            return (Criteria) this;
        }

        public Criteria andThePicIsNotNull() {
            addCriterion("the_pic is not null");
            return (Criteria) this;
        }

        public Criteria andThePicEqualTo(String value) {
            addCriterion("the_pic =", value, "thePic");
            return (Criteria) this;
        }

        public Criteria andThePicNotEqualTo(String value) {
            addCriterion("the_pic <>", value, "thePic");
            return (Criteria) this;
        }

        public Criteria andThePicGreaterThan(String value) {
            addCriterion("the_pic >", value, "thePic");
            return (Criteria) this;
        }

        public Criteria andThePicGreaterThanOrEqualTo(String value) {
            addCriterion("the_pic >=", value, "thePic");
            return (Criteria) this;
        }

        public Criteria andThePicLessThan(String value) {
            addCriterion("the_pic <", value, "thePic");
            return (Criteria) this;
        }

        public Criteria andThePicLessThanOrEqualTo(String value) {
            addCriterion("the_pic <=", value, "thePic");
            return (Criteria) this;
        }

        public Criteria andThePicLike(String value) {
            addCriterion("the_pic like", value, "thePic");
            return (Criteria) this;
        }

        public Criteria andThePicNotLike(String value) {
            addCriterion("the_pic not like", value, "thePic");
            return (Criteria) this;
        }

        public Criteria andThePicIn(List<String> values) {
            addCriterion("the_pic in", values, "thePic");
            return (Criteria) this;
        }

        public Criteria andThePicNotIn(List<String> values) {
            addCriterion("the_pic not in", values, "thePic");
            return (Criteria) this;
        }

        public Criteria andThePicBetween(String value1, String value2) {
            addCriterion("the_pic between", value1, value2, "thePic");
            return (Criteria) this;
        }

        public Criteria andThePicNotBetween(String value1, String value2) {
            addCriterion("the_pic not between", value1, value2, "thePic");
            return (Criteria) this;
        }

        public Criteria andTheDesIsNull() {
            addCriterion("the_des is null");
            return (Criteria) this;
        }

        public Criteria andTheDesIsNotNull() {
            addCriterion("the_des is not null");
            return (Criteria) this;
        }

        public Criteria andTheDesEqualTo(String value) {
            addCriterion("the_des =", value, "theDes");
            return (Criteria) this;
        }

        public Criteria andTheDesNotEqualTo(String value) {
            addCriterion("the_des <>", value, "theDes");
            return (Criteria) this;
        }

        public Criteria andTheDesGreaterThan(String value) {
            addCriterion("the_des >", value, "theDes");
            return (Criteria) this;
        }

        public Criteria andTheDesGreaterThanOrEqualTo(String value) {
            addCriterion("the_des >=", value, "theDes");
            return (Criteria) this;
        }

        public Criteria andTheDesLessThan(String value) {
            addCriterion("the_des <", value, "theDes");
            return (Criteria) this;
        }

        public Criteria andTheDesLessThanOrEqualTo(String value) {
            addCriterion("the_des <=", value, "theDes");
            return (Criteria) this;
        }

        public Criteria andTheDesLike(String value) {
            addCriterion("the_des like", value, "theDes");
            return (Criteria) this;
        }

        public Criteria andTheDesNotLike(String value) {
            addCriterion("the_des not like", value, "theDes");
            return (Criteria) this;
        }

        public Criteria andTheDesIn(List<String> values) {
            addCriterion("the_des in", values, "theDes");
            return (Criteria) this;
        }

        public Criteria andTheDesNotIn(List<String> values) {
            addCriterion("the_des not in", values, "theDes");
            return (Criteria) this;
        }

        public Criteria andTheDesBetween(String value1, String value2) {
            addCriterion("the_des between", value1, value2, "theDes");
            return (Criteria) this;
        }

        public Criteria andTheDesNotBetween(String value1, String value2) {
            addCriterion("the_des not between", value1, value2, "theDes");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
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