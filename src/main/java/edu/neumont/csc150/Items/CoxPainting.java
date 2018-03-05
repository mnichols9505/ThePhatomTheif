package edu.neumont.csc150.Items;

/**
 * sets valueof the Mr. Cox painting
 * @author Ashley, Marisol, Matthew
 */
public class CoxPainting extends Cash {
    /**
     * default contructor
     */
    public CoxPainting() {
        super(10000,"Images/Mr.Cox.PNG");
    }
    @Override
    int getAllowedDenomination() {
        return 10000;
    }

}
