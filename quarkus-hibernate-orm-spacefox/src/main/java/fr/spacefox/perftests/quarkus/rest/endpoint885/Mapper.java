package fr.spacefox.perftests.quarkus.rest.endpoint885;

import fr.spacefox.perftests.quarkus.core.service885.model.Model885;
import fr.spacefox.perftests.quarkus.rest.endpoint885.schema.Schema885;

final class Mapper {
    private Mapper() {}

    public static Schema885 of(Model885 model) {
        return new Schema885(model.id(), model.value());
    }
}
