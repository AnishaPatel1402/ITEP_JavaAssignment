class Test{
    public static void main(String args[]){
        int arr[] = {2,322,322,4,15,2,2,5,14,6};
        int n = arr.length;
        boolean visited[] = new boolean[n];
        for(int i=0; i<n; i++){
            if(visited[i]) continue;
            int count = 1;
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println("occurence of "+ arr[i] +" is = "+ count);
        }
    }
}