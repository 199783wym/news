package news.newsworker.model;

public class Dictionary {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary.id
     *
     * @mbg.generated Sat Apr 11 19:50:23 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary.type
     *
     * @mbg.generated Sat Apr 11 19:50:23 CST 2020
     */
    private Long type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary.name
     *
     * @mbg.generated Sat Apr 11 19:50:23 CST 2020
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary.id
     *
     * @return the value of dictionary.id
     *
     * @mbg.generated Sat Apr 11 19:50:23 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary.id
     *
     * @param id the value for dictionary.id
     *
     * @mbg.generated Sat Apr 11 19:50:23 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary.type
     *
     * @return the value of dictionary.type
     *
     * @mbg.generated Sat Apr 11 19:50:23 CST 2020
     */
    public Long getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary.type
     *
     * @param type the value for dictionary.type
     *
     * @mbg.generated Sat Apr 11 19:50:23 CST 2020
     */
    public void setType(Long type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary.name
     *
     * @return the value of dictionary.name
     *
     * @mbg.generated Sat Apr 11 19:50:23 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary.name
     *
     * @param name the value for dictionary.name
     *
     * @mbg.generated Sat Apr 11 19:50:23 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}