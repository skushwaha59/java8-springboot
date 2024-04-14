1. **Filtering a List**
   ```java
   List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
   List<String> filteredNames = names.stream()
                                     .filter(name -> name.startsWith("A"))
                                     .collect(Collectors.toList());
   ```

   This example filters a list of names to include only those that start with the letter 'A'.

2. **Mapping Elements**
   ```java
   List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
   List<Integer> nameLengths = names.stream()
                                    .map(String::length)
                                    .collect(Collectors.toList());
   ```

   Here, the length of each name in the list is mapped to a new list of integers.

3. **Finding an Element**
   ```java
   Optional<String> result = names.stream()
                                  .filter(name -> name.startsWith("B"))
                                  .findFirst();
   ```

   This example finds the first name in the list that starts with the letter 'B'.

4. **Combining Elements**
   ```java
   String combined = names.stream()
                          .reduce("", (acc, name) -> acc + " " + name);
   ```

   The names in the list are concatenated into a single string with spaces between them.

5. **Grouping Elements**
   ```java
   Map<Character, List<String>> groupedNames = names.stream()
                                                     .collect(Collectors.groupingBy(name -> name.charAt(0)));
   ```

   This groups the names in the list by the first letter of each name.

6. **Flattening a List of Lists**
   ```java
   List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
   List<Integer> flattenedList = listOfLists.stream()
                                             .flatMap(Collection::stream)
                                             .collect(Collectors.toList());
   ```

   This flattens a list of lists into a single list.

7. **Sorting Elements**
   ```java
   List<String> sortedNames = names.stream()
                                   .sorted()
                                   .collect(Collectors.toList());
   ```

   The names in the list are sorted alphabetically.

8. **Removing Duplicates**
   ```java
   List<String> distinctNames = names.stream()
                                     .distinct()
                                     .collect(Collectors.toList());
   ```

   This removes duplicate names from the list.

9. **Checking for Matches**
   ```java
   boolean anyMatch = names.stream()
                           .anyMatch(name -> name.startsWith("A"));
   ```

   This checks if any name in the list starts with the letter 'A'.

10. **Iterating with Consumer**
    ```java
    names.forEach(System.out::println);
    ```

    This iterates over each name in the list and prints it.

11. **Calculate Sum of Integers**
    ```java
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    int sum = numbers.stream()
                     .mapToInt(Integer::intValue)
                     .sum();
    ```

    This calculates the sum of all integers in the list.

12. **Calculate Average of Integers**
    ```java
    double average = numbers.stream()
                            .mapToInt(Integer::intValue)
                            .average()
                            .orElse(Double.NaN);
    ```

    This calculates the average of all integers in the list, returning NaN if the list is empty.

13. **Find Maximum Integer**
    ```java
    Optional<Integer> max = numbers.stream()
                                   .max(Integer::compareTo);
    ```

    This finds the maximum integer in the list.

14. **Find Minimum Integer**
    ```java
    Optional<Integer> min = numbers.stream()
                                   .min(Integer::compareTo);
    ```

    This finds the minimum integer in the list.

15. **Check if All Elements Match a Condition**
    ```java
    boolean allMatch = numbers.stream()
                              .allMatch(num -> num < 10);
    ```

    This checks if all integers in the list are less than 10.

16. **Check if Any Element Matches a Condition**
    ```java
    boolean anyMatch = numbers.stream()
                              .anyMatch(num -> num % 2 == 0);
    ```

    This checks if any integer in the list is even.

17. **Check if No Elements Match a Condition**
    ```java
    boolean noneMatch = numbers.stream()
                               .noneMatch(num -> num < 0);
    ```

    This checks if no integer in the list is negative.

18. **Count Elements**
    ```java
    long count = numbers.stream()
                        .count();
    ```

    This counts the number of integers in the list.

19. **Generate a Stream of Integers**
    ```java
    IntStream.range(1, 6)
             .forEach(System.out::println);
    ```

    This generates a stream of integers from 1 to 5 and prints each integer.

