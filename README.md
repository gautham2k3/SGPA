# SGPA Calculator
![SGPA](https://socialify.git.ci/gautham2k3/SGPA/image?description=1&font=KoHo&language=1&name=1&owner=1&pattern=Charlie%20Brown&stargazers=1&theme=Auto)
This is a Java program that calculates your Semester Grade Point Average (SGPA) based on the grades and credits of the subjects you have taken in a semester.Additionally, it provides a feature to save the calculated SGPA and inputted marks to a file.

## How to Use

1. Open the terminal or command prompt.
2. Navigate to the directory where the program is saved.
3. Compile the program using the command `javac SGPA.java`.
4. Run the program using the command `java SGPA`.
5. Enter the number of subjects you have taken in the semester.
6. Enter the grade and credits of each subject when prompted.
7. The program will display your SGPA.
8. The program will also save the entered data and SGPA to a file named `[Name]_sgpa_data.txt` (e.g., [`John_Doe_sgpa_data.txt`](John_Doe_sgpa_data.txt)).

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
### Example Output

```
Enter your name: John Doe
Enter your ID: 12345
Enter the number of subjects: 4

Subject 1:
Enter the subject credits: 3
Enter the subject grade: A

Subject 2:
Enter the subject credits: 4
Enter the subject grade: B+

Subject 3:
Enter the subject credits: 3
Enter the subject grade: C

Subject 4:
Enter the subject credits: 2
Enter the subject grade: B

Your SGPA (Semester Grade Point Average) is: 7.33

Data saved to file: John_Doe_sgpa_data.txt
```

The file "John_Doe_sgpa_data.txt" will contain the following information:

```
Name: John Doe
ID: 12345

Subject 1: Credits: 3.0, Grade: A
Subject 2: Credits: 4.0, Grade: B+
Subject 3: Credits: 3.0, Grade: C
Subject 4: Credits: 2.0, Grade: B

SGPA: 7.33
```

## Assumptions

This program assumes that all subjects have equal credit weightage. If the credit weightage of the subjects in your previous semester was different, you will need to modify the program accordingly.

## Contributing

If you find any issues with the program, feel free to raise an issue or submit a pull request. Contributions are always welcome!

