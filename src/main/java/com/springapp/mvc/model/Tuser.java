package com.springapp.mvc.model;

public class Tuser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.id
     *
     * @mbggenerated Tue Mar 15 17:28:25 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.name
     *
     * @mbggenerated Tue Mar 15 17:28:25 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.pwd
     *
     * @mbggenerated Tue Mar 15 17:28:25 CST 2016
     */
    private String pwd;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Tue Mar 15 17:28:25 CST 2016
     */
    public Tuser(Integer id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Tue Mar 15 17:28:25 CST 2016
     */
    public Tuser() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.id
     *
     * @return the value of t_user.id
     *
     * @mbggenerated Tue Mar 15 17:28:25 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.id
     *
     * @param id the value for t_user.id
     *
     * @mbggenerated Tue Mar 15 17:28:25 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.name
     *
     * @return the value of t_user.name
     *
     * @mbggenerated Tue Mar 15 17:28:25 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.name
     *
     * @param name the value for t_user.name
     *
     * @mbggenerated Tue Mar 15 17:28:25 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.pwd
     *
     * @return the value of t_user.pwd
     *
     * @mbggenerated Tue Mar 15 17:28:25 CST 2016
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.pwd
     *
     * @param pwd the value for t_user.pwd
     *
     * @mbggenerated Tue Mar 15 17:28:25 CST 2016
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }
}