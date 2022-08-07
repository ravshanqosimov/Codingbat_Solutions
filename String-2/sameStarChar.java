/*
Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true
*/

// method 1
// public boolean sameStarChar(String str) {
//   boolean eq=true;
//   for (int i=1;i<str.length()-1;i++){
//     if(str.charAt(i)=='*'&&str.charAt(i-1)!=str.charAt(i+1)){eq= false;break;}
//   }
//   return eq;
// }


public boolean sameStarChar(String str) {
  int z = -1;
  for(int i=1; i < str.length()-1; i++)
  {
    if(str.charAt(i) == '*') {
      if(str.charAt(i-1) == str.charAt(i+1)){
        z=i;
      }
      else{
        return false;
      }
    }
  }
  if(z > 0 || z == -1) {
    return true;
  }
  else {
  return false;
  }
}
