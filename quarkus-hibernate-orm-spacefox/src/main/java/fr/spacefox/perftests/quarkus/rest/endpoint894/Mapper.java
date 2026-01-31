package fr.spacefox.perftests.quarkus.rest.endpoint894;

import fr.spacefox.perftests.quarkus.core.service894.model.Model894;
import fr.spacefox.perftests.quarkus.rest.endpoint894.schema.Schema894;

final class Mapper {
    private Mapper() {}

    public static Schema894 of(Model894 model) {
        return new Schema894(model.id(), model.value());
    }
}
