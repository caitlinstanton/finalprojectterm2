import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;

public class addressBookTypeController extends TNOrderedLinkedList{
    public TNOrderedLinkedList<extPersonType> linkedList = new TNOrderedLinkedList<extPersonType>();

    public void loadData(){
        Scanner inputStream = null;

    try{
        inputStream = new Scanner(new FileInputStream("Programming Assignment 1 Data.txt"));
    }catch(FileNotFoundException e){
        System.out.println("File Programming Assignment 1 Data.txt was not found");
        System.out.println("or could not be opened.");
        System.exit(0);
    }
        String[] temp = new String[8];
        int i = 0;
        String first = "", last = "", month = "", day = "", year = "", address = "", city = "", state = "", zip = "", number = "";
        
        while(inputStream.hasNext()){
            inputStream.useDelimiter("\n");
            temp[i] = inputStream.next();
            if(i == 0){
                String theName = temp[i];
                String[] split = theName.split(" ");
                first = split[0];
                last = split[1];
            }
            if(i == 1){
                String theDate = temp[i];
                String[] split = theDate.split(" ");
                month = split[0];
                day = split [1];
                year = split [2];
            }
            i++;
            if(i == 8){
                addressType tempAddr = new addressType(temp[2],temp[3],temp[4],temp[5]);
                dateType tempDob = new dateType(month,day,year);
                extPersonType extPerson = new extPersonType(first,last,tempAddr,tempDob,number,temp[7]);
                linkedList.addToStart(extPerson);
                i = 0;
            }
        }
    }
    public void searchPerson(String searchLastName){
        Scanner cin = new Scanner(System.in);
        String lastName;
        System.out.println("Enter last name: ");
        lastName = cin.next();
        linkedList.findData(lastName);
    }
}


