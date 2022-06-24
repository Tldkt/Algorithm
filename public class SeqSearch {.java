public class SeqSearch {
    //요소수가 n인 배열에서 key를 검색
    static int seqSearch(int[] a, int n, int key){
        //i를 1씩 늘리며 탐색
        for(int i=0;i<n;i++)
            if (a[i] == key)
            return i;
        return -1;
    }
    
    //main부분 실행
    public static void main(String[] args) {
    //입력받을 준비
      Scanner stdIn = new Scanner(System.in);
      
      System.out.print("type the length of array:");
    //입력된 수를 num으로 받기
      int num = stdIn.nextInt();
    //num의 길이를 갖는 x 선언
      int[] x = new int[num];
      System.out.println("write the numbers in increasing order only");

    //i를 늘려가며 반복
      for(int i=0;i<num;i++){
    //이전 입력받은 수보다 작으면, 다시 입력하라고 x[i] 보이기, 적절하게 입력해야 i++가능
        do{
          System.out.print("x[" +i+ "]:");
          x[i]=stdIn.nextInt();
          }while(x[i]<x[i-1]);  
        }
      System.out.println("write the number you wanna search for");
      int ky = stdIn.nextInt();
      
      int idx = binSearch(x,num,ky);
      
      if(idx == -1){//idx 선언을 안하면 어떻게 될까?
        System.out.println("Element is Not Found");
        }else{
          System.out.println("Element is found at index: " + idx);
          }

    }
}