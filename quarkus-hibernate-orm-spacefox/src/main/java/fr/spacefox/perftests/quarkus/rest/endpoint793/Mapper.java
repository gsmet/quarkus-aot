package fr.spacefox.perftests.quarkus.rest.endpoint793;

import fr.spacefox.perftests.quarkus.core.service793.model.Model793;
import fr.spacefox.perftests.quarkus.rest.endpoint793.schema.Schema793;

final class Mapper {
    private Mapper() {}

    public static Schema793 of(Model793 model) {
        return new Schema793(model.id(), model.value());
    }
}
