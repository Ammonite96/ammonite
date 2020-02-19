public class PhraseOMatic {
    public static void main(String[] args) {

        String[] wordListOne = {"круглосуточный", "манящий", "злобный", "постапокалиптический", "на основе веб-технологий", "динамичный", "быстродейственный"};
        String[] wordListTwo = {"трудный", "чистый продукт", "лимон", "центральный", "опухший"};
        String[] wordListThree = {"процесс", "талант", "портал", "потустороний", "криминал", "обзор", "образец"};

        int oneLenght = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int threeLenght = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLenght);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLenght);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.print("Всё что нам нужно, - это " + phrase);
    }
}
