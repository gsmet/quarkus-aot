package fr.spacefox.perftests.quarkus.rest.endpoint656;

import fr.spacefox.perftests.quarkus.core.service656.model.Model656;
import fr.spacefox.perftests.quarkus.rest.endpoint656.schema.Schema656;

final class Mapper {
    private Mapper() {}

    public static Schema656 of(Model656 model) {
        return new Schema656(model.id(), model.value());
    }
}
