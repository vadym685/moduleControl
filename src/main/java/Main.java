public class Main {


    public static void main(String[] args) {
        Human[] headquarters = new Human[9];

        headquarters[0] = new Soldier("soldier1", 32);
        headquarters[1] = new Soldier("soldier2", 25);
        headquarters[2] = new Soldier("soldier3", 27);
        headquarters[3] = new Soldier("soldier4", 31);
        headquarters[4] = new Soldier("soldier5", 23);
        headquarters[5] = new Soldier("soldier6", 30);
        headquarters[6] = new Captain("capitan1", 40);
        headquarters[7] = new Captain("capitan2", 35);
        headquarters[8] = new General("general1", 54);

        for (int i = 0; i <= 8; i = i + 1) {
            Human human = headquarters[i];
            try {
                System.out.println("Name: " + human.getName() + " Age: " + human.getAge() + " Can fight:" + human.canFight().toString()+ " Subordinates:" + human.canReport());
            } catch (UserException e) {
                e.printStackTrace();
            }
        }

    }
}
