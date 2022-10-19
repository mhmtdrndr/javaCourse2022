package streamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(11);
		numbers.add(12);
		
		List<String> cities = new ArrayList<>();
		cities.add("ankara");
		cities.add("izmir");
		cities.add("bursa");
		cities.add("kocaeli");
		
//		List<String> cities2 = new ArrayList<>();
//		cities.forEach(city -> cities2.add(city.toUpperCase()));//		
//		cities2.forEach(city -> System.out.println(city));
		
		// map 
		// liste elemanları üzerinde herhangi bir işlem yapılacaksa kullanıyoruz.
		
		List<String> citiesUpper = cities.stream().map(city -> city.toUpperCase()).collect(Collectors.toList());
		System.out.println(citiesUpper);
		
		// filter 
		// liste elemanları üzer,nde listeleme yapmak için kullanıyoruz.
		
		List<String> citiesFilter = cities.stream().filter(city -> city.toUpperCase().startsWith("B") || city.startsWith("a")).collect(Collectors.toList());
		System.out.println(citiesFilter);
		
		// reduce
		// listedeki elemanları farklı bir işleme tabi tutmak istediğimiz zaman, örnek olarak listedeki sayıları tek tek toplama istediğimiz zaman kullanıyoruz. 
		
		Optional<Integer> sumNumbers = numbers.stream().reduce((n1, n2) -> (n1+ n2)); 
		System.out.println(sumNumbers);
	}

}
