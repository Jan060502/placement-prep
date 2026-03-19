
class wordinSentence{

public static void main(String[] args){

String s = "  java   is  easy  ";

String[] words = s.trim().split("\\s+");
System.out.println(words.length);
}
}