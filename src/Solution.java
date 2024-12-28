public class Solution {
    public static void main(String[] args) throws Exception {
    System.out.println(TreeConstructor(new String[]{"(1,2)", "(3,2)", "(2,12)", "(5,2)"}));
    }

    public static String TreeConstructor(String[] strArr){
        int length = strArr.length;
        int[] child_nodes = new int[length];
        int[] par_nodes = new int[length];

        for(int i=0; i< length; i++){
            String[] splited = strArr[i].split(",");
            child_nodes[i] = Integer.parseInt(splited[0].replace("(", ""));//extract a in (a,b)
            par_nodes[i] = Integer.parseInt(splited[1].replace(")", ""));//extract b in (a,b)
        }
        Boolean child_unique = true;
        for(int j=0; j< length; j++){
            for(int k=0; k< length; k++){
                if(j!=k && child_nodes[j] == child_nodes[k]){ //we check if all children are unique
                    child_unique = false;
                    k = length; //stops inner loop
                }
            }
            j = length; //stops outer loop, to avoid greater time complexity
        }
        if(child_unique == false){
            return "false";
        }

        Boolean par_occurs_twice = true;
        for(int j=0; j< length; j++){
            int count_occurances = 0;
            for(int k=0; k< length; k++){
                if(par_nodes[j] == par_nodes[k]){ //keep track of parent occurances
                    count_occurances++;
                }
                if(count_occurances > 2){
                    par_occurs_twice = false;
                    k = length; //stops inner loop
                    //System.out.println(par_nodes[j]+" occured "+ count_occurances+ " times.");
                }
            }
            j = length; //stops outer loop, to avoid greater time complexity
        }

        if(par_occurs_twice == false){
            return "false";
        }

        return "true"; //true is returned if all children were unique and all parents occured not more than 2 times
    }
}
