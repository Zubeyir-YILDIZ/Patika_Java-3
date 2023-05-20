public class QuickSort
{
    void sort(int arr[], int first, int last)
    {
        if (first < last)
        {

            int result = divider(arr, first, last);

            sort(arr, first, result -1);
            sort(arr, result +1, last);
        }
    }
    int divider(int arr[], int first, int last)
    {
        int pivot = arr[last];
        int i = (first -1);
        for (int j = first; j< last; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[last];
        arr[last] = temp;

        return i+1;
    }
}






