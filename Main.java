//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }


}


public boolean hasDuplicate(int[] nums) {
    // intializng a hasshet
    HashSet<Integer> set = new HashSet<>();

    // for loop to go through array of integers
    for (int i = 0; i < nums.length; i++) {
        if (set.contains(nums[i])) {
            return true; // reutrn true and exist if number already exists in hashset
        } else // add that number ot the set.
        {
            set.add(nums[i]);
        }
    }
    return false; // means no duplcate found, as it went thorugh the for loop without finding anythign.
}


