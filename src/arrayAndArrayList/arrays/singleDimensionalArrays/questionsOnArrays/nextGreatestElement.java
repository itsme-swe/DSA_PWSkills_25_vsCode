package arrayAndArrayList.arrays.singleDimensionalArrays.questionsOnArrays;

public class nextGreatestElement {

    public static void main(String[] args) {

        int [] arr = {12, 8, 41, 37, 60, 49, 16, 28, 21};

        int n = arr.length;

        int [] ans = new int[n];

        ans[n-1] = -1;

        int nge = arr[n-1]; // nge(NextGreatestElement) yaha pae hum nae nge kae anadr array ki last value ko store kiya hai

        for (int i = n -2; i >= 0; i--) {

            ans[i] = nge;

            nge = Math.max(nge, arr[i]);    // yae compare kar raha hai ki nge value sae koi badi value hai kya arr[] array mae, agar hui toh nge ko update kardega
        }

        System.out.print("arr[] : ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        System.out.print("ans[] : ");
        for (int ele : ans) {
            System.out.print(ele + " ");
        }

    }
}

/*
* Output: arr[]: 12 8 41 37 60 49 16 28 21
          ans[]: 60 60 60 60 49 28 28 21 -1
Approach :
1️⃣ Ismae hum array ko descending order mae iterate karenge. Aur ham yae maan kae chalenge kae ki array ki last value ka koi greatest element hoga nhi is liye hum usmae -1 value store kara daenge.
2️⃣ Aur aub last value yani ki 'n-1' pae humnae -1 store kiya hua hai toh hum array ko second last indexValue sae start karenge aur jub tuk iterate karenge jub tuk ki arr[i] 0 ya 0 kae barabar nhi hota.
3️⃣ Aur phir hum ans[] array ki pheli value mae -1 insert kar daenge uskae baad iterate karte huae joh next greatest element hoga usko store karate huae jayenge.

*/
