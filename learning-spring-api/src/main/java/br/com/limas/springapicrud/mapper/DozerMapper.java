package br.com.limas.springapicrud.mapper;

import java.util.ArrayList;
import java.util.List;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

public class DozerMapper {

    private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    public static <O, D> D parseObject(O origen, Class<D> destiny) {

        return mapper.map(origen, destiny);

    }

    public static <O, D> List<D> parseListObjects(List<O> origen, Class<D> destiny) {

        List<D> destinationObject = new ArrayList<D>();
        for (O o : origen) {
            destinationObject.add(mapper.map(o, destiny));
        }

        return destinationObject;

    }

}
