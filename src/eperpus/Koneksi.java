package eperpus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Asus
 */
public class Koneksi {
    private static Connection koneksi;

public static Connection getKoneksi(){
//method ini berguna membuat koneksi ke MYSQL
if (koneksi == null) {
try {
String url ="jdbc:mysql://localhost:3306/uaspbo";
String username ="root";
String password ="";
DriverManager.registerDriver(new com.mysql.jdbc.Driver());
koneksi = DriverManager.getConnection(url,username,password);
System.out.println("Koneksi berhasil");
} catch (SQLException e) {
System.out.println("Gagal membuat koneksi");
}
}
return koneksi;
}
}
