class Solution{
    public static void main(String[] args) {
        int a=3,b=5;
            int c=0;
            while(b>=a){
                b=b-a;
                c+=1;
            }
            b=b*a;
            c=c+b;
            System.out.println("moves: "+c);
    
    }
}
