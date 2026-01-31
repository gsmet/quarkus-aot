package fr.spacefox.perftests.quarkus.rest.endpoint806;

import fr.spacefox.perftests.quarkus.core.service806.model.Model806;
import fr.spacefox.perftests.quarkus.rest.endpoint806.schema.Schema806;

final class Mapper {
    private Mapper() {}

    public static Schema806 of(Model806 model) {
        return new Schema806(model.id(), model.value());
    }
}