20. **Generate Infinite Stream**
    ```java
    Stream.iterate(0, n -> n + 1)
          .limit(10)
          .forEach(System.out::println);
    ```

    This generates an infinite stream of integers starting from 0, limits it to 10 elements, and then prints each integer.

21. **Convert List to Map**
    ```java
    Map<String, Integer> map = names.stream()
                                    .collect(Collectors.toMap(name -> name, String::length));
    ```

    This converts a list of names to a map where the key is the name and the value is the length of the name.

22. **Convert List to Set**
    ```java
    Set<String> nameSet = names.stream()
                               .collect(Collectors.toSet());
    ```

    This converts a list of names to a set, removing duplicates.

23. **Convert Array to List**
    ```java
    String[] namesArray = {"Alice", "Bob", "Charlie"};
    List<String> namesList = Arrays.stream(namesArray)
                                   .collect(Collectors.toList());
    ```

    This converts an array of names to a list.

24. **Convert List to Array**
    ```java
    String[] namesArray = names.stream()
                               .toArray(String[]::new);
    ```

    This converts a list of names to an array.

25. **Convert List to Comma-Separated String**
    ```java
    String namesString = names.stream()
                              .collect(Collectors.joining(", "));
    ```

    This converts a list of names to a comma-separated string.

26. **Grouping Elements by Length**
    ```java
    Map<Integer, List<String>> groupedByLength = names.stream()
                                                      .collect(Collectors.groupingBy(String::length));
    ```

    This groups the names in the list by their length.

27. **Partitioning Elements**
    ```java
    Map<Boolean, List<String>> partitioned = names.stream()
                                                  .collect(Collectors.partitioningBy(name -> name.length() > 3));
    ```

    This partitions the names in the list into two groups based on whether their length is greater than 3.

28. **Joining Elements**
    ```java
    String result = names.stream()
                         .collect(Collectors.joining());
    ```

    This joins all the names

 in the list into a single string.

29. **Parallel Processing**
    ```java
    List<String> parallelResult = names.parallelStream()
                                       .map(String::toUpperCase)
                                       .collect(Collectors.toList());
    ```

    This processes the names in parallel, converting them to uppercase.

30. **Using Optional**
    ```java
    Optional<String> optionalName = Optional.ofNullable(null);
    String name = optionalName.orElse("Default Name");
    ```

    This demonstrates how to use `Optional` to handle null values.

31. **Stream to Array**
    ```java
    String[] namesArray = names.stream()
                               .toArray(String[]::new);
    ```

    This converts a stream of names to an array.

32. **Filtering Null Values**
    ```java
    List<String> namesWithoutNulls = names.stream()
                                          .filter(Objects::nonNull)
                                          .collect(Collectors.toList());
    ```

    This filters out null values from the list of names.

33. **Sorting Custom Objects**
    ```java
    class Person {
        private String name;
        private int age;

        // Constructor, getters, and setters
    }

    List<Person> people = Arrays.asList(new Person("Alice", 25), new Person("Bob", 30));
    List<Person> sortedPeople = people.stream()
                                      .sorted(Comparator.comparing(Person::getName))
                                      .collect(Collectors.toList());
    ```

    This sorts a list of `Person` objects by their name.

34. **Checking for Empty List**
    ```java
    boolean isEmpty = names.isEmpty();
    ```

    This checks if the list of names is empty.

35. **Remove Elements**
    ```java
    List<String> modifiedNames = new ArrayList<>(names);
    modifiedNames.removeIf(name -> name.startsWith("A"));
    ```

    This removes names from the list that start with the letter 'A'.

36. **Replace Elements**
    ```java
    List<String> modifiedNames = names.stream()
                                      .map(name -> name.equals("Alice") ? "Alicia" : name)
                                      .collect(Collectors.toList());
    ```

    This replaces the name "Alice" with "Alicia" in the list.

37. **Check if List Contains an Element**
    ```java
    boolean containsAlice = names.contains("Alice");
    ```

    This checks if the list of names contains the name "Alice".

38. **Check if List Contains All Elements of Another List**
    ```java
    List<String> otherNames = Arrays.asList("Alice", "Bob");
    boolean containsAll = names.containsAll(otherNames);
    ```

    This checks if the list of names contains all the names in another list.

