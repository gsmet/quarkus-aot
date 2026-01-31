package fr.spacefox.perftests.quarkus.rest.endpoint390;

import fr.spacefox.perftests.quarkus.core.service390.model.Model390;
import fr.spacefox.perftests.quarkus.rest.endpoint390.schema.Schema390;

final class Mapper {
    private Mapper() {}

    public static Schema390 of(Model390 model) {
        return new Schema390(model.id(), model.value());
    }
}
