package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import metier.entities.Parfum;
public class ParfumDaoImpl implements IParfumDao{
	@Override
	public Parfum save(Parfum p) {
		Connection conn=SingletonConnection.getConnection();
	try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO parfums(Nom_parfum,marque,PRIX) VALUES(?,?,?)");
			ps.setString(1, p.getNomParfum());
			ps.setString(2, p.getMarque());
			ps.setDouble(3, p.getPrix());
			ps.executeUpdate();
			PreparedStatement ps2= conn.prepareStatement("SELECT MAX(ID_parfum) as MAX_ID FROM parfums");
			ResultSet rs =ps2.executeQuery();
			if (rs.next()) {
				p.setIdParfum(rs.getLong("MAX_ID"));
			}
			ps.close();
			ps2.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return p;
	}
	@Override
	public List<Parfum> parfumsParMC(String mc) {
		List<Parfum> prods= new ArrayList<Parfum>();
		Connection conn=SingletonConnection.getConnection();
		try {
				PreparedStatement ps= conn.prepareStatement("select * from parfums where Nom_parfum LIKE ?");
				ps.setString(1, "%"+mc+"%");
				ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Parfum p = new Parfum();
				p.setIdParfum(rs.getLong("Id_parfum"));
				p.setNomParfum(rs.getString("Nom_Parfum"));
				p.setMarque(rs.getString("marque"));
				p.setPrix(rs.getDouble("PRIX"));
				prods.add(p);
			}
			} catch (SQLException e) {
				e.printStackTrace();
			}
				return prods;
	}
	@Override
	public Parfum getParfum(Long id) {
		Connection conn=SingletonConnection.getConnection();
		Parfum p = new Parfum();
		try {
			PreparedStatement ps= conn.prepareStatement("select * from parfums where Id_parfum = ?");
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				p.setIdParfum(rs.getLong("Id_parfum"));
				p.setNomParfum(rs.getString("Nom_Parfum"));
				p.setMarque(rs.getString("marque"));
				p.setPrix(rs.getDouble("PRIX"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return p;
}
	@Override
	public Parfum updateParfum(Parfum p) {
		Connection conn=SingletonConnection.getConnection();
		try {
			PreparedStatement ps= conn.prepareStatement("UPDATE parfums SET Nom_parfum=?,marque=?,PRIX=? WHERE Id_parfum=?");
			ps.setString(1, p.getNomParfum());
			ps.setString(2, p.getMarque());
			ps.setDouble(3, p.getPrix());
			ps.setLong(4, p.getIdParfum());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return p;
}
	@Override
	public void deleteParfum(Long id) {
		Connection conn=SingletonConnection.getConnection();
		try {
			PreparedStatement ps= conn.prepareStatement("DELETE FROM parfums WHERE Id_parfum = ?");
			ps.setLong(1, id);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}