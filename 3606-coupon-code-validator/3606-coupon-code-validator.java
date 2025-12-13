class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        List<String> ans = new ArrayList<>();
        List<String> elect = new ArrayList<>();
        List<String> groc = new ArrayList<>();
        List<String> pharm = new ArrayList<>();
        List<String> rest = new ArrayList<>();

        for (int i = 0; i < isActive.length; i++) {
            if (isActive[i]) {
                if (businessLine[i].equals("electronics") || businessLine[i].equals("grocery")
                        || businessLine[i].equals("pharmacy") || businessLine[i].equals("restaurant")) {
                    if (code[i].length() == 0)
                        continue;
                    boolean flag = true;
                    for (int j = 0; j < code[i].length(); j++) {
                        char ch = code[i].charAt(j);
                        if (!Character.isLetterOrDigit(ch) && ch != '_') {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        if (businessLine[i].startsWith("e"))
                            elect.add(code[i]);
                        if (businessLine[i].startsWith("g"))
                            groc.add(code[i]);
                        if (businessLine[i].startsWith("p"))
                            pharm.add(code[i]);
                        if (businessLine[i].startsWith("r"))
                            rest.add(code[i]);
                    }
                }
            }
        }
        Collections.sort(elect);
        ans.addAll(elect);
        Collections.sort(groc);
        ans.addAll(groc);
        Collections.sort(pharm);
        ans.addAll(pharm);
        Collections.sort(rest);
        ans.addAll(rest);
        return ans;
    }
}