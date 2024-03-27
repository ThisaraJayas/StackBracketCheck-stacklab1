package stackLabPractice2;

public class BracketCheck {
    private String text;

    public BracketCheck(String v){
        text=v;
    }


    public void check(){
        int count = text.length();
        Stack st = new Stack(count);
        for(int i=0;i<count;i++){
            if(text.charAt(i)=='('){

                    st.push(text.charAt(i));

            }else if(text.charAt(i)==')'){

                    st.pop();

            }

        }
        if(st.isEmpty()){
            System.out.println("Valid");
        }else {
            System.out.println("Invalid");
        }
    }

}
