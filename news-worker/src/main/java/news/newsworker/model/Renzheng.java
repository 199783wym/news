package news.newsworker.model;

public class Renzheng {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column renzheng.id
     *
     * @mbg.generated Mon May 18 01:37:09 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column renzheng.user_id
     *
     * @mbg.generated Mon May 18 01:37:09 CST 2020
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column renzheng.status
     *
     * @mbg.generated Mon May 18 01:37:09 CST 2020
     */
    private Long status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column renzheng.name
     *
     * @mbg.generated Mon May 18 01:37:09 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column renzheng.gmt_create
     *
     * @mbg.generated Mon May 18 01:37:09 CST 2020
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column renzheng.img
     *
     * @mbg.generated Mon May 18 01:37:09 CST 2020
     */
    private String img;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column renzheng.id
     *
     * @return the value of renzheng.id
     *
     * @mbg.generated Mon May 18 01:37:09 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column renzheng.id
     *
     * @param id the value for renzheng.id
     *
     * @mbg.generated Mon May 18 01:37:09 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column renzheng.user_id
     *
     * @return the value of renzheng.user_id
     *
     * @mbg.generated Mon May 18 01:37:09 CST 2020
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column renzheng.user_id
     *
     * @param userId the value for renzheng.user_id
     *
     * @mbg.generated Mon May 18 01:37:09 CST 2020
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column renzheng.status
     *
     * @return the value of renzheng.status
     *
     * @mbg.generated Mon May 18 01:37:09 CST 2020
     */
    public Long getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column renzheng.status
     *
     * @param status the value for renzheng.status
     *
     * @mbg.generated Mon May 18 01:37:09 CST 2020
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column renzheng.name
     *
     * @return the value of renzheng.name
     *
     * @mbg.generated Mon May 18 01:37:09 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column renzheng.name
     *
     * @param name the value for renzheng.name
     *
     * @mbg.generated Mon May 18 01:37:09 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column renzheng.gmt_create
     *
     * @return the value of renzheng.gmt_create
     *
     * @mbg.generated Mon May 18 01:37:09 CST 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column renzheng.gmt_create
     *
     * @param gmtCreate the value for renzheng.gmt_create
     *
     * @mbg.generated Mon May 18 01:37:09 CST 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column renzheng.img
     *
     * @return the value of renzheng.img
     *
     * @mbg.generated Mon May 18 01:37:09 CST 2020
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column renzheng.img
     *
     * @param img the value for renzheng.img
     *
     * @mbg.generated Mon May 18 01:37:09 CST 2020
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
}