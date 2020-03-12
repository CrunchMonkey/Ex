package kr.co.DaoImpl;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.Dao.EplDao;
import kr.co.Dto.EplDTO;

@Repository
public class EplDaoImpl implements EplDao {
	
	@Inject
	private SqlSession Sql;
	
	private static String NameSpace = "Mapper";

	@Override
	public List<EplDTO> test() throws Exception {
		// TODO Auto-generated method stub
		return Sql.selectList(NameSpace + ".test");
	}
	
	
}
