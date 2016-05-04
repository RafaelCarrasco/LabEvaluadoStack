package cl.ubb.agil.java;

public class StackTDD {
	int[] stackPila=new int[2];

	public StackTDD() {
	}

	public boolean EstaVaciaPila() {
		return true;
	}

	public int InsertarPila(int num) {
		stackPila[0] = num;
		if (stackPila[0] == 1) {
			return 1;
		}
		return 0;
	}

}
