package AD_12;
public class Graph
{
	private static double[][] matrix1 =
	{
		{0.0, 5.0, 0.0, 0.0, 0.0, 0.0},
		{5.0, 0.0, 5.0, 5.0, 0.0, 0.0},
		{0.0, 5.0, 0.0, 0.0, 0.0, 0.0},
		{0.0, 5.0, 5.0, 0.0, 0.0, 0.0},
		{0.0, 0.0, 0.0, 0.0, 5.0, 0.0},
		{0.0, 0.0, 0.0, 0.0, 0.0, 5.0},
	};

	private static double[][] matrix2 =
	{
		{0.0, 5.0, 0.0, 0.0, 0.0, 0.0},
		{0.0, 0.0, 5.0, 5.0, 0.0, 0.0},
		{0.0, 5.0, 0.0, 5.0, 0.0, 0.0},
		{0.0, 5.0, 0.0, 0.0, 0.0, 0.0},
		{0.0, 0.0, 0.0, 0.0, 5.0, 0.0},
		{0.0, 0.0, 0.0, 0.0, 0.0, 5.0},
	};

	private static boolean isSymmetric(final double[][] matrix)
	{
		assert(matrix!=null);
		assert(matrix[0]!=null);
		assert(matrix.length==matrix[0].length);

		// TODO
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j <= i; j++)
                if (matrix[i][j] != matrix[j][i])
                    return false;

        return true;
	}

	private static boolean isTriviallyWeighted(final double[][] matrix)
	{
		assert(matrix!=null);
		assert(matrix[0]!=null);
		assert(matrix.length==matrix[0].length);

		// TODO
        double temp = 0;
        boolean isGefunden = false;

        // if (!isSymmetric(matrix)) return false;

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j <= i; j++) {
        		if (matrix[i][j] != 0) {
					if (isGefunden) {
						if (matrix[i][j] != temp) {
							return false;
						}
					} else {
						temp = matrix[i][j];
						isGefunden = true;
					}
				}
            }

        return true;
	}

	public static void main(String[] args)
	{
		System.out.println("isSymmetric: " + isSymmetric(matrix1) + ", " + isSymmetric(matrix2));
		System.out.println("isTriviallyWeighted: " + isTriviallyWeighted(matrix1) + ", " + isTriviallyWeighted(matrix2));
	}
}