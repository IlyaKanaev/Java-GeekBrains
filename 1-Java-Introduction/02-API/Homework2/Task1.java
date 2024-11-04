package Homework2;
/*
 * ана строка sql-запроса "select * from students where “

Условие

Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные (параметры) для фильтрации приведены в виде json-строки в примере ниже. Если значение null, то параметр не должен попадать в запрос.

Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:

String QUERY - начало SQL-запроса String PARAMS - JSON с параметрами

Пример**:** Строка sql-запроса:

select * from students where
// Параметры для фильтрации:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Результат:
select * from students where name='Ivanov' and country='Russia' and city='Moscow'
 */
class Answer {  
    public static StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже
        StringBuilder params = new StringBuilder(PARAMS);
        params.deleteCharAt(0);
        for(int i = params.length() - 1; i > 50; i--) {
            params.deleteCharAt(i);
        }
        for(int i = 0; i < params.length(); i++) {
            if(params.charAt(i) == ':') {
                params.deleteCharAt(i + 1);
                params.insert(i + 1, "'");
                params.deleteCharAt(i);
                params.insert(i, "=");
            }
            if(params.charAt(i) == ',') {
                params.deleteCharAt(i - 1);
                params.insert(i - 1, "'");
                params.deleteCharAt(i);
                params.insert(i, " and");
            }
        }
        for(int i = 0; i < params.length(); i++) {
            if(params.charAt(i) == '"') params.deleteCharAt(i);
        }
        params.append("'");

        StringBuilder result = new StringBuilder(QUERY);
        result.append(params);
        return result;
    }
}

// Variant 2 (Образцовый)
//class Answer {
//    public static StringBuilder answer(String QUERY, String PARAMS){
//        String paramsNew = PARAMS.replace('{',' ').replace('}', ' ');
//        String[] params = paramsNew.split(",");
//        StringBuilder stringBuilder = new StringBuilder(QUERY);
//
//        for (int i = 0; i < params.length; i++){
//            String[] elements = params[i].replace('"', ' ').split(":");
//            if(!"null".equals(elements[1].trim())){
//                stringBuilder.append(elements[0].trim()).append("=").append("'").append(elements[1].trim()).append("'");
//                if (i < params.length - 2) stringBuilder.append(" and ");
//            }
//        }
//        return stringBuilder;
//    }
//}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task1{ 
	public static void main(String[] args) { 
      String QUERY = "";
      String PARAMS = "";
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        QUERY = "select * from students where ";
	    PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
      }
      else{
        QUERY = args[0];
        PARAMS = args[1];
      }     
      
      Answer ans = new Answer();      
      System.out.println(ans.answer(QUERY, PARAMS));
	}
}
