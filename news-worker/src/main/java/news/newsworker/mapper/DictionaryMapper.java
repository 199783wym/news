package news.newsworker.mapper;

import java.util.List;
import news.newsworker.model.Dictionary;
import news.newsworker.model.DictionaryExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DictionaryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary
     *
     * @mbg.generated Sat Apr 11 19:50:23 CST 2020
     */
    long countByExample(DictionaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary
     *
     * @mbg.generated Sat Apr 11 19:50:23 CST 2020
     */
    int deleteByExample(DictionaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary
     *
     * @mbg.generated Sat Apr 11 19:50:23 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary
     *
     * @mbg.generated Sat Apr 11 19:50:23 CST 2020
     */
    int insert(Dictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary
     *
     * @mbg.generated Sat Apr 11 19:50:23 CST 2020
     */
    int insertSelective(Dictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary
     *
     * @mbg.generated Sat Apr 11 19:50:23 CST 2020
     */
    List<Dictionary> selectByExampleWithRowbounds(DictionaryExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary
     *
     * @mbg.generated Sat Apr 11 19:50:23 CST 2020
     */
    List<Dictionary> selectByExample(DictionaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary
     *
     * @mbg.generated Sat Apr 11 19:50:23 CST 2020
     */
    Dictionary selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary
     *
     * @mbg.generated Sat Apr 11 19:50:23 CST 2020
     */
    int updateByExampleSelective(@Param("record") Dictionary record, @Param("example") DictionaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary
     *
     * @mbg.generated Sat Apr 11 19:50:23 CST 2020
     */
    int updateByExample(@Param("record") Dictionary record, @Param("example") DictionaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary
     *
     * @mbg.generated Sat Apr 11 19:50:23 CST 2020
     */
    int updateByPrimaryKeySelective(Dictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary
     *
     * @mbg.generated Sat Apr 11 19:50:23 CST 2020
     */
    int updateByPrimaryKey(Dictionary record);
}