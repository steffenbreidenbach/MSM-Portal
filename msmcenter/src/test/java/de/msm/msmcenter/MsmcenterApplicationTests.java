package de.msm.msmcenter;

import de.msm.msmcenter.dataacess.BesetzungRepository;
import de.msm.msmcenter.model.entitiys.Besetzung;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MsmcenterApplicationTests {
	@Autowired
	BesetzungRepository besetzungRepository;
	@Test
	public void contextLoads() {
	}


	@Test
	public void bestzungRepository(){
		Date date = new Date();
		List<Besetzung> besetzung= besetzungRepository.findAllByFlächeIdAndStartGreaterThanAndEndLessThan(1,date,date);
		for (Besetzung besetzun:besetzung) {
			System.out.println(besetzun.getId());
		}
	}
}
