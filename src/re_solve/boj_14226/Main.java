package re_solve.boj_14226;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int S;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        S = Integer.parseInt(br.readLine());
        visited = new boolean[10001][10001];

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(1, 0, 0));
        visited[1][0] = true;

        while (!q.isEmpty()) {
            Pair cur = q.poll();
            int cur_display = cur.getDisplay();
            int cur_clipboard = cur.getClipboard();
            int cur_cnt = cur.getCnt();

            if (cur_display == S) {
                System.out.println(cur_cnt);
                return;
            }

            for (int i = 0; i < 3; i++) {
                int next_display;
                int next_clipboard;
                if (i == 0) { // 화면에 있는 이모티콘 중 하나를 삭제한다.
                    next_display = cur_display - 1;
                    next_clipboard = cur_clipboard;
                }
                else if (i == 1) { // 클립보드에 있는 모든 이모티콘을 화면에 붙여넣기 한다.
                    next_display = cur_display + cur_clipboard;
                    next_clipboard = cur_clipboard;
                }
                else { // 화면에 있는 이모티콘을 모두 복사해서 클립보드에 저장한다.
                    next_display = cur_display;
                    next_clipboard = cur_display;
                }

                if (next_display < 0 || next_clipboard < 0) continue;

                if (!visited[next_display][next_clipboard]) {
                    visited[next_display][next_clipboard] = true;
                    q.offer(new Pair(next_display, next_clipboard, cur_cnt + 1));
                }
            }
        }
    }
}

class Pair {
    private final int display;
    private final int clipboard;
    private final int cnt;

    public Pair(final int display, final int clipboard, final int cnt) {
        this.display = display;
        this.clipboard = clipboard;
        this.cnt = cnt;
    }

    public int getDisplay() {
        return display;
    }

    public int getClipboard() {
        return clipboard;
    }

    public int getCnt() {
        return cnt;
    }
}
