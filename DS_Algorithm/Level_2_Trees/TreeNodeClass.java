package Level_2_Trees;

import java.util.ArrayList;

public class TreeNodeClass<T> {
	ArrayList<TreeNodeClass<T>> children;
	T data;


	public TreeNodeClass(T data) {
		children = new ArrayList<TreeNodeClass<T>>();
		this.data = data;
	}


}
