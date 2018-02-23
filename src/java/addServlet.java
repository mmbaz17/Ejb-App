
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author user
 */
@WebServlet(urlPatterns = {"/addServlet"})
public class addServlet extends HttpServlet {
    
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
    
    PrintWriter out =res.getWriter();
    
    int i = Integer.parseInt(req.getParameter("num1"));
    int j = Integer.parseInt(req.getParameter("num2"));
    
     int k =add(i,j);
     int l =sub(i,j);
     int m= divide(i,j);
     int n= multiply(i,j);
     
    out.println("Addition is   " + k);
    out.println("Sub is   " + l);
    out.println("Multiply   is" + m);
    out.println("Divide is   " + n);

    
        
    }
    
    public int add(int i,int j){
        
        return i+j;
    
    }
        public int sub(int i,int j){
        
        return i-j;
    
    }
        
        public int multiply(int i,int j){
        
        return i*j;
    
    }
            public int divide(int i,int j){
        
        return i/j;
    
    }

  
}
