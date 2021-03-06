package other;

import org.junit.Test;

public class SetFlag {

    private static final int UNSET = -1;            //-1 //11111111111111111111111111111111
    private static final int CLICK_ABLE = 1 << 1;   //2  //  10
    private static final int SELECT_ABLE = 1 << 2;  //4  // 100
    private static final int EDIT_ABLE = 1 << 3;    //8  //1000

    int flag;//0

    @Test
    public void testSetFlag() {
        flag |= EDIT_ABLE;      //1110
        flag |= SELECT_ABLE;    // 100
        flag |= CLICK_ABLE;     //  10
        System.out.println(flag);
        System.out.println(Integer.toBinaryString(flag));

        System.out.println((flag & EDIT_ABLE) != 0);
        System.out.println((flag & SELECT_ABLE) != 0);
        System.out.println((flag & CLICK_ABLE) != 0);

        clear();
        System.out.println(flag);
    }

    private void clear(){
        flag &= 0;  //0
    }
}
