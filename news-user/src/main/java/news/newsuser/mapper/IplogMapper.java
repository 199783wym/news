package news.newsuser.mapper;

import java.util.List;
import news.newsuser.model.Iplog;
import news.newsuser.model.IplogExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface IplogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iplog
     *
     * @mbg.generated Mon May 18 01:37:34 CST 2020
     */
    long countByExample(IplogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iplog
     *
     * @mbg.generated Mon May 18 01:37:34 CST 2020
     */
    int deleteByExample(IplogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iplog
     *
     * @mbg.generated Mon May 18 01:37:34 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iplog
     *
     * @mbg.generated Mon May 18 01:37:34 CST 2020
     */
    int insert(Iplog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iplog
     *
     * @mbg.generated Mon May 18 01:37:34 CST 2020
     */
    int insertSelective(Iplog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iplog
     *
     * @mbg.generated Mon May 18 01:37:34 CST 2020
     */
    List<Iplog> selectByExampleWithRowbounds(IplogExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iplog
     *
     * @mbg.generated Mon May 18 01:37:34 CST 2020
     */
    List<Iplog> selectByExample(IplogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iplog
     *
     * @mbg.generated Mon May 18 01:37:34 CST 2020
     */
    Iplog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iplog
     *
     * @mbg.generated Mon May 18 01:37:34 CST 2020
     */
    int updateByExampleSelective(@Param("record") Iplog record, @Param("example") IplogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iplog
     *
     * @mbg.generated Mon May 18 01:37:34 CST 2020
     */
    int updateByExample(@Param("record") Iplog record, @Param("example") IplogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iplog
     *
     * @mbg.generated Mon May 18 01:37:34 CST 2020
     */
    int updateByPrimaryKeySelective(Iplog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iplog
     *
     * @mbg.generated Mon May 18 01:37:34 CST 2020
     */
    int updateByPrimaryKey(Iplog record);
}