package news.newsworker.model;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.account_id
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    private String accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.token
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    private String token;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.avatar_url
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    private String avatarUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.renzheng
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    private Long renzheng;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.renzheng_string
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    private String renzhengString;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.phone
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.score
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    private Long score;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gmt_create
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gmt_modified
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    private Long gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password_md5
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    private String passwordMd5;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.account_id
     *
     * @return the value of user.account_id
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.account_id
     *
     * @param accountId the value for user.account_id
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name
     *
     * @return the value of user.name
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name
     *
     * @param name the value for user.name
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.token
     *
     * @return the value of user.token
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.token
     *
     * @param token the value for user.token
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.avatar_url
     *
     * @return the value of user.avatar_url
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.avatar_url
     *
     * @param avatarUrl the value for user.avatar_url
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.renzheng
     *
     * @return the value of user.renzheng
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    public Long getRenzheng() {
        return renzheng;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.renzheng
     *
     * @param renzheng the value for user.renzheng
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    public void setRenzheng(Long renzheng) {
        this.renzheng = renzheng;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.renzheng_string
     *
     * @return the value of user.renzheng_string
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    public String getRenzhengString() {
        return renzhengString;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.renzheng_string
     *
     * @param renzhengString the value for user.renzheng_string
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    public void setRenzhengString(String renzhengString) {
        this.renzhengString = renzhengString == null ? null : renzhengString.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.phone
     *
     * @return the value of user.phone
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.phone
     *
     * @param phone the value for user.phone
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.score
     *
     * @return the value of user.score
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    public Long getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.score
     *
     * @param score the value for user.score
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    public void setScore(Long score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.gmt_create
     *
     * @return the value of user.gmt_create
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.gmt_create
     *
     * @param gmtCreate the value for user.gmt_create
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.gmt_modified
     *
     * @return the value of user.gmt_modified
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.gmt_modified
     *
     * @param gmtModified the value for user.gmt_modified
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password_md5
     *
     * @return the value of user.password_md5
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    public String getPasswordMd5() {
        return passwordMd5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password_md5
     *
     * @param passwordMd5 the value for user.password_md5
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    public void setPasswordMd5(String passwordMd5) {
        this.passwordMd5 = passwordMd5 == null ? null : passwordMd5.trim();
    }
}