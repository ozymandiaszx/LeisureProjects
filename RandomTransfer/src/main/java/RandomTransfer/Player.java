package RandomTransfer;

/**
 *
 * @author DOLPHIN-PC
 */
public class Player {

    public String name;
//    public int age;
//    public String position;
//    public int id;
    public int stat;

//    public Player(String nm, int a, String pos, int i , int st) {
    public Player(String nm, int st) {

        name = nm;
//        age = a;
//        position = pos;
//        id = i;
        stat = st;
    }

    @Override
    public String toString() {

//        return "ID:" + id + "\nName: " + name + "\nAge: " + age + "\nPosition: " + position + "\nStat:" + stat + "\n";
        return "Name: " + name + "\nStat:" + stat + "\n";
    }
}
