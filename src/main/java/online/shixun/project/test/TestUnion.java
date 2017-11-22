package online.shixun.project.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import online.shixun.project.mapper.StudentModelMapper;

import online.shixun.project.model.StudentModel;

public class TestUnion extends BaseJDBC{
	SqlSession sqlSession;
	StudentModelMapper studentModelMapper;
	public void findGradeAndStudent(){
		sqlSession=BaseJDBC.getSqlSessionFactory().openSession();
		studentModelMapper=sqlSession.getMapper(StudentModelMapper.class);
		//動態sql條件
		Map<String,Object> map=new HashMap<>();
		map.put("studentname", "");
		map.put("studentsex", null);
		map.put("subjectname", "");
		map.put("gradename", "");
		map.put("studentresult", 60);
		//使用分頁
		PageHelper.startPage(2, 2);
		
		List<StudentModel> list=studentModelMapper.findStudentAndgradeAndSubjectAndResult(map);
		//獲取分頁信息
		PageInfo<StudentModel> pageInfo=new PageInfo<>(list);
		System.out.println(pageInfo.toString());
		
		for (StudentModel studentModel : list) {
			System.out.println(studentModel.toString());
		}
		sqlSession.commit();
		sqlSession.close();
	}
}