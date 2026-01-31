package fr.spacefox.perftests.quarkus.rest.endpoint89;

import fr.spacefox.perftests.quarkus.core.service89.model.Model89;
import fr.spacefox.perftests.quarkus.rest.endpoint89.schema.Schema89;

final class Mapper {
    private Mapper() {}

    public static Schema89 of(Model89 model) {
        return new Schema89(model.id(), model.value());
    }
}
