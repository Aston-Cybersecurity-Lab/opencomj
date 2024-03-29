/*
 * ICalculator.java
 *
 * OpenCOMJ is a flexible component model for reconfigurable reflection developed at Lancaster University.
 * Copyright (C) 2005 Paul Grace
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License 
 * as published by the Free Software Foundation; either version 2 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty 
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program; if not, 
 * write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

package OpenCOM.Samples.CalculatorComponent;
import OpenCOM.*;

/**
 * General calculator interface.
 * @author  Paul Grace
 * @version 1.3.5
 */
public interface ICalculator extends IUnknown{
 
    /**
     * Add two integers together.
     * @param x Operand X.
     * @param y Operand Y.
     * @return The added values.
     */
    public int add(int x, int y);

    /**
     * Subtract operand y from x.
     * @param a Operand X.
     * @param b Operand Y.
     * @return The result of the subtraction.
     */
    public int subtract(int x, int y);

    /**
     * Concatenate a display message to the passed message.
     * @param message The message to attach to.
     * @return The concatenated string.
     */
    public String display(String a);
    
    /**
     * Time passing function. Simply operates in the component
     * doing nothing for the specified time period then 
     * returns.
     * @param seconds The time to wait for.
     */
    public void Wait(long time);
}
