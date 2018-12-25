package com.oscardeathrace.transformers;

public interface Transformer<T, K> {
	K transform(T t);
}
