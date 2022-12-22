package tier.silver.boj_2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int cnt = 0;

        for (int i = 0; i < input.length(); i++) {
            char tmp = input.charAt(i);

            if (tmp == 'c') {
                if (i < input.length() - 1) {
                    if (input.charAt(i + 1) == '=' || input.charAt(i + 1) == '-') {
                        cnt++;
                        i++;
                        continue;
                    }
                }
            }

            else if (tmp == 'd') {
                if (i < input.length() - 1) {
                    if (input.charAt(i + 1) == 'z') {
                        if (i < input.length() - 2) {
                            if (input.charAt(i + 2) == '=') {
                                cnt++;
                                i += 2;
                                continue;
                            }
                        }
                    } else if (input.charAt(i + 1) == '-') {
                        cnt++;
                        i++;
                        continue;
                    }
                }
            }

            else if (tmp == 'l') {
                if (i < input.length() - 1) {

                    if (input.charAt(i + 1) == 'j') {
                        cnt++;
                        i++;
                        continue;
                    }
                }
            }

            else if (tmp == 'n') {
                if (i < input.length() - 1) {

                    if (input.charAt(i + 1) == 'j') {
                        cnt++;
                        i++;
                        continue;
                    }
                }
            }

            else if (tmp == 's') {
                if (i < input.length() - 1) {

                    if (input.charAt(i + 1) == '=') {
                        cnt++;
                        i++;
                        continue;
                    }
                }
            }

            else if (tmp == 'z') {
                if (i < input.length() - 1) {

                    if (input.charAt(i + 1) == '=') {
                        cnt++;
                        i++;
                        continue;
                    }
                }
            }

            cnt++;
        }

        System.out.println(cnt);
    }
}
