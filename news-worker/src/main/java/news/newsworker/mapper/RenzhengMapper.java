package news.newsworker.mapper;

import java.util.List;
import news.newsworker.model.Renzheng;
import news.newsworker.model.RenzhengExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RenzhengMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renzheng
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    long countByExample(RenzhengExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renzheng
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    int deleteByExample(RenzhengExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renzheng
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renzheng
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    int insert(Renzheng record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renzheng
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    int insertSelective(Renzheng record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renzheng
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    List<Renzheng> selectByExampleWithRowbounds(RenzhengExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renzheng
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    List<Renzheng> selectByExample(RenzhengExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renzheng
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    Renzheng selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renzheng
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    int updateByExampleSelective(@Param("record") Renzheng record, @Param("example") RenzhengExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renzheng
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    int updateByExample(@Param("record") Renzheng record, @Param("example") RenzhengExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renzheng
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    int updateByPrimaryKeySelective(Renzheng record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renzheng
     *
     * @mbg.generated Sat May 23 02:31:30 CST 2020
     */
    int updateByPrimaryKey(Renzheng record);
}