/*

Given a string, return a new string where "not " has been added to the front. 
However, if the string already begins with "not", return the string unchanged.

*/


def not_string(str):
  return str if str.startswith("not") else "not " + str
  