39. **Convert List of Integers to List of Strings**
    ```java
    List<Integer> numbers = Arrays.asList(1, 2, 3);
    List<String> numberStrings = numbers.stream()
                                        .map(Object::toString)
                                        .collect(Collectors.toList());
    ```

    This converts a list of integers to a list of strings.

40. **Find the Average of a List of Doubles**
    ```java
    List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0);
    double average = doubles.stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .orElse(Double.NaN);
    ```

    This calculates the average of a list of doubles, returning NaN if the list is empty.

41. **Grouping by Multiple Criteria**
    ```java
    Map<String, Map<Integer, List<Person>>> groupedPeople = people.stream()
                                                                   .collect(Collectors.groupingBy(Person::getName,
                                                                            Collectors.groupingBy(Person::getAge)));
    ```

    This groups a list of `Person` objects first by name and then by age.

42. **Summing Integers**
    ```java
    int sum = numbers.stream()
                     .mapToInt(Integer::intValue)
                     .sum();
    ```

    This calculates the sum of a list of integers.

43. **Summing Doubles**
    ```java
    double sum = doubles.stream()
                        .mapToDouble(Double::doubleValue)
                        .sum();
    ```

    This calculates the sum of a list of doubles.

44. **Checking for Palindromes**
    ```java
    boolean isPalindrome = names.stream()
                                 .allMatch(name -> new StringBuilder(name).reverse().toString().equalsIgnoreCase(name));
    ```

    This checks if all names in the list are palindromes.

45. **Checking for Prime Numbers**
    ```java
    List<Integer> primes = numbers.stream()
                                  .filter(num -> IntStream.rangeClosed(2, (int) Math.sqrt(num)).noneMatch(i -> num % i == 0))
                                  .collect(Collectors.toList());
    ```

    This filters out non-prime numbers from a list of integers.

46. **Calculate Factorial**
    ```java
    int n = 5;
    int factorial = IntStream.rangeClosed(1, n)
                             .reduce(1, (int a, int b) -> a * b);
    ```

    This calculates the factorial of a number using `reduce`.

47. **Find Maximum and Minimum Element in a List**
    ```java
    Optional<Integer> max = numbers.stream()
                                   .max(Integer::compareTo);

    Optional<Integer> min = numbers.stream()
                                   .min(Integer::compareTo);
    ```

    This finds the maximum and minimum integers in a list.

48. **Find Second Largest Element in a List**
    ```java
    Optional<Integer> secondLargest = numbers.stream()
                                             .sorted(Comparator.reverseOrder())
                                             .skip(1)
                                             .findFirst();
    ```

    This finds the second largest integer in a list.

49. **Calculate Fibonacci Series**
    ```java
    Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
          .limit(n)
          .mapToInt(f -> f[0])
          .forEach(System.out::println);
    ```

    This generates the Fibonacci series up to a given number of terms.

50. **Calculate Power of a Number**
    ```java
    int base = 2;
    int exponent = 3;
    double result = Math.pow(base, exponent);
    ```

    This calculates the power of a number using the `Math.pow` method.

51. **Calculate GCD (Greatest Common Divisor)**
    ```java
    int gcd = gcd(12, 18);

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    ```

    This calculates the Greatest Common Divisor (GCD) of two numbers using recursion.

52. **Calculate LCM (Least Common Multiple)**
    ```java
    int lcm = lcm(12, 18);

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    ```

    This calculates the Least Common Multiple (LCM) of two numbers using the GCD.

53. **Check if a Number is Armstrong Number**
    ```java
    int num = 153;
    int sum = String.valueOf(num).chars()
                                  .map(Character::getNumericValue

)
                                  .map(n -> (int) Math.pow(n, String.valueOf(num).length()))
                                  .sum();
    boolean isArmstrong = sum == num;
    ```

    This checks if a number is an Armstrong number.

54. **Check if a Number is Palindrome**
    ```java
    int num = 12321;
    boolean isPalindrome = String.valueOf(num).equals(new StringBuilder(String.valueOf(num)).reverse().toString());
    ```

    This checks if a number is a palindrome.

