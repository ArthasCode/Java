import java.util.List;

public class Teste {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        var num = 3;
        var num2 = 1;
        List<String> nome = List.of("João", "Maria", "Carlos");
        if (num == 2 || num2 == 1)
            nome.stream()
                    .map(String::toUpperCase)
                    .forEach(System.out::println);
        System.out.println(num2 == 1);
        System.out.println("Acabou!");

        String sentence = "Tente achar uma substring em mim";
        String subString = "char";
        boolean foundChar = false;

        int loopLength = sentence.length() - subString.length();

        test: for (int i = 0; i < loopLength; i++) {
            int n = subString.length();
            int charSub = 0;
            int charString = i;

            while (n-- > 0){
                if (subString.charAt(charSub++) != sentence.charAt(charString++))
                    continue test;
            }
            foundChar = true;
            break test;
        }
        System.out.println(foundChar ? "A substring está presente na setença": "A substring não foi encontrada");
        
        }
        
        public class search{
            public search(){
                int searchTarget = 3;
                int[][] searchArray = {
                        { 54, 24, 325, 42, 23, 24 },
                        { 32, 42, 524, 524, 3, 42, 54 }
                };
                boolean found = false;
                int i1 = 0;
                int j1 = 0;
                search: for (int i = 0; i < searchArray.length; i++) {
                    for (int j = 0; j < searchArray[i].length; j++) {
                        if (searchArray[i][j] == searchTarget) {
                            j1 = j;
                            i1 = i;
                            found = true;
                            break search;
                        }
                    }
                }
                if (found) {
                    System.out.println("O número foi encontrado na posição: " + i1 + ", " + j1);
                }
            }
        }

        public class switchTeste{
            public switchTeste(){
               
                String[] months = {"january","february","march","april","may","june","july","august","september","october","november","december"};
                int month = 3;
                int numDays = 0;
                int year = 2025;

                switch (months[month]) {
                    case "january": case "march": case "may":
                    case "july": case "august": case "october":
                    case "december":
                        numDays = 31;
                        break;
                    
                    case "april": case "juny": case "september":
                    case "november":
                        numDays=30;
                        break;
                    case "february":
                        if (((year % 4 == 0) && 
                        !(year % 100 == 0))
                        || (year % 400 == 0))
                            numDays = 29;
                    else
                        numDays = 28;
                        break;
                    default:
                        System.out.println("Invalid month");
                        break;
                }
                    String day = "Wednesday";
                    int len = 
                        switch (day) {
                            case "MONDAY","FRIDAY", "SUNDAY" -> 6;
                            case "TUESDAY" -> 7;
                            case "WEDNESDAY" -> 9;
                            default -> throw new IllegalStateException("dia inválido: "+ day);
                        };
    
            }
            
        }
    }


    
