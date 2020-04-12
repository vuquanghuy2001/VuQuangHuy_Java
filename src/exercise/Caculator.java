//
//package exercise;
//private static void Calculator() {
//        System.out.print("Enter size: ");
//        int size = getInputInt();
//        System.out.println("Enter " + size + " integer values: ");
//        int[] arr = initArray(size);
//        System.out.println("Average : " + getAverage(arr));
//        }
//
//private static int[] initArray(int size) {
//        int[] result = new int[size];
//
//        for (int i = 0; i < size; ++i) {
//        System.out.print("Value " + (i + 1) + ": ");
//        result[i] = getInputInt();
//        }
//
//        return result;
//        }
//
//private static double getAverage(int[] arr) {
//        int sum = 0;
//        for (var item : arr) {
//        sum += item;
//        }
//        return (double) sum / arr.length;
//        }
//
//private static int getInputInt() {
//        Scanner input = new Scanner(System.in);
//        return input.nextInt();
//        }
//
//private static List<Integer> initArray_useList(int size) {
//        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < size; ++i) {
//        System.out.print("Value " + (i + 1) + ": ");
//        int tmp = getInputInt();
//        result.add(tmp);
//        }
//
//        return result;
//        }
//
//private static double getAverage_useList(List<Integer> integerList) {
//        int sum = 0;
//
//        Iterator<Integer> integerList_Iterator = integerList.iterator();
//        while (integerList_Iterator.hasNext()) {
//        sum += integerList_Iterator.next();
//        }
//
//        return sum / integerList.size();
//        }