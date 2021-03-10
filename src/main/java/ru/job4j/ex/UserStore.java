package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for(User element : users) {
            if(login.equals(element.getUsername())) {
                rsl = element;
            }
        }
        if(rsl == null) {
            throw new UserNotFoundException("User not found!");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rsl = false;
        if(user.isValid()) {
            rsl = true;
        }
        if(!rsl || user.getUsername().length() < 3) {
            throw new UserInvalidException("User is not valid!");
        }
        return rsl;
    }

    public static void main(String[] args) {
        User[] users = { new User("Petr Arsentev", true)};
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        }
        catch (UserInvalidException inv) {
              inv.printStackTrace();
                }
        catch (UserNotFoundException us) {
            us.printStackTrace();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
