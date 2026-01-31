package fr.spacefox.perftests.quarkus.rest.endpoint930;

import fr.spacefox.perftests.quarkus.core.service930.model.Model930;
import fr.spacefox.perftests.quarkus.rest.endpoint930.schema.Schema930;

final class Mapper {
    private Mapper() {}

    public static Schema930 of(Model930 model) {
        return new Schema930(model.id(), model.value());
    }
}
