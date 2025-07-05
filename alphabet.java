class alphabet{
    public static void main(String[] args) {
       int v_count = 0;
       int c_count = 0;
       int I_count = 0;
       int S_count = 0;
       String s ="hello@_123#";
       char ch;
       for(int i=0;i<s.length();i++){
        ch=s.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            v_count++;
        }
        else if (ch>='a'&&ch<='z'||ch>'A'&&ch<='z){
            c_count++;
        }
        else if (ch>='0'&&ch<='9'){
            I_count++;
        }
        else{
            S_count++;
        }
       } 
       System.out.println(v_count);
       System.out.println(c_count);
       System.out.println(I_count);
       System.out.println(S_count);
    }
}



