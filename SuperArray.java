public class SuperArray{
        private String[] data;
        private int size = data.length;

        public void clear(){
                String[] nullarr = new String[size];
                data = nullarr;
        }
        public int size(){
                return size;
        }
        public boolean isEmpty(){
                for(int n=0;n<size;n++){
                        if(data[n]!= null){
                                return false;
                        }
                }
                return true;
        }
        public boolean add(String element){
                String[] newdata = new String[size+1];
                for(int x=0;x<size;x++){
                        data1[x] = data[x];
                }
                newdata[size]=element;
                return true;
        }
        public String get(int index){
                if(index>=size){
                        throw new ArrayIndexOutOfBoundsException("index array out of bounds");
                }
                return data[index];
        }
        public String set(int index, String element){
                if(index >= size){
                        throw new ArrayIndexOutOfBoundsException("index array out of bounds");
                }
                String n = data[index];
                data[index]=element;
                return n;
        }
        public String toString(){
                String array = "";
                for(int a=0;a<size;a++){
                        array.concat(data[a]+", ");
                }
                return "["+array+"]";
        }
        public boolean contains(String element){
                for(int i=0;i<size;i++){
                        if(data[i]).equals(element)){
                                return true;
                        }
                }
                return false;
        }
        public  void add(int index, String element){
                if(index>=size){
                        throw new ArrayIndexOutOfBoundsException("index array out of bounds");
                }
                String[] newdata=new String[size+1];
                for(int i=0;i<index;i++){
                        data1[i] = data[i];
                }
                for(int i=index;i<size;i++){
                        newdata[i+1]=data[i];
                }
                data1[index]=element;
        }
        public int IndexOf(String element){
                for(int b=0;b<size;b++){
                        if(data[b].equals(element)){
                                return b;
                        }
                }
                return -1;
        }
        public int lastIndexOf(String element){
                for(int i=size-1;i>=0;i--){
                        if(data[i].equals(element)){
                                return i;
                        }
                }
                return -1;
        }
        public String remove(int index){
                if(index >= size){
                        throw new ArrayIndexOutOfBoundsException("index array out of bounds");
                }
                String temp=data[index];
                String[] newdata=new String[size-1];
                for(int i=index+1;i<size;i++){
                        newdata[i-1]=data[i];
                }
                for(int j=0;i<index;i++){
                        newdata[i]=data[i];
                }
                return temp;
        }
        public boolean remove(String element){
                String[] newdata=new String[size-1];
                for(int i=0;i<size;i++){
                        if(data[i].equals(element)){
                                int index = i;
                                for(int n=0;n<index;n++){
                                        newdata[n]=data[n];
                                }
                                for(int m=index+1;m<size;m++){
                                        newdata[m-1]=data[m];
                                }
                                return true;
                        }
                }
                return false;
        }
}
