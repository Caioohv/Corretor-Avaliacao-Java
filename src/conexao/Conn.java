/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author CaioVieira
 */
public class Conn {
    public static Connection connect(){
        int opc =  1      ;
        // 0 = server local 10.0.0.0    -   Janio / IFMG
        // 1 = server local 127.0.0.1   -   Caio
        // 2 = server externo           -   Janio / IFMG
        // 3 = Sercer local 127.0.0.1   -   Carlos
        if(opc == 0){
            //Para ConexÃ£o do BD Oficial
            try{
                Class.forName("org.postgresql.Driver");
            } catch(ClassNotFoundException ex){
                return null;
            }
            String usuario = "correcaocartao";
            String senha = "correcaocartao";
            //String banco = "jdbc:postgresql://200.18.128.54/caiohvieira";
            String banco = "jdbc:postgresql://10.90.24.54/correcaocartao";
            try{
                return DriverManager.getConnection(banco,usuario, senha);
            } catch (SQLException ex){
                System.out.println(ex.getMessage());
                return null;
            }
            //Para teste local
        }else if(opc == 1){
            try{
                Class.forName("org.postgresql.Driver");
            } catch(ClassNotFoundException ex){
                return null;
            }
            
            String usuario = "postgres";
            String senha = "root";
            System.out.println(usuario + " - " + senha);
            //String banco = "jdbc:postgresql://200.18.128.54/caiohvieira";
            String banco = "jdbc:postgresql://localhost/corretor";
            System.out.println("Entrou na conn = 1");
            try{
                Class.forName("org.postgresql.Driver");
                System.out.println(" - - - - - - - CONEXÃO CRIADA - - - - - - - - - - -");
                return DriverManager.getConnection(banco,usuario, senha);
            } catch (Exception ex){
                System.out.println(ex.getMessage());
                return null;
            }
        }else if(opc == 2){
             try{
                Class.forName("org.postgresql.Driver");
            } catch(ClassNotFoundException ex){
                return null;
            }


            String usuario = "correcaocartao";
            String senha = "correcaocartao";
            //String banco = "jdbc:postgresql://200.18.128.54/caiohvieira";
            String banco = "jdbc:postgresql://200.18.128.54/correcaocartao";
            try{
                return DriverManager.getConnection(banco,usuario, senha);
            } catch (SQLException ex){
                System.out.println(ex.getMessage());
                
            }
        }else if(opc == 3){
            try{
                Class.forName("org.postgresql.Driver");
            } catch(ClassNotFoundException ex){
                return null;
            }
            
            int loló = 1;
            String usuario = "postgres";
            String senha = "Xesque";


            
            //String banco = "jdbc:postgresql://200.18.128.54/caiohvieira";
            String banco = "jdbc:postgresql://localhost/corretor";
            try{
                Class.forName("org.postgresql.Driver");
                System.out.println(" - - - - - - - CONEXÃO CRIADA - - - - - - - - - - -");
                return DriverManager.getConnection(banco,usuario, senha);
            } catch (Exception ex){
                System.out.println(ex.getMessage());
                return null;
            }
        }
        return null;
    
    }
}
