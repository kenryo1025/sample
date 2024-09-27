package javaapis.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardInputOutput {
	public static void main(String[] args) {
		try {
            BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder inputBuilder = new StringBuilder();

            System.out.println("何か文字を入力してください（終了するには空行を入力してください）");

            String line;
            while ((line = key.readLine()) != null && !line.isEmpty()) {
                inputBuilder.append(line).append(System.lineSeparator());
            }

            String input = inputBuilder.toString();
            System.out.println("入力された文字列は以下の通りです：");
            System.out.println(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
