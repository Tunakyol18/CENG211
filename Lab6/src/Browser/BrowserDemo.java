package Browser;

public class BrowserDemo {
    public static void main(String[] args) {

        BrowserHistory browser = new BrowserHistory();

        // STEP 1: Visit three webpages.
        browser.visit("google.com");
        browser.visit("youtube.com");
        browser.goBack();

        browser.visit("Facebook.com");
        browser.goBack();

        // STEP 3: Go forward once.
        browser.goForward();

        // STEP 4: Visit a new webpage.
        browser.visit("stackoverflow.com");

        // STEP 5: Display the current webpage.
        browser.displayCurrentPage();

        // STEP 6: Display the complete browser history.
        browser.displayHistory();
    }
}


// 2. What happens to the forward stack when a new page is visited?
// The forward stack is cleared because visiting a new page creates
// a new navigation path. Previously visited forward pages are removed.


// 3. Why are stacks appropriate for this problem?
// Stacks are appropriate because they follow the LIFO (Last In, First Out)
// principle. The last visited webpage can be accessed first when going back
// or forward. This makes browser navigation easy to manage.


// 4. Time Complexity:
//
// Method       Time Complexity    Explanation
//
// push()       O(1)               Adds a new node at the top of the stack.
// pop()        O(1)               Removes the top node of the stack.
// peek()       O(1)               Returns the top element without removing it.
// visit()      O(n)               Clearing the forward stack takes O(n) time
//                                 in the worst case.
// goBack()     O(1)               Pushes and pops one element.
// goForward()  O(1)               Pushes and pops one element.