package p025;

public class Main {

	public static void main(String[] args) {
		// list 1-1
		{
			System.out.println("<--- list 1-1 --->");
			String s1 = "スッキリJava";
			String s2 = "Java";
			String s3 = "java";
			if(s2.equals(s3))
			{
				System.out.println("s2とs3は等しい");
			}
			if(s2.equalsIgnoreCase(s3))
			{
				System.out.println("s2とs3はケースを区別しなければ等しい");
			}
			System.out.println("s1の長さは" + s1.length() + "です");
			if(s1.isEmpty())
			{
				System.out.println("s1は空文字です");
			}
		}

		// list 1-2
		{
			System.out.println("<--- list 1-2 --->");
			String s1 = "Java and JavaScript";
			if(s1.contains(s1))
			{
				System.out.println("文字列s1は、Javaを含んでいます");
			}
			if(s1.endsWith("Java"))
			{
				System.out.println("文字列s1は、Javaが末尾にあります");
			}
			System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
			System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
		}

		// list 1-3
		{
			System.out.println("<--- list 1-3 --->");
			String s1 = "Java programming";
			System.out.println("文字列s1の3文字目以降は" + s1.substring(3));
			System.out.println("文字列s1の3～8文字目は" + s1.substring(3, 8));
		}
	}

}
