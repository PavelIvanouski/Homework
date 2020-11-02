package by.homework.homework3;

public class Task4 {
    public static void main(String[] args) {
        String str = "Just keep swimming. Just keep swimming. Just keep swimming, swimming, swimming. What do we do? We swim, swim.";
        //"Finding Nemo"
        System.out.println(str);
        String regex = "[,.?!:;]";
        String formattedString = str.replaceAll(regex, " ");
        char marker = '!';
        String[] split = formattedString.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].isEmpty()) {
                continue;
            }
            String currentWorld = split[i];
            if (currentWorld.charAt(0) == marker) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < split.length; j++) {
                if (split[j].equalsIgnoreCase(currentWorld)) {
                    count++;
                    split[j] = marker + split[j];
                }
            }
            System.out.println("The world \"" + currentWorld + "\" occurs " + count + " time(s).");
        }
    }
}
