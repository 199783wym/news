package news.newsuser.mapper;

import java.util.List;
import news.newsuser.model.Clue;
import news.newsuser.model.ClueExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ClueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clue
     *
     * @mbg.generated Mon May 18 01:37:34 CST 2020
     */
    long countByExample(ClueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clue
     *
     * @mbg.generated Mon May 18 01:37:34 CST 2020
     */
    int deleteByExample(ClueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clue
     *
     * @mbg.generated Mon May 18 01:37:34 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clue
     *
     * @mbg.generated Mon May 18 01:37:34 CST 2020
     */
    int insert(Clue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clue
     *
     * @mbg.generated Mon May 18 01:37:34 CST 2020
     */
    int insertSelective(Clue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clue
     *
     * @mbg.generated Mon May 18 01:37:34 CST 2020
     */
    List<Clue> selectByExampleWithRowbounds(ClueExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clue
     *
     * @mbg.generated Mon May 18 01:37:34 CST 2020
     */
    List<Clue> selectByExample(ClueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clue
     *
     * @mbg.generated Mon May 18 01:37:34 CST 2020
     */
    Clue selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clue
     *
     * @mbg.generated Mon May 18 01:37:34 CST 2020
     */
    int updateByExampleSelective(@Param("record") Clue record, @Param("example") ClueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clue
     *
     * @mbg.generated Mon May 18 01:37:34 CST 2020
     */
    int updateByExample(@Param("record") Clue record, @Param("example") ClueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clue
     *
     * @mbg.generated Mon May 18 01:37:34 CST 2020
     */
    int updateByPrimaryKeySelective(Clue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clue
     *
     * @mbg.generated Mon May 18 01:37:34 CST 2020
     */
    int updateByPrimaryKey(Clue record);
}