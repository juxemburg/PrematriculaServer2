package com.aliance.util;

import com.aliance.model.GroupMateriaModel;
import com.aliance.model.IMateriaGroupable;
import com.aliance.model.MateriaModel;

import java.util.List;

public class MapUtil {

    public static <T extends IMateriaGroupable> void insertToMap(List<GroupMateriaModel<T>> list, T item) {

        int index = contiene(item.getNumSemestre(), list);
        if(index <0) {
            list.add(new GroupMateriaModel(item.getNumSemestre()));
            index = list.size()-1;
    }
        list.get(index).addMateria(item);

    }

    private static <T extends IMateriaGroupable> int contiene(String codigo, List<GroupMateriaModel<T>> list) {
        int index =0;
        for(GroupMateriaModel model : list) {
            if(model.getNumSemestre().equals(codigo))
                return index;
            index++;
        }
        return -1;
    }
}
