package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.quick_sort;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.quick_sort.service.QuickSortService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class QuickSortApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickSortApplication.class, args);
/*
		QuickSortService quickSortService= new QuickSortService();
		String[] nombres = {"Leon", "Haris", "Jill", "Wesker", "Ada","Benjain"};
			quickSortService.sort(nombres);
			quickSortService.printArray(nombres);*/
	}

}
