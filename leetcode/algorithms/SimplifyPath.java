/*
 * Given an absolute path for a file (Unix-style), simplify it.

 * For example,
 * path = "/home/", => "/home"
 * path = "/a/./b/../../c/", => "/c"
 * click to show corner cases.
 * 
 * Corner Cases:
 * Did you consider the case where path = "/../"?
 * In this case, you should return "/".
 * Another corner case is the path might contain multiple slashes 
 * '/' together, such as "/home//foo/".
 * In this case, you should ignore redundant slashes and return 
 * "/home/foo".
 */
public class SimplifyPath {

    public String simplifyPath(String path) {
        String[] pathElem = path.split("/");
        LinkedList<String> list = new LinkedList<String>();
        for (int i = 0; i < pathElem.length; ++i) {
            if (pathElem[i].equals("") || pathElem[i].equals("."))
                continue;
            if (pathElem[i].equals("..")) {
                if (list.size() == 0)
                    continue;
                else 
                    list.removeLast();
            }
            else {
                list.add(pathElem[i]);
            }
        }
        String result = "";
        for (int i = 0; i < list.size(); ++i) {
            result += "/" + list.get(i);
        }
        return result;
    }

}
