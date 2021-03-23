package com.Java.Class1.Day12.Database2;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/03/22 15:04
 */
public class Main {
    public static final String DB_NAME="sample.db";
    public static final String CONNECTION_NAME="jdbc:sqlite:"+DB_NAME;

    public static final String TABLE_NAME="company";

    public static final String COLUMN_ID="_id";
    public static final String COLUMN_NAME="name";
    public static final String COLUMN_DEPARTMENT="departmentName";



    public static void main(String[] args) {





//SELECT songs.track,songs.album,albums.name FROM songs
// JOIN albums ON songs.album=albums._id
// ORDER by albums.name,songs.track COLLATE NOCASE DESC;




//SELECT artists.name,albums.name,songs.track,songs.title FROM songs
//INNER JOIN albums on songs.album=albums._id
//INNER JOIN artists on albums.artist=artists._id
//ORDER BY artists.name;




//SELECT artists.name,albums.name,songs.track,songs.title FROM songs
//INNER JOIN albums on songs.album=albums._id
//INNER JOIN artists on albums.artist=artists._id
//where artists._id=19
//ORDER BY artists.name;



//SELECT artists.name,albums.name,songs.track,songs.title FROM songs
//INNER JOIN albums on songs.album=albums._id
//INNER JOIN artists on albums.artist=artists._id
//where artists.name like "%ELF"
//ORDER BY artists.name;



//CREATE VIEW Jisha_Table_new As
//SELECT artists.name,albums.name,songs.track,songs.title FROM songs
//INNER JOIN albums on songs.album=albums._id
//INNER JOIN artists on albums.artist=artists._id
//ORDER BY artists.name;


//drop view Jisha_Table_new;


//CREATE VIEW Jisha_Table_new As
//SELECT artists.name as ArtistsName,albums.name AlbumsName,songs.track,songs.title FROM songs
//INNER JOIN albums on songs.album=albums._id
//INNER JOIN artists on albums.artist=artists._id
//ORDER BY artists.name;


//SELECT count(songs._id) FROM songs;








    }
}
