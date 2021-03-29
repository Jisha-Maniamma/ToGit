package com.Java.Class1.Day12.Database3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/03/23 15:09
 */
public class DataSource {
    public static final String DB_NAME="music.db";
    public static final String CONNECTION="jdbc:sqlite:"+DB_NAME;

    public static final String TABLE_ALBUM="albums";
    public static final String COLUMN_ALBUM_ID ="_id";
    public static final String COLUMN_ALBUM_NAME ="name";
    public static final String COLUMN_ALBUM_ARTIST ="artist";
    //////////////////////////
    public static final int INDEX_ALBUM_ID=1;
    public static final int INDEX_ALBUM_NAME=2;
    public static final int INDEX_ALBUM_ARTISTS=3;
    //////////////////////////
    public static final String TABLE_ARTIST="artists";
    public static final String COLUMN_ARTIST_ID ="_id";
    public static final String COLUMN_ARTIST_NAME ="name";
    public static final int INDEX_ARTIST_ID=1;
    public static final int INDEX_ARTIST_NAME=2;
    //////////////////////////
    public static final String TABLE_SONG="songs";
    public static final String COLUMN_SONG_ID ="_id";
    public static final String COLUMN_SONG_TRACK ="track";
    public static final String COLUMN_SONG_TITLE ="title";
    public static final String COLUMN_SONG_ALBUM ="album";
    public static final int INDEX_SONG_ID=1;
    public static final int INDEX_SONG_TRACK=2;
    public static final int INDEX_SONG_TITLE=3;
    public static final int  INDEX_SONG_ALBUM=4;
    //////////////////////////
    public static final int ORDER_BY_NONE=1;
    public static final int ORDER_BY_ASC=2;
    public static final int ORDER_BY_DESC=3;

    //public static final String QUERY_VIEW="SELECT "+COLUMN_ARTIST_NAME+","+COLUMN_SONG_ALBUM+","+COLUMN_SONG_TRACK+" FROM "+NEW_VIEW_NAME+" WHERE "+COLUMN_SONG_TITLE+"= \"";
    //WHERE "+COLUMN_SONG_TITLE+"= \"";
    public static final String NEW_VIEW_NAME="song_details_list_V3";


    //INSERT INTO artists (name) VALUES("Jisha");
    //INSERT INTO albums (name,artist) VALUES("jai hooooo",202);
    //INSERT INTO songs (track,title,album) VALUES(9,"Desi Hits",440);

    public static final String INSERT_INTO_ARTIST="INSERT INTO "+TABLE_ARTIST+" ("+COLUMN_ARTIST_NAME+") VALUES (?)";
    public static final String INERT_INTO_ALBUMS="INSERT INTO "+TABLE_ALBUM+" ("+COLUMN_ALBUM_NAME+","+COLUMN_ALBUM_ARTIST+") VALUES (?,?)";
    public static final String INSERT_INTO_SONGS="INSERT INTO "+TABLE_SONG+" ("+COLUMN_SONG_TRACK+","+COLUMN_SONG_TITLE+","+
            COLUMN_SONG_ALBUM+") VALUES (?,?,?)";

    public static final String QUERY_ARTIST=" SELECT "+COLUMN_ARTIST_ID+" FROM "+TABLE_ARTIST+
            " WHERE "+COLUMN_ARTIST_NAME+" = ?";
    public static final String QUERY_ALBUM=" SELECT "+COLUMN_ALBUM_ID+" FROM "+TABLE_ALBUM+
            " WHERE "+COLUMN_ALBUM_NAME+" = ?";

    public static final String Query_Albums_From_ArtistsName=
            "SELECT "+TABLE_ALBUM+"."+COLUMN_ALBUM_NAME+
                    " FROM "+TABLE_ALBUM+" INNER JOIN "+TABLE_ARTIST +" ON "+TABLE_ARTIST+"."+COLUMN_ARTIST_ID+" = "+TABLE_ALBUM+"."+COLUMN_ALBUM_ARTIST
                    +" WHERE "+TABLE_ARTIST+"."+COLUMN_ARTIST_NAME+" = "+" \"";
    public static final String Query_Albums_From_ArtistsName_ORDER=" ORDER BY "+TABLE_ALBUM+"."+COLUMN_ALBUM_NAME+" COLLATE NOCASE ";

