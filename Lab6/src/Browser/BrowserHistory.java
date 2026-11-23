package Browser;

public class BrowserHistory {
    private Stack backButtonStack;
    private Stack forwardButonStack;
    private String currentPage;

    public BrowserHistory(){
        backButtonStack = new Stack();
        forwardButonStack = new Stack();
        currentPage = null;
    }

    public void visit(String url){
        if (currentPage != null){
            backButtonStack.push(currentPage);
        }

        currentPage = url;
        forwardButonStack.delete();

        System.out.println("Visited : " + currentPage);
    }

    public void goBack(){
        if (backButtonStack.isEmpty()){
            System.out.println("Cannot go back!");
            return;
        }

        forwardButonStack.push(currentPage);
        currentPage = backButtonStack.pop();

        System.out.println("Went back to: " + currentPage);

    }

    public void goForward(){
        if (forwardButonStack.isEmpty()){
            System.out.println("Cannot go forward!");
            return;
        }

        backButtonStack.push(currentPage);
        currentPage = forwardButonStack.pop();

        System.out.println("Went forward to: " + currentPage);
    }

    public void displayCurrentPage() {
        if (currentPage == null){
            System.out.println("No Page Is Open!");
            return;
        }

        System.out.println("Current Page: " + currentPage);
    }

    private void clearStack(Stack stack){
        stack.delete();
    }

    public void displayHistory() {
        System.out.println("\n========== BROWSER HISTORY ==========");

        System.out.println("Current page: " + currentPage);

        System.out.print("Back stack (top -> bottom): ");
        backButtonStack.display();

        System.out.print("Forward stack (top -> bottom): ");
        forwardButonStack.display();

        System.out.println("=====================================");

    }

}
