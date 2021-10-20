class Solution {
    public String interpret(String command) {
        int len = command.length()-1;
        StringBuilder s = new StringBuilder(len);
        for(int i=0; i<command.length(); i++){
            if(command.charAt(i) == 'G'){
                s.append('G');
            }
            if(command.charAt(i) == '(' && command.charAt(i+1) == 'a'){
                s.append('a');
                s.append('l');
            }
              if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                s.append('o');
            }
              
              
        }
       return s.toString();
    }
}
