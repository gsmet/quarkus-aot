package fr.spacefox.perftests.quarkus.rest.endpoint373;

import fr.spacefox.perftests.quarkus.core.service373.model.Model373;
import fr.spacefox.perftests.quarkus.rest.endpoint373.schema.Schema373;

final class Mapper {
    private Mapper() {}

    public static Schema373 of(Model373 model) {
        return new Schema373(model.id(), model.value());
    }
}
