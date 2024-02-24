package stacklab1;

public class BracketCheck {
    private String inputString;

    public BracketCheck(String str){
        inputString=str;
    }
    public void check(){
        int size = inputString.length();
        Stack stObj= new Stack(size);

        for(int i =0;i<size;i++){
            if(inputString.charAt(i)=='('){
                stObj.push('(');
            } else if (inputString.charAt(i)==')') {
                stObj.pop();
            }
        }
        if(!stObj.isEmpty()){
            System.out.println("Invalid String");
        }else {
            System.out.println("Valid String");
        }
    }
}
