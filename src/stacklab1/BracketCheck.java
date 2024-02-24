package stacklab1;

public class BracketCheck {
    //Create variable
    private String inputString;

    public BracketCheck(String str){
        inputString=str;
    }
    public void check(){
        //assign size to maxSize
        int size = inputString.length();
        Stack stObj= new Stack(size);

        for(int i =0;i<size;i++){
            if(inputString.charAt(i)=='('){  //if ( push to stack
                stObj.push('(');
            } else if (inputString.charAt(i)==')') { //if ')' pop one pushed element from stack
                stObj.pop();                        //so pop all pushed elements if brackets equal
            }
        }
        if(!stObj.isEmpty()){
            System.out.println("Invalid String");
        }else {
            System.out.println("Valid String");
        }
    }
}
