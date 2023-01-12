

public class App {
    public static void main(String[] args) {
        int[] list1 = new int[] {1, 2, 3, 4, 5};
        int[] list2 = new int[] {5, 6, 7, 8, 9};

        for(int i=0; i<list1.length; i++){
            for(int j=0; j<list2.length; j++){
                if(list1[i] == list2[j]){
                  System.out.println("list["+i+"]: "+list1[i]+" = list2["+j+"]: "+list2[j]);
                  break;
                }
            }
        }
    }
}
