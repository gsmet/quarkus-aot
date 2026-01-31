package fr.spacefox.perftests.quarkus.rest.endpoint450;

import fr.spacefox.perftests.quarkus.core.service450.model.Model450;
import fr.spacefox.perftests.quarkus.rest.endpoint450.schema.Schema450;

final class Mapper {
    private Mapper() {}

    public static Schema450 of(Model450 model) {
        return new Schema450(model.id(), model.value());
    }
}
