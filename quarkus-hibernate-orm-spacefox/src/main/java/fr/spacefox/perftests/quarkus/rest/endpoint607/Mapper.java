package fr.spacefox.perftests.quarkus.rest.endpoint607;

import fr.spacefox.perftests.quarkus.core.service607.model.Model607;
import fr.spacefox.perftests.quarkus.rest.endpoint607.schema.Schema607;

final class Mapper {
    private Mapper() {}

    public static Schema607 of(Model607 model) {
        return new Schema607(model.id(), model.value());
    }
}
