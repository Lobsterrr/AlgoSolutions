/*
 * Given an absolute path for a file (Unix-style), simplify it.

Example
"/home/", => "/home"

"/a/./b/../../c/", => "/c"

Challenge 
Did you consider the case where path = "/../"?

In this case, you should return "/".

Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".

In this case, you should ignore redundant slashes and return "/home/foo".
 */
public class SimplifyPath {

    /**
     * @param path the original path
     * @return the simplified path
     */
    public String simplifyPath(String path) {
        String[] array = path.split("/");
        List<String> list = new ArrayList<String>();
        for (String s : array) {
            if (s.equals(".") || s.equals("")) {
                continue;
            }
            if (s.equals("..") && list.size() > 0) {
                list.remove(list.size() - 1);
            } else {
                list.add(s);
            }
        }
        String result = "";
        for (String s : list) {
            result += "/" + s;
        }
        if (result.length() == 0) {
            result += "/";
        }
        return result;
    }

}
