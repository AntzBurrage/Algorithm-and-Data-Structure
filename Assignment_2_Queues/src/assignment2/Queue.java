package assignment2;

public class Queue
{

    private Node top;
    private Node back;
    private int size;

    public Queue()
    {
        top = back = null;
        size = 0;
    }

    //Size Function
    public int size()
    {
        return size;
    }

    //Empty Button
    public void clear()
    {
        this.top = null;
        size = 0;
    }

    //Get Back Function  
    public Employee getTail()
    {
        return back.getElement();
    }

    //Get Top Button
    public Employee getTop()
    {
        return top.getElement();
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

    //Insert Button
    public void append(Employee obj)
    {
        Node node = new Node();
        node.setElement(obj);
        node.setNext(null);
        if (size == 0)
        {
            top = node;
        } else
        {
            back.setNext(node);
        }
        back = node;
        size++;
    }

    //remove From Top Button
    public Employee remove()
    {
        Employee obj;
        obj = top.getElement();
        top = top.getNext();
        size--;
        if (size == 0)
        {
            back = null;
        }
        return obj;
    }

    //Print Button
    public void print()
    {
        System.out.print("Queue Contains: " + "\n");
        Node current = top;
        int i = 1;
        while (current != null)
        {
            try
            {
                System.out.print("Node Number " + i + "\n"
                        + "First Name: " + current.getElement().employeenum + "\n"
                        + "Surname: " + current.getElement().surname + "\n"
                        + "Surname: " + current.getElement().firstname + "\n"
                        + "Age: " + current.getElement().age + "\n\n");

                current = current.getNext();
            } catch (Exception ex)
            {
                System.out.print(ex.getMessage());
            }
            i++;
        }
    }

    //Search Button
    public Employee search(String UserInput)
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

}
