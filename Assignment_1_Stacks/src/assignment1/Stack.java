package assignment1;

public class Stack
{

    private Node top;
    private int size;

    public Stack()
    {
        top = null;
        size = 0;
    }
//Size Function

    public int size()
    {
        return size;
    }

//Is Empty Function
    public boolean isEmpty()
    {
        if (top == null)
        {
            return true;
        } else
        {
            return false;
        }
    }

//Top Button
    public Student preview()
    {
        return top.getElement();
    }

//Push Button
    public void push(Student e)
    {
        Node s = new Node(e, top);
        s.setElement(e);
        s.setNext(top);
        top = s;
        size++;
    }

//Pop Button
    public Student pop()
    {
        Student temp;
        temp = top.getElement();
        top = top.getNext();
        size--;
        return temp;
    }

//Print Button
    public void print()
    {
        Node current = top;
	int i = 1;
        while (current != null)
        {
	    try {
            
		System.out.print("Node Number " + i  + "\n"
		+ "First Name: " + current.getElement().name + "\n"
                + "Surname: " + current.getElement().surname + "\n"
                + "Age: " + current.getElement().age + "\n"
                + "Student Number: " + current.getElement().StudID + "\n"
                + "Web Dev Results: " + current.getElement().res1 + "\n"
                + "Java Results: " + current.getElement().res2 + "\n"
                + "PHP Results: " + current.getElement().res3 + "\n"
                + "Engineering Results: " + current.getElement().res4 + "\n"
                + "Product Results: " + current.getElement().res5 + "\n"
                + "SQL Results: " + current.getElement().res6 + "\n\n");
            
		current = current.getNext();
	    }
	    catch (Exception ex) 
	    { 
	    System.out.print(ex.getMessage());
	    }
	    i++;
        }
    }

    //Search Button
    
    public Student search(String UserInput)
    {
        Node current = top;
        while (current != null)
        {
            if (current.getElement().surname.toLowerCase().equals(UserInput.toLowerCase()))
            {
		return current.getElement();	
            } else
            {
                current = current.getNext();
            }
        }
	return null;
    }

//Clear Button
    public void clear()
    {
        this.top = null;
        size = 0;
    }

    private void display(Student element)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void search()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getElement()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
