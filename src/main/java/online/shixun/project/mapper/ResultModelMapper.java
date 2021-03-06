package online.shixun.project.mapper;

import java.util.List;
import online.shixun.project.model.ResultModel;
import online.shixun.project.model.ResultModelCriteria;
import org.apache.ibatis.annotations.Param;

public interface ResultModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table result
     *
     * @mbggenerated Tue Nov 21 20:48:04 CST 2017
     */
    int countByExample(ResultModelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table result
     *
     * @mbggenerated Tue Nov 21 20:48:04 CST 2017
     */
    int deleteByExample(ResultModelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table result
     *
     * @mbggenerated Tue Nov 21 20:48:04 CST 2017
     */
    int insert(ResultModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table result
     *
     * @mbggenerated Tue Nov 21 20:48:04 CST 2017
     */
    int insertSelective(ResultModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table result
     *
     * @mbggenerated Tue Nov 21 20:48:04 CST 2017
     */
    List<ResultModel> selectByExample(ResultModelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table result
     *
     * @mbggenerated Tue Nov 21 20:48:04 CST 2017
     */
    int updateByExampleSelective(@Param("record") ResultModel record, @Param("example") ResultModelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table result
     *
     * @mbggenerated Tue Nov 21 20:48:04 CST 2017
     */
    int updateByExample(@Param("record") ResultModel record, @Param("example") ResultModelCriteria example);
}