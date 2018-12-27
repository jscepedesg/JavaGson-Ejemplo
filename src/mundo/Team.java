package mundo;

import java.util.ArrayList;

public class Team 
{
   /* Atributos  */
 // private User user[];
    private ArrayList team;
    
    /* Constructor */
    public Team()
    { /*
      user = new User[3];
    
      user[0] = new User("Billy Joel", "192.168.0.1");
      user[1] = new User("Thom Yorke", "192.168.0.2");
      user[2] = new User("Gordon Matthew - Sting", "192.168.0.3");
      */
    	
      
      team = new ArrayList();	
      team.add(new User("Billy Joel", "192.168.0.1"));
      team.add(new User("Thom Yorke", "192.168.0.2"));
      team.add(new User("Gordon Matthew - Sting", "192.168.0.3"));
       	
    }   
}
