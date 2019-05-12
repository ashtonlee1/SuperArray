public class Test{
    public static void print(SuperArray a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        String[] str = new String[]{"cat", "dog", "eye", "car", "hat", "door", "face"};
        SuperArray a = new SuperArray(str);
        System.out.println(a.toString());
        System.out.println(a.isEmpty());
        System.out.println(a.get(1));
        a.add(3, "food");
        System.out.println(a.set(4, "ribbon"));
        System.out.println(a.contains("eye"));
        System.out.println(a.IndexOf("hat"));
        System.out.println(a.lastIndexOf("door"));
        System.out.println(a.remove(4));
        a.remove("cat");
    }
}
