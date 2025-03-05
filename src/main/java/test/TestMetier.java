package test;
import java.util.List;

import dao.ParfumDaoImpl;
import metier.entities.Parfum;
public class TestMetier {

	public static void main(String[] args) {
		ParfumDaoImpl pdao= new ParfumDaoImpl();
		Parfum pa= pdao.save(new Parfum("Miss dior","Dior",165));
		System.out.println(pa);
		List<Parfum> parfs =pdao.parfumsParMC("mi");
		for (Parfum p : parfs)
			System.out.println(p);
	}

}


 