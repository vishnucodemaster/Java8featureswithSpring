package IOImprovement;



import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class TestIO {

	public static void main(String[] args)  {
		
		Path path = Paths.get("C:\\Users\\Vishnu\\Documents\\workspace-spring-tool-suite-4-4.16.0.RELEASE\\SimpleSpring\\src\\main\\java\\IOImprovement\\data.txt");
		
		try(Stream<String> lines = Files.lines(path)) {
		Optional<String> optional = lines.filter(s->s.contains("line15")).findFirst();
		if(optional.isPresent()){
			System.out.println(optional.get());
		}else
			System.out.println("No data found");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}