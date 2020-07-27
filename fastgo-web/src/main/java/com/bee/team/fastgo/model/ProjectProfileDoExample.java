package com.bee.team.fastgo.model;

import com.alibaba.lava.base.LavaExample;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectProfileDoExample extends LavaExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_project_profile
     *
     * @mbg.generated Wed Jul 22 11:39:08 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_project_profile
     *
     * @mbg.generated Wed Jul 22 11:39:08 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_project_profile
     *
     * @mbg.generated Wed Jul 22 11:39:08 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_profile
     *
     * @mbg.generated Wed Jul 22 11:39:08 CST 2020
     */
    public ProjectProfileDoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_profile
     *
     * @mbg.generated Wed Jul 22 11:39:08 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_profile
     *
     * @mbg.generated Wed Jul 22 11:39:08 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_profile
     *
     * @mbg.generated Wed Jul 22 11:39:08 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_profile
     *
     * @mbg.generated Wed Jul 22 11:39:08 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_profile
     *
     * @mbg.generated Wed Jul 22 11:39:08 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_profile
     *
     * @mbg.generated Wed Jul 22 11:39:08 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_profile
     *
     * @mbg.generated Wed Jul 22 11:39:08 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_profile
     *
     * @mbg.generated Wed Jul 22 11:39:08 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_profile
     *
     * @mbg.generated Wed Jul 22 11:39:08 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_profile
     *
     * @mbg.generated Wed Jul 22 11:39:08 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_project_profile
     *
     * @mbg.generated Wed Jul 22 11:39:08 CST 2020
     */
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

        public Criteria andGmt_codifiedIsNull() {
            addCriterion("gmt_codified is null");
            return (Criteria) this;
        }

        public Criteria andGmt_codifiedIsNotNull() {
            addCriterion("gmt_codified is not null");
            return (Criteria) this;
        }

        public Criteria andGmt_codifiedEqualTo(Date value) {
            addCriterion("gmt_codified =", value, "gmt_codified");
            return (Criteria) this;
        }

        public Criteria andGmt_codifiedNotEqualTo(Date value) {
            addCriterion("gmt_codified <>", value, "gmt_codified");
            return (Criteria) this;
        }

        public Criteria andGmt_codifiedGreaterThan(Date value) {
            addCriterion("gmt_codified >", value, "gmt_codified");
            return (Criteria) this;
        }

        public Criteria andGmt_codifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_codified >=", value, "gmt_codified");
            return (Criteria) this;
        }

        public Criteria andGmt_codifiedLessThan(Date value) {
            addCriterion("gmt_codified <", value, "gmt_codified");
            return (Criteria) this;
        }

        public Criteria andGmt_codifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_codified <=", value, "gmt_codified");
            return (Criteria) this;
        }

        public Criteria andGmt_codifiedIn(List<Date> values) {
            addCriterion("gmt_codified in", values, "gmt_codified");
            return (Criteria) this;
        }

        public Criteria andGmt_codifiedNotIn(List<Date> values) {
            addCriterion("gmt_codified not in", values, "gmt_codified");
            return (Criteria) this;
        }

        public Criteria andGmt_codifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_codified between", value1, value2, "gmt_codified");
            return (Criteria) this;
        }

        public Criteria andGmt_codifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_codified not between", value1, value2, "gmt_codified");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("projectName is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("projectName is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("projectName =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("projectName <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("projectName >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("projectName >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("projectName <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("projectName <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("projectName like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("projectName not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("projectName in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("projectName not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("projectName between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("projectName not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNull() {
            addCriterion("projectCode is null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNotNull() {
            addCriterion("projectCode is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeEqualTo(String value) {
            addCriterion("projectCode =", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotEqualTo(String value) {
            addCriterion("projectCode <>", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThan(String value) {
            addCriterion("projectCode >", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("projectCode >=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThan(String value) {
            addCriterion("projectCode <", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThanOrEqualTo(String value) {
            addCriterion("projectCode <=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLike(String value) {
            addCriterion("projectCode like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotLike(String value) {
            addCriterion("projectCode not like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIn(List<String> values) {
            addCriterion("projectCode in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotIn(List<String> values) {
            addCriterion("projectCode not in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeBetween(String value1, String value2) {
            addCriterion("projectCode between", value1, value2, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotBetween(String value1, String value2) {
            addCriterion("projectCode not between", value1, value2, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProfileNameIsNull() {
            addCriterion("profileName is null");
            return (Criteria) this;
        }

        public Criteria andProfileNameIsNotNull() {
            addCriterion("profileName is not null");
            return (Criteria) this;
        }

        public Criteria andProfileNameEqualTo(String value) {
            addCriterion("profileName =", value, "profileName");
            return (Criteria) this;
        }

        public Criteria andProfileNameNotEqualTo(String value) {
            addCriterion("profileName <>", value, "profileName");
            return (Criteria) this;
        }

        public Criteria andProfileNameGreaterThan(String value) {
            addCriterion("profileName >", value, "profileName");
            return (Criteria) this;
        }

        public Criteria andProfileNameGreaterThanOrEqualTo(String value) {
            addCriterion("profileName >=", value, "profileName");
            return (Criteria) this;
        }

        public Criteria andProfileNameLessThan(String value) {
            addCriterion("profileName <", value, "profileName");
            return (Criteria) this;
        }

        public Criteria andProfileNameLessThanOrEqualTo(String value) {
            addCriterion("profileName <=", value, "profileName");
            return (Criteria) this;
        }

        public Criteria andProfileNameLike(String value) {
            addCriterion("profileName like", value, "profileName");
            return (Criteria) this;
        }

        public Criteria andProfileNameNotLike(String value) {
            addCriterion("profileName not like", value, "profileName");
            return (Criteria) this;
        }

        public Criteria andProfileNameIn(List<String> values) {
            addCriterion("profileName in", values, "profileName");
            return (Criteria) this;
        }

        public Criteria andProfileNameNotIn(List<String> values) {
            addCriterion("profileName not in", values, "profileName");
            return (Criteria) this;
        }

        public Criteria andProfileNameBetween(String value1, String value2) {
            addCriterion("profileName between", value1, value2, "profileName");
            return (Criteria) this;
        }

        public Criteria andProfileNameNotBetween(String value1, String value2) {
            addCriterion("profileName not between", value1, value2, "profileName");
            return (Criteria) this;
        }

        public Criteria andBranchNameIsNull() {
            addCriterion("branchName is null");
            return (Criteria) this;
        }

        public Criteria andBranchNameIsNotNull() {
            addCriterion("branchName is not null");
            return (Criteria) this;
        }

        public Criteria andBranchNameEqualTo(String value) {
            addCriterion("branchName =", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotEqualTo(String value) {
            addCriterion("branchName <>", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameGreaterThan(String value) {
            addCriterion("branchName >", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("branchName >=", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLessThan(String value) {
            addCriterion("branchName <", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLessThanOrEqualTo(String value) {
            addCriterion("branchName <=", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLike(String value) {
            addCriterion("branchName like", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotLike(String value) {
            addCriterion("branchName not like", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameIn(List<String> values) {
            addCriterion("branchName in", values, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotIn(List<String> values) {
            addCriterion("branchName not in", values, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameBetween(String value1, String value2) {
            addCriterion("branchName between", value1, value2, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotBetween(String value1, String value2) {
            addCriterion("branchName not between", value1, value2, "branchName");
            return (Criteria) this;
        }

        public Criteria andPrifileCodeIsNull() {
            addCriterion("prifileCode is null");
            return (Criteria) this;
        }

        public Criteria andPrifileCodeIsNotNull() {
            addCriterion("prifileCode is not null");
            return (Criteria) this;
        }

        public Criteria andPrifileCodeEqualTo(String value) {
            addCriterion("prifileCode =", value, "prifileCode");
            return (Criteria) this;
        }

        public Criteria andPrifileCodeNotEqualTo(String value) {
            addCriterion("prifileCode <>", value, "prifileCode");
            return (Criteria) this;
        }

        public Criteria andPrifileCodeGreaterThan(String value) {
            addCriterion("prifileCode >", value, "prifileCode");
            return (Criteria) this;
        }

        public Criteria andPrifileCodeGreaterThanOrEqualTo(String value) {
            addCriterion("prifileCode >=", value, "prifileCode");
            return (Criteria) this;
        }

        public Criteria andPrifileCodeLessThan(String value) {
            addCriterion("prifileCode <", value, "prifileCode");
            return (Criteria) this;
        }

        public Criteria andPrifileCodeLessThanOrEqualTo(String value) {
            addCriterion("prifileCode <=", value, "prifileCode");
            return (Criteria) this;
        }

        public Criteria andPrifileCodeLike(String value) {
            addCriterion("prifileCode like", value, "prifileCode");
            return (Criteria) this;
        }

        public Criteria andPrifileCodeNotLike(String value) {
            addCriterion("prifileCode not like", value, "prifileCode");
            return (Criteria) this;
        }

        public Criteria andPrifileCodeIn(List<String> values) {
            addCriterion("prifileCode in", values, "prifileCode");
            return (Criteria) this;
        }

        public Criteria andPrifileCodeNotIn(List<String> values) {
            addCriterion("prifileCode not in", values, "prifileCode");
            return (Criteria) this;
        }

        public Criteria andPrifileCodeBetween(String value1, String value2) {
            addCriterion("prifileCode between", value1, value2, "prifileCode");
            return (Criteria) this;
        }

        public Criteria andPrifileCodeNotBetween(String value1, String value2) {
            addCriterion("prifileCode not between", value1, value2, "prifileCode");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "Id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "Id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "Id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "Id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "Id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "Id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "Id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "Id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "Id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "Id");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("GMT_CREATE is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("GMT_CREATE is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("GMT_CREATE =", value, "GmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("GMT_CREATE <>", value, "GmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("GMT_CREATE >", value, "GmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("GMT_CREATE >=", value, "GmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("GMT_CREATE <", value, "GmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("GMT_CREATE <=", value, "GmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("GMT_CREATE in", values, "GmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("GMT_CREATE not in", values, "GmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("GMT_CREATE between", value1, value2, "GmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("GMT_CREATE not between", value1, value2, "GmtCreate");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "Creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "Creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "Creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "Creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "Creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "Creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "Creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "Creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "Creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "Creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "Creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "Creator");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("GMT_MODIFIED is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("GMT_MODIFIED is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("GMT_MODIFIED =", value, "GmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("GMT_MODIFIED <>", value, "GmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("GMT_MODIFIED >", value, "GmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("GMT_MODIFIED >=", value, "GmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("GMT_MODIFIED <", value, "GmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("GMT_MODIFIED <=", value, "GmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("GMT_MODIFIED in", values, "GmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("GMT_MODIFIED not in", values, "GmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("GMT_MODIFIED between", value1, value2, "GmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("GMT_MODIFIED not between", value1, value2, "GmtModified");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("MODIFIER is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("MODIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("MODIFIER =", value, "Modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("MODIFIER <>", value, "Modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("MODIFIER >", value, "Modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIER >=", value, "Modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("MODIFIER <", value, "Modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("MODIFIER <=", value, "Modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("MODIFIER in", values, "Modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("MODIFIER not in", values, "Modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("MODIFIER between", value1, value2, "Modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("MODIFIER not between", value1, value2, "Modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("MODIFIER like", value, "Modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("MODIFIER not like", value, "Modifier");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("IS_DELETED is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("IS_DELETED is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(String value) {
            addCriterion("IS_DELETED =", value, "IsDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(String value) {
            addCriterion("IS_DELETED <>", value, "IsDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(String value) {
            addCriterion("IS_DELETED >", value, "IsDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DELETED >=", value, "IsDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(String value) {
            addCriterion("IS_DELETED <", value, "IsDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(String value) {
            addCriterion("IS_DELETED <=", value, "IsDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<String> values) {
            addCriterion("IS_DELETED in", values, "IsDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<String> values) {
            addCriterion("IS_DELETED not in", values, "IsDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(String value1, String value2) {
            addCriterion("IS_DELETED between", value1, value2, "IsDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(String value1, String value2) {
            addCriterion("IS_DELETED not between", value1, value2, "IsDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLike(String value) {
            addCriterion("IS_DELETED like", value, "IsDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotLike(String value) {
            addCriterion("IS_DELETED not like", value, "IsDeleted");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_project_profile
     *
     * @mbg.generated do_not_delete_during_merge Wed Jul 22 11:39:08 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_project_profile
     *
     * @mbg.generated Wed Jul 22 11:39:08 CST 2020
     */
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