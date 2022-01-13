package lesson6_34.lesson25A;

import lesson6_34.lesson25A.exception.BadRequestException;
import lesson6_34.lesson25A.exception.InternalServerException;

public class GeneralDAO<T> {

    @SuppressWarnings("uncheked")
        private T[] array=(T[]) new Object[10];

//cохранение объекта в условную базу данных
    public  T save(T t) throws BadRequestException, InternalServerException {
        if (t==null)                                                        //User равен null
            throw new BadRequestException("Can`t save null user");

        int index=0;                                                        //проверка есть пустые места
        for(T el:array){
            if(el==null){
                array[index]=t;
                return array[index];
            }
            index++;
        }
        throw new InternalServerException("Not enough space to save user");  //не понятно, как добавить getId
        }

    //поиск всех элементов в массиве
    public T[] getAll(){
        return array;}
}
