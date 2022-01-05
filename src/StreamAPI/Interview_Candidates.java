package StreamAPI;

import java.util.ArrayList;
import java.util.Collections;

class Interview_Candidates
{
    boolean areNatives(ArrayList<Candidates> candidatesList)
    {
        //Enter your Code here
        int res = (int)candidatesList.stream().filter((c) -> 
        c.locality.equals("Native")).count();
        return res == candidatesList.size();
        
    }
    
    Candidates youngestCandidate(ArrayList<Candidates> candidatesList)
    {
        //Enter your Code here
        Collections.sort(candidatesList,(o1,o2) -> o1.age - o2.age);
        return candidatesList.get(0);
        
    }
}
