public class StringBuffer {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("fajar");
        builder.append(" ");
        builder.append("abdillah");
        builder.append(" ");
        builder.append("ahmad");

        String fullName = builder.toString();//method toString() untuk merepresentasikan String
        System.out.println(fullName);
    }

}
