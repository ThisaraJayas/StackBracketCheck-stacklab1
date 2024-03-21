package stackLabPractice1;

public class BracketCheck {

    private String text;

    public BracketCheck(String v){
        text=v;
    }

    public void check(){
        int expLen = text.length();
        Stack newSt = new Stack(expLen);

        for(int i=0;i<expLen;i++){
            if(text.charAt(i)=='('){
                newSt.push(text.charAt(i));
            } else if (text.charAt(i)==')') {
                newSt.pop();
            }
        }
        if(newSt.isEmpty()){
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT");
        }
    }



}
