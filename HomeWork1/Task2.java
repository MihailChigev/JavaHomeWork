//2. Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от 
//заданного, а остальные - равны ему.

package HomeWork1;

public class Task2 {
    public static void main(String[] args) {
        int val = 3;
        int[] nums = {3,2,2,3};
        int[] a = nums;
 
        for(int i =0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        numtoend(a, nums, val);
        }
        public static void numtoend (int[]a, int[]nums, int val){
        int j =0;
        for(int i = 0; i<nums.length; i++){
            if (nums[i] != val) {
                a[j]=nums[i];
                j++;
            }
            }
        for(int i = j; i<a.length; i++){
            a[i]=val;
        }
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        
        }
        }
    }

