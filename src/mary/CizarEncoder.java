package mary;

public class CizarEncoder{
	String alfavit = " ��������������������������������";
	//��������� ��������� � �����. ���������� ������������� ������.
	public String encode(String _message, int shift) {
		String result = "";
		String message = _message.toLowerCase();
		for(int i = 0; i < message.length(); i++) {
			char mes = message.charAt(i);
			int index = alfavit.indexOf(mes);
			int newindex = (index+shift)% alfavit.length();
			result += alfavit.charAt(newindex);
		
		}
		
		

		return result;
	}
	
	//��������� ��������� � �����, � ������� ����������� ������. 
	//���������� �������������� ������.
	public String decode(String _message, int shift) {
		String result = "";
		String message = _message.toLowerCase();
		for(int i = 0; i < message.length(); i++) {
			char mes = message.charAt(i);
			int index = alfavit.indexOf(mes);
			int newindex = Math.abs(index-shift)% alfavit.length();
			result += alfavit.charAt(newindex);
			
		}
		return result;
	}
	
}
