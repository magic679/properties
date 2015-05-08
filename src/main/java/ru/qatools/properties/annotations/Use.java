package ru.qatools.properties.annotations;

import ru.qatools.properties.converters.Converter;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Using this annotation you can override default converter
 * for property.
 *
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 05.05.15
 */
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.FIELD})
public @interface Use {

    Class<? extends Converter> value();
}
