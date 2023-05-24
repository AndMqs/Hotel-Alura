package factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
	public DataSource dataSource;
	
	
	public ConnectionFactory() {
		ComboPooledDataSource comboPDS = new ComboPooledDataSource();
        comboPDS.setJdbcUrl("jdbc:mysql://localhost:3306/hotel_alura?useTimezone=true&serverTimezone=UTC");
        comboPDS.setUser("root");
        comboPDS.setPassword("andresa22");

        comboPDS.setMaxPoolSize(15);

        this.dataSource = comboPDS;
	}
	
	public Connection conectar() {
		try {
			return this.dataSource.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
