package fr.spacefox.perftests.quarkus.rest.endpoint754;

import fr.spacefox.perftests.quarkus.core.service754.model.Model754;
import fr.spacefox.perftests.quarkus.rest.endpoint754.schema.Schema754;

final class Mapper {
    private Mapper() {}

    public static Schema754 of(Model754 model) {
        return new Schema754(model.id(), model.value());
    }
}
