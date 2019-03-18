package Day17;

import java.util.Stack;

public class stackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        // 压栈
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        // 搜索是从栈顶向栈底进行搜索，并且以1位基数
        System.out.println(stack.search("b"));
        // 如果栈中没有元素，那么弹栈会抛出空栈异常
        // 弹栈 peek  pop
        // peek获取栈顶的元素，但是不删除对应的元素
//		String str = stack.peek();

        // pop 弹栈
        // pop取出栈顶的元素，原来栈结构中对应的元素会被删除
//		String str = stack.pop();
//		System.out.println(str);
        System.out.println(stack);

//		System.out.println(stack.empty());
        // 弹栈时推荐使用以下格式
//		if (!stack.empty()){
//			// 在这里写弹栈代码
//		}
    }
}

