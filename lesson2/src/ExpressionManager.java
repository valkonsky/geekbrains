public class ExpressionManager {
    MyJPanel myJPanel;
    String[] operands;

    ExpressionManager(MyJPanel myJPanel){
        this.myJPanel = myJPanel;
        operands = new String[]{"+","-","*","/"};
    }



    public String[] splitOperands(){
        String expression = myJPanel.getExpressionString();
        String operands[] = expression.split(findOperator(expression));
        return operands;
    }

    String findOperator(String expression){
        String operand = null;
        for (int i = 0; i < operands.length; i++) {
            if (expression.indexOf(operands[i])>0){
                operand =  operands[i];
                if (operand.equals("+")){
                    operand = "\\+";
                }else if (operand.equals("*")){
                    operand="\\*";
                }
            }
        }
        return operand;
    }

    double getResult(){
        double firstOperand = Double.parseDouble(splitOperands()[0]);
        double secondOperand = Double.parseDouble(splitOperands()[1]);
        double result = 0;
        String operator = findOperator(myJPanel.getExpressionString());
        switch (operator){
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "/":
                result = firstOperand / secondOperand;
                break;
            case "\\+":
                result = firstOperand + secondOperand;
                break;
            case"\\*":
                result = firstOperand * secondOperand;
                break;
        }
            return result;
    }
}
