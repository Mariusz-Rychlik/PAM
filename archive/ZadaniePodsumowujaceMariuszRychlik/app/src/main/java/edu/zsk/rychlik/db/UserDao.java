package edu.zsk.rychlik.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface UserDao {
    @Query("SELECT COUNT(*) FROM users")
    int getUserCount();

    @Insert
    void insertAll(User... users);

    @Query("SELECT * FROM users WHERE email = :email LIMIT 1")
    User getUserByEmail(String email);
}
