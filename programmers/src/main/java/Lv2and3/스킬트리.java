package Lv2and3;

public class 스킬트리 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String s : skill_trees) {
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<s.length(); i++) {
                String s1 = String.valueOf(s.charAt(i));
                if (skill.contains(s1)) {
                    sb.append(s1);
                }
            }
            if (skill.startsWith(sb.toString())) {
                answer++;
            }
            if (sb.capacity() == 0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        스킬트리 ps = new 스킬트리();
        System.out.println(ps.solution("CBD",new String[]{"FDSF","CBDS","ASWC"}));
    }
}
/** 다른 사람 풀이
 * ArrayList<String> sk = new ArrayList<String>(Arrays.asList(skill_trees));
 * Iterator<String> it = skillTrees.iterator();
 * while (it.hasNext()) {
 *     if (skill.indexOf(it.next().replaceAll( "[^" + skill + +"]", "")) != 0) {
 *         it.remove();
 *     }
 * }
 * answer = sk.size();
 */