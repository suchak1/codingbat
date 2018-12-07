/*

Given a string, return a new string 
where the first and last chars have been exchanged.

*/

public String frontBack(String str) {
  
  if(str.length() < 2)
    return str;
  
  String s = str.substring(0, 1);
  String g = str.substring(1, str.length() - 1);
  String t = str.substring(str.length() - 1);
  
  return t + g + s;
}
