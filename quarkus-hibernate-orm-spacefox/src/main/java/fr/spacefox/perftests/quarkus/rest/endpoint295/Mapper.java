package fr.spacefox.perftests.quarkus.rest.endpoint295;

import fr.spacefox.perftests.quarkus.core.service295.model.Model295;
import fr.spacefox.perftests.quarkus.rest.endpoint295.schema.Schema295;

final class Mapper {
    private Mapper() {}

    public static Schema295 of(Model295 model) {
        return new Schema295(model.id(), model.value());
    }
}
