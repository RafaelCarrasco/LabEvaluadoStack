package cl.ubb.agil.java;

public class StackTDD {
	int[] stackPila;
	int vac;

	public StackTDD(int tam) {
		stackPila = new int[tam];
		vac = -1;
	}

	public boolean EstaVaciaPila() {
		if (vac == -1) {
			return true;
		}
		return false;
	}

	public boolean InsertarPila(int num){
		if(vac==-1){
			stackPila[0]=num;
			return true;
		}
		for(int i=vac;i<stackPila.length;i++){
			stackPila[i]=num;
			System.out.println(stackPila[i]);
			vac ++;
		}
		if(vac != -1){
			return true;
		}
		return false;
	}
	
	public int Tamaño(){
		return stackPila.length -1;		
	}
	
	public int pop(){
		int val= stackPila[0];
		return val;
	}

}
