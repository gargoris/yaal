package on2014_11.on2014_11_02_OpenCup_Siberia_GP.Task3;

import net.egork.chelper.tester.NewTester;

import org.junit.Assert;
import org.junit.Test;

public class Main {
	@Test
	public void test() throws Exception {
		if (!NewTester.test("lib/test/on2014_11/on2014_11_02_OpenCup_Siberia_GP/Task3/Task3.task"))
			Assert.fail();
	}
}