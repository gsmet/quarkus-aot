package fr.spacefox.perftests.quarkus.rest.endpoint818;

import fr.spacefox.perftests.quarkus.core.service818.model.Model818;
import fr.spacefox.perftests.quarkus.rest.endpoint818.schema.Schema818;

final class Mapper {
    private Mapper() {}

    public static Schema818 of(Model818 model) {
        return new Schema818(model.id(), model.value());
    }
}
