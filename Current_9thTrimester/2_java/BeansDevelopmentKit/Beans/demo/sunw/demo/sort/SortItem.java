/*
 * @(#)SortItem.java	1.4 96/12/06
 *
 * Copyright (c) 1994-1996 Sun Microsystems, Inc. All Rights Reserved.
 *
 * Sun grants you ("Licensee") a non-exclusive, royalty free, license to use,
 * modify and redistribute this software in source and binary code form,
 * provided that i) this copyright notice and license appear on all copies of
 * the software; and ii) Licensee does not utilize the software in a manner
 * which is disparaging to Sun.
 *
 * This software is provided "AS IS," without a warranty of any kind. ALL
 * EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND WARRANTIES, INCLUDING ANY
 * IMPLIED WARRANTY OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE OR
 * NON-INFRINGEMENT, ARE HEREBY EXCLUDED. SUN AND ITS LICENSORS SHALL NOT BE
 * LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING
 * OR DISTRIBUTING THE SOFTWARE OR ITS DERIVATIVES. IN NO EVENT WILL SUN OR ITS
 * LICENSORS BE LIABLE FOR ANY LOST REVENUE, PROFIT OR DATA, OR FOR DIRECT,
 * INDIRECT, SPECIAL, CONSEQUENTIAL, INCIDENTAL OR PUNITIVE DAMAGES, HOWEVER
 * CAUSED AND REGARDLESS OF THE THEORY OF LIABILITY, ARISING OUT OF THE USE OF
 * OR INABILITY TO USE SOFTWARE, EVEN IF SUN HAS BEEN ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGES.
 *
 * This software is not designed or intended for use in on-line control of
 * aircraft, air traffic, aircraft navigation or aircraft communications; or in
 * the design, construction, operation or maintenance of any nuclear
 * facility. Licensee represents and warrants that it will not use or
 * redistribute the Software for such purposes.
 */

package sunw.demo.sort;

import java.awt.*;
import java.awt.event.*;
import java.io.InputStream;
import java.util.Hashtable;
import java.net.*;

/**
 * A simple applet class to demonstrate a sort algorithm.
 * You can specify a sorting algorithm using the "alg"
 * attribyte. When you click on the applet, a thread is
 * forked which animates the sorting algorithm.
 *
 * @author James Gosling
 * @version 	1.17f, 10 Apr 1995
 */
public class SortItem extends java.applet.Applet implements Runnable, MouseListener {
    /**
     * The thread that is sorting (or null).
     */
    transient private Thread kicker;

    /**
     * The array that is being sorted.
     */
    transient int arr[];

    /**
     * The high water mark.
     */
    transient int h1 = -1;

    /**
     * The low water mark.
     */
    transient int h2 = -1;

    /**
     * The name of the algorithm.
     */
    String algName = "BubbleSort";

    /**
     * The sorting algorithm (or null).
     */
    transient SortAlgorithm algorithm;

    // The sie of the area we're drawing into.  This represents the
    // size of our window when we started the current sort.
    transient private int width;
    transient private int height;



    public SortItem() {
	resize(100, 100);
	addMouseListener(this);
    }


    /**
     * Fill the array with random numbers from 0..n-1.
     */
    void scramble() {
	// Get the current width
	width = getSize().width;
	// Get the current height rounded to multiple of two.
	height = 2 * (getSize().height/2);

	int a[] = new int[height / 2];
	double f = width / (double) a.length;
	for (int i = a.length; --i >= 0;) {
	    a[i] = (int)(i * f);
	}
	for (int i = a.length; --i >= 0;) {
	    int j = (int)(i * Math.random());
	    int t = a[i];
	    a[i] = a[j];
	    a[j] = t;
	}
	arr = a;
    }

    /**
     * Pause a while.
     * @see SortAlgorithm
     */
    void pause() {
	pause(-1, -1);
    }

    /**
     * Pause a while, and draw the high water mark.
     * @see SortAlgorithm
     */
    void pause(int H1) {
	pause(H1, -1);
    }

