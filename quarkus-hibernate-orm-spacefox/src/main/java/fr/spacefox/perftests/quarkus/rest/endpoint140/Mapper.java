package fr.spacefox.perftests.quarkus.rest.endpoint140;

import fr.spacefox.perftests.quarkus.core.service140.model.Model140;
import fr.spacefox.perftests.quarkus.rest.endpoint140.schema.Schema140;

final class Mapper {
    private Mapper() {}

    public static Schema140 of(Model140 model) {
        return new Schema140(model.id(), model.value());
    }
}
