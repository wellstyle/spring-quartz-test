package test.dao;

import org.springframework.stereotype.Component;

@Component
public class TestDAOImpl implements TestDAO {

	public void showMe(String msg) {
		System.out.println("TestDAOImpl :: " +msg);
	}

}