    public static final String QUERY_VIEW="SELECT "+COLUMN_ARTIST_NAME+","+COLUMN_SONG_ALBUM+","+COLUMN_SONG_TRACK+
            " FROM "+NEW_VIEW_NAME+
            " WHERE "+COLUMN_SONG_TITLE+"= \"";
    //SELECT  name,album,track FROM song_details_list_V3 where title="(I Can't Get No) Satisfacion"
    public static final String QUERY_VIEW_NEW="SELECT "+COLUMN_ARTIST_NAME+","+COLUMN_SONG_ALBUM+","+COLUMN_SONG_TRACK+
            " FROM "+NEW_VIEW_NAME+
            " WHERE "+COLUMN_SONG_TITLE+"= ?";

    private Connection conn;
    private PreparedStatement querySongInfoView;
    private PreparedStatement insertToAlbum ;
    private PreparedStatement insertToArtists;
    private PreparedStatement insertIntoSongs;

    private PreparedStatement queryArtist;
    private PreparedStatement queryAlbum;


    public boolean open(){
        try{
            conn= DriverManager.getConnection(CONNECTION);
            querySongInfoView=conn.prepareStatement(QUERY_VIEW_NEW);
            insertToArtists=conn.prepareStatement(INSERT_INTO_ARTIST,Statement.RETURN_GENERATED_KEYS);
            insertToAlbum=conn.prepareStatement(INERT_INTO_ALBUMS,Statement.RETURN_GENERATED_KEYS);
            insertIntoSongs=conn.prepareStatement(INSERT_INTO_SONGS);

            queryArtist=conn.prepareStatement(QUERY_ARTIST);
            queryAlbum=conn.prepareStatement(QUERY_ALBUM);
            return true;
        }catch(SQLException e){
            System.out.println("The error is- "+e.getMessage());

            return false;
        }
    }

    public void close(){
        try{
            if(insertToAlbum!=null){
                insertToAlbum.close();
            }
            if(insertToArtists!=null){
                insertToArtists.close();
            }
            if(insertIntoSongs!=null){
                insertIntoSongs.close();

            }
            if(querySongInfoView!=null){
                querySongInfoView.close();
            }
            if(queryArtist!=null){
                queryArtist.close();
            }
            if(queryAlbum!=null){
                queryAlbum.close();
            }
            if(conn!=null)
                conn.close();

        }catch(SQLException e){
            System.out.println("The error is- "+e.getMessage());
        }
    }
    public List<Artists> querryArtist(int orderChoice){
//        Statement statement=null;
//        ResultSet result=null;
        StringBuilder sb=new StringBuilder("SELECT * FROM ");
        sb.append(TABLE_ARTIST);
        if(orderChoice!=1){
            sb.append(" ORDER BY ");
            sb.append(COLUMN_ARTIST_NAME);
            if(orderChoice==ORDER_BY_ASC){
                sb.append(" ASC");
            }
            else{
                sb.append(" DESC");
            }
        }
        try(Statement statement= conn.createStatement();
            ResultSet result= statement.executeQuery(sb.toString())){
//            Statement statement= conn.createStatement();
//            ResultSet result= statement.executeQuery("SELECT * FROM "+TABLE_ARTIST)
            List<Artists> artists=new ArrayList<>();

            while(result.next()){
                Artists artist=new Artists();
                artist.setId(result.getInt(INDEX_ARTIST_ID));
                artist.setName(result.getString(INDEX_ARTIST_NAME));

                artists.add(artist);

            }
            return artists;
        }catch(SQLException e){
            System.out.println("The error is- "+e.getMessage());
            return null; }


    }
    public static void main(String[] args) {

//         conn= DriverManager.getConnection(CONNECTION);
//        Statement statement= conn.createStatement();

    }

