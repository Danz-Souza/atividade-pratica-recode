// package DbDviagem.Connection;

// import java.lang.System.Logger;
// import java.lang.System.Logger.Level;
// import java.sql.Connection;
// import java.sql.DriverManager;

// public class ConnectionFactory {
//     private final String DRIVER = "com.mysql.jdbc.Driver";
//     private final String url = "jdbc:mysql://localhost:3306/database/db_fisico";
//     private final String user = "root";
//     private final String password = "";

//     /**
//      * @return
//      */
//     public String getPassword() {
//         return password;
//     }
//     try {
//         Class.forName(DRIVER);
//         return DriverManager.getConnection(url, user, password);
//     } catch (ClassNotFoundException ex){
//         throw new RuntimeException("Erro na conexão: ", ex);
//     }
// }
