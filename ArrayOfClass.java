
 class Data
{

String name;
int rollNo;
}

public class ArrayOfClass {
    
   public static void main(String[] args) {
    
    Data data[]=new Data[3];
     data[0] = new Data();
        data[1] = new Data();
        data[2] = new Data();
    data[0].name="Aniket";
    data[0].rollNo= 37;
    data[1].name= "XYZ";
    data[1].rollNo = 44;
    data[2].name= "ABC";
    data[2].rollNo = 78;

    for(int i=0; i<data.length; i++){
        System.err.println(data[i].name +" : "+data[i].rollNo);
    }
    for(Data datas : data){
         System.err.println(datas.name +" : "+datas.rollNo);
    }
   }
}


