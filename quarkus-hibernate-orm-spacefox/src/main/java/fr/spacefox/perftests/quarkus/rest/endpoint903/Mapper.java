package fr.spacefox.perftests.quarkus.rest.endpoint903;

import fr.spacefox.perftests.quarkus.core.service903.model.Model903;
import fr.spacefox.perftests.quarkus.rest.endpoint903.schema.Schema903;

final class Mapper {
    private Mapper() {}

    public static Schema903 of(Model903 model) {
        return new Schema903(model.id(), model.value());
    }
}
