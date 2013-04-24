package edu.zzabost.spoj.depend;

import java.io.IOException;
import java.util.*;

/**
 * Solution for DEPEND problem from Sphere Online Judge (SPOJ)
 * http://www.spoj.com/problems/DEPEND/
 *
 * User: Zbigniew Zabost
 * Date: 4/24/13
 */
public class Depend {

    public static void main (String[] args) throws IOException {
        List<Pair> dependencyList = new ArrayList<Pair>();

        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String inputLine = input.nextLine();
            if (inputLine == null || inputLine.isEmpty()) {
                break;
            }
            String[] splitLine = inputLine.split(" ");
            ArrayList<String> lineAsArray =  new ArrayList(Arrays.asList(splitLine));
            String key = lineAsArray.get(0);
            Set<String> dependencies = new HashSet<String>();
            if (lineAsArray.size() > 1) {
                dependencies.addAll(lineAsArray.subList(1, lineAsArray.size()-1));
            }
            Pair dependencyPair = new Pair(key, dependencies);
            dependencyList.add(dependencyPair);
        }

        final Integer installedPackages = checkDependencies(dependencyList);
        System.out.println(installedPackages);

        return;
    }

    public static Integer checkDependencies(List<Pair> dependencyList) {
        Set<String> installedPackages = new HashSet<String>();

        Iterator it = dependencyList.iterator();

        boolean changes = true;
        while (changes) {
            changes = false;
            for (Pair dep : dependencyList) {
                if (dep.getValue().size() == 0 && !installedPackages.contains(dep.getKey())) {
                    installedPackages.add(dep.getKey());
                    changes = true;
                }
                if (installedPackages.containsAll(dep.getValue()) && !installedPackages.contains(dep.getKey())) {
                    installedPackages.add(dep.getKey());
                    changes = true;
                }
            }
        }

        return installedPackages.size();
    }

    static class Pair {

        private String key;
        private Set<String> value;

        public Pair() {
            key = new String();
            value = new HashSet<String>();
        }

        public Pair(final String key) {
            this.key = key;
            value = new HashSet<String>();
        }

        public Pair(final String key, final Set<String> value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Set<String> getValue() {
            return value;
        }

    }

}
