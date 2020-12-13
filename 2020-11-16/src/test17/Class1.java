package test17;

abstract class Class1 {int objectnum=0;
Class1 storage[]=new Class1[10];
abstract void put(Object o);
abstract Object get();
}
class Stack extends Class1{
private int point=0;
@Override
    void put(Object o) {
        storage[point++]= (Class1) o;
        objectnum++;
    }

    @Override
    Object get() {
    objectnum--;
    return storage[--point];
    }
}
class Queue extends Class1{
    private int top=0;
    private int bottom=0;

    @Override
    void put(Object o) {
        storage[top++]= (Class1) o;
    objectnum--;
    }

    @Override
    Object get() {
objectnum--;
    return storage[bottom++];
    }
}

