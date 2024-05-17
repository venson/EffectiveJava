package venson;


import java.util.EnumSet;

public class Item2Builder {
    private Long id;
    private String name;

    public Item2Builder(Builder builder){
        id = builder.id;
        name = builder.name;
    }
    public static Builder builder(){
        return new Builder();
    }
    public static class Builder {
        private Long id;
        private String name;

        public Builder (){}
        public Builder id(Long id){
            this.id = id;
            return this;
        }
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Item2Builder build(){
            return new Item2Builder(this);
        }
    }

    @Override
    public String toString() {
        return "Item2Builder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item2Builder that = (Item2Builder) o;
        return id.equals(that.id) && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }
}

