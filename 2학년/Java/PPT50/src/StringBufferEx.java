public class StringBufferEx {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This");
        // StringBuffer ( end는 끝나는 숫자보다 1 많게 작성한다. )
        sb.append(" is pencil");
        System.out.println(sb);

        sb.insert(7, " my");
        System.out.println(sb);

        sb.replace(8, 10, "your");
        System.out.println(sb);

        sb.delete(8, 13);
        System.out.println(sb);

        sb.setLength(4); // setLength ( 길이만큼 짤라서 저장 )
        System.out.println(sb);
    }
}
