package online.shixun.project.mapper;

import java.util.List;
import online.shixun.project.model.SubjectModel;
import online.shixun.project.model.SubjectModelCriteria;
import org.apache.ibatis.annotations.Param;

public interface SubjectModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbggenerated Tue Nov 21 20:48:04 CST 2017
     */
    int countByExample(SubjectModelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbggenerated Tue Nov 21 20:48:04 CST 2017
     */
    int deleteByExample(SubjectModelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbggenerated Tue Nov 21 20:48:04 CST 2017
     */
    int deleteByPrimaryKey(Integer subjectno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbggenerated Tue Nov 21 20:48:04 CST 2017
     */
    int insert(SubjectModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbggenerated Tue Nov 21 20:48:04 CST 2017
     */
    int insertSelective(SubjectModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbggenerated Tue Nov 21 20:48:04 CST 2017
     */
    List<SubjectModel> selectByExample(SubjectModelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbggenerated Tue Nov 21 20:48:04 CST 2017
     */
    SubjectModel selectByPrimaryKey(Integer subjectno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbggenerated Tue Nov 21 20:48:04 CST 2017
     */
    int updateByExampleSelective(@Param("record") SubjectModel record, @Param("example") SubjectModelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbggenerated Tue Nov 21 20:48:04 CST 2017
     */
    int updateByExample(@Param("record") SubjectModel record, @Param("example") SubjectModelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbggenerated Tue Nov 21 20:48:04 CST 2017
     */
    int updateByPrimaryKeySelective(SubjectModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbggenerated Tue Nov 21 20:48:04 CST 2017
     */
    int updateByPrimaryKey(SubjectModel record);
}