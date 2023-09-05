java:TextReader.java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.*;

public class TextReader {
	private String path;

	private static Logger logger = Logger.getLogger(TextReader.class.getName());

	public enum Mark {
		START, END
	};

	private TextReader(String path) {
		this.path = path;
	}

	private void execute() {
		List<Integer> valueList = new ObjectList<>();
//Integer型に変換
		try (FileReader fr=new FileReader(path);
BufferedReader br=new BufferedReader(fr);
		) 
//リソース文に入れるものは、ファイルを扱うものだけ。よってnullの代入文はリソース文に入れない。
{
			String line = null;
			while ((line = br.readLine()) != null) {
				valueList.add(Integer.parseInt(line));
			}//Integer型に変換
		} catch (IOException e) {
			e.printStackTrace();
		}
//元の構文fainalでnullチェックの理由
//→インスタンスが入ってない場合クローズできないから。
		for (Integer value : valuList) {
			System.out.println(value);
		}
		}  
	}

	public static void main(String... args) {
		logger.info(Mark.START.name());
		new TextReader(args[0]).execute();
		logger.info(Mark.END.name());
	}
//可変長引数の効果
//引数数が決まっているプログラムだが、引数の数が決められていなくて、いくらでも引数を指定できる。
//そのような性質のプログラムにこの形を指定できる。

}


