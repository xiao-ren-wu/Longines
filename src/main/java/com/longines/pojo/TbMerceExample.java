package com.longines.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbMerceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbMerceExample() {
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

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSCredIsNull() {
            addCriterion("s_cred is null");
            return (Criteria) this;
        }

        public Criteria andSCredIsNotNull() {
            addCriterion("s_cred is not null");
            return (Criteria) this;
        }

        public Criteria andSCredEqualTo(String value) {
            addCriterion("s_cred =", value, "sCred");
            return (Criteria) this;
        }

        public Criteria andSCredNotEqualTo(String value) {
            addCriterion("s_cred <>", value, "sCred");
            return (Criteria) this;
        }

        public Criteria andSCredGreaterThan(String value) {
            addCriterion("s_cred >", value, "sCred");
            return (Criteria) this;
        }

        public Criteria andSCredGreaterThanOrEqualTo(String value) {
            addCriterion("s_cred >=", value, "sCred");
            return (Criteria) this;
        }

        public Criteria andSCredLessThan(String value) {
            addCriterion("s_cred <", value, "sCred");
            return (Criteria) this;
        }

        public Criteria andSCredLessThanOrEqualTo(String value) {
            addCriterion("s_cred <=", value, "sCred");
            return (Criteria) this;
        }

        public Criteria andSCredLike(String value) {
            addCriterion("s_cred like", value, "sCred");
            return (Criteria) this;
        }

        public Criteria andSCredNotLike(String value) {
            addCriterion("s_cred not like", value, "sCred");
            return (Criteria) this;
        }

        public Criteria andSCredIn(List<String> values) {
            addCriterion("s_cred in", values, "sCred");
            return (Criteria) this;
        }

        public Criteria andSCredNotIn(List<String> values) {
            addCriterion("s_cred not in", values, "sCred");
            return (Criteria) this;
        }

        public Criteria andSCredBetween(String value1, String value2) {
            addCriterion("s_cred between", value1, value2, "sCred");
            return (Criteria) this;
        }

        public Criteria andSCredNotBetween(String value1, String value2) {
            addCriterion("s_cred not between", value1, value2, "sCred");
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

        public Criteria andSTimeEqualTo(String value) {
            addCriterion("s_time =", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotEqualTo(String value) {
            addCriterion("s_time <>", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeGreaterThan(String value) {
            addCriterion("s_time >", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeGreaterThanOrEqualTo(String value) {
            addCriterion("s_time >=", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeLessThan(String value) {
            addCriterion("s_time <", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeLessThanOrEqualTo(String value) {
            addCriterion("s_time <=", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeLike(String value) {
            addCriterion("s_time like", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotLike(String value) {
            addCriterion("s_time not like", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeIn(List<String> values) {
            addCriterion("s_time in", values, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotIn(List<String> values) {
            addCriterion("s_time not in", values, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeBetween(String value1, String value2) {
            addCriterion("s_time between", value1, value2, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotBetween(String value1, String value2) {
            addCriterion("s_time not between", value1, value2, "sTime");
            return (Criteria) this;
        }

        public Criteria andHomeIsNull() {
            addCriterion("home is null");
            return (Criteria) this;
        }

        public Criteria andHomeIsNotNull() {
            addCriterion("home is not null");
            return (Criteria) this;
        }

        public Criteria andHomeEqualTo(String value) {
            addCriterion("home =", value, "home");
            return (Criteria) this;
        }

        public Criteria andHomeNotEqualTo(String value) {
            addCriterion("home <>", value, "home");
            return (Criteria) this;
        }

        public Criteria andHomeGreaterThan(String value) {
            addCriterion("home >", value, "home");
            return (Criteria) this;
        }

        public Criteria andHomeGreaterThanOrEqualTo(String value) {
            addCriterion("home >=", value, "home");
            return (Criteria) this;
        }

        public Criteria andHomeLessThan(String value) {
            addCriterion("home <", value, "home");
            return (Criteria) this;
        }

        public Criteria andHomeLessThanOrEqualTo(String value) {
            addCriterion("home <=", value, "home");
            return (Criteria) this;
        }

        public Criteria andHomeLike(String value) {
            addCriterion("home like", value, "home");
            return (Criteria) this;
        }

        public Criteria andHomeNotLike(String value) {
            addCriterion("home not like", value, "home");
            return (Criteria) this;
        }

        public Criteria andHomeIn(List<String> values) {
            addCriterion("home in", values, "home");
            return (Criteria) this;
        }

        public Criteria andHomeNotIn(List<String> values) {
            addCriterion("home not in", values, "home");
            return (Criteria) this;
        }

        public Criteria andHomeBetween(String value1, String value2) {
            addCriterion("home between", value1, value2, "home");
            return (Criteria) this;
        }

        public Criteria andHomeNotBetween(String value1, String value2) {
            addCriterion("home not between", value1, value2, "home");
            return (Criteria) this;
        }

        public Criteria andCIntroIsNull() {
            addCriterion("c_intro is null");
            return (Criteria) this;
        }

        public Criteria andCIntroIsNotNull() {
            addCriterion("c_intro is not null");
            return (Criteria) this;
        }

        public Criteria andCIntroEqualTo(String value) {
            addCriterion("c_intro =", value, "cIntro");
            return (Criteria) this;
        }

        public Criteria andCIntroNotEqualTo(String value) {
            addCriterion("c_intro <>", value, "cIntro");
            return (Criteria) this;
        }

        public Criteria andCIntroGreaterThan(String value) {
            addCriterion("c_intro >", value, "cIntro");
            return (Criteria) this;
        }

        public Criteria andCIntroGreaterThanOrEqualTo(String value) {
            addCriterion("c_intro >=", value, "cIntro");
            return (Criteria) this;
        }

        public Criteria andCIntroLessThan(String value) {
            addCriterion("c_intro <", value, "cIntro");
            return (Criteria) this;
        }

        public Criteria andCIntroLessThanOrEqualTo(String value) {
            addCriterion("c_intro <=", value, "cIntro");
            return (Criteria) this;
        }

        public Criteria andCIntroLike(String value) {
            addCriterion("c_intro like", value, "cIntro");
            return (Criteria) this;
        }

        public Criteria andCIntroNotLike(String value) {
            addCriterion("c_intro not like", value, "cIntro");
            return (Criteria) this;
        }

        public Criteria andCIntroIn(List<String> values) {
            addCriterion("c_intro in", values, "cIntro");
            return (Criteria) this;
        }

        public Criteria andCIntroNotIn(List<String> values) {
            addCriterion("c_intro not in", values, "cIntro");
            return (Criteria) this;
        }

        public Criteria andCIntroBetween(String value1, String value2) {
            addCriterion("c_intro between", value1, value2, "cIntro");
            return (Criteria) this;
        }

        public Criteria andCIntroNotBetween(String value1, String value2) {
            addCriterion("c_intro not between", value1, value2, "cIntro");
            return (Criteria) this;
        }

        public Criteria andMTelIsNull() {
            addCriterion("m_tel is null");
            return (Criteria) this;
        }

        public Criteria andMTelIsNotNull() {
            addCriterion("m_tel is not null");
            return (Criteria) this;
        }

        public Criteria andMTelEqualTo(String value) {
            addCriterion("m_tel =", value, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelNotEqualTo(String value) {
            addCriterion("m_tel <>", value, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelGreaterThan(String value) {
            addCriterion("m_tel >", value, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelGreaterThanOrEqualTo(String value) {
            addCriterion("m_tel >=", value, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelLessThan(String value) {
            addCriterion("m_tel <", value, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelLessThanOrEqualTo(String value) {
            addCriterion("m_tel <=", value, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelLike(String value) {
            addCriterion("m_tel like", value, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelNotLike(String value) {
            addCriterion("m_tel not like", value, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelIn(List<String> values) {
            addCriterion("m_tel in", values, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelNotIn(List<String> values) {
            addCriterion("m_tel not in", values, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelBetween(String value1, String value2) {
            addCriterion("m_tel between", value1, value2, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelNotBetween(String value1, String value2) {
            addCriterion("m_tel not between", value1, value2, "mTel");
            return (Criteria) this;
        }

        public Criteria andSManagerIsNull() {
            addCriterion("s_manager is null");
            return (Criteria) this;
        }

        public Criteria andSManagerIsNotNull() {
            addCriterion("s_manager is not null");
            return (Criteria) this;
        }

        public Criteria andSManagerEqualTo(String value) {
            addCriterion("s_manager =", value, "sManager");
            return (Criteria) this;
        }

        public Criteria andSManagerNotEqualTo(String value) {
            addCriterion("s_manager <>", value, "sManager");
            return (Criteria) this;
        }

        public Criteria andSManagerGreaterThan(String value) {
            addCriterion("s_manager >", value, "sManager");
            return (Criteria) this;
        }

        public Criteria andSManagerGreaterThanOrEqualTo(String value) {
            addCriterion("s_manager >=", value, "sManager");
            return (Criteria) this;
        }

        public Criteria andSManagerLessThan(String value) {
            addCriterion("s_manager <", value, "sManager");
            return (Criteria) this;
        }

        public Criteria andSManagerLessThanOrEqualTo(String value) {
            addCriterion("s_manager <=", value, "sManager");
            return (Criteria) this;
        }

        public Criteria andSManagerLike(String value) {
            addCriterion("s_manager like", value, "sManager");
            return (Criteria) this;
        }

        public Criteria andSManagerNotLike(String value) {
            addCriterion("s_manager not like", value, "sManager");
            return (Criteria) this;
        }

        public Criteria andSManagerIn(List<String> values) {
            addCriterion("s_manager in", values, "sManager");
            return (Criteria) this;
        }

        public Criteria andSManagerNotIn(List<String> values) {
            addCriterion("s_manager not in", values, "sManager");
            return (Criteria) this;
        }

        public Criteria andSManagerBetween(String value1, String value2) {
            addCriterion("s_manager between", value1, value2, "sManager");
            return (Criteria) this;
        }

        public Criteria andSManagerNotBetween(String value1, String value2) {
            addCriterion("s_manager not between", value1, value2, "sManager");
            return (Criteria) this;
        }

        public Criteria andBCardIsNull() {
            addCriterion("b_card is null");
            return (Criteria) this;
        }

        public Criteria andBCardIsNotNull() {
            addCriterion("b_card is not null");
            return (Criteria) this;
        }

        public Criteria andBCardEqualTo(String value) {
            addCriterion("b_card =", value, "bCard");
            return (Criteria) this;
        }

        public Criteria andBCardNotEqualTo(String value) {
            addCriterion("b_card <>", value, "bCard");
            return (Criteria) this;
        }

        public Criteria andBCardGreaterThan(String value) {
            addCriterion("b_card >", value, "bCard");
            return (Criteria) this;
        }

        public Criteria andBCardGreaterThanOrEqualTo(String value) {
            addCriterion("b_card >=", value, "bCard");
            return (Criteria) this;
        }

        public Criteria andBCardLessThan(String value) {
            addCriterion("b_card <", value, "bCard");
            return (Criteria) this;
        }

        public Criteria andBCardLessThanOrEqualTo(String value) {
            addCriterion("b_card <=", value, "bCard");
            return (Criteria) this;
        }

        public Criteria andBCardLike(String value) {
            addCriterion("b_card like", value, "bCard");
            return (Criteria) this;
        }

        public Criteria andBCardNotLike(String value) {
            addCriterion("b_card not like", value, "bCard");
            return (Criteria) this;
        }

        public Criteria andBCardIn(List<String> values) {
            addCriterion("b_card in", values, "bCard");
            return (Criteria) this;
        }

        public Criteria andBCardNotIn(List<String> values) {
            addCriterion("b_card not in", values, "bCard");
            return (Criteria) this;
        }

        public Criteria andBCardBetween(String value1, String value2) {
            addCriterion("b_card between", value1, value2, "bCard");
            return (Criteria) this;
        }

        public Criteria andBCardNotBetween(String value1, String value2) {
            addCriterion("b_card not between", value1, value2, "bCard");
            return (Criteria) this;
        }

        public Criteria andPSerIsNull() {
            addCriterion("p_ser is null");
            return (Criteria) this;
        }

        public Criteria andPSerIsNotNull() {
            addCriterion("p_ser is not null");
            return (Criteria) this;
        }

        public Criteria andPSerEqualTo(String value) {
            addCriterion("p_ser =", value, "pSer");
            return (Criteria) this;
        }

        public Criteria andPSerNotEqualTo(String value) {
            addCriterion("p_ser <>", value, "pSer");
            return (Criteria) this;
        }

        public Criteria andPSerGreaterThan(String value) {
            addCriterion("p_ser >", value, "pSer");
            return (Criteria) this;
        }

        public Criteria andPSerGreaterThanOrEqualTo(String value) {
            addCriterion("p_ser >=", value, "pSer");
            return (Criteria) this;
        }

        public Criteria andPSerLessThan(String value) {
            addCriterion("p_ser <", value, "pSer");
            return (Criteria) this;
        }

        public Criteria andPSerLessThanOrEqualTo(String value) {
            addCriterion("p_ser <=", value, "pSer");
            return (Criteria) this;
        }

        public Criteria andPSerLike(String value) {
            addCriterion("p_ser like", value, "pSer");
            return (Criteria) this;
        }

        public Criteria andPSerNotLike(String value) {
            addCriterion("p_ser not like", value, "pSer");
            return (Criteria) this;
        }

        public Criteria andPSerIn(List<String> values) {
            addCriterion("p_ser in", values, "pSer");
            return (Criteria) this;
        }

        public Criteria andPSerNotIn(List<String> values) {
            addCriterion("p_ser not in", values, "pSer");
            return (Criteria) this;
        }

        public Criteria andPSerBetween(String value1, String value2) {
            addCriterion("p_ser between", value1, value2, "pSer");
            return (Criteria) this;
        }

        public Criteria andPSerNotBetween(String value1, String value2) {
            addCriterion("p_ser not between", value1, value2, "pSer");
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