    public List<String> queryAlbumsForartist(String artistname,int sortOrder){

        StringBuilder sb=new StringBuilder(Query_Albums_From_ArtistsName);

//        sb.append(TABLE_ALBUM);
//        sb.append(".");
//        sb.append(COLUMN_ALBUM_NAME);
//        sb.append(" FROM ");
//        sb.append(TABLE_ALBUM+" INNER JOIN ");
//        sb.append(TABLE_ARTIST +" ON ");
//        sb.append(TABLE_ARTIST+"."+COLUMN_ARTIST_ID+" = "+TABLE_ALBUM+"."+COLUMN_ALBUM_ARTIST);
//        sb.append(" WHERE "+TABLE_ARTIST+"."+COLUMN_ARTIST_NAME+"=\"");
        sb.append(artistname);
        sb.append("\" ");

        if(sortOrder!=ORDER_BY_NONE){
            sb.append(Query_Albums_From_ArtistsName_ORDER);
//            sb.append(" ORDER BY ");
//            sb.append(TABLE_ALBUM+"."+COLUMN_ALBUM_NAME+" COLLATE NOCASE ");
            if(sortOrder==ORDER_BY_ASC){
                sb.append(" ASC");
            } else{
                sb.append(" DESC");
            }
        }
        System.out.println("SQL statement is- "+sb.toString());
        try(Statement statement= conn.createStatement(); ResultSet resultSet= statement.executeQuery(sb.toString())){
            List<String> AlbumNames=new ArrayList<>();

            while(resultSet.next()){
                AlbumNames.add(resultSet.getString(1));
            }
            return AlbumNames;
        }catch(SQLException e){
            System.out.println("The error in finding out the albums of an artist is- "+e.getMessage());
            return null;
        }

    }



    //SELECT songs.track,albums.name,artists.name FROM songs
    //INNER JOIN albums ON albums._id=songs.album
    //INNER JOIN artists ON artists._id=albums.artist
    //where songs.title="Go Your Own Way" order by albums.name,artists.name
    //COLLATE NOCASE ASC;
    public static final String QUERRY_SONG_DETAILS=
            "SELECT "+TABLE_SONG+"."+COLUMN_SONG_TRACK+","+ TABLE_ALBUM+"."+COLUMN_ALBUM_NAME+
                    ","+TABLE_ARTIST+"."+COLUMN_ARTIST_NAME+ " FROM "+TABLE_SONG+
                    " INNER JOIN "+TABLE_ALBUM+" ON "+TABLE_ALBUM+"."+COLUMN_ALBUM_ID+"="+TABLE_SONG+"."+COLUMN_SONG_ALBUM+
                    " INNER JOIN "+TABLE_ARTIST+" ON "+TABLE_ARTIST+"."+COLUMN_ARTIST_ID+"="+TABLE_ALBUM+"."+COLUMN_ALBUM_ARTIST+
                    " WHERE "+TABLE_SONG+"."+COLUMN_SONG_TITLE+"= \"";
    public static final String QUERRY_SONG_DETAILS_ORDER=" ORDER BY "+TABLE_ALBUM+"."+COLUMN_ALBUM_NAME+","+TABLE_ARTIST+"."+
            COLUMN_ARTIST_NAME+" COLLATE NOCASE";



    public List<SongArtistAlbum> QuerySongDetails(String song,int SortOrderorder){
        StringBuilder sb=new StringBuilder(QUERRY_SONG_DETAILS);
        sb.append(song);
        sb.append("\"");


        if(SortOrderorder!=ORDER_BY_NONE){
            sb.append(QUERRY_SONG_DETAILS_ORDER);
            if(SortOrderorder==ORDER_BY_ASC){
                sb.append(" ASC");
            }else{
                sb.append(" DESC");
            }
        }
        System.out.println("The SQL query is- \""+ sb.toString());
        return getAboutSong(sb);


    }
    public List<SongArtistAlbum> getAboutSong(StringBuilder s){
        System.out.println(s.toString());
        try(Statement statement= conn.createStatement(); ResultSet resultSet= statement.executeQuery(s.toString())){
            List<SongArtistAlbum> SongDetails=new ArrayList<>();
            while(resultSet.next()){
                SongArtistAlbum allAboutSelectedSong=new SongArtistAlbum();
                allAboutSelectedSong.setArtistName(resultSet.getString(3));
                allAboutSelectedSong.setAlbumName(resultSet.getString(2));
                allAboutSelectedSong.setSongTrackNumber(resultSet.getInt(1));


                SongDetails.add(allAboutSelectedSong);
            }
            return SongDetails;

        }catch(SQLException e){
            System.out.println("The error generated while fetching the song details [song track number, album name, artist name] is- "+e.getMessage());
            return null;
        }
    }

