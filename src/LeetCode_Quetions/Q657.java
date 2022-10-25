package LeetCode_Quetions;

class Q657 {
    public boolean judgeCircle(String moves) {
        
       int updown = 0; 
        int lefr = 0;
        
        for(int i = 0; i < moves.length(); i ++ ){
            if(moves.charAt(i)=='U'){
                updown ++;
            }if(moves.charAt(i)=='D'){
                updown --;
            }if(moves.charAt(i)=='L'){
                lefr ++;
            }if(moves.charAt(i)=='R'){
                lefr --;
            }
            
        }
        if(updown==0 && lefr == 0){
            return true;
        }
        return false;
    }
}