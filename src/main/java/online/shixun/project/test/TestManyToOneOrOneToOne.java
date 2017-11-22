package online.shixun.project.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import online.shixun.project.mapper.StudentModelMapper;
import online.shixun.project.model.StudentModel;

public class TestManyToOneOrOneToOne extends BaseJDBC{
	SqlSession sqlSession;
	StudentModelMapper studentModelMapper;
	public void findStudentAndGrade(){
		sqlSession=BaseJDBC.getSqlSessionFactory().openSession();
		studentModelMapper=sqlSession.getMapper(StudentModelMapper.class);
		List<StudentModel> list=studentModelMapper.findStudentAndGrade();
		for (StudentModel studentModel : list) {
			System.out.println(studentModel.toString());
		}
		sqlSession.commit();
		sqlSession.close();
	}
}