55. **Check if a Number is Prime**
    ```java
    int num = 17;
    boolean isPrime = IntStream.rangeClosed(2, (int) Math.sqrt(num)).noneMatch(i -> num % i == 0);
    ```

    This checks if a number is prime.

56. **Generate Random Numbers**
    ```java
    int random = new Random().nextInt(10);
    ```

    This generates a random integer between 0 (inclusive) and 10 (exclusive).

57. **Generate Random String**
    ```java
    String randomString = new Random().ints(10, 97, 122)
                                      .mapToObj(i -> (char) i)
                                      .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                                      .toString();
    ```

    This generates a random string of length 10 containing lowercase letters.

58. **Check if String is Anagram**
    ```java
    String str1 = "listen";
    String str2 = "silent";
    boolean isAnagram = Arrays.equals(str1.chars().sorted().toArray(), str2.chars().sorted().toArray());
    ```

    This checks if two strings are anagrams.

59. **Reverse a String**
    ```java
    String reversed = new StringBuilder("Hello").reverse().toString();
    ```

    This reverses a string.

60. **Check if String is Pangram**
    ```java
    String sentence = "The quick brown fox jumps over the lazy dog";
    boolean isPangram = sentence.toLowerCase().chars().filter(Character::isLetter).distinct().count() == 26;
    ```

    This checks if a sentence is a pangram (contains every letter of the alphabet at least once).

61. **Calculate Sum of Digits in a Number**
    ```java
    int number = 12345;
    int sumOfDigits = String.valueOf(number).chars()
                                              .map(Character::getNumericValue)
                                              .sum();
    ```

    This calculates the sum of digits in a number.

62. **Count Number of Words in a String**
    ```java
    String sentence = "This is a sample sentence";
    int wordCount = sentence.split("\\s+").length;
    ```

    This counts the number of words in a string.

63. **Count Number of Vowels and Consonants in a String**
    ```java
    String sentence = "Hello World";
    long vowelsCount = sentence.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
    long consonantsCount = sentence.toLowerCase().chars().filter(c -> "bcdfghjklmnpqrstvwxyz".indexOf(c) != -1).count();
    ```

    This counts the number of vowels and consonants in a string.

64. **Find Duplicate Characters in a String**
    ```java
    String str = "Programming";
    Set<Character> duplicates = str.chars()
                                    .mapToObj(c -> (char) c)
                                    .filter(c -> str.indexOf(c) != str.lastIndexOf(c))
                                    .collect(Collectors.toSet());
    ```

    This finds duplicate characters in a string.

65. **Remove Duplicate Characters in a String**
    ```java
    String str = "Programming";
    String result = str.chars()
                       .distinct()
                       .mapToObj(c -> String.valueOf((char) c))
                       .collect(Collectors.joining());
    ```

    This removes duplicate characters in a string.

66. **Check if String is Numeric**
    ```java
    String str = "12345";
    boolean isNumeric = str.chars().allMatch(Character::isDigit);
    ```

    This checks if a string is numeric.

67. **Check if Year is Leap Year**
    ```java
    int year = 2024;
    boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    ```

    This checks if a year is a leap year.

68. **Convert Decimal to Binary**
    ```java
    int decimal = 10;
    String binary = Integer.toBinaryString(decimal);
    ```

    This converts a decimal number to binary.

69. **Convert Decimal to Octal**
    ```java
    int decimal = 10;
    String octal = Integer.toOctalString(decimal);
    ```

    This converts a decimal number to octal.

70. **Convert Decimal to Hexadecimal**
    ```java
    int decimal = 10;
    String hexadecimal = Integer.toHexString(decimal);
    ```

    This converts a decimal number to hexadecimal.

71. **Convert Binary to Decimal**
    ```java
    String binary = "1010";
    int decimal = Integer.parseInt(binary, 2);
    ```

    This converts a binary number to decimal.

72. **Convert Octal to Decimal**
    ```java
    String octal = "12";
    int decimal = Integer.parseInt(octal, 8);
    ```

    This converts an octal number to decimal.

