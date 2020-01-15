package cn.cnzcb.data.conversion.transform;

public interface Assembler<R,T> {
    public T convert(R original,Class<T> targetType);
}