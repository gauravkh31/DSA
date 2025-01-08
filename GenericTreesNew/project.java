Import java.util.Scanner;
// Song class
Class Song {
 Private String title;
 Private String artist;
 Private int duration;
 Public Song(String title, String artist, int duration) {
 This.title = title;
 This.artist = artist;
 This.duration = duration;
 }
 Public String getTitle() {
 Return title;
 }
 Public String getArtist() {
 Return artist;
 }
 Public int getDuration() {
 Return duration;
 }
  @Override
 Public String toString() {
 Return “\”” + title + “\” by “ + artist + “ (“ + duration + “ seconds)”;
 }
}
// Playlist class
Class Playlist {
 Private Song[] songs;
 Private int count;
 Public Playlist(int capacity) {
 Songs = new Song[capacity];
 Count = 0;
 }
 Public void addSong(Song song) {
 Songs[count++] = song;
 }
 Public void displayPlaylist() {
 System.out.println(“Playlist:”);
 For (int I = 0; I < count; i++) {
 System.out.println((I + 1) + “. “ + songs[i]);
 } }
 