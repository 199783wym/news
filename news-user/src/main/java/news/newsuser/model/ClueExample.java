package news.newsuser.model;

import java.util.ArrayList;
import java.util.List;

public class ClueExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table clue
     *
     * @mbg.generated Mon Apr 06 00:05:38 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table clue
     *
     * @mbg.generated Mon Apr 06 00:05:38 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table clue
     *
     * @mbg.generated Mon Apr 06 00:05:38 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clue
     *
     * @mbg.generated Mon Apr 06 00:05:38 CST 2020
     */
    public ClueExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clue
     *
     * @mbg.generated Mon Apr 06 00:05:38 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clue
     *
     * @mbg.generated Mon Apr 06 00:05:38 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clue
     *
     * @mbg.generated Mon Apr 06 00:05:38 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clue
     *
     * @mbg.generated Mon Apr 06 00:05:38 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clue
     *
     * @mbg.generated Mon Apr 06 00:05:38 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clue
     *
     * @mbg.generated Mon Apr 06 00:05:38 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clue
     *
     * @mbg.generated Mon Apr 06 00:05:38 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clue
     *
     * @mbg.generated Mon Apr 06 00:05:38 CST 2020
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
     * This method corresponds to the database table clue
     *
     * @mbg.generated Mon Apr 06 00:05:38 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clue
     *
     * @mbg.generated Mon Apr 06 00:05:38 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table clue
     *
     * @mbg.generated Mon Apr 06 00:05:38 CST 2020
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(Long value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(Long value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(Long value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(Long value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(Long value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<Long> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<Long> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(Long value1, Long value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(Long value1, Long value2) {
            addCriterion("create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andAudit1IsNull() {
            addCriterion("audit1 is null");
            return (Criteria) this;
        }

        public Criteria andAudit1IsNotNull() {
            addCriterion("audit1 is not null");
            return (Criteria) this;
        }

        public Criteria andAudit1EqualTo(Long value) {
            addCriterion("audit1 =", value, "audit1");
            return (Criteria) this;
        }

        public Criteria andAudit1NotEqualTo(Long value) {
            addCriterion("audit1 <>", value, "audit1");
            return (Criteria) this;
        }

        public Criteria andAudit1GreaterThan(Long value) {
            addCriterion("audit1 >", value, "audit1");
            return (Criteria) this;
        }

        public Criteria andAudit1GreaterThanOrEqualTo(Long value) {
            addCriterion("audit1 >=", value, "audit1");
            return (Criteria) this;
        }

        public Criteria andAudit1LessThan(Long value) {
            addCriterion("audit1 <", value, "audit1");
            return (Criteria) this;
        }

        public Criteria andAudit1LessThanOrEqualTo(Long value) {
            addCriterion("audit1 <=", value, "audit1");
            return (Criteria) this;
        }

        public Criteria andAudit1In(List<Long> values) {
            addCriterion("audit1 in", values, "audit1");
            return (Criteria) this;
        }

        public Criteria andAudit1NotIn(List<Long> values) {
            addCriterion("audit1 not in", values, "audit1");
            return (Criteria) this;
        }

        public Criteria andAudit1Between(Long value1, Long value2) {
            addCriterion("audit1 between", value1, value2, "audit1");
            return (Criteria) this;
        }

        public Criteria andAudit1NotBetween(Long value1, Long value2) {
            addCriterion("audit1 not between", value1, value2, "audit1");
            return (Criteria) this;
        }

        public Criteria andAudit1NoIsNull() {
            addCriterion("audit1_no is null");
            return (Criteria) this;
        }

        public Criteria andAudit1NoIsNotNull() {
            addCriterion("audit1_no is not null");
            return (Criteria) this;
        }

        public Criteria andAudit1NoEqualTo(Long value) {
            addCriterion("audit1_no =", value, "audit1No");
            return (Criteria) this;
        }

        public Criteria andAudit1NoNotEqualTo(Long value) {
            addCriterion("audit1_no <>", value, "audit1No");
            return (Criteria) this;
        }

        public Criteria andAudit1NoGreaterThan(Long value) {
            addCriterion("audit1_no >", value, "audit1No");
            return (Criteria) this;
        }

        public Criteria andAudit1NoGreaterThanOrEqualTo(Long value) {
            addCriterion("audit1_no >=", value, "audit1No");
            return (Criteria) this;
        }

        public Criteria andAudit1NoLessThan(Long value) {
            addCriterion("audit1_no <", value, "audit1No");
            return (Criteria) this;
        }

        public Criteria andAudit1NoLessThanOrEqualTo(Long value) {
            addCriterion("audit1_no <=", value, "audit1No");
            return (Criteria) this;
        }

        public Criteria andAudit1NoIn(List<Long> values) {
            addCriterion("audit1_no in", values, "audit1No");
            return (Criteria) this;
        }

        public Criteria andAudit1NoNotIn(List<Long> values) {
            addCriterion("audit1_no not in", values, "audit1No");
            return (Criteria) this;
        }

        public Criteria andAudit1NoBetween(Long value1, Long value2) {
            addCriterion("audit1_no between", value1, value2, "audit1No");
            return (Criteria) this;
        }

        public Criteria andAudit1NoNotBetween(Long value1, Long value2) {
            addCriterion("audit1_no not between", value1, value2, "audit1No");
            return (Criteria) this;
        }

        public Criteria andAudit2IsNull() {
            addCriterion("audit2 is null");
            return (Criteria) this;
        }

        public Criteria andAudit2IsNotNull() {
            addCriterion("audit2 is not null");
            return (Criteria) this;
        }

        public Criteria andAudit2EqualTo(Long value) {
            addCriterion("audit2 =", value, "audit2");
            return (Criteria) this;
        }

        public Criteria andAudit2NotEqualTo(Long value) {
            addCriterion("audit2 <>", value, "audit2");
            return (Criteria) this;
        }

        public Criteria andAudit2GreaterThan(Long value) {
            addCriterion("audit2 >", value, "audit2");
            return (Criteria) this;
        }

        public Criteria andAudit2GreaterThanOrEqualTo(Long value) {
            addCriterion("audit2 >=", value, "audit2");
            return (Criteria) this;
        }

        public Criteria andAudit2LessThan(Long value) {
            addCriterion("audit2 <", value, "audit2");
            return (Criteria) this;
        }

        public Criteria andAudit2LessThanOrEqualTo(Long value) {
            addCriterion("audit2 <=", value, "audit2");
            return (Criteria) this;
        }

        public Criteria andAudit2In(List<Long> values) {
            addCriterion("audit2 in", values, "audit2");
            return (Criteria) this;
        }

        public Criteria andAudit2NotIn(List<Long> values) {
            addCriterion("audit2 not in", values, "audit2");
            return (Criteria) this;
        }

        public Criteria andAudit2Between(Long value1, Long value2) {
            addCriterion("audit2 between", value1, value2, "audit2");
            return (Criteria) this;
        }

        public Criteria andAudit2NotBetween(Long value1, Long value2) {
            addCriterion("audit2 not between", value1, value2, "audit2");
            return (Criteria) this;
        }

        public Criteria andAudit2NoIsNull() {
            addCriterion("audit2_no is null");
            return (Criteria) this;
        }

        public Criteria andAudit2NoIsNotNull() {
            addCriterion("audit2_no is not null");
            return (Criteria) this;
        }

        public Criteria andAudit2NoEqualTo(Long value) {
            addCriterion("audit2_no =", value, "audit2No");
            return (Criteria) this;
        }

        public Criteria andAudit2NoNotEqualTo(Long value) {
            addCriterion("audit2_no <>", value, "audit2No");
            return (Criteria) this;
        }

        public Criteria andAudit2NoGreaterThan(Long value) {
            addCriterion("audit2_no >", value, "audit2No");
            return (Criteria) this;
        }

        public Criteria andAudit2NoGreaterThanOrEqualTo(Long value) {
            addCriterion("audit2_no >=", value, "audit2No");
            return (Criteria) this;
        }

        public Criteria andAudit2NoLessThan(Long value) {
            addCriterion("audit2_no <", value, "audit2No");
            return (Criteria) this;
        }

        public Criteria andAudit2NoLessThanOrEqualTo(Long value) {
            addCriterion("audit2_no <=", value, "audit2No");
            return (Criteria) this;
        }

        public Criteria andAudit2NoIn(List<Long> values) {
            addCriterion("audit2_no in", values, "audit2No");
            return (Criteria) this;
        }

        public Criteria andAudit2NoNotIn(List<Long> values) {
            addCriterion("audit2_no not in", values, "audit2No");
            return (Criteria) this;
        }

        public Criteria andAudit2NoBetween(Long value1, Long value2) {
            addCriterion("audit2_no between", value1, value2, "audit2No");
            return (Criteria) this;
        }

        public Criteria andAudit2NoNotBetween(Long value1, Long value2) {
            addCriterion("audit2_no not between", value1, value2, "audit2No");
            return (Criteria) this;
        }

        public Criteria andToIdIsNull() {
            addCriterion("to_id is null");
            return (Criteria) this;
        }

        public Criteria andToIdIsNotNull() {
            addCriterion("to_id is not null");
            return (Criteria) this;
        }

        public Criteria andToIdEqualTo(Long value) {
            addCriterion("to_id =", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdNotEqualTo(Long value) {
            addCriterion("to_id <>", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdGreaterThan(Long value) {
            addCriterion("to_id >", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdGreaterThanOrEqualTo(Long value) {
            addCriterion("to_id >=", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdLessThan(Long value) {
            addCriterion("to_id <", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdLessThanOrEqualTo(Long value) {
            addCriterion("to_id <=", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdIn(List<Long> values) {
            addCriterion("to_id in", values, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdNotIn(List<Long> values) {
            addCriterion("to_id not in", values, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdBetween(Long value1, Long value2) {
            addCriterion("to_id between", value1, value2, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdNotBetween(Long value1, Long value2) {
            addCriterion("to_id not between", value1, value2, "toId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Long value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Long value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Long value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Long value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Long value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Long> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Long> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Long value1, Long value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Long value1, Long value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Long value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Long value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Long value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Long value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Long value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Long> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Long> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Long value1, Long value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Long value1, Long value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Long value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Long value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Long value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Long value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Long value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Long value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Long> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Long> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Long value1, Long value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Long value1, Long value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Long value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Long value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Long value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Long value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Long value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Long value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Long> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Long> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Long value1, Long value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Long value1, Long value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table clue
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 06 00:05:39 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table clue
     *
     * @mbg.generated Mon Apr 06 00:05:39 CST 2020
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