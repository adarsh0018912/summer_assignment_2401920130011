class Solution {
    public String reverseWords(String s) {
        String[] wrods=s.split(" ");
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<wrods.length;i++){
            sb.append(rev(wrods[i]));
            if (i != wrods.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static String rev(String st){
        char[] str=st.toCharArray();
        int i=0;
        int j=str.length-1;
        while(i<j){
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
        return new String(str);
    }
}