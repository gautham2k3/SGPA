# SGPA Calculator
![SGPA](https://socialify.git.ci/gautham2k3/SGPA/image?description=1&font=KoHo&language=1&name=1&owner=1&pattern=Charlie%20Brown&stargazers=1&theme=Auto)
This is a Java program that calculates your Semester Grade Point Average (SGPA) based on the grades and credits of the subjects you have taken in a semester.

## How to Use

1. Open the terminal or command prompt.
2. Navigate to the directory where the program is saved.
3. Compile the program using the command `javac SGPA.java`.
4. Run the program using the command `java SGPA`.
5. Enter the number of subjects you have taken in the semester.
6. Enter the grade and credits of each subject when prompted.
7. The program will display your SGPA at the end.

## Grade Point Scale

This program uses the following grade point scale:

| Grade | Grade Point |
|-------|-------------|
| A+    | 10.0        |
| A     | 9.0         |
| B+    | 8.0         |
| B     | 7.0         |
| C+    | 6.0         |
| C     | 5.0         |
| D     | 4.0         |
| F     | 0.0         |

If your university uses a different grade point scale, you can modify the `getGradePoint()` method in the program to match your university's scale.

## Assumptions

This program assumes that all subjects have equal credit weightage. If the credit weightage of the subjects in your previous semester was different, you will need to modify the program accordingly.

## Contributing

If you find any issues with the program, feel free to raise an issue or submit a pull request. Contributions are always welcome!

