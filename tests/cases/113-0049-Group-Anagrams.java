import java.util.*;
class RegressionTest {
 static void check(boolean ok){if(!ok)throw new AssertionError("group anagrams");}
 public static void main(String[] args){
  List<List<String>> actual=GroupAnagrams.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
  check(actual.equals(Arrays.asList(Arrays.asList("eat","tea","ate"),Arrays.asList("tan","nat"),Arrays.asList("bat"))));
  check(GroupAnagrams.groupAnagrams(new String[]{}).isEmpty());
  check(GroupAnagrams.groupAnagrams(new String[]{"",""}).equals(Arrays.asList(Arrays.asList("",""))));
  check(GroupAnagrams.groupAnagrams(new String[]{"abc","bca"}).size()==1);
 }
}