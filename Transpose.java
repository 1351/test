package github;

import java.util.Stack;

public class Transpose {
	StringBuffer sb;

	public static void main(String[] args) {
		// ���ڲ��Ե��ַ���
		String sentence = "how are you?";
		// ���õߵ���ӡ���µ��ʵķ����Բ����ַ������д�ӡ
		new Transpose().transposeWord(sentence);
	}

	/**
	 * �÷�����ߵ�˳���ӡ�����е���
	 * 
	 * @param sentence
	 *            ���ߵ�������
	 */
	private void transposeWord(String sentence) {
		Stack<String> list = new Stack<String>();
		StringBuffer sb = new StringBuffer();
		// �Ƿ�ʼ�齨����
		boolean isLetter = false;
		boolean addWord = false;
		// �������ַ������ַ����б����������ַ����½�һ��StringBuffer���ѵ�һ����ĸ�ŵ�StringBuffer�У�
		// ��������ɨ�裬�������ĸ�Ͱ��ַ�׷�ŵ���StringBuffer�ֱ���������ַ����Ͱ�StringBuffer��Ϊһ�����ʷŵ�List��
		for (int i = 0; i < sentence.length(); i++) {
			char tmp = sentence.charAt(i);
			// �������ĸ�Ļ����ͽ�״̬��Ϊ<��ʼ�齨����>
			if (Character.isLetter(tmp)) {
				isLetter = true;
				addWord = false;
				sb.append(tmp);
				if (i == sentence.length() - 1) {
					addWord = true;
				}
			} else {
				addWord = true;
			}
			if (addWord) {
				// �����<��ʼ�齨����>�ͽ����ʼӵ�list��
				if (isLetter) {
					list.push(sb.toString());
					sb.delete(0, sb.length());
					isLetter = false;
				}
			}
		}
		while (!list.empty()) {
			System.out.print(list.pop() + " ");
		}
	}
}
