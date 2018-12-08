/*

Given a string, return a string made of the first 2 chars 
(if present), however include first char only if it is 'o' 
and include the second only if it is 'z', so "ozymandias" yields "oz".

*/


public String startOz(String str) {
  
  if(str.equals(""))
    return "";
  
  if(str.length() > 1 && str.substring(0, 2).equals("oz"))
    return "oz";
  else if(str.charAt(0)== 'o')
    return "o";
  else if(str.charAt(1)== 'z')
    return "z";
  else
    return "";
}
