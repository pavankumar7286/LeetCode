class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        for(int i = 1 ; i<salary.length;i++){
            if(salary[i]>max){
                max = salary[i];
            }
        }
        for(int i = 1 ; i<salary.length;i++){
            if(salary[i]<min){
                min = salary[i];
            }
        }
        int sum =0;
        for(int i =0;i<salary.length;i++){
            if(salary[i] != min && salary[i] != max){
                sum = sum + salary[i];
            }
            
        }
        double avg = (double)sum/(salary.length-2);
        return avg;
    }
}