 /**
 * 汉诺塔
 * @param n n个盘子
 * @param start 起始柱子
 * @param transfer 中转柱子
 * @param target 目标柱子
 */
public static void hanoi(int n, char start, char transfer, char target) {
    //只有一个盘子，直接搬到目标柱子
    if (n == 1) {
        System.out.println(start + "---->" + target);
    } else {
        //起始柱子借助目标柱子将盘子都移动到中转柱子中(除了最大的盘子)
        hanoi(n - 1, start, target, transfer);
        System.out.println(start + "---->" + target);
        //中转柱子借助起始柱子将盘子都移动到目标柱子中
        hanoi(n - 1, transfer, start, target);
    }
}
