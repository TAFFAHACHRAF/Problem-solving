#include <stdio.h>

int main() {
    int t;
    scanf("%d", &t);

    while (t--) {
        int n, m;
        scanf("%d %d", &n, &m);

        int grid[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                scanf("%d", &grid[i][j]);
            }
        }

        int dp[n][m];
        dp[0][0] = grid[0][0];

        // Initialize the first row of dp array
        for (int j = 1; j < m; j++) {
            dp[0][j] = dp[0][j-1] + grid[0][j];
        }

        // Initialize the first column of dp array
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }

        // Calculate the cumulative sum along the path
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = grid[i][j] + (dp[i-1][j] < dp[i][j-1] ? dp[i-1][j] : dp[i][j-1]);
            }
        }

        if (dp[n-1][m-1] == 0)
            printf("YES\n");
        else
            printf("NO\n");
    }

    return 0;
}
