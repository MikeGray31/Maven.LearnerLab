package io.zipcoder.interfaces.classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E> {

    public List<E> personList;

    public People(){
        personList = new ArrayList<>();
    }

    public List<E> getPersonList() {
        return personList;
    }

    public void add(E p){
        personList.add((E) p);
    }

    public boolean contains(E p){
        return personList.contains(p);
    }

    public boolean remove(E p){
       return personList.remove(findById(p.getId()));
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public Iterator<E> iterator() {
        return personList.iterator();
    }

    public E findById(long id){
        for(E s: this.getPersonList()){
            if(s.getId() == id){
                return s;
            }
        }
        return null;
    }

    public abstract E[] toArray ();
}
