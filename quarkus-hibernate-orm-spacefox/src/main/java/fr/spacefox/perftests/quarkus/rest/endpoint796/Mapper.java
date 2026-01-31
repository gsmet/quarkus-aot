package fr.spacefox.perftests.quarkus.rest.endpoint796;

import fr.spacefox.perftests.quarkus.core.service796.model.Model796;
import fr.spacefox.perftests.quarkus.rest.endpoint796.schema.Schema796;

final class Mapper {
    private Mapper() {}

    public static Schema796 of(Model796 model) {
        return new Schema796(model.id(), model.value());
    }
}
