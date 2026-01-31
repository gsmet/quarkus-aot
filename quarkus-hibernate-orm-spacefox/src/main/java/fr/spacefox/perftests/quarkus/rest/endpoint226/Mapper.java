package fr.spacefox.perftests.quarkus.rest.endpoint226;

import fr.spacefox.perftests.quarkus.core.service226.model.Model226;
import fr.spacefox.perftests.quarkus.rest.endpoint226.schema.Schema226;

final class Mapper {
    private Mapper() {}

    public static Schema226 of(Model226 model) {
        return new Schema226(model.id(), model.value());
    }
}
