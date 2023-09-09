
package clientescruddos;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClientesCrudDos {

   Connection cn;
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_sistemas_ventas","root","");
            System.out.println("Conectado");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error"+e);
        }
        return cn;
    }
    
}
