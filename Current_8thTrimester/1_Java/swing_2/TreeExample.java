import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeExample {
JFrame f;
TreeExample(){
    f=new JFrame();
    DefaultMutableTreeNode courses=new DefaultMutableTreeNode("courses");
    DefaultMutableTreeNode science=new DefaultMutableTreeNode("Science");
    DefaultMutableTreeNode management=new DefaultMutableTreeNode("Management");
    DefaultMutableTreeNode humanities=new DefaultMutableTreeNode("Humanities");
    courses.add(science);
    courses.add(management);
    courses.add(humanities);
    DefaultMutableTreeNode bsc=new DefaultMutableTreeNode("bsc");
    DefaultMutableTreeNode bca=new DefaultMutableTreeNode("bca");
    DefaultMutableTreeNode bcom=new DefaultMutableTreeNode("bcom");
    DefaultMutableTreeNode bba=new DefaultMutableTreeNode("bba");
    DefaultMutableTreeNode ba=new DefaultMutableTreeNode("ba");
    science.add(bsc); science.add(bca);
    management.add(bcom); management.add(bba);
    humanities.add(ba);
    JTree jt=new JTree(courses);
    f.add(jt);
    f.setSize(200,200);
    f.setVisible(true);
}
public static void main(String[] args) {
    new TreeExample();
}}
