package fr.spacefox.perftests.quarkus.rest.endpoint961;

import fr.spacefox.perftests.quarkus.core.service961.model.Model961;
import fr.spacefox.perftests.quarkus.rest.endpoint961.schema.Schema961;

final class Mapper {
    private Mapper() {}

    public static Schema961 of(Model961 model) {
        return new Schema961(model.id(), model.value());
    }
}
