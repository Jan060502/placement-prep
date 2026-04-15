public class SecondMax{

int[] arr = {3, 7, 2, 9, 5};

int max = Integer.MIN_VALUE;
int secondMax = Integer.MIN_VALUE;

for (int num : arr) {
    if (num > max) {
        secondMax = max;
        max = num;
    } else if (num > secondMax && num != max) {
        secondMax = num;
    }
}

System.out.println(secondMax); 
}