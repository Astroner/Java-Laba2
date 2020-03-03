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
		String message = "��� ���� �� ����� � ������ �����.";
		String xor_secret = "secret";
		String basic_shift = "3";
			
		XOREncoder xor = new XOREncoder();
		CizarAdapter cizar = new CizarAdapter(new CizarEncoder());
		
		Point[] ops = { 
			new BasicPoint(
				"���������� � ������� �������� \"XOR\"", 
				new Executor(xor, message, xor_secret)
			),
			new BasicPoint(
				"���������� � �������  ������������ ������",
				new Executor(cizar, message, basic_shift)
			),
				/*
				 * new BasicPoint(
				 * "������ ����� ������� ��� ���������� ����� ������������ ������", new
				 * AdvancedExecutor(cizar, message, basic_shift) )
				 */
		};
		CLI cli = new CLI(ops);
		cli.start();
	}

}