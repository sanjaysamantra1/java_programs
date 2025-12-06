public class FirstLetterCapital {
 
 
  public static void main(String[] args){
      try{
        String test = "i am a student.";
        String[] testSplit = test.split( " " );
        StringBuffer sb = new StringBuffer();
        for (int i =0 ; i < testSplit.length ; i ++){
            String capitalVer = capitalizeFirstLetter(testSplit[i]);
            if( i != 0 ){
                sb.append(" ");
            }
            sb.append(capitalVer);
        }
        System.out.println(sb.toString());
      }catch(Exception es){
 
      }
  }
 
 
    public static String capitalizeFirstLetter(final String string)
  {
     if (string == null || string.equals("") )
        throw new NullPointerException("no string ");
 
     return Character.toUpperCase(string.charAt(0)) + string.substring(1);
  }
 
 
}

