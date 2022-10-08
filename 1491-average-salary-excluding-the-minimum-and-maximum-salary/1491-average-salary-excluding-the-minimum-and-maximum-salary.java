class Solution {
    public double average(int[] salary) {
        double min = salary[0];
        double max = 0;
        double total = 0;
        for (int i=0;i<salary.length;i++){
            if(salary[i] < min){
                min = salary[i];
            }
            if (salary[i]> max){
                max = salary[i];
            }
            total += salary[i];
        }

        return (total-max- min) / (salary.length-2);
    }
}