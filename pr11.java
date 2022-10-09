//21CE024_Aneri
package Assignment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
class Triplet<U, V, T> 
{
	public final U first; 
	public final V second; 
	public final T third; 
	private Triplet(U first, V second, T third) 
	{
		this.first = first;
		this.second = second;
		this.third = third;
	}
	public boolean equals(Object o) 
	{
		if (this == o) 
		{
			return true;
		}
		if (o == null || getClass() != o.getClass()) 
		{
			return false;
		}
		Triplet triplet = (Triplet) o;
		if (!first.equals(triplet.first) || !second.equals(triplet.second) || !third.equals(triplet.third)) 
		{
			return false;
		}
		return true;
	}
	public int hashCode() 
	{
		int result = first.hashCode();
		result = 31 * result + second.hashCode();
		result = 31 * result + third.hashCode();
		return result;
	}
	public String toString() 
	{
		return "(" + first + ", " + second + ", " + third + ")";
	}
	public static <U, V, T> Triplet<U, V, T> of(U a, V b, T c) 
	{
		return new Triplet<>(a, b, c);
	}
}
class Main 
{
	public static void main(String[] args) throws ExecutionException 
	{
		Triplet<String, Integer, Character> p1 = Triplet.of("Aneri Desai", 24, 'F');
		Triplet<String, Integer, Character> p2 = Triplet.of("Unnati Desai", 25, 'F');
		Triplet<String, Integer, Character> p3 = Triplet.of("Mamta Chaudhary", 16, 'F');
		List<Triplet<String, Integer, Character>> pairs = new ArrayList<>();
		pairs.add(p1);
		pairs.add(p2);
		pairs.add(p3);
		System.out.println(pairs);
		Set<Triplet<String, Integer, Character>> distinctTriplets = new HashSet<>(pairs);
		System.out.println(distinctTriplets);
	}
}