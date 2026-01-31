package fr.spacefox.perftests.quarkus.rest.endpoint6;

import fr.spacefox.perftests.quarkus.core.service6.model.Model6;
import fr.spacefox.perftests.quarkus.rest.endpoint6.schema.Schema6;

final class Mapper {
    private Mapper() {}

    public static Schema6 of(Model6 model) {
        return new Schema6(model.id(), model.value());
    }
}
