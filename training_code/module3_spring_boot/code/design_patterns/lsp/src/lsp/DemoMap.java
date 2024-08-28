package lsp;
import java.util.*;

class Foo{
	int i;

	public Foo(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "Foo [i=" + i + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(i);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Foo other = (Foo) obj;
		return i == other.i;
	}

//	@Override
//	public int compareTo(Foo o) {
//		return Integer.compare(this.i, o.i);
//	}
	
	
}
public class DemoMap {

	
	public static void main(String[] args) {
		
		Map<Foo, Integer> map=new TreeMap<>(( o1,  o2)-> Integer.compare(o2.i, o1.i));//HashMap vs TreeMap (B R algo)
	
		map.put(new Foo(3), 3);
		map.put(new Foo(30), 30);

		
		System.out.println(map);
		
	}
}
