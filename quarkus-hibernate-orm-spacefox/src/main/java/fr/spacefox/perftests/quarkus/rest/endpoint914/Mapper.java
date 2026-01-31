package fr.spacefox.perftests.quarkus.rest.endpoint914;

import fr.spacefox.perftests.quarkus.core.service914.model.Model914;
import fr.spacefox.perftests.quarkus.rest.endpoint914.schema.Schema914;

final class Mapper {
    private Mapper() {}

    public static Schema914 of(Model914 model) {
        return new Schema914(model.id(), model.value());
    }
}