    public static final String GET_COUNT="SELECT COUNT(*) FROM ";
    public int getCount(String TableName){
        StringBuilder sb=new StringBuilder(GET_COUNT);
        sb.append(TableName);
        System.out.println(sb.toString());
        try(Statement statement= conn.createStatement(); ResultSet resultSet= statement.executeQuery(sb.toString())){
            // while(resultSet.next()){
            int count=resultSet.getInt(1);
            return count;
            //}

        }catch(SQLException e){
            System.out.println("The error while counting the number of items in the table is- "+e.getMessage());
            return -1;}

    }

    //CREATE VIEW if NOT EXISTS artist_list As SELECT
    //artists.name as singer,
    //albums.name as album,
    //songs.track as track,
    //songs.title as songName
    //FROM songs
    //INNER JOIN albums on albums._id=songs.album
    //INNER JOIN artists on artists._id=albums.artist ORDER by songs.track;

    public static final String QUERY_CREATE_NEW_VIEW="CREATE VIEW IF NOT EXISTS "+NEW_VIEW_NAME+" AS SELECT "+
            TABLE_SONG+"."+COLUMN_SONG_TITLE+" AS "+ COLUMN_SONG_TITLE+", "+
            TABLE_SONG+"."+COLUMN_SONG_TRACK+" AS "+COLUMN_SONG_TRACK+", "+
            TABLE_ALBUM+"."+COLUMN_ALBUM_NAME+" AS "+COLUMN_SONG_ALBUM+", "+
            TABLE_ARTIST+"."+COLUMN_ARTIST_NAME+" AS "+COLUMN_ARTIST_NAME+" "+
            " FROM "+TABLE_SONG+
            " INNER JOIN "+TABLE_ALBUM+" ON "+TABLE_ALBUM+"."+COLUMN_ALBUM_ID+"="+TABLE_SONG+"."+COLUMN_SONG_ALBUM+
            " INNER JOIN "+TABLE_ARTIST+" ON "+TABLE_ARTIST+"."+COLUMN_ARTIST_ID+"="+TABLE_ALBUM+"."+COLUMN_ALBUM_ARTIST
            +" ORDER BY "+TABLE_SONG+"."+COLUMN_SONG_TRACK;


//    public static final String CREATE_ARTIST_FOR_SONG_VIEW = "CREATE VIEW IF NOT EXISTS " +
//            TABLE_ARTIST_SONG_VIEW + " AS SELECT " +
//            TABLE_ARTISTS + "." + COLUMN_ARTIST_NAME + ", " +
//            TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME + " AS " + COLUMN_SONG_ALBUM +
//            ", " +
//            TABLE_SONGS + "." + COLUMN_SONG_TRACK + ", "
//            + TABLE_SONGS + "." + COLUMN_SONG_TITLE +
//            " FROM " + TABLE_SONGS +
//            " INNER JOIN " + TABLE_ALBUMS + " ON " + TABLE_SONGS +
//            "." + COLUMN_SONG_ALBUM + " = " + TABLE_ALBUMS + "." + COLUMN_ALBUM_ID +
//            " INNER JOIN " + TABLE_ARTISTS + " ON " + TABLE_ALBUMS + "." + COLUMN_ALBUM_ARTIST +
//            " = " + TABLE_ARTISTS + "." + COLUMN_ARTIST_ID +
//            " ORDER BY " +
//            TABLE_ARTISTS + "." + COLUMN_ARTIST_NAME + ", " +
//            TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME + ", " +
//            TABLE_SONGS + "." + COLUMN_SONG_TRACK;


    public boolean createNewView(){
        try(Statement statement= conn.createStatement()){
            statement.execute(QUERY_CREATE_NEW_VIEW);
            return true;
        }catch(SQLException e){
            System.out.println("The error while trying to create the new view is- "+e.getMessage());
            return false;
        }

    }

    public List<SongArtistAlbum> QueryNewView(String songName){
        StringBuilder sb=new StringBuilder(QUERY_VIEW);

        sb.append(songName);
        sb.append("\"");
        System.out.println("The SQL query is- "+ sb.toString());
        return getAboutSong(sb);

    }

