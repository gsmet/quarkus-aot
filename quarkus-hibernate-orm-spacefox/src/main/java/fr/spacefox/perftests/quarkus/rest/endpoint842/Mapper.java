package fr.spacefox.perftests.quarkus.rest.endpoint842;

import fr.spacefox.perftests.quarkus.core.service842.model.Model842;
import fr.spacefox.perftests.quarkus.rest.endpoint842.schema.Schema842;

final class Mapper {
    private Mapper() {}

    public static Schema842 of(Model842 model) {
        return new Schema842(model.id(), model.value());
    }
}