73. **Convert Hexadecimal to Decimal**
    ```java
    String hexadecimal = "A";
    int decimal = Integer.parseInt(hexadecimal, 16);
    ```

    This converts a hexadecimal number to decimal.

74. **Find Intersection of Two Arrays**
    ```java
    int[] array1 = {1, 2, 3, 4, 5};
    int[] array2 = {3, 4, 5, 6, 7};
    Set<Integer> intersection = Arrays.stream(array1)
                                       .boxed()
                                       .collect(Collectors.toSet());
    intersection.retainAll(Arrays.stream(array2).boxed().collect(Collectors.toSet()));
    ```

    This finds the intersection of two arrays.

75. **Find Union of Two Arrays**
    ```java
    int[] array1 = {1, 2, 3, 4, 5};
    int[] array2 = {3, 4, 5, 6, 7};
    Set<Integer> union = Arrays.stream(array1)
                               .boxed()
                               .collect(Collectors.toSet());
    union.addAll(Arrays.stream(array2).boxed().collect(Collectors.toSet()));
    ```

    This finds the union of two arrays.

76. **Find Missing Number in Array**
    ```java
    int[] numbers = {1, 2, 3, 5};
    int sum = Arrays.stream(numbers).sum();
    int n = numbers.length + 1;
    int totalSum = (n * (n + 1)) / 2;
    int missingNumber = totalSum - sum;
    ```

    This finds the missing number in an array of integers.

77. **Reverse an Array**
    ```java
    int[] array = {1, 2, 3, 4

, 5};
    int[] reversedArray = IntStream.rangeClosed(1, array.length)
                                   .map(i -> array[array.length - i])
                                   .toArray();
    ```

    This reverses an array of integers.

78. **Sort Array in Ascending Order**
    ```java
    int[] array = {5, 3, 8, 2, 1};
    int[] sortedArray = Arrays.stream(array)
                              .sorted()
                              .toArray();
    ```

    This sorts an array of integers in ascending order.

79. **Sort Array in Descending Order**
    ```java
    int[] array = {5, 3, 8, 2, 1};
    int[] sortedArray = Arrays.stream(array)
                              .boxed()
                              .sorted(Collections.reverseOrder())
                              .mapToInt(Integer::intValue)
                              .toArray();
    ```

    This sorts an array of integers in descending order.

80. **Find Maximum Element in an Array**
    ```java
    int[] array = {5, 3, 8, 2, 1};
    int max = Arrays.stream(array)
                    .max()
                    .orElseThrow(NoSuchElementException::new);
    ```

    This finds the maximum element in an array of integers.

81. **Find Minimum Element in an Array**
    ```java
    int[] array = {5, 3, 8, 2, 1};
    int min = Arrays.stream(array)
                    .min()
                    .orElseThrow(NoSuchElementException::new);
    ```

    This finds the minimum element in an array of integers.

82. **Remove Duplicates from an Array**
    ```java
    int[] array = {1, 2, 3, 2, 4, 5};
    int[] uniqueArray = Arrays.stream(array)
                              .distinct()
                              .toArray();
    ```

    This removes duplicates from an array of integers.

83. **Check if Array Contains a Value**
    ```java
    int[] array = {1, 2, 3, 4, 5};
    boolean contains = Arrays.stream(array)
                             .anyMatch(num -> num == 3);
    ```

    This checks if an array of integers contains a specific value.

84. **Check if Arrays are Equal**
    ```java
    int[] array1 = {1, 2, 3};
    int[] array2 = {1, 2, 3};
    boolean isEqual = Arrays.equals(array1, array2);
    ```

    This checks if two arrays of integers are equal.

85. **Merge Two Arrays**
    ```java
    int[] array1 = {1, 2, 3};
    int[] array2 = {4, 5, 6};
    int[] mergedArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
                                .toArray();
    ```

    This merges two arrays of integers into a single array.

