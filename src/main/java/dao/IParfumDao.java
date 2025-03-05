package dao;
import java.util.List;
import metier.entities.Parfum;
public interface IParfumDao {
	public Parfum save(Parfum p);
	public List<Parfum> parfumsParMC(String mc);
	public Parfum getParfum(Long id);
	public Parfum updateParfum(Parfum p);
	public void deleteParfum(Long id);
}