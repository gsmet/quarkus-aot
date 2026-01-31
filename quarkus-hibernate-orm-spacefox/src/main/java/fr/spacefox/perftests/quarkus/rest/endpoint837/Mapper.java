package fr.spacefox.perftests.quarkus.rest.endpoint837;

import fr.spacefox.perftests.quarkus.core.service837.model.Model837;
import fr.spacefox.perftests.quarkus.rest.endpoint837.schema.Schema837;

final class Mapper {
    private Mapper() {}

    public static Schema837 of(Model837 model) {
        return new Schema837(model.id(), model.value());
    }
}
