import java.util.ArrayList;
import java.util.Scanner;

enum NodeType {
	STMT,
	ASSIGN,
	EXPR,
	NUM,
	VAR
}
public class Node {
	NodeType type;
	double value;
	char operator;
	String str;

	static ArrayList<Node> children;
	
	public Node(NodeType type) {
		this.type = type;
	}
	public Node(NodeType type, double value) {
		this.type = type;
		this.value = value;
	}
	public Node(NodeType type, char operator) {
		this.type = type;
		this.operator = operator;
	}
	public Node(NodeType type, String str) {
		this.type = type;
		this.str = str;
	}
	static public void eval() {
	
	}
	public void setString(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
	public void addChild(Node child) {
		children.add(child);
	}
	public static void main(String[] args) {

	}
}

