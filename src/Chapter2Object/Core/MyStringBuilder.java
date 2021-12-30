package Chapter2Object.Core;

public class MyStringBuilder {

    public MyStringBuilder(){
        StringBuilder sb = new StringBuilder(1024);

        for (int i = 0 ; i < 10 ; ++i){
            sb.append(i);
            sb.append(',');
        }

        String result = sb.toString();

        System.out.println(result);

        String[] fields = { "name", "position", "salary" };
        String table = "employee";

        String sql = buildInsertSql(fields,table);
        System.out.println(sql);
    }

    private String buildInsertSql(String [] fields, String tabel){

        StringBuilder sb = new StringBuilder(1024);
        sb.append("INSERT INTO ");
        sb.append(tabel);
        sb.append(" ( ");
        for (String filed:fields){
            sb.append(filed);
            sb.append(" ");
        }
        sb.append(") VALUES (?, ?, ?)");
        return sb.toString();
    }

}
