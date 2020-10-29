package by.homework.homework3;

public class Task4{
    public static void main(String[] args){
        String str = "Just keep swimming. Just keep swimming. Just keep swimming, swimming, swimming. What do we do? We swim, swim.";
        //"Finding Nemo"
        String[] split = str.split(" ");
        for (String entry : split) {
            System.out.println(entry);
        }

    }
}
