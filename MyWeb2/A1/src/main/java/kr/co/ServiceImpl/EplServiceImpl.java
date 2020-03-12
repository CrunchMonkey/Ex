package kr.co.ServiceImpl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.Dao.EplDao;
import kr.co.Dto.EplDTO;
import kr.co.Service.EplService;

@Service
public class EplServiceImpl implements EplService{
	@Inject
	EplDao epldao;

	@Override
	public List<EplDTO> test() throws Exception {
		// TODO Auto-generated method stub
		return epldao.test();
	}
}
