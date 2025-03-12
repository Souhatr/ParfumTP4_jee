package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import metier.entities.Parfum;
import util.JPAutil;

public class ParfumDaoImpl implements IParfumDao {
	private EntityManager entityManager = JPAutil.getEntityManager("TP5_JEE");

	@Override
	public Parfum save(Parfum p) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(p);
		tx.commit();
		return p;
	}

	@Override
	public List<Parfum> parfumsParMC(String mc) {
		List<Parfum> parfs = entityManager.createQuery("select p from Parfum p where p.nomParfum like :mc")
				.setParameter("mc", "%" + mc + "%").getResultList();
		return parfs;
	}

	@Override
	public Parfum getParfum(Long id) {
		return entityManager.find(Parfum.class, id);
	}

	@Override
	public Parfum updateParfum(Parfum p) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.merge(p);
		tx.commit();
		return p;
	}

	@Override
	public void deleteParfum(Long id) {
		Parfum p = entityManager.find(Parfum.class, id);
		entityManager.getTransaction().begin();
		entityManager.remove(p);
		entityManager.getTransaction().commit();
	}
}