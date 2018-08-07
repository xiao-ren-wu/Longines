package com.longines.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbGoodsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbGoodsInfoExample() {
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

        public Criteria andGnameIsNull() {
            addCriterion("gname is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("gname is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("gname =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("gname <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("gname >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("gname >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("gname <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("gname <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("gname like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("gname not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("gname in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("gname not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("gname between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("gname not between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andTheIdIsNull() {
            addCriterion("the_id is null");
            return (Criteria) this;
        }

        public Criteria andTheIdIsNotNull() {
            addCriterion("the_id is not null");
            return (Criteria) this;
        }

        public Criteria andTheIdEqualTo(String value) {
            addCriterion("the_id =", value, "theId");
            return (Criteria) this;
        }

        public Criteria andTheIdNotEqualTo(String value) {
            addCriterion("the_id <>", value, "theId");
            return (Criteria) this;
        }

        public Criteria andTheIdGreaterThan(String value) {
            addCriterion("the_id >", value, "theId");
            return (Criteria) this;
        }

        public Criteria andTheIdGreaterThanOrEqualTo(String value) {
            addCriterion("the_id >=", value, "theId");
            return (Criteria) this;
        }

        public Criteria andTheIdLessThan(String value) {
            addCriterion("the_id <", value, "theId");
            return (Criteria) this;
        }

        public Criteria andTheIdLessThanOrEqualTo(String value) {
            addCriterion("the_id <=", value, "theId");
            return (Criteria) this;
        }

        public Criteria andTheIdLike(String value) {
            addCriterion("the_id like", value, "theId");
            return (Criteria) this;
        }

        public Criteria andTheIdNotLike(String value) {
            addCriterion("the_id not like", value, "theId");
            return (Criteria) this;
        }

        public Criteria andTheIdIn(List<String> values) {
            addCriterion("the_id in", values, "theId");
            return (Criteria) this;
        }

        public Criteria andTheIdNotIn(List<String> values) {
            addCriterion("the_id not in", values, "theId");
            return (Criteria) this;
        }

        public Criteria andTheIdBetween(String value1, String value2) {
            addCriterion("the_id between", value1, value2, "theId");
            return (Criteria) this;
        }

        public Criteria andTheIdNotBetween(String value1, String value2) {
            addCriterion("the_id not between", value1, value2, "theId");
            return (Criteria) this;
        }

        public Criteria andMovIsNull() {
            addCriterion("mov is null");
            return (Criteria) this;
        }

        public Criteria andMovIsNotNull() {
            addCriterion("mov is not null");
            return (Criteria) this;
        }

        public Criteria andMovEqualTo(String value) {
            addCriterion("mov =", value, "mov");
            return (Criteria) this;
        }

        public Criteria andMovNotEqualTo(String value) {
            addCriterion("mov <>", value, "mov");
            return (Criteria) this;
        }

        public Criteria andMovGreaterThan(String value) {
            addCriterion("mov >", value, "mov");
            return (Criteria) this;
        }

        public Criteria andMovGreaterThanOrEqualTo(String value) {
            addCriterion("mov >=", value, "mov");
            return (Criteria) this;
        }

        public Criteria andMovLessThan(String value) {
            addCriterion("mov <", value, "mov");
            return (Criteria) this;
        }

        public Criteria andMovLessThanOrEqualTo(String value) {
            addCriterion("mov <=", value, "mov");
            return (Criteria) this;
        }

        public Criteria andMovLike(String value) {
            addCriterion("mov like", value, "mov");
            return (Criteria) this;
        }

        public Criteria andMovNotLike(String value) {
            addCriterion("mov not like", value, "mov");
            return (Criteria) this;
        }

        public Criteria andMovIn(List<String> values) {
            addCriterion("mov in", values, "mov");
            return (Criteria) this;
        }

        public Criteria andMovNotIn(List<String> values) {
            addCriterion("mov not in", values, "mov");
            return (Criteria) this;
        }

        public Criteria andMovBetween(String value1, String value2) {
            addCriterion("mov between", value1, value2, "mov");
            return (Criteria) this;
        }

        public Criteria andMovNotBetween(String value1, String value2) {
            addCriterion("mov not between", value1, value2, "mov");
            return (Criteria) this;
        }

        public Criteria andFuncIsNull() {
            addCriterion("func is null");
            return (Criteria) this;
        }

        public Criteria andFuncIsNotNull() {
            addCriterion("func is not null");
            return (Criteria) this;
        }

        public Criteria andFuncEqualTo(String value) {
            addCriterion("func =", value, "func");
            return (Criteria) this;
        }

        public Criteria andFuncNotEqualTo(String value) {
            addCriterion("func <>", value, "func");
            return (Criteria) this;
        }

        public Criteria andFuncGreaterThan(String value) {
            addCriterion("func >", value, "func");
            return (Criteria) this;
        }

        public Criteria andFuncGreaterThanOrEqualTo(String value) {
            addCriterion("func >=", value, "func");
            return (Criteria) this;
        }

        public Criteria andFuncLessThan(String value) {
            addCriterion("func <", value, "func");
            return (Criteria) this;
        }

        public Criteria andFuncLessThanOrEqualTo(String value) {
            addCriterion("func <=", value, "func");
            return (Criteria) this;
        }

        public Criteria andFuncLike(String value) {
            addCriterion("func like", value, "func");
            return (Criteria) this;
        }

        public Criteria andFuncNotLike(String value) {
            addCriterion("func not like", value, "func");
            return (Criteria) this;
        }

        public Criteria andFuncIn(List<String> values) {
            addCriterion("func in", values, "func");
            return (Criteria) this;
        }

        public Criteria andFuncNotIn(List<String> values) {
            addCriterion("func not in", values, "func");
            return (Criteria) this;
        }

        public Criteria andFuncBetween(String value1, String value2) {
            addCriterion("func between", value1, value2, "func");
            return (Criteria) this;
        }

        public Criteria andFuncNotBetween(String value1, String value2) {
            addCriterion("func not between", value1, value2, "func");
            return (Criteria) this;
        }

        public Criteria andAPeoIsNull() {
            addCriterion("a_peo is null");
            return (Criteria) this;
        }

        public Criteria andAPeoIsNotNull() {
            addCriterion("a_peo is not null");
            return (Criteria) this;
        }

        public Criteria andAPeoEqualTo(String value) {
            addCriterion("a_peo =", value, "aPeo");
            return (Criteria) this;
        }

        public Criteria andAPeoNotEqualTo(String value) {
            addCriterion("a_peo <>", value, "aPeo");
            return (Criteria) this;
        }

        public Criteria andAPeoGreaterThan(String value) {
            addCriterion("a_peo >", value, "aPeo");
            return (Criteria) this;
        }

        public Criteria andAPeoGreaterThanOrEqualTo(String value) {
            addCriterion("a_peo >=", value, "aPeo");
            return (Criteria) this;
        }

        public Criteria andAPeoLessThan(String value) {
            addCriterion("a_peo <", value, "aPeo");
            return (Criteria) this;
        }

        public Criteria andAPeoLessThanOrEqualTo(String value) {
            addCriterion("a_peo <=", value, "aPeo");
            return (Criteria) this;
        }

        public Criteria andAPeoLike(String value) {
            addCriterion("a_peo like", value, "aPeo");
            return (Criteria) this;
        }

        public Criteria andAPeoNotLike(String value) {
            addCriterion("a_peo not like", value, "aPeo");
            return (Criteria) this;
        }

        public Criteria andAPeoIn(List<String> values) {
            addCriterion("a_peo in", values, "aPeo");
            return (Criteria) this;
        }

        public Criteria andAPeoNotIn(List<String> values) {
            addCriterion("a_peo not in", values, "aPeo");
            return (Criteria) this;
        }

        public Criteria andAPeoBetween(String value1, String value2) {
            addCriterion("a_peo between", value1, value2, "aPeo");
            return (Criteria) this;
        }

        public Criteria andAPeoNotBetween(String value1, String value2) {
            addCriterion("a_peo not between", value1, value2, "aPeo");
            return (Criteria) this;
        }

        public Criteria andDialIsNull() {
            addCriterion("dial is null");
            return (Criteria) this;
        }

        public Criteria andDialIsNotNull() {
            addCriterion("dial is not null");
            return (Criteria) this;
        }

        public Criteria andDialEqualTo(String value) {
            addCriterion("dial =", value, "dial");
            return (Criteria) this;
        }

        public Criteria andDialNotEqualTo(String value) {
            addCriterion("dial <>", value, "dial");
            return (Criteria) this;
        }

        public Criteria andDialGreaterThan(String value) {
            addCriterion("dial >", value, "dial");
            return (Criteria) this;
        }

        public Criteria andDialGreaterThanOrEqualTo(String value) {
            addCriterion("dial >=", value, "dial");
            return (Criteria) this;
        }

        public Criteria andDialLessThan(String value) {
            addCriterion("dial <", value, "dial");
            return (Criteria) this;
        }

        public Criteria andDialLessThanOrEqualTo(String value) {
            addCriterion("dial <=", value, "dial");
            return (Criteria) this;
        }

        public Criteria andDialLike(String value) {
            addCriterion("dial like", value, "dial");
            return (Criteria) this;
        }

        public Criteria andDialNotLike(String value) {
            addCriterion("dial not like", value, "dial");
            return (Criteria) this;
        }

        public Criteria andDialIn(List<String> values) {
            addCriterion("dial in", values, "dial");
            return (Criteria) this;
        }

        public Criteria andDialNotIn(List<String> values) {
            addCriterion("dial not in", values, "dial");
            return (Criteria) this;
        }

        public Criteria andDialBetween(String value1, String value2) {
            addCriterion("dial between", value1, value2, "dial");
            return (Criteria) this;
        }

        public Criteria andDialNotBetween(String value1, String value2) {
            addCriterion("dial not between", value1, value2, "dial");
            return (Criteria) this;
        }

        public Criteria andStrapIsNull() {
            addCriterion("strap is null");
            return (Criteria) this;
        }

        public Criteria andStrapIsNotNull() {
            addCriterion("strap is not null");
            return (Criteria) this;
        }

        public Criteria andStrapEqualTo(String value) {
            addCriterion("strap =", value, "strap");
            return (Criteria) this;
        }

        public Criteria andStrapNotEqualTo(String value) {
            addCriterion("strap <>", value, "strap");
            return (Criteria) this;
        }

        public Criteria andStrapGreaterThan(String value) {
            addCriterion("strap >", value, "strap");
            return (Criteria) this;
        }

        public Criteria andStrapGreaterThanOrEqualTo(String value) {
            addCriterion("strap >=", value, "strap");
            return (Criteria) this;
        }

        public Criteria andStrapLessThan(String value) {
            addCriterion("strap <", value, "strap");
            return (Criteria) this;
        }

        public Criteria andStrapLessThanOrEqualTo(String value) {
            addCriterion("strap <=", value, "strap");
            return (Criteria) this;
        }

        public Criteria andStrapLike(String value) {
            addCriterion("strap like", value, "strap");
            return (Criteria) this;
        }

        public Criteria andStrapNotLike(String value) {
            addCriterion("strap not like", value, "strap");
            return (Criteria) this;
        }

        public Criteria andStrapIn(List<String> values) {
            addCriterion("strap in", values, "strap");
            return (Criteria) this;
        }

        public Criteria andStrapNotIn(List<String> values) {
            addCriterion("strap not in", values, "strap");
            return (Criteria) this;
        }

        public Criteria andStrapBetween(String value1, String value2) {
            addCriterion("strap between", value1, value2, "strap");
            return (Criteria) this;
        }

        public Criteria andStrapNotBetween(String value1, String value2) {
            addCriterion("strap not between", value1, value2, "strap");
            return (Criteria) this;
        }

        public Criteria andWButIsNull() {
            addCriterion("w_but is null");
            return (Criteria) this;
        }

        public Criteria andWButIsNotNull() {
            addCriterion("w_but is not null");
            return (Criteria) this;
        }

        public Criteria andWButEqualTo(String value) {
            addCriterion("w_but =", value, "wBut");
            return (Criteria) this;
        }

        public Criteria andWButNotEqualTo(String value) {
            addCriterion("w_but <>", value, "wBut");
            return (Criteria) this;
        }

        public Criteria andWButGreaterThan(String value) {
            addCriterion("w_but >", value, "wBut");
            return (Criteria) this;
        }

        public Criteria andWButGreaterThanOrEqualTo(String value) {
            addCriterion("w_but >=", value, "wBut");
            return (Criteria) this;
        }

        public Criteria andWButLessThan(String value) {
            addCriterion("w_but <", value, "wBut");
            return (Criteria) this;
        }

        public Criteria andWButLessThanOrEqualTo(String value) {
            addCriterion("w_but <=", value, "wBut");
            return (Criteria) this;
        }

        public Criteria andWButLike(String value) {
            addCriterion("w_but like", value, "wBut");
            return (Criteria) this;
        }

        public Criteria andWButNotLike(String value) {
            addCriterion("w_but not like", value, "wBut");
            return (Criteria) this;
        }

        public Criteria andWButIn(List<String> values) {
            addCriterion("w_but in", values, "wBut");
            return (Criteria) this;
        }

        public Criteria andWButNotIn(List<String> values) {
            addCriterion("w_but not in", values, "wBut");
            return (Criteria) this;
        }

        public Criteria andWButBetween(String value1, String value2) {
            addCriterion("w_but between", value1, value2, "wBut");
            return (Criteria) this;
        }

        public Criteria andWButNotBetween(String value1, String value2) {
            addCriterion("w_but not between", value1, value2, "wBut");
            return (Criteria) this;
        }

        public Criteria andGPicIsNull() {
            addCriterion("g_pic is null");
            return (Criteria) this;
        }

        public Criteria andGPicIsNotNull() {
            addCriterion("g_pic is not null");
            return (Criteria) this;
        }

        public Criteria andGPicEqualTo(String value) {
            addCriterion("g_pic =", value, "gPic");
            return (Criteria) this;
        }

        public Criteria andGPicNotEqualTo(String value) {
            addCriterion("g_pic <>", value, "gPic");
            return (Criteria) this;
        }

        public Criteria andGPicGreaterThan(String value) {
            addCriterion("g_pic >", value, "gPic");
            return (Criteria) this;
        }

        public Criteria andGPicGreaterThanOrEqualTo(String value) {
            addCriterion("g_pic >=", value, "gPic");
            return (Criteria) this;
        }

        public Criteria andGPicLessThan(String value) {
            addCriterion("g_pic <", value, "gPic");
            return (Criteria) this;
        }

        public Criteria andGPicLessThanOrEqualTo(String value) {
            addCriterion("g_pic <=", value, "gPic");
            return (Criteria) this;
        }

        public Criteria andGPicLike(String value) {
            addCriterion("g_pic like", value, "gPic");
            return (Criteria) this;
        }

        public Criteria andGPicNotLike(String value) {
            addCriterion("g_pic not like", value, "gPic");
            return (Criteria) this;
        }

        public Criteria andGPicIn(List<String> values) {
            addCriterion("g_pic in", values, "gPic");
            return (Criteria) this;
        }

        public Criteria andGPicNotIn(List<String> values) {
            addCriterion("g_pic not in", values, "gPic");
            return (Criteria) this;
        }

        public Criteria andGPicBetween(String value1, String value2) {
            addCriterion("g_pic between", value1, value2, "gPic");
            return (Criteria) this;
        }

        public Criteria andGPicNotBetween(String value1, String value2) {
            addCriterion("g_pic not between", value1, value2, "gPic");
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