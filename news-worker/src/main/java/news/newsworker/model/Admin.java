package news.newsworker.model;

public class Admin {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.id
     *
     * @mbg.generated Tue Apr 21 17:04:27 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.username
     *
     * @mbg.generated Tue Apr 21 17:04:27 CST 2020
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.password
     *
     * @mbg.generated Tue Apr 21 17:04:27 CST 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.admin_class
     *
     * @mbg.generated Tue Apr 21 17:04:27 CST 2020
     */
    private Long adminClass;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.GMT_CREATE
     *
     * @mbg.generated Tue Apr 21 17:04:27 CST 2020
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.GMT_MODIFIED
     *
     * @mbg.generated Tue Apr 21 17:04:27 CST 2020
     */
    private Long gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.id
     *
     * @return the value of admin.id
     *
     * @mbg.generated Tue Apr 21 17:04:27 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.id
     *
     * @param id the value for admin.id
     *
     * @mbg.generated Tue Apr 21 17:04:27 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.username
     *
     * @return the value of admin.username
     *
     * @mbg.generated Tue Apr 21 17:04:27 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.username
     *
     * @param username the value for admin.username
     *
     * @mbg.generated Tue Apr 21 17:04:27 CST 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.password
     *
     * @return the value of admin.password
     *
     * @mbg.generated Tue Apr 21 17:04:27 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.password
     *
     * @param password the value for admin.password
     *
     * @mbg.generated Tue Apr 21 17:04:27 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.admin_class
     *
     * @return the value of admin.admin_class
     *
     * @mbg.generated Tue Apr 21 17:04:27 CST 2020
     */
    public Long getAdminClass() {
        return adminClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.admin_class
     *
     * @param adminClass the value for admin.admin_class
     *
     * @mbg.generated Tue Apr 21 17:04:27 CST 2020
     */
    public void setAdminClass(Long adminClass) {
        this.adminClass = adminClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.GMT_CREATE
     *
     * @return the value of admin.GMT_CREATE
     *
     * @mbg.generated Tue Apr 21 17:04:27 CST 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.GMT_CREATE
     *
     * @param gmtCreate the value for admin.GMT_CREATE
     *
     * @mbg.generated Tue Apr 21 17:04:27 CST 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.GMT_MODIFIED
     *
     * @return the value of admin.GMT_MODIFIED
     *
     * @mbg.generated Tue Apr 21 17:04:27 CST 2020
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.GMT_MODIFIED
     *
     * @param gmtModified the value for admin.GMT_MODIFIED
     *
     * @mbg.generated Tue Apr 21 17:04:27 CST 2020
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }
}