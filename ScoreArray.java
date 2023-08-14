/*以下は複数条件式を記述する際のfor文の使い方
 * 例 for(初期値設定; 条件式1 && 条件式2...; 増減設定){
 *   処理
 * }
 */

class ScoreArray {
    public static void main(String args[]){
        int student = 4;
        int[] score = {90, 80, 100, 90};

        for(int i = 1, n = 0; i <= student && n <= score.length; i++, n++){
            System.out.println(i + "人目のは" + score[n] + "点");
        }
    }
}
