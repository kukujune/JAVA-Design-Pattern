public class File extends Unit{
    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public int getsize() {
        return size;
    }
}
