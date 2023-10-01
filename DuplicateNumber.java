package Week2;

import java.util.Arrays;

public class DuplicateNumber {

    static boolean isFind(int [ ]arr,int value){
        for(int i: arr){
            if( i==value){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {

             int []list={1,2,6,5,6,6,6,5,8,9,8};
             int[]duplicate=new int[list.length];
             int statrIndex=0;
             int sayac=0;
             for(int i=0; i< list.length; i++){

                 for(int k=0; k< list.length; k++){
                    if( list[i]%2==0 && list[i]==list[k]  ) {
                        sayac++;
                      if(!isFind(duplicate, list[i])){
                          duplicate[statrIndex++]=list[i];

                      }
                        break;
                    }

                 }
                 if(sayac>1){
                     duplicate[statrIndex++]=list[i];
                 }
                 sayac=0;
             }

        for(int i: duplicate){
            if(i!=0){
                System.out.println(i);
            }
        }

    }
}
