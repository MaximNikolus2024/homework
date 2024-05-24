package lesson31.classwork.example01;

import java.util.Stack;

public class TabHistory {
    private Stack<String> forwardStack;
    private Stack<String> backwardStack;
    private String currentPage;

public TabHistory(String homePage){
    currentPage = homePage;
    forwardStack = new Stack<>();
    backwardStack = new Stack<>();
}

public String goBack(){
    if (backwardStack.isEmpty()){
        return null;
    }
    forwardStack.push(currentPage);
    currentPage = backwardStack.pop();
    return currentPage;
}

public String goForward(){
    if (forwardStack.isEmpty()){
        return null;
    }
    backwardStack.push(currentPage);
    currentPage = forwardStack.pop();
    return currentPage;
}

public void goToPage(String url){
    forwardStack.clear();
    backwardStack.push(currentPage);
    currentPage = url;
}
    public String getCurrentPage() {
        return currentPage;
    }
}
