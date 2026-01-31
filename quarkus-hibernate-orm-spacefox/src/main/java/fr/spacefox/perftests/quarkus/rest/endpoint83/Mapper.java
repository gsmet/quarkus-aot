package fr.spacefox.perftests.quarkus.rest.endpoint83;

import fr.spacefox.perftests.quarkus.core.service83.model.Model83;
import fr.spacefox.perftests.quarkus.rest.endpoint83.schema.Schema83;

final class Mapper {
    private Mapper() {}

    public static Schema83 of(Model83 model) {
        return new Schema83(model.id(), model.value());
    }
}
