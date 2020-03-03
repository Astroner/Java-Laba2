import common.CizarAdapter;
import eugine.BasicPoint;
import eugine.CLI;
import eugine.Point;
import eugine.XOREncoder;
import mary.AdvancedExecutor;
import mary.CizarEncoder;
import mary.Executor;

public class Main {

	public static void main(String[] args) {
		String message = "Ўла —аша по шоссе и сосала сушку.";
		String xor_secret = "secret";
		String basic_shift = "3";
			
		XOREncoder xor = new XOREncoder();
		CizarAdapter cizar = new CizarAdapter(new CizarEncoder());
		
		Point[] ops = { 
			new BasicPoint(
				"Ўифрование с помощью операции \"XOR\"", 
				new Executor(xor, message, xor_secret)
			),
			new BasicPoint(
				"Ўифрование с помощью  циклического сдвига",
				new Executor(cizar, message, basic_shift)
			),
				/*
				 * new BasicPoint(
				 * "¬вести число позиций дл€ шифровани€ путем циклического сдвига", new
				 * AdvancedExecutor(cizar, message, basic_shift) )
				 */
		};
		CLI cli = new CLI(ops);
		cli.start();
	}

}