package fr.spacefox.perftests.quarkus.rest.endpoint149;

import fr.spacefox.perftests.quarkus.core.service149.model.Model149;
import fr.spacefox.perftests.quarkus.rest.endpoint149.schema.Schema149;

final class Mapper {
    private Mapper() {}

    public static Schema149 of(Model149 model) {
        return new Schema149(model.id(), model.value());
    }
}
