public class Student {
    
    private String name;
    private int test[] = new int[4];

      public Student(String nm, int t[]){
		name = nm;
                test = t;
	}

	//Additonal Constructor
	public Student(Student other) {
		this(other.name, other.test);
	}

    public void setName(String nm) {
    	name = nm;
    }

    public void setMark(int i, int mark){
    	test[i-1] = mark;
    }

    public int getAverage() {
    	int average;
        average = (test[0] + test[1] + test[2] + test[3]) / 4;
    	return average;
    }


    public int getMark(int i) {
	return test[i-1];
    }

    public String toString(){
        String str;
        str = "Name:\t\t" + name + "\n";
        str += "" + getAverage();
        return str;
    }

    

    public String getName() {
    	return name;
    }

    //validate data
    public String validateData() {
    	String errormessage = null;
    	//check if name is entered
    	if (name.length() < 2) 
    		errormessage += "\nName is required";
    	
	if (test[0] < 0 || test[0] > 100 || test[1] < 0 || test[1] > 100 || test[2] < 0 || test[2] > 100 || test[3] < 0 || test[3] > 100) 
    		errormessage += "\nAt least one mark is not within acceptable range.";
	
        if (errormessage != null)
                errormessage += ("\n Please re-enter all data.");
        
	return errormessage;
    	}
 }

