package sg.edu.np.mad.practical2;

public class users {
    String Name;
    String Description;
    int Id;
    boolean Followed;

    public users(String name, String desc, int id, boolean follow)
    {
        Name = name;
        Description = desc;
        Id = id;
        Followed = follow;
    }
}
