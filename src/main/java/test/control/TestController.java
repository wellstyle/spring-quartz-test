package test.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import test.service.TestService;

@Controller
public class TestController {
	@Autowired
	private TestService testService;
	
	public void showMe(String msg) {
		testService.showMe(msg);
	}
}
