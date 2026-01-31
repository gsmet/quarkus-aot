package fr.spacefox.perftests.quarkus.rest.endpoint420;

import fr.spacefox.perftests.quarkus.core.service420.model.Model420;
import fr.spacefox.perftests.quarkus.rest.endpoint420.schema.Schema420;

final class Mapper {
    private Mapper() {}

    public static Schema420 of(Model420 model) {
        return new Schema420(model.id(), model.value());
    }
}