86. **Rotate Array to the Left**
    ```java
    int[] array = {1, 2, 3, 4, 5};
    int rotations = 2;
    int[] rotatedArray = IntStream.range(0, array.length)
                                  .map(i -> array[(i + rotations) % array.length])
                                  .toArray();
    ```

    This rotates an array of integers to the left by a given number of positions.

87. **Rotate Array to the Right**
    ```java
    int[] array = {1, 2, 3, 4, 5};
    int rotations = 2;
    int[] rotatedArray = IntStream.range(0, array.length)
                                  .map(i -> array[(i - rotations + array.length) % array.length])
                                  .toArray();
    ```

    This rotates an array of integers to the right by a given number of positions.

88. **Find Duplicate Numbers in an Array**
    ```java
    int[] array = {1, 2, 3, 2, 4, 5};
    Set<Integer> duplicates = Arrays.stream(array)
                                    .boxed()
                                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                                    .entrySet()
                                    .stream()
                                    .filter(entry -> entry.getValue() > 1)
                                    .map(Map.Entry::getKey)
                                    .collect(Collectors.toSet());
    ```

    This finds duplicate numbers in an array of integers.

89. **Find Missing Number in Array of Numbers from 1 to N**
    ```java
    int[] numbers = {1, 2, 3, 5};
    int n = numbers.length + 1;
    int totalSum = (n * (n + 1)) / 2;
    int sum = Arrays.stream(numbers).sum();
    int missingNumber = totalSum - sum;
    ```

    This finds the missing number in an array of numbers from 1 to N.

90. **Find the Maximum Consecutive Ones in an Array of 0s and 1s**
    ```java
    int[] nums = {1, 0, 1, 1, 0, 1, 1, 1};
    int maxConsecutiveOnes = Arrays.stream(Arrays.toString(nums).split("0+"))
                                   .mapToInt(String::length)
                                   .max()
                                   .orElse(0);
    ```

    This finds the maximum consecutive ones in an array of 0s and 1s.

91. **Find Common Elements in Three Sorted Arrays**
    ```java
    int[] array1 = {1, 5, 10, 20, 40, 80};
    int[] array2 = {6, 7, 20, 80, 100};
    int[] array3 = {3, 4, 15, 20, 30, 70, 80, 120};
    List<Integer> commonElements = new ArrayList<>();
    int i = 0, j = 0, k = 0;
    while (i < array1.length && j < array2.length && k < array3.length) {
        if (array1[i] == array2[j] && array2[j] == array3[k]) {
            commonElements.add(array1[i]);
            i++;
            j++;
            k++;
        } else if (array1[i] < array2[j]) {
            i++;
        } else if (array2[j] < array3[k]) {
            j++;
        } else {
            k++;
        }
    }
    ```

    This finds the common elements in three sorted arrays.

92. **Find Two Numbers in an Array Whose Sum is Equal to a Given Number**
    ```java
    int[] array = {1, 2, 3, 4, 5};
    int target = 9;
    Set<Integer> complements = new HashSet<>();
    for (int num : array) {
        if (complements.contains(num)) {
            System.out.println(num + ", " + (target - num));
        }
        complements.add(target - num);
    }
    ```

    This finds two numbers in an array whose sum is equal to a given number.

93. **Find Two Numbers in an Array Whose Product is Equal to a Given Number**
    ```java
    int[]

 array = {2, 3, 4, 6, 8};
    int target = 12;
    Set<Integer> complements = new HashSet<>();
    for (int num : array) {
        if (num != 0 && target % num == 0 && complements.contains(target / num)) {
            System.out.println(num + ", " + (target / num));
        }
        complements.add(num);
    }
    ```

    This finds two numbers in an array whose product is equal to a given number.

94. **Find Maximum Product Subarray**
    ```java
    int[] array = {2, 3, -2, 4};
    int maxProduct = array[0];
    int maxSoFar = array[0];
    int minSoFar = array[0];
    for (int i = 1; i < array.length; i++) {
        int curr = array[i];
        int tempMax = Math.max(curr, Math.max(maxSoFar * curr, minSoFar * curr));
        minSoFar = Math.min(curr, Math.min(maxSoFar * curr, minSoFar * curr));
        maxSoFar = tempMax;
        maxProduct = Math.max(maxProduct, maxSoFar);
    }
    ```

    This finds the maximum product subarray in an array of integers.

