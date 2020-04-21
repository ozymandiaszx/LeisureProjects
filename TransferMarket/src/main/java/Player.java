
/**
 *
 * @author DOLPHIN-PC
 */
public class Player {

    public String name;
    public int age;
    public String position;
    public int id;

    public Player(String nm, int a, String pos, int i) {
        
        name = nm;
        age = a;
        position = pos;
        id = i;
    }

    @Override
    public String toString() {
        
        return "ID:" + id + "\nName: " + name + "\nAge: " + age + "\nPosition: " + position + "\n";
    }
}
