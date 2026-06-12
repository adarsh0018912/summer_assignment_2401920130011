class Solution {
    public int compress(char[] arr){
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<arr.length){
            int j=i;
            while(j<arr.length && arr[i]==arr[j]){
                j++;
            }
            sb.append(arr[i]);
            int freq=j-i;
            if(freq>1){
                sb.append(freq);
            }
            i=j;

        }
        for( int k=0;k<sb.length();k++){
            arr[k]=sb.charAt(k);
        }

        return sb.length();
    }

}