class ByThrees implements Series {
 //Implements interface
int start;
int cur_val;
ByThrees() {
start = 0;
cur_val = 0;
}
public void setStart(int x) {
start = x;
cur_val = x;
}
public int getNext() {
cur_val += 3;
return cur_val;
}
public void reset() {
cur_val = start;
}
 
}