    /**
     * Pause a while, and draw the low&high water marks.
     * @see SortAlgorithm
     */
    void pause(int H1, int H2) {
	h1 = H1;
	h2 = H2;
	if (kicker != null) {
	    repaint();
	}
	try {Thread.sleep(20);} catch (InterruptedException e){}
    }

    /**
     * Initialize the applet.
     */
    public void init() {
	algName = getParameter("alg");
	if (algName == null) {
	    algName = "BubbleSort";
	}
    }

    /**
     * (re)start the applet.
     */
    public void start() {
	scramble();
    }    

    /**
     * Paint the array of numbers as a list
     * of horizontal lines of varying lenghts.
     */
    public void paint(Graphics g) {
	int a[] = arr;
	int y = height - 1;

	if (a == null) {
	    // Sometimes "paint" gets called before scamble has 
	    // initialized things.
	    return;
	}

	// Erase old lines
	g.setColor(getBackground());
	for (int i = a.length; --i >= 0; y -= 2) {
	    g.drawLine(arr[i], y, width, y);
	}

	// Draw new lines
	g.setColor(Color.black);
	y = height - 1;
	for (int i = a.length; --i >= 0; y -= 2) {
	    g.drawLine(0, y, arr[i], y);
	}

	if (h1 >= 0) {
	    g.setColor(Color.red);
	    y = h1 * 2 + 1;
	    g.drawLine(0, y, width, y);
	}
	if (h2 >= 0) {
	    g.setColor(Color.blue);
	    y = h2 * 2 + 1;
	    g.drawLine(0, y, width, y);
	}
    }

    /**
     * Update without erasing the background.
     */
    public void update(Graphics g) {
	paint(g);
    }

    /**
     * Run the sorting algorithm. This method is
     * called by class Thread once the sorting algorithm
     * is started.
     * @see java.lang.Thread#run
     * @see SortItem#mouseClicked
     */
    public void run() {
	try {
	    if (algorithm == null) {
		String className = "sunw.demo.sort." + algName + "Algorithm";
		algorithm = (SortAlgorithm)Class.forName(className).newInstance();
		algorithm.setParent(this);
	    }
	    algorithm.init();
	    algorithm.sort(arr);
	} catch(Exception ex) {
	    System.err.println("SortItem.run " + ex);
	    ex.printStackTrace(System.err);
	}
    }

    /**
     * Stop the applet. Kill any sorting algorithm that
     * is still sorting.
     */
    public synchronized void stop() {
	if (kicker != null) {
            try {
		kicker.stop();
            } catch (IllegalThreadStateException e) {
                // ignore this exception
            }
	    kicker = null;
	}
	if (algorithm != null){
            try {
		algorithm.stop();
            } catch (IllegalThreadStateException e) {
                // ignore this exception
            }
	}
    }


    /**
     * For a Thread to actually do the sorting. This routine makes
     * sure we do not simultaneously start several sorts if the user
     * repeatedly clicks on the sort item.  It needs to be
     * synchronoized with the stop() method because they both
     * manipulate the common kicker variable.
     */
    private synchronized void startSort() {
	if (kicker == null || !kicker.isAlive()) {
	    scramble();
	    repaint();
	    kicker = new Thread(this);
	    kicker.start();
	}
    }

    //----------------------------------------------------------------------
    // Mouse listener methods.

    public void mouseClicked(MouseEvent evt) {
	// The user wants to start the sort.
	try {
	    startSort();
	} catch(Throwable th) {
	    System.err.println("SortItem.mouseClicked " + th);
	    th.printStackTrace();
	}
    }

    public synchronized void mousePressed(MouseEvent evt) {
    }

    public void mouseReleased(MouseEvent evt) {
    }

    public void mouseEntered(MouseEvent evt) {
    }

    public void mouseExited(MouseEvent evt) {
    }

    //----------------------------------------------------------------------

    public String getAlgorithm() {
	return algName;
    }

    public void setAlgorithm(String alg) {
	algName = alg;
	algorithm = null;
    }

}

