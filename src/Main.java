public class CodageFormaté {
    public static void main(String[] args) {
        String firstName = "Khalid Hicham";
        String lastName = "Sai";
        int age = 26;
        double poid = 89.8;
        System.out.println("Je suis " + lastName + firstName + ", et j'ai "+age+ " ans.");

        // codage formaté :
        // %s : for String
        // %d : for integer
        // %f : for double, add ".2" before f => %.2f, to have the numbers aprés la virgule.
        System.out.printf("Je suis %s %s, et j'ai %d ans, et je pèse %.2f kg.",firstName,lastName,age, poid);
    }
}
