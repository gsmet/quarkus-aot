package fr.spacefox.perftests.quarkus.rest.endpoint976;

import fr.spacefox.perftests.quarkus.core.service976.model.Model976;
import fr.spacefox.perftests.quarkus.rest.endpoint976.schema.Schema976;

final class Mapper {
    private Mapper() {}

    public static Schema976 of(Model976 model) {
        return new Schema976(model.id(), model.value());
    }
}
