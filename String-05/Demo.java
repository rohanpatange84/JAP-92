public class Demo {
    public static  String longestCommonPrefix(String[] strs) {
       
        int res=strs[0].length();
        int index=0;
       for(int i=0;i<strs.length;i++){
        if(strs[i].length()<res){
            index=i;
        }

       }

    String str=strs[index];

    String newStr="";
    System.out.println(str);
    for(int i=0;i<str.length();i++){
        boolean light=true;
        char ch =str.charAt(i);
        for(int j=0;j<strs.length;j++){
            if(strs[j].charAt(i)!=ch){
                light=false;
            }

            



        }
        if(light){
                newStr+=ch;
            }
    }

    return newStr;

    }

    public static void main(String[] args) {
        
        String strs[]={"flower","flow","flight"};

        System.out.println(longestCommonPrefix(strs));
    }
}