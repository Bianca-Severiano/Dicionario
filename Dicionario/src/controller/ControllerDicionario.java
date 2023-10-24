package controller;

import model.Lista;
import model.Palavra;

public class ControllerDicionario {


	Lista<Palavra>[] dic = new Lista[26];

	public ControllerDicionario() {
		int tamanho = dic.length;
		for (int i = 0; i < tamanho; i++) {
			dic[i] = new Lista<Palavra>();
		}
	}

	public void remove(Palavra palavra) throws Exception {
		int hash = palavra.hashCode();
		Lista<Palavra> l = dic[hash];
		if (!l.isEmpty()) {
			int tamanho = l.size();
			for (int i = 0; i < tamanho; i++) {
				Palavra p = l.get(i);

				if (palavra.verbete.equals(p.verbete)) {
					l.remove(i);
					break;
				}
			}
		}
	}

	public void add(Palavra palavra) throws Exception {
		int hash = palavra.hashCode();
		Lista<Palavra> l = dic[hash];
		if (l.isEmpty()) {
			l.addFirst(palavra);
		} else {
			l.addLast(palavra);
		}
	}

	public void list(String Caractere) throws Exception {
		int hash = Caractere.hashCode();
		Lista<Palavra> l = dic[hash];
		if (!l.isEmpty()) {
			int tamanho = l.size();
			for (int i = 0; i < tamanho; i++) {
				System.out.print(l.get(i));
			}
		}
		System.out.println("NULL");
	}

	private int hashCode(String caractere) {
		char c = caractere.toLowerCase().charAt(0);
		int ch = c - 97;
		return ch;
	}
	
	public void search(Palavra palavra) throws Exception {
		int hash = palavra.hashCode();
		Lista<Palavra> l = dic[hash];
		if (!l.isEmpty()) {
			int tamanho = l.size();
			for (int i = 0; i < tamanho; i++) {
				Palavra p = l.get(i);

				if (palavra.verbete.equals(p.verbete)) {
					System.out.println(palavra.verbete + ": " + palavra.significado  );
					break;
				}
			}
		}
	}

}
