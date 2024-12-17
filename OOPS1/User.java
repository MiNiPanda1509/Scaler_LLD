package LLD.LabSession.OOPS1;

public abstract class User {

    private String userId;
    private String name;
    private String contactInfo;

    public User(){
        this.userId = generateUniqueId();
    }

    public User(String name, String contactInfo){
        this();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public User(User user){
        this.userId = user.userId;
        this.name = user.name;
        this.contactInfo = user.contactInfo;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setContactInfo(String contactInfo){
        this.contactInfo = contactInfo;
    }

    public String getName(){
        return name;
    }

    public String getContactInfo(){
        return contactInfo;
    }

    private String generateUniqueId(){
        return "0";
    }

    abstract void displayDashboard();
    abstract boolean canBorrowBooks();
}
