package sun.beanbox;

import java.io.*;
import java.util.*;

/**
 *
 * @version           1.15, 96/11/19
 * @author           David Brown
 * @author           Benjamin Renaud
 */

public class Manifest {

    /* list of headers that all pertain to a particular
     * file in the archive
     */
    private Vector entries = new Vector();

    static final boolean debug = false;
    static final void debug(String s) {
	if (debug)
	    System.out.println("man> " + s);
    }

    public Manifest() {}

    public Manifest(byte[] bytes) throws IOException {
	this(new ByteArrayInputStream(bytes));
    }

    /**
     * Parse a manifest from a stream
     */
    public Manifest(InputStream is) throws IOException {
	while (is.available() != 0) {
	    MessageHeader m = new MessageHeader(is);
	    entries.addElement(m);
	}
    }


    /* recursively generate manifests from directory tree */
    public Manifest(String[] files) throws IOException {
	MessageHeader globals = new MessageHeader();
	globals.add("Manifest-Version", "1.0");
	addEntry(globals);
	addFiles(null, files);
    }

    public void addEntry(MessageHeader entry) {
	entries.addElement(entry);
    }

    public MessageHeader getEntry(String name) {
	Enumeration enum = entries();
	while(enum.hasMoreElements()) {
	    MessageHeader mh = (MessageHeader)enum.nextElement();
	    String nameVal = mh.findValue("Name");
	    if (nameVal != null && nameVal.equals(name)) {
		return mh;
	    }
	}
	return null;
    }

    public MessageHeader entryAt(int i) {
	return (MessageHeader) entries.elementAt(i);
    }

    public Enumeration entries() {
	return entries.elements();
    }
	
    public void addFiles(File dir, String[] files) throws IOException {
	if (files == null)
	    return;
	for (int i = 0; i < files.length; i++) {
	    File file;
	    if (dir == null) {
		file = new File(files[i]);
	    } else {
		file = new File(dir, files[i]);
	    }
	    if (file.isDirectory()) {
		addFiles(file, file.list());
	    } else {
		addFile(file);
	    }
	}
    }

    public void addFile(File f) throws IOException {
	MessageHeader mh = new MessageHeader();
	mh.add("Name", f.getPath());
	addEntry(mh);
    }

    /* Add a manifest file at current position in a stream
     */
    public void stream(OutputStream os, Vector extraFiles) 
    throws IOException {

	/* the first header in the file should be the global one.
	 * It should say "Manifest-Version: x.x"; barf if not
	 */
	MessageHeader globals = (MessageHeader) entries.elementAt(0);
	if (globals.findValue("Manifest-Version") == null) {
	    throw new IOException("Manifest file requires " +
			    "Manifest-Version: 1.0 in 1st header");
	}

	PrintWriter ps = new PrintWriter(os);
	globals.print(ps);

	for (int i = 1; i < entries.size(); ++i) {
	    MessageHeader mh = (MessageHeader) entries.elementAt(i);

	    mh.print(ps);

	    /* REMIND: could be adding files twice!!! */
	    String name = mh.findValue("name");
	    if (extraFiles != null && name != null) {
		extraFiles.addElement(name);
	    }
	}
    }

    public static boolean isManifestName(String name) {
	
	// remove leading /
	if (name.charAt(0) == '/') {
	    name = name.substring(1, name.length());
	}
	// case insensitive
	name = name.toUpperCase();
	
	if (name.equals("META-INF/MANIFEST.MF")) {
	    return true;
	}
	return false;
    }

						  
}