    public List<SongArtistAlbum> QueryNewView1(String songName){


        try{
            querySongInfoView.setString(1,songName);
            ResultSet resultSet= querySongInfoView.executeQuery();
            List<SongArtistAlbum> SongDetails=new ArrayList<>();
            while(resultSet.next()){
                SongArtistAlbum allAboutSelectedSong=new SongArtistAlbum();
                allAboutSelectedSong.setArtistName(resultSet.getString(3));
                allAboutSelectedSong.setAlbumName(resultSet.getString(2));
                allAboutSelectedSong.setSongTrackNumber(resultSet.getInt(1));


                SongDetails.add(allAboutSelectedSong);
            }
            return SongDetails;

        }catch(SQLException e){
            System.out.println("The error generated while fetching the song details [song track number, album name, artist name] is- "+e.getMessage());
            return null;
        }

    }
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
    private int GetArtistID(String artistName) throws SQLException{
        queryArtist.setString(1,artistName);
        ResultSet resultSet=queryArtist.executeQuery();
        if(resultSet.next()){
            return resultSet.getInt(1);

        }else{
            insertToArtists.setString(1,artistName);
            int modifiedColumn=insertToArtists.executeUpdate();
            if(modifiedColumn!=1){
                throw  new SQLException("Sorry couldnot add the artist to the table");
            }
            ResultSet resultSet1=insertToArtists.getGeneratedKeys();
            if(resultSet1.next()){
                return resultSet1.getInt(1);
            }else{
                throw new SQLException("Sorry cannot print the artist id");
            }

        }

    }

    private int gtAlbumId(String albumName,int artistID) throws SQLException{
        queryAlbum.setString(1,albumName);
        ResultSet resultSet=queryArtist.executeQuery();
        if(resultSet.next()){
            return resultSet.getInt(1);
        }
        else{
            insertToAlbum.setString(1,albumName);
            insertToAlbum.setInt(2,artistID);

            int modifiedColumn=insertToAlbum.executeUpdate();
            if(modifiedColumn!=1){
                throw new SQLException("Sorry couldnot insert thethe new album");
            }

            ResultSet resultSet1=insertToAlbum.getGeneratedKeys();
            if(resultSet1.next()){
                return resultSet1.getInt(1);
            }else{
               throw new SQLException("Sorry cannot print the album id value");
            }

        }



    }

    public void addSong(){

    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private int insertArtist(String artistName) throws SQLException{
        queryArtist.setString(1,artistName);
        ResultSet resultSet=queryArtist.executeQuery();
        if(resultSet.next()){
            return  resultSet.getInt(1);
        }
        else{
            //insert artist into artists table
            insertToArtists.setString(1,artistName);
            int affectedKeys=insertToArtists.executeUpdate();
            if(affectedKeys!=1){
                throw new SQLException("could not insert artist...sorry!");
            }

            ResultSet resultSet1=insertIntoSongs.getGeneratedKeys();
            if(resultSet1.next()){
                return resultSet1.getInt(1);
            }else{
                throw new SQLException(" could not get the _id of artist");
            }
        }



    }
    private int insertAlbum(String albumName,int  artistId) throws SQLException{
        queryAlbum.setString(1,albumName);
        ResultSet resultSet=queryArtist.executeQuery();
        if(resultSet.next()){
            return resultSet.getInt(1);
        }else{
            insertToAlbum.setString(1,albumName);
            insertToAlbum.setInt(2,artistId);

            int AffectedRows=insertToAlbum.executeUpdate();
            if(AffectedRows!=1){
                throw new SQLException("Sorry could not insert the new album ...sorry! ");
            }

            ResultSet generatedKey=insertToAlbum.getGeneratedKeys();
            if(generatedKey.next()){
                return generatedKey.getInt(1);
            }
            else{
                throw new SQLException("could not gt the _id value from Album table");
            }


        }

    }

    public void insertSong(int track, String songTitle,String album, String artist){
        try{
            conn.setAutoCommit(false);
            int artitID=insertArtist(artist);
            int albumID=insertAlbum(album,artitID);
            insertIntoSongs.setInt(1,track);
            insertIntoSongs.setString(2,songTitle);
            insertIntoSongs.setInt(3, albumID);
            int affectedKey=insertIntoSongs.executeUpdate();
            if(affectedKey==1){
                conn.commit();
            }else{
                throw new SQLException("the song insert failed");
            }



        }catch(Exception e){
            System.out.println(e.getMessage());
            try{
                System.out.println("Performing rollback");
                conn.rollback();
            }catch(SQLException e1){
                System.out.println(e1.getMessage());
            }

        }finally{
            try{
                System.out.println("Resetting auto commit behaviour");
                conn.setAutoCommit(true);
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }

        }

    }



}
