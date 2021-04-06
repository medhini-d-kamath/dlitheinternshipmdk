package internship.dlithe.twentyone.DLithe2021Internship;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import internship.dlithe.twentyone.DLithe2021Internship.controllers.RepoAccount;
import internship.dlithe.twentyone.DLithe2021Internship.controllers.ServiceAccount;
import internship.dlithe.twentyone.DLithe2021Internship.model.Account;


@SpringBootTest
@RunWith(SpringRunner.class)
class DLithe2021InternshipApplicationTests 
{
	@MockBean
	RepoAccount repo;
	
	@Autowired
	ServiceAccount service;
	
	@Test
	void contextLoads() {
	}

	@Test
	public void testInsertion()
	{
		Account acc=new Account(987656789L, "Mohamed", "ABCD111", "SAlem", "razzaksr@gmail.com", "Savings", "abcabc", 9876568987L, 1200.8);
	}
}
