/*

Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

*/

public int diff21(int n) {
  int res = Math.abs(21-n);
  
  if(n>21)
    return res*2;
  else
    return res;
}