95. **Find the Celebrity in a Party**
    ```java
    int[][] party = {{0, 0, 1, 0},
                     {0, 0, 1, 0},
                     {0, 0, 0, 0},
                     {0, 0, 1, 0}};
    int celebrity = findCelebrity(party);
    
    private int findCelebrity(int[][] party) {
        int candidate = 0;
        for (int i = 1; i < party.length; i++) {
            if (knows(candidate, i)) {
                candidate = i;
            }
        }
        for (int i = 0; i < party.length; i++) {
            if (i != candidate && (knows(candidate, i) || !knows(i, candidate))) {
                return -1;
            }
        }
        return candidate;
    }

    private boolean knows(int a, int b) {
        return party[a][b] == 1;
    }
    ```

    This finds the celebrity in a party where everyone knows the celebrity, but the celebrity doesn't know anyone.

96. **Find the Maximum Sum Subarray of Size K**
    ```java
    int[] array = {1, 4, 2, 10, 2, 3, 1, 0, 20};
    int k = 4;
    int maxSum = IntStream.range(0, array.length - k + 1)
                          .map(i -> Arrays.stream(array, i, i + k).sum())
                          .max()
                          .orElse(0);
    ```

    This finds the maximum sum subarray of size K in an array of integers.

97. **Sort an Array of 0s, 1s, and 2s (Dutch National Flag Problem)**
    ```java
    int[] array = {0, 1, 2, 0, 1, 2, 0, 1, 2};
    int low = 0, mid = 0, high = array.length - 1;
    while (mid <= high) {
        if (array[mid] == 0) {
            swap(array, low++, mid++);
        } else if (array[mid] == 1) {
            mid++;
        } else {
            swap(array, mid, high--);
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    ```

    This sorts an array of 0s, 1s, and 2s in linear time.

98. **Implement Stack using Queues**
    ```java
    class MyStack {
        private Queue<Integer> queue1 = new LinkedList<>();
        private Queue<Integer> queue2 = new LinkedList<>();

        public void push(int x) {
            queue2.add(x);
            while (!queue1.isEmpty()) {
                queue2.add(queue1.remove());
            }
            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
        }

        public int pop() {
            return queue1.remove();
        }

        public int top() {
            return queue1.peek();
        }

        public boolean empty() {
            return queue1.isEmpty();
        }
    }
    ```

    This implements a stack using two queues.

99. **Implement Queue using Stacks**
    ```java
    class MyQueue {
        private Stack<Integer> input = newStack<>();
        private Stack<Integer> output = new Stack<>();

        public void push(int x) {
            input.push(x);
        }

        public int pop() {
            if (output.isEmpty()) {
                while (!input.isEmpty()) {
                    output.push(input.pop());
                }
            }
            return output.pop();
        }

        public int peek() {
            if (output.isEmpty()) {
                while (!input.isEmpty()) {
                    output.push(input.pop());
                }
            }
            return output.peek();
        }

        public boolean empty() {
            return input.isEmpty() && output.isEmpty();
        }
    }
    ```

    This implements a queue using two stacks.
    

100. **Implement Trie (Prefix Tree)**
     
    ```java
    class TrieNode {
        private TrieNode[] children = new TrieNode[26];
        private boolean isEndOfWord;
    }
    class Trie {
        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode current = root;
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (current.children[index] == null) {
                    current.children[index] = new TrieNode();
                }
                current = current.children[index];
            }
            current.isEndOfWord = true;
        }

        public boolean search(String word) {
            TrieNode current = root;
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (current.children[index] == null) {
                    return false;
                }
                current = current.children[index];
            }
            return current.isEndOfWord;
        }

        public boolean startsWith(String prefix) {
            TrieNode current = root;
            for (char c : prefix.toCharArray()) {
                int index = c - 'a';
                if (current.children[index] == null) {
                    return false;
                }
                current = current.children[index];
            }
            return true;
        }
    }
    ```

    This implements a trie (prefix tree) data structure.
