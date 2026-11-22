// class Solution {
//     public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        
//         Set<Integer> set= new HashSet<>();


//         for(int i=0; i<bulbs.size(); i++){
//             int val=bulbs.get(i);
//             if(!set.contains(val)){
//                 set.add(val);
//             }else{
//                 set.remove(val);
//             }
//         }
//         List<Integer> list= new ArrayList<>(set);
//         Collections.sort(list);
//         return list;
//     }
// }

class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        
        List<Integer> list= new ArrayList<>();
        boolean [] flag=new boolean[101];

        for(int value: bulbs){
            flag[value]=!flag[value];
        }

        for(int i=0; i<flag.length; i++){
            if(flag[i]){
                list.add(i);
            }
        }
        return list;
    }
}