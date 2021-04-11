class ByTwos implements Series {
 //Implements interface
int start;
int cur_val;

ByTwos() {
start = 0;
cur_val = 0;
}
//public void setStart(int x) {
//start = x;
//cur_val = x;
//}
public int getNext() {
cur_val += 2;
return cur_val;
}
public void reset() {
cur_val = start;
}
